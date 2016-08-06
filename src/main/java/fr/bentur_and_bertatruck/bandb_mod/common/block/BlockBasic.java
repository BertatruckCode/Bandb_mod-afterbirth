package fr.bentur_and_bertatruck.bandb_mod.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block{

	public BlockBasic(Material material) {
		super(material);
		setHardness(5.0F);
		setResistance(1.0F);
		
	}
	
}
