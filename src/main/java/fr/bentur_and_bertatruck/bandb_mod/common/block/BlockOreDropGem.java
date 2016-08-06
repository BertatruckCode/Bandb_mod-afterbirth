package fr.bentur_and_bertatruck.bandb_mod.common.block;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOreDropGem extends Block {
	
	Item itemDrop;
	int bonusDrop;

	public BlockOreDropGem(Material material,float hardness,int harvestLevel,Item drop,int proba) {
		super(material);
		this.setHardness(hardness);
		this.setHarvestLevel("pickaxe",harvestLevel);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		itemDrop = drop;
		bonusDrop = proba;
	}
	
	@Override	
	public int quantityDropped(Random random){	
		return 1 + random.nextInt(bonusDrop);	
	}	

	public Item getItemDropped(int metadata, Random random, int par3){	
		return itemDrop;
	}
	 	 
	public void dropBlockAsItemWithChance(World world, BlockPos bockpos, IBlockState state, float f, int i){
		super.dropBlockAsItemWithChance(world, bockpos, state, f, i);
	}	    
	    
	public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_){
		return 5;
	}

}

