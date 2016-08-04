package fr.bentur_and_bertatruck.bandb_mod.common.item;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.item.Item;

public class ItemToolsKitchen extends Item{
	
	public ItemToolsKitchen(){
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(64);
		this.setNoRepair();
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);		
	}
	
}
