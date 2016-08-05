package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

	public class BlockTreePlank extends Block{

	public BlockTreePlank(){
		super(Material.wood);	
		
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsWood);		
		this.setHardness(2.0F);
		this.setHarvestLevel("axe",0);
		this.setStepSound(Block.soundTypeWood);

	}	 	
}
