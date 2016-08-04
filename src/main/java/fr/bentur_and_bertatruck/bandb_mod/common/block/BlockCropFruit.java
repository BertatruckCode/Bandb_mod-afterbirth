package fr.bentur_and_bertatruck.bandb_mod.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCrops;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;


public class BlockCropFruit extends BlockCrops implements IGrowable
{

    protected int maxGrowthStage = 7;

    @SideOnly(Side.CLIENT)
    protected IIcon[] iIcon;
    
    Item itemSeed,itemDrop;
    String texture, renderType;

    public BlockCropFruit(Item item, String str, String render)
    {
    	itemDrop = item;   	
    	texture = str;
    	renderType = render;
    	   	
     // Basic block setup
        setTickRandomly(true);
        float f = 0.5F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        setHardness(0.0F);
        setStepSound(soundTypeGrass);
        disableStats();
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.iIcon = new IIcon[8];

        for (int i = 0; i < this.iIcon.length; ++i)
        {
            this.iIcon[i] = p_149651_1_.registerIcon(Bandb_mod.MODID + ":crop/"+ texture + "/" + this.getUnlocalizedName().substring(5) + "_stage" + i);
        }
    }

    /**
     * is the block grass, dirt or farmland
     */
    @Override
    protected boolean canPlaceBlockOn(Block parBlock)
    {
        return parBlock == Blocks.farmland;
    }

    public void incrementGrowStage(World parWorld, Random parRand, int parX, int parY, int parZ)

    {
        int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + 

              MathHelper.getRandomIntegerInRange(parRand, 2, 5);

        if (growStage > maxGrowthStage)
        {
         growStage = maxGrowthStage;
        }

        parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
    }
   
   
    /**
     * Gets the block's texture. Args: side, meta
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int parSide, int parGrowthStage)
    {
     return this.iIcon[parGrowthStage];
    }
   
    /*
     * Need to implement the IGrowable interface methods
     */

    /*
     * (non-Javadoc)
     * @see net.minecraft.block.IGrowable#func_149851_a(net.minecraft.world.World, 

     * int, int, int, boolean)
     */
    @Override
    // checks if finished growing (a grow stage of 7 is final stage)
    public boolean func_149851_a(World parWorld, int parX, int parY, int parZ, 

          boolean p_149851_5_)
    {
        return parWorld.getBlockMetadata(parX, parY, parZ) != 7;
    }

    /*
     * (non-Javadoc)
     * @see net.minecraft.block.IGrowable#func_149852_a(net.minecraft.world.World, 

     * java.util.Random, int, int, int)
     */
    @Override
    public boolean func_149852_a(World p_149852_1_, Random parRand, int p_149852_3_, 

          int p_149852_4_, int p_149852_5_)
    {
        return true;
    }

    /*
     * (non-Javadoc)
     * @see net.minecraft.block.IGrowable#func_149853_b(net.minecraft.world.World, 

     * java.util.Random, int, int, int)
     */
    @Override
    public void func_149853_b(World parWorld, Random parRand, int parX, int parY, 

          int parZ)
    {
        incrementGrowStage(parWorld, parRand, parX, parY, parZ);
    }
    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World parWorld, int parX, int parY, int parZ, Random parRand)
    {
        super.updateTick(parWorld, parX, parY, parZ, parRand);
        int growStage = parWorld.getBlockMetadata(parX, parY, parZ) + 1;

        if (growStage > 7)
        {
            growStage = 7;
        }

        parWorld.setBlockMetadataWithNotify(parX, parY, parZ, growStage, 2);
    }
    public int getRenderType()
    {
    	if(renderType == "cross")
        return 1;
    	if(renderType == "square")
    	return 6;
    	else
    	return 6;
    }

    protected Item func_149866_i()
    {
    	if(texture == "fruits/pineapplecayenne")
    		return BandbCrops.itemSeedPineappleCayenne; 
    	else
    	if(texture == "fruits/pineapplevictoria")
    		return BandbCrops.itemSeedPineappleVictoria;
    	else
    	if(texture == "fruits/cranberry")
    		return BandbCrops.itemSeedCranberry;
    	else
    	if(texture == "fruits/blackcurrant")
    		return BandbCrops.itemSeedBlackcurrant;
    	else
    	if(texture == "fruits/pricklypear")
    		return BandbCrops.itemSeedPricklyPear;
    	else
    	
    	if(texture == "fruits/strawberry")
    		return BandbCrops.itemSeedStrawberry;
    	else
    	if(texture == "fruits/raspberry")
    		return BandbCrops.itemSeedRaspberry;
    	else
    	if(texture == "fruits/currant")
    		return BandbCrops.itemSeedCurrant;
    	else
    	if(texture == "fruits/rhubarb")
    		return BandbCrops.itemSeedRhubarb;
    	else
    	if(texture == "fruits/tomato")
    		return BandbCrops.itemSeedTomato;
    	
    	else   		
        	return BandbItems.itemBug;    		
    }

    protected Item func_149865_P()
    {
        return itemDrop;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World world, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(world, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, 0);
    }

    public Item getItemDropped(int world, Random random, int p_149650_3_)
    {  	
    	return world == 7 ? this.func_149865_P() : this.func_149866_i();
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(2);
    }
 
    /**
     * Gets an item for the block being called on. Args: world, x, y, z
     */
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return this.func_149866_i();
    }
}

