package fr.bentur_and_bertatruck.bandb_mod.common.item;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.item.Item;

public class ItemCocktail extends Item{
	
	
	public ItemCocktail(){
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsCoktail);
		this.setMaxStackSize(16);
	}
}
