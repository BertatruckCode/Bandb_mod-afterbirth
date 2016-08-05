package fr.bentur_and_bertatruck.bandb_mod.machine.slot;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotCottonCandyMachineSugar extends Slot{

	public SlotCottonCandyMachineSugar(IInventory inv, int par2, int par3, int par4) {
		super(inv, par2, par3, par4);
		}
		@Override
		public boolean canTakeStack(EntityPlayer par1EntityPlayer) {
		return true;
		}
		@Override
		public boolean isItemValid(ItemStack itemstack) {
		if(itemstack.getItem() == BandbFood.itemIngredientCottonCandySugar){
			return true;
		}else
			return false;
	}
}
