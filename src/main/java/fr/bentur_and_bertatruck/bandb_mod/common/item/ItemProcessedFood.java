package fr.bentur_and_bertatruck.bandb_mod.common.item;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemProcessedFood extends ItemFood{

	public ItemProcessedFood(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
	}

}
