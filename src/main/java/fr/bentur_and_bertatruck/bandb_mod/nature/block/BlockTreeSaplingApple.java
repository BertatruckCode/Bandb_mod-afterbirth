package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.nature.construction.ConstructionTreesApple;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockTreeSaplingApple extends BlockBush implements IGrowable{
	Block blockleaves,blockwood;
    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);


	public BlockTreeSaplingApple(Block leaves, Block wood){
		float f = 0.4F;	
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);	
		this.setCreativeTab(BandbCreativeTabs.CreativeTabSapling);
		blockleaves= leaves;
		blockwood = wood;
    }

    /**
     * Gets the localized name of this block. Used for the statistics page.
     */
    public String getLocalizedName(){
        return this.getUnlocalizedName();
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand){
        if (!worldIn.isRemote){
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0){
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state){
        this.grow(worldIn, pos, state, rand);
    }
    
    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand){
        if (((Integer)state.getValue(STAGE)).intValue() == 0){
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        }
        else{
            this.generateTree(worldIn, pos, state, rand);
        }
    }
    
    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand){
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) return;
        
        Object object = new ConstructionTreesApple(true, blockleaves, blockwood);

        IBlockState iblockstate1 = Blocks.air.getDefaultState();

        worldIn.setBlockState(pos, iblockstate1, 4);
               
        if (!((WorldGenerator)object).generate(worldIn, rand, pos)){
            worldIn.setBlockState(pos, state, 4);
        }
    }
     
    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient){
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state){
        return (double)worldIn.rand.nextFloat() < 0.45D;
    }
    
    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta){
        return this.getDefaultState().withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state){
        int i = 0;
        i = i | ((Integer)state.getValue(STAGE)).intValue() << 3;
        return i;
    }

    protected BlockState createBlockState(){
        return new BlockState(this, new IProperty[] {STAGE});
    }

}