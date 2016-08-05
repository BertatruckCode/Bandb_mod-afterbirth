package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.List;
import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.nature.construction.ConstructionTreesPalmTree;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTreeSaplingPalmTree extends BlockSapling{
	
	Block blockleaves,blockwood;
		
	public BlockTreeSaplingPalmTree(Block leaves, Block wood){	
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
		obj = new ConstructionTreesPalmTree(true, blockleaves, blockwood);
		 if(!((WorldGenerator)(obj)).generate(world, random, new BlockPos(x, y, z))){	
			 world.setBlockState(new BlockPos(x, y, z), this.getDefaultState(), 3);	
		 	}	
		 }

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativetabs, List list){		        
		list.add(new ItemStack(item, 1 ,0));
	}
		    
		 
	protected boolean canPlaceBlockOn(Block block){
		 return block == Blocks.grass || block == Blocks.dirt;
	}
}
