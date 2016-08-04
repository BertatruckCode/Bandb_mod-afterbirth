package fr.bentur_and_bertatruck.bandb_mod.machine.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBeverages;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipePress;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPressInput;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPressPint;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPress;

public class ContainerPress extends Container {
	private TileEntityPress tileEntity;
	public int lastWorkTimeLeft;
	public int lastCurrentItemWorkTime;
	public int lastWorkTime;

	public ContainerPress(InventoryPlayer inventory, TileEntityPress tileentity) {
		this.tileEntity = tileentity;
		this.addSlotToContainer(new SlotSyrupMachineOutput(tileentity, 0, 111, 26	)); //output
		this.addSlotToContainer(new SlotSyrupMachineFuel(tileentity, 1, 8, 62)); //fuel
		this.addSlotToContainer(new SlotPressInput(tileentity, 3, 56, 14	)); //input 1
		this.addSlotToContainer(new SlotPressPint(tileentity, 2, 56, 38)); //pint

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9,
						8 + j * 18, 84 + i * 18));
			}
		}
		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
		}
	}

	public void addCraftingToCrafters(ICrafting icrafting) {
		super.addCraftingToCrafters(icrafting);
		icrafting.sendProgressBarUpdate(this, 0, this.tileEntity.workTime);
		icrafting.sendProgressBarUpdate(this, 1, this.tileEntity.workTimeLeft);
		icrafting.sendProgressBarUpdate(this, 2, this.tileEntity.currentItemWorkTime);
	}

	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for (int i = 0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			if (this.lastWorkTime != this.tileEntity.workTime) {
				icrafting.sendProgressBarUpdate(this, 0,this.tileEntity.workTime);
			}
			if (this.lastWorkTimeLeft != this.tileEntity.workTimeLeft) {
				icrafting.sendProgressBarUpdate(this, 1,this.tileEntity.workTimeLeft);
			}
			if (this.lastCurrentItemWorkTime != this.tileEntity.currentItemWorkTime) {
				icrafting.sendProgressBarUpdate(this, 2,this.tileEntity.currentItemWorkTime);
			}
		}
		this.lastWorkTime = this.tileEntity.workTime;
		this.lastWorkTimeLeft = this.tileEntity.workTimeLeft;
		this.lastCurrentItemWorkTime = this.tileEntity.currentItemWorkTime;
	}

	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2) {
		if (par1 == 0) {
			this.tileEntity.workTime = par2;
		}
		if (par1 == 1) {
			this.tileEntity.workTimeLeft = par2;
		}
		if (par1 == 2) {
			this.tileEntity.currentItemWorkTime = par2;
		}
	}

	public ItemStack transferStackInSlot(EntityPlayer player, int slotid) {
		super.transferStackInSlot(player, slotid);
		ItemStack stack = null;
		Slot slot = (Slot) inventorySlots.get(slotid);
		if (slot != null && slot.getHasStack()) {
			stack = slot.getStack();
			switch (slotid) {
			case 0:
				if (!this.mergeItemStack(stack, 4, inventorySlots.size(), true))
				return null;
			case 1:
				if (!this.mergeItemStack(stack, 4, inventorySlots.size(), true))
					return null;
				break;
			case 2: {
				if (!this.mergeItemStack(stack, 4, inventorySlots.size(), true))
					return null;
				break;
			}
			case 3: {
				if (!this.mergeItemStack(stack, 4, inventorySlots.size(), true))
					return null;
				break;
			}
			default: {
				 if (BandbFuel.getFuelValue(stack.getItem()) > 0) {
					if (!this.mergeItemStack(stack, 1, 2, false))
						return null;
				} else if (stack.getItem() == BandbBeverages.itemPint) {
					if (!this.mergeItemStack(stack, 2, 3, false))
						return null;
				} else if (RecipePress.getAmountNeeded(stack.getItem()) != 0) {
					if (!this.mergeItemStack(stack, 3, 4, false))
						return null;
				} else {
					return null;
				}
			}
			}
			if (stack.stackSize == 0) {
				slot.putStack(null);
			}
		}
		return stack;
	}

	public boolean canInteractWith(EntityPlayer var1) {
		return true;
	}
}