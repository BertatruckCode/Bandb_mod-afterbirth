package fr.bentur_and_bertatruck.bandb_mod.common.item;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBase extends Item{

	private final String name = "tutorialItem";

	public ItemBase(){		
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Bandb_mod.MODID + ":" + name);
	}
	
	public String getName(){		
		return name;
	}
}
