package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationDesertPalmTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationDesertPlant;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GlobalWorldGenerationDesert implements IWorldGenerator{

	public void generate(Random rand, int X, int Z, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.getDimensionId()){
		case -1:
			this.generateNether(world, X * 16, Z * 16, rand);
		case 0:
			this.generateSurface(world, X * 16, Z * 16, rand);
		case 1:
			this.generateEnd(world, X * 16, Z * 16, rand);
		}

	}
	private void generateSurface(World world, int x, int z, Random rand){
		
	 	if(world.getBiomeGenForCoords(new BlockPos(x, 16, z)).equals(BiomeGenBase.desert)){
		//Trees
	 		for(int j = 0; j < ListGenerationDesertPalmTree.getListSize(); j++){	
	 			
	 			for (int i = 0; i < 2; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					BlockPos position = new BlockPos(x1, y1, z1);
					(new WorldGenerationTreesPalmTree(ListGenerationDesertPalmTree.getBlocks(j)[0], ListGenerationDesertPalmTree.getBlocks(j)[1])).generate(world, rand, position);	 				
	 			}	
	 		}
		//plants
 			for(int k = 0; k < ListGenerationDesertPlant.getListSize(); k++){	
	 			
	 			for (int i = 0; i < 20; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					BlockPos position = new BlockPos(x1, y1, z1);
					(new WorldGenerationPlantSand(ListGenerationDesertPlant.getBlocks(k))).generate(world, rand, position);	 				
	 			}

 			}
	 	}
	 	if(world.getBiomeGenForCoords(new BlockPos(x, 16, z)).equals(BiomeGenBase.beach)){
	 		for (int i = 0; i < 5; i++){
 				int x1 = x + rand.nextInt(16);
 				int y1 = rand.nextInt(128);
 				int z1 = z + rand.nextInt(16);
				BlockPos position = new BlockPos(x1, y1, z1);
 				(new WorldGenerationTreesPalmTree(BandbBlocks.blockCoconutLeaves, BandbBlocks.blockCoconutWood)).generate(world, rand, position);	 				
 			}	 		
	 	}
	 
	}
		 
	private void generateEnd(World world, int x, int z, Random rand){}
 
	private void generateNether(World world, int x, int z, Random rand){}
	 
 }


