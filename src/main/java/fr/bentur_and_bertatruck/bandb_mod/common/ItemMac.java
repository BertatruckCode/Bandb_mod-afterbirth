package fr.bentur_and_bertatruck.bandb_mod.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMac extends Item{
	
	public ItemMac(){				
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer thePlayer){
		thePlayer.openGui(Bandb_mod.instance, Bandb_mod.guiIDMac, thePlayer.worldObj, (int) thePlayer.posX, (int) thePlayer.posY, (int) thePlayer.posZ);
     	return par1ItemStack;
	}
}
