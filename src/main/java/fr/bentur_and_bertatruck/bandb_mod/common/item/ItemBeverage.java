package fr.bentur_and_bertatruck.bandb_mod.common.item;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBeverage extends Item {

	Item itemDrop;

	public ItemBeverage(Item item) {
		this.setMaxStackSize(32);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsBeverage);
		itemDrop = item;

	}

	public Item getBottleEmpty(){
		//System.out.println(itemDrop.getUnlocalizedName());

		return this.itemDrop;
	}

	// check if the player has the itemDrop in is inventory
	public boolean playerHasItemDrop(EntityPlayer player) {
		for (int i = 0; i < player.inventory.mainInventory.length; i++) {
			ItemStack itemstack = player.inventory.mainInventory[i];
			if (itemstack != null) {
				Item item = itemstack.getItem();

				if (item == itemDrop) {
					return true;
				}
			}
		}
		return false;
	}
	/*
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return itemIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iiconRegister) {
		this.itemIcon = iiconRegister.registerIcon(Bandb_mod.MODID + ":bottle/" + this.getTextureName());
		//System.out.println(this.getTextureName());
	}
	
	public String getTextureName(){
		return this.getUnlocalizedName().substring(5);
	}
	*/
}
