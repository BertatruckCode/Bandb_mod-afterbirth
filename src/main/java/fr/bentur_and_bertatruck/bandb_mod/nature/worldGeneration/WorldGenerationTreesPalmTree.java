package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.nature.construction.ConstructionTreesPalmTree;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenerationTreesPalmTree extends WorldGenerator implements IWorldGenerator{
	
	Block blockLeaves,blockWood;
	
	public WorldGenerationTreesPalmTree(Block leaves, Block wood){
		blockLeaves=leaves;
		blockWood=wood;
		
	}

	public boolean generate(World world, Random random, BlockPos position){
		if(world.getBlockState(new BlockPos(position.getX(), position.getY()-1, position.getZ())).getBlock() == Blocks.grass 
				&& world.getBlockState(new BlockPos(position.getX() +1, position.getY()+1, position.getZ())).getBlock() == Blocks.air
				&& world.getBlockState(new BlockPos(position.getX() -1, position.getY()+1, position.getZ())).getBlock() == Blocks.air
				&& world.getBlockState(new BlockPos(position.getX(), position.getY()+1, position.getZ() +1)).getBlock() == Blocks.air
				&& world.getBlockState(new BlockPos(position.getX(), position.getY()+1, position.getZ() -1)).getBlock() == Blocks.air
				
				&& world.getBlockState(new BlockPos(position.getX(), position.getY()+1, position.getZ())).getBlock() == Blocks.air				
				&& world.getBlockState(new BlockPos(position.getX(), position.getY()+2, position.getZ())).getBlock() == Blocks.air
				&& world.getBlockState(new BlockPos(position.getX(), position.getY()+3, position.getZ())).getBlock() == Blocks.air
				&& world.getBlockState(new BlockPos(position.getX(), position.getY()+4, position.getZ())).getBlock() == Blocks.air
				&& world.getBlockState(new BlockPos(position.getX(), position.getY()+5, position.getZ())).getBlock() == Blocks.air){	
				new ConstructionTreesPalmTree(true, blockLeaves, blockWood).generate(world, random, position);
				return true;			
			} else{
			return false;
		}									
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){}

	public void generate(World world, Random rand, int x1, int y1, int z1) {
		this.generate(world, rand, new BlockPos(x1, y1, z1));		
	}
	
}
