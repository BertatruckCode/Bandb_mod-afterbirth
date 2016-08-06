package fr.bentur_and_bertatruck.bandb_mod.common.block.furniture;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;

public abstract class BlockFurniture extends BlockContainer {
	
	private TileEntity tileEntity;
	
	public BlockFurniture(TileEntity tileEntity) {
		super(Material.wood);
		this.setResistance(5f);
		this.setHardness(4f);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
		
		this.tileEntity = tileEntity;
	}

	// You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType() {
		return bandb_mod_ClientProxy.tesrRenderId;
	}

	// It's not an opaque cube, so you need this.
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	// It's not a normal block, so you need this too.
	public boolean renderAsNormalBlock() {
		return false;
	}

	
}
