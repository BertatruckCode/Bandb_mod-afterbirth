package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.nature.construction.BlockPlantConstruction;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenerationPlant extends WorldGenerator implements IWorldGenerator {
	
	Block blockPlant;
	
	public WorldGenerationPlant(Block block){
		blockPlant = block;
	}

	public boolean generate(World world, Random random, BlockPos position) {

		if(world.getBlockState(new BlockPos(position.getX(), position.getY()-1, position.getZ())).getBlock() == Blocks.grass
				|| world.getBlockState(new BlockPos(position.getX(), position.getY()-1, position.getZ())).getBlock() == Blocks.stone
				&& world.getBlockState(position).getBlock() == Blocks.air){
			new BlockPlantConstruction(true,blockPlant).generate(world, random, position);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {}

	public void generate(World world, Random rand, int x1, int y1, int z1) {
		this.generate(world, rand, new BlockPos(x1, y1, z1));		
	}


}