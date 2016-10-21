package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.List;
import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.nature.construction.ConstructionTreesApple;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTreeSaplingApple extends BlockSapling{
	Block blockleaves,blockwood;	   
		
	public BlockTreeSaplingApple(Block leaves, Block wood){
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, BlockPlanks.EnumType.OAK).withProperty(STAGE, Integer.valueOf(0)));

		float f = 0.4F;	
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);	
		this.setCreativeTab(BandbCreativeTabs.CreativeTabSapling);
		blockleaves= leaves;
		blockwood = wood;
		
	}

	public void func_149878_d(World world, int x, int y, int z, Random random){	
		int l = world.getBlockState(new BlockPos(x, y, z)).getBlock().getMetaFromState(world.getBlockState(new BlockPos(x, y, z))) & 3;	
		world.setBlockToAir(new BlockPos(x, y, z));	
		Object obj = null;	
		 obj = new ConstructionTreesApple(true, blockleaves, blockwood);
		 if(!((WorldGenerator)(obj)).generate(world, random, new BlockPos(x, y, z))){	
			 world.setBlockState(new BlockPos(x, y, z), this.getDefaultState(), 3);	
	 	}	
	 }
	    	 
	 protected boolean canPlaceBlockOn(Block block){
		 return block == Blocks.grass || block == Blocks.dirt;
	 }
	 
}