package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockMushroom extends BlockBush 
{
	Item itemDrop;
	
	 public BlockMushroom(Item drop,float f,float f1,float f2,float f3, float f4, float f5, float f6){	
	 setBlockBounds(f1 - f, f2, f3 - f, f4 + f, f * f5, f6 + f);	
	 this.setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
	 itemDrop = drop;
	 }

	 protected boolean canPlaceBlockOn(Block block){
	 return block == Blocks.grass || block == Blocks.dirt || block == Blocks.stone;
	 }

	 @Override	
	 public int quantityDropped(Random random){	
	 return random.nextInt(2)+1;	
	 }	 

}
