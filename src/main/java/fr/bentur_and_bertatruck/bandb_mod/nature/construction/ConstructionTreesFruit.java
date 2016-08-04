package fr.bentur_and_bertatruck.bandb_mod.nature.construction;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ConstructionTreesFruit extends WorldGenerator {

	private Block leaves ;
	private Block wood ;

	
	public ConstructionTreesFruit(boolean gen , Block leaves, Block wood )
	 {
	 super(gen);
	 this.leaves = leaves ;
	 this.wood = wood;			 
	 }
	

	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		if(    world.getBlockState(new BlockPos(position.getX(), position.getY() +1, position.getZ())).getBlock() == Blocks.air				
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +2, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +3, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +4, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +5, position.getZ())).getBlock() == Blocks.air						

			&& world.getBlockState(new BlockPos(position.getX() +1, position.getY() +2, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() -1, position.getY() +2, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +2, position.getZ() +1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +2, position.getZ() -1)).getBlock() == Blocks.air

			&& world.getBlockState(new BlockPos(position.getX() +1, position.getY() +3, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() -1, position.getY() +3, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +3, position.getZ() +1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +3, position.getZ() -1)).getBlock() == Blocks.air
			
			&& world.getBlockState(new BlockPos(position.getX() +1, position.getY() +4, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() -1, position.getY() +4, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +4, position.getZ() +1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +4, position.getZ() -1)).getBlock() == Blocks.air
			
			&& world.getBlockState(new BlockPos(position.getX() +1, position.getY() +5, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() -1, position.getY() +5, position.getZ())).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +5, position.getZ() +1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX(), position.getY() +5, position.getZ() -1)).getBlock() == Blocks.air
			
			&& world.getBlockState(new BlockPos(position.getX() +1, position.getY()+2, position.getZ() +1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() -1, position.getY()+2, position.getZ() +1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() -1, position.getY()+2, position.getZ() -1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() +1, position.getY()+2, position.getZ() -1)).getBlock() == Blocks.air
			
			&& world.getBlockState(new BlockPos(position.getX() +1, position.getY() +2, position.getZ() +1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() -1, position.getY() +2, position.getZ() +1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() -1, position.getY() +2, position.getZ() -1)).getBlock() == Blocks.air
			&& world.getBlockState(new BlockPos(position.getX() +1, position.getY() +2, position.getZ() -1)).getBlock() == Blocks.air){
		
			int x = position.getX();
			int y = position.getY();
			int z = position.getZ();

			for(int i = 0; i < 5; i++)
			{
				this.changeBlock(world, x , y + i, z , wood);
			}

			//y == 7
			this.changeBlock(world, x , y + 6 , z , leaves);
			
			//y == 3
			
			for (int i = 0; i<3; i++) {
					
				this.changeBlock(world, x+i-1 , y+2 , z-2 , leaves);
				}
			
			for (int i = 0; i<5; i++) {
				this.changeBlock(world, x+i-2 , y+2 , z-1 , leaves);
					}
			
			for (int i = 0; i<5; i++) {
				this.changeBlock(world, x+i-2 , y+2 , z+1 , leaves);
					}
			
			for (int i = 0; i<3; i++) {
				this.changeBlock(world, x+i-1 , y+2 , z+2 , leaves);
					}
			this.changeBlock(world, x+2 , y+2 , z , leaves);
			this.changeBlock(world, x-2 , y+2 , z , leaves);
			this.changeBlock(world, x+1 , y+2 , z , leaves);
			this.changeBlock(world, x-1 , y+2 , z , leaves);
			
		//y == 4
			
			for (int i = 0; i<5; i++) {
				this.changeBlock(world, x+i-2 , y+3 , z-2 , leaves);
					}
				
			for (int i = 0; i<5; i++) {
				this.changeBlock(world, x+i-2 , y+3 , z-1 , leaves);
					}
				
			for (int i = 0; i<5; i++) {
				this.changeBlock(world, x+i-2 , y+3 , z+1 , leaves);
					}
				
			for (int i = 0; i<5; i++) {
				this.changeBlock(world, x+i-2 , y+3 , z+2 , leaves);
					}
			
			this.changeBlock(world, x+2 , y+3 , z , leaves);
			this.changeBlock(world, x-2 , y+3 , z , leaves);
			this.changeBlock(world, x+1 , y+3 , z , leaves);
			this.changeBlock(world, x-1 , y+3 , z , leaves);
			
			//y == 5
			
			for (int i = 0; i<3; i++) {
				this.changeBlock(world, x+i-1 , y+4 , z-2 , leaves);
				}
								
			for (int i = 0; i<5; i++) {
				this.changeBlock(world, x+i-2 , y+4 , z-1 , leaves);
					}				
				
			for (int i = 0; i<5; i++) {
				this.changeBlock(world, x+i-2 , y+4 , z+1 , leaves);
					}				
				
			for (int i = 0; i<3; i++) {
				this.changeBlock(world, x+i-1 , y+4 , z+2 , leaves);
					}
			
			this.changeBlock(world, x+2 , y+4 , z , leaves);
			this.changeBlock(world, x-2 , y+4 , z , leaves);
			this.changeBlock(world, x+1 , y+4 , z , leaves);
			this.changeBlock(world, x-1 , y+4 , z , leaves);
			
			//y == 6
			
			this.changeBlock(world, x+1 , y + 5 , z+1 , leaves);
			this.changeBlock(world, x+1 , y + 5 , z   , leaves);
			this.changeBlock(world, x+1 , y + 5 , z-1 , leaves);
			this.changeBlock(world, x   , y + 5 , z+1 , leaves);
			this.changeBlock(world, x   , y + 5 , z   , leaves);
			this.changeBlock(world, x   , y + 5 , z-1 , leaves);
			this.changeBlock(world, x-1 , y + 5 , z+1 , leaves);
			this.changeBlock(world, x-1 , y + 5 , z   , leaves);
			this.changeBlock(world, x-1 , y + 5 , z-1 , leaves);
			
			return true;
			
	 }
	return false ;
	}
	public void changeBlock(World world, int x, int y, int z, Block block){
		BlockPos position = new BlockPos(x, y, z);
		if(world.getBlockState(position).getBlock() == Blocks.air || world.getBlockState(position).getBlock().isLeaves(world, position)) {
			world.setBlockState(position , block.getDefaultState());
		}
	}

}

