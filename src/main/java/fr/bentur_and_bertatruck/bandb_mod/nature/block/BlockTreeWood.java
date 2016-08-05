package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;

public class BlockTreeWood extends BlockLog{
	
	public BlockTreeWood(Material material)
	{   
		super();
		this.setHardness(2.0F);
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(BandbCreativeTabs.CreativeTabsWood);
	}
	
}

