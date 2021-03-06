package fr.bentur_and_bertatruck.bandb_mod.common.item;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBeverages;

public class ItemBeverageFruitJuice extends ItemBeverage {
	
	static Item itemDrop = BandbBeverages.itemPint;
	
	public ItemBeverageFruitJuice() {
		super(itemDrop);
	}

	public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--item.stackSize;
		}
		if (!world.isRemote) {
			player.addPotionEffect(new PotionEffect(1, 400));
			;
		}

		if (!this.playerHasItemDrop(player) && player.inventory.getFirstEmptyStack() == -1) {
			EntityItem entityitem = new EntityItem(world, player.posX, player.posY + 1, player.posZ, new ItemStack(itemDrop));
			if (!world.isRemote)
				world.spawnEntityInWorld(entityitem);
		} else
			player.inventory.addItemStackToInventory(new ItemStack(itemDrop));
		
		return item;
	}

	public int getMaxItemUseDuration(ItemStack item) {
		return 32;
	}

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	public EnumAction getItemUseAction(ItemStack item) {
		return EnumAction.DRINK;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack item, World world,
			EntityPlayer player) {
		player.setItemInUse(item, this.getMaxItemUseDuration(item));
		return item;
	}
}
