package fr.bentur_and_bertatruck.bandb_mod.common.item;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.item.Item;

public class ItemBottle extends Item {
		
	public ItemBottle() {
		this.setMaxStackSize(32);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsBottle);	
	}
	
}