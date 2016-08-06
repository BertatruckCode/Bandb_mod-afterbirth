package fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.tileEntity;

import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.model.ModelFurnitureKitchenWorktopA;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;

public class TileEntityFurnitureKitchenWorktopA extends TileEntity{
	
    private final ModelFurnitureKitchenWorktopA model;   
    
    private byte direction= (byte)0;
    private boolean isAngle = false;
		
	public TileEntityFurnitureKitchenWorktopA(){
		 this.model = new ModelFurnitureKitchenWorktopA();
	}
	
	@Override	
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);		
        this.direction = nbt.getByte("Direction");
        this.isAngle = nbt.getBoolean("angle");
	}

	@Override	
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setByte("Direction", this.direction);
		nbt.setBoolean("angle", this.isAngle);
	}
	
    public byte getDirection(){
        return direction;
    }

    public void setDirection(byte direction){
        this.direction = direction;
        this.worldObj.markBlockForUpdate(this.getPos());
    }

	public boolean isAngle() {
		return isAngle;
	}

	public void setAngle(boolean isAngle) {
		System.out.println("changing angle");
		this.isAngle = isAngle;
	}
 }

