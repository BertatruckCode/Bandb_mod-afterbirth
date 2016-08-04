package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationJunglePalmTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationJungleTree;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GlobalWorldGenerationJungle implements IWorldGenerator{

	public void generate(Random rand, int X, int Z, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.getDimensionId()){
		case 0:
			this.generateSurface(world, X * 16, Z * 16, rand);
				}
	}
	
	private void generateSurface(World world, int x, int z, Random rand){
		
	
	 	if(world.getBiomeGenForCoords(new BlockPos(x, 16, z)).equals(BiomeGenBase.jungle) || world.getBiomeGenForCoords(new BlockPos(x, 16, z)).equals(BiomeGenBase.jungleEdge)){
	 		
	 		//palm tree			
			for(int j = 0; j < ListGenerationJunglePalmTree.getListSize(); j++){	
	 			
	 			for (int i = 0; i < 8; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationTreesPalmTree(ListGenerationJunglePalmTree.getBlocks(j)[0], ListGenerationJunglePalmTree.getBlocks(j)[1])).generate(world, rand, x1, y1, z1);	 				
	 			}	
	 		}
			for(int j = 0; j < ListGenerationJungleTree.getListSize(); j++){	
	 			
	 			for (int i = 0; i < 8; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationTreesFruit(ListGenerationJungleTree.getBlocks(j)[0], ListGenerationJungleTree.getBlocks(j)[1])).generate(world, rand, x1, y1, z1);	 				
	 			}	
	 		}
	 	}	 
	 }
		 
 }

	