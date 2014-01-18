package kkaylium.TechliumCraft.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGlowBlockTryOne extends TileEntity{
	
	public static int color = 0;
	
	public TileEntityGlowBlockTryOne(){
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		color = nbt.getInteger("color");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("color", color);
	}

}
