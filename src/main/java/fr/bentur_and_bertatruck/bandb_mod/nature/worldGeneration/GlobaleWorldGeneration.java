package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GlobaleWorldGeneration implements IWorldGenerator {
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){

		switch(world.provider.getDimensionId()){

			case -1:
					
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;

			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;

			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {}

	private void generateSurface(World world, Random rand, int x, int z) {

		 for(int i = 0; i < 5; i++){
			 new WorldGenMinable(BandbBlocks.blockTruffle.getDefaultState(), 5).generate(world, rand, new BlockPos(x + rand.nextInt(16), 48 + rand.nextInt(16), z + rand.nextInt(16)));	
			 
		 }

		 //ore block drop
		 
		 for(int i = 0; i < 3; i++){
			 new WorldGenMinable(BandbBlocks.blockOreAluminium.getDefaultState(), 3).generate(world, rand, new BlockPos(x + rand.nextInt(16), 16 + rand.nextInt(16), z + rand.nextInt(16)));				 
		 }
		 		 
		 for(int i = 0; i < 4; i++){
			 new WorldGenMinable(BandbBlocks.blockOrePlatinum.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16), 16 + rand.nextInt(8), z + rand.nextInt(16)));				
		 }
		 
		 for(int i = 0; i < 1; i++){
			 new WorldGenMinable(BandbBlocks.blockOreTitan.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16),rand.nextInt(64), z + rand.nextInt(16)));				 
		 }
		 
		 //ore gem drop
		 for(int i = 0; i < 3; i++){
			 new WorldGenMinable(BandbBlocks.blockOreAmethyst.getDefaultState(), 3).generate(world, rand, new BlockPos(x + rand.nextInt(16),16 + rand.nextInt(16), z + rand.nextInt(16)));				
		 }
		 
		 for(int i = 0; i < 3; i++){
			 new WorldGenMinable(BandbBlocks.blockOreJade.getDefaultState(), 3).generate(world, rand, new BlockPos(x + rand.nextInt(16),rand.nextInt(32), z + rand.nextInt(16)));				
		 }	
		 
		 for(int i = 0; i < 3; i++){
			 new WorldGenMinable(BandbBlocks.blockOreOnyx.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16),24 + rand.nextInt(8), z + rand.nextInt(16)));				 
		 }
		 
		 for(int i = 0; i < 3; i++){
			 new WorldGenMinable(BandbBlocks.blockOreOpal.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16),24 + rand.nextInt(8), z + rand.nextInt(16)));				 
		 }
		 
		 for(int i = 0; i < 3; i++){
			 new WorldGenMinable(BandbBlocks.blockOreRuby.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16)));				 
		 }
		 
		 for(int i = 0; i < 3; i++){
			 new WorldGenMinable(BandbBlocks.blockOreSapphire.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16)));				 
		 }
		 
		 for(int i = 0; i < 3; i++){
			 new WorldGenMinable(BandbBlocks.blockOreTopaz.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16)));				
		 }
		 
		 if(world.getBiomeGenForCoords(new BlockPos(x, 16, z)).equals(BiomeGenBase.ocean)){
			 for(int i = 0; i < 3; i++){
				 new WorldGenMinable(BandbBlocks.blockOreSalt.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16)));				 
			 }
		 }
		 
		 if(world.getBiomeGenForCoords(new BlockPos(x, 16, z)).equals(BiomeGenBase.river)){
			 for(int i = 0; i < 2; i++){
				 (new WorldGenMinable(BandbBlocks.blockOreSalt.getDefaultState(), 4)).generate(world, rand, new BlockPos(x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16)));					 
			 }
		 }
		 
		 if(world.getBiomeGenForCoords(new BlockPos(x, 16, z)).equals(BiomeGenBase.beach)){
			 for(int i = 0; i < 2; i++){
				 new WorldGenMinable(BandbBlocks.blockOreSalt.getDefaultState(), 4).generate(world, rand, new BlockPos(x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16)));				 
			 }
		 }
	}
	
	private void generateNether(World world, Random random, int x, int z) {}

}
