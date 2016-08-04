package fr.bentur_and_bertatruck.bandb_mod.nature.construction;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockPlantConstruction {
	
	Block blockPlant;
		
	public BlockPlantConstruction(boolean gen, Block block){
	 super();
	 blockPlant = block;
	 }

	 public boolean generate(World world, Random rand, BlockPos position){		
			world.setBlockState(position , blockPlant.getDefaultState());
		return true;
		}
}
