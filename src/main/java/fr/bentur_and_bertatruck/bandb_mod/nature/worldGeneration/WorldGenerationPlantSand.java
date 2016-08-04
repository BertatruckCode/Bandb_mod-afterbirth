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

public class WorldGenerationPlantSand extends WorldGenerator implements IWorldGenerator {
	
	Block blockPlant;
	
	public WorldGenerationPlantSand(Block block){
		blockPlant = block;
	}

	@Override
	public boolean generate(World world, Random random, BlockPos position) {

		if(world.getBlockState(new BlockPos(position.getX(), position.getY()-1, position.getZ())).getBlock() == Blocks.sand
				&& world.getBlockState(position).getBlock() == Blocks.air){
			new BlockPlantConstruction(true,blockPlant).generate(world, random, position);
			return true;
		} else {
			return false;
		}
	}

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {}

}