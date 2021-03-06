package fr.bentur_and_bertatruck.bandb_mod.common.handler;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFood;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class CraftingHandler {

	public void craftEvent(PlayerEvent.ItemCraftedEvent event) {

		// Alliages

		if (event.crafting.getItem().equals(BandbFood.itemMeatChickenFullRaw)) {

			

		}

		else if (event.crafting.getItem().equals(BandbFood.itemMeatChickenFullRaw)) {


		}
	}
/*
	@SubscribeEvent
	public void pickUpEvent(ItemPickupEvent event) {

		if (event.pickedUp.getEntityItem().isItemEqual(
				new ItemStack(ModTest.carbon))) {

			if (event.player != null)

				event.player.addStat(ModTest.findCarbon, 1);

		}
	}
	*/
	
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event) {
		
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
			if (event.craftMatrix.getStackInSlot(i) != null) {
				
				ItemStack item0 = event.craftMatrix.getStackInSlot(i);
					if (item0 != null && item0.getItem() == BandbItems.itemToolKnifeIron) {
						ItemStack k = new ItemStack(BandbItems.itemToolKnifeIron, 2, (item0.getItemDamage() + 1));
						
						if (k.getItemDamage() >= k.getMaxDamage()) {
							k.stackSize--;
						}
						
					event.craftMatrix.setInventorySlotContents(i, k);
						
					}
					
				ItemStack item1 = event.craftMatrix.getStackInSlot(i);
					if (item1 != null && item1.getItem() == BandbItems.itemToolFlyingPan) {
						ItemStack k = new ItemStack(BandbItems.itemToolFlyingPan, 2, (item1.getItemDamage() + 1));
						
						if (k.getItemDamage() >= k.getMaxDamage()) {
							k.stackSize--;
						}
						
					event.craftMatrix.setInventorySlotContents(i, k);
						
					}
				
				ItemStack item2 = event.craftMatrix.getStackInSlot(i);
				
				if (item2 != null && item2.getItem() == BandbFood.itemMeatChickenFullRaw) {
					ItemStack k = new ItemStack(BandbFood.itemMeatChickenFleshRaw, 3);

					event.player.inventory.addItemStackToInventory(k);
										
				}

				}
			}
		}
	

}
