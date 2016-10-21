package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBlocks;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTreeLeaf extends BlockLeaves {
	
	protected String name;
	protected Item itemDrop;
	
	public BlockTreeLeaf(String string, Item item) {
		name = string;
		itemDrop = item;
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsLeaf);
	}

	@Override
	public int quantityDropped(Random random) {
		return random.nextInt(20) == 0 ? 1 : 0;
	}

	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	if (world.rand.nextFloat() < 0.10F){
		if (name == "almond")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingAlmond)));
		if (name == "apricot")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingApricot)));
		if (name == "banana")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingBanana)));
		if (name == "cherry")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingCherry)));
		if (name == "clementine")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingClementine)));
		if (name == "date")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingDate)));
		if (name == "dragonfruit")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingDragonfruit)));
		if (name == "fig")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingFig)));
		if (name == "guava")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingGuava)));
		if (name == "lemon")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingLemon)));
		if (name == "lime")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingLime)));
		if (name == "lychee")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingLychee)));
		if (name == "passionfruit")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingPassionfruit)));
		if (name == "pomegranate")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockSaplingPomegranate)));
		if (name == "quince")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingQuince)));

		if (name == "avocado")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAvocado)));

		if (name == "coconut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingCoconut)));

		if (name == "tangerine")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingTangerine)));

		if (name == "mango")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingMango)));

		if (name == "chestnut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingChestnut)));

		if (name == "mirabelle")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingMirabelle)));

		if (name == "nuts")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingNuts)));

		if (name == "walnut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingWalnut)));

		if (name == "olive")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingOlive)));

		if (name == "orange")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingOrange)));

		if (name == "grapefruit")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingGrapefruit)));

		if (name == "papaya")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingPapaya)));

		if (name == "peach")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingPeach)));

		if (name == "pear")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingPear)));

		if (name == "plum")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingPlum)));

		if (name == "african")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAfrican)));

		if (name == "anise")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAnise)));

		if (name == "staranise")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingStarAnise)));

		if (name == "cacao")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingCacao)));

		if (name == "cashew")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingCashew)));

		if (name == "amia")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAmla)));

		if (name == "persimmon")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingPersimmon)));

		if (name == "nectarine")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingNectarine)));

		if (name == "kumquat")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingKumquat)));

		if (name == "jujube")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingJujube)));

		if (name == "crabapple")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingCrabapple)));

		if (name == "antares")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleAntares)));

		if (name == "ariane")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleAriane)));

		if (name == "belchardchantecier")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleBelchardChancelier)));

		if (name == "belledeboskoop")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleBelleDeBoskoop)));

		if (name == "braeburn")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleBraeburn)));

		if (name == "elstar")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleElstar)));

		if (name == "Fuji")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleFuji)));

		if (name == "Gala")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleGala)));

		if (name == "golden")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleGolden)));

		if (name == "grannysmith")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleGrannySmith)));

		if (name == "honeycrunch")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleHoneycrunch)));

		if (name == "jazz")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleJazz)));

		if (name == "jonagoldjonagored")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleJonagoldJonagored)));

		if (name == "lesrouges")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleLesRouges)));

		if (name == "pinklady")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingApplePinkLady)));

		if (name == "pommedulimousin")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingApplePommeDuLimousin)));

		if (name == "reinedesreinettes")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleReineDesReinettes)));

		if (name == "reinettegriseducanada")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleReinetteGriseDuCanada)));

		if (name == "tentation")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAppleTentation)));

		if (name == "breadnut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingBreadNut)));

		if (name == "kiwi")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingKiwi)));

		if (name == "pistachio")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingPistachio)));

		if (name == "vanilla")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingVanilla)));	
		
		if (name == "allspice")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingAllspice)));
		if (name == "bael")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingBael)));
		if (name == "bananaplantain")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingBananaPlantain)));
		if (name == "blackcherry")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingBlackCherry)));
		if (name == "blackthorn")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingBlackthorn)));
		
		if (name == "brazilnut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingBrazilNut)));
		if (name == "butternut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingButternut)));
		if (name == "cinnamon")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingCinnamon)));
		if (name == "clove")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingClove)));
		if (name == "damsonplum")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingDamsonPlum)));

		if (name == "elderberry")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingElderberry)));
		if (name == "laurel")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingLaurel)));
		if (name == "macadamia")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingMacadamia)));
		if (name == "pomelo")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingPomelo)));
		if (name == "satsuma")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingSatsuma)));
		
		if (name == "bloodorange")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingBloodOrange)));
		if (name == "morellocherry")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingMorelloCherry)));
		if (name == "whitepeach")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSaplingWhitePeach)));
			
	}else if (world.rand.nextFloat() < 0.05F){
		drops.add(new ItemStack(itemDrop));			
	}
		
	return drops;
	}

	public String getName(){
		return name;
	}

	@Override
	public int getRenderColor(IBlockState state){
		return ColorizerFoliage.getFoliageColorBasic();
	}
	
	 @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass){
        return BiomeColorHelper.getFoliageColorAtPos(worldIn, pos);
    }
	
	@Override
    public int getBlockColor(){
        return ColorizerFoliage.getFoliageColor(0.5D, 1.0D);
    }
	
	@Override
    public boolean isLeaves(IBlockAccess world, BlockPos pos){
        return true;
    }
	
	@Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){
        return true;
    }

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		return new java.util.ArrayList(java.util.Arrays.asList(new ItemStack(this, 1, 1)));
	}

	@Override
	public EnumType getWoodType(int meta) {
		return null;
	}
	
	 public boolean isOpaqueCube(){
        return !this.fancyGraphics;
    }

    @SideOnly(Side.CLIENT)
    public void setGraphicsLevel(boolean fancy){
        this.isTransparent = fancy;
        this.fancyGraphics = fancy;
        this.iconIndex = fancy ? 0 : 1;
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer(){
        return this.isTransparent ? EnumWorldBlockLayer.CUTOUT_MIPPED : EnumWorldBlockLayer.SOLID;
    }

    public boolean isVisuallyOpaque(){
        return false;
    }
    
    protected BlockState createBlockState(){
        return new BlockState(this, new IProperty[] {CHECK_DECAY, DECAYABLE});
    }
    
    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta){
        IBlockState iblockstate = this.getDefaultState();

        switch (meta & 12){
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state){
    	
        switch ((BlockLog.EnumAxis)state.getValue(LOG_AXIS)){
            case X: return 4;
            case Y: return 0;
            case Z: return 8;
            case NONE: return 12;
        }
        return 12;
    }


}
