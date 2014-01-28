package kkaylium.TechliumCraft.tileentities;

import java.util.Arrays;

import kkaylium.TechliumCraft.lib.BlockIds;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGlowBlock extends TileEntity{
	
	public static int color; //13 is base color
	public static boolean[] bool = new boolean[13];
	
	public TileEntityGlowBlock() {
		color = 13;
	}
	
	@Override
	public void updateEntity() {
		if (!worldObj.isRemote){
			worldObj.addBlockEvent(xCoord, yCoord, zCoord, BlockIds.GLOW_BLOCK_defaultId, 1, 0);
//			switch(color){
//				case 0: Arrays.fill(bool, false); bool[0] = true; break;
//				case 1: color = 1; break;
//				case 2: color = 2; break;
//				case 3: color = 3; break;
//				case 4: color = 4; break;
//				case 5: color = 5; break;
//				case 6: color = 6; break;
//				case 7: color = 7; break;
//				case 8: color = 8; break;
//				case 9: color = 9; break;
//				case 10: color = 10; break;
//				case 11: color = 11; break;
//				case 12: color = 12; break;
//				default: color = 13; break;
//			}
		}
	}
	
	@Override
	public boolean receiveClientEvent(int id, int value)
	{
		if(worldObj.isRemote && id == 1)
		{
			worldObj.markBlockForRenderUpdate(xCoord, yCoord, zCoord);
		}
		
		return true;
	}
	
	public static int getCrystalUsed(int cc){
		switch(cc){
			case 0: color = 0; break;
			case 1: color = 1; break;
			case 2: color = 2; break;
			case 3: color = 3; break;
			case 4: color = 4; break;
			case 5: color = 5; break;
			case 6: color = 6; break;
			case 7: color = 7; break;
			case 8: color = 8; break;
			case 9: color = 9; break;
			case 10: color = 10; break;
			case 11: color = 11; break;
			case 12: color = 12; break;
			default: color = 13; break;
		}
		return color;
	}
	
	public void changeColor(int x, int y, int z){
		if (!worldObj.isRemote){
			switch(color){
				case 0: Arrays.fill(bool, false); bool[0] = true; break;
				case 1: Arrays.fill(bool, false); bool[1] = true; break;
				case 2: Arrays.fill(bool, false); bool[2] = true; break;
				case 3: Arrays.fill(bool, false); bool[3] = true; break;
				case 4: Arrays.fill(bool, false); bool[4] = true; break;
				case 5: Arrays.fill(bool, false); bool[5] = true; break;
				case 6: Arrays.fill(bool, false); bool[6] = true; break;
				case 7: Arrays.fill(bool, false); bool[7] = true; break;
				case 8: Arrays.fill(bool, false); bool[8] = true; break;
				case 9: Arrays.fill(bool, false); bool[9] = true; break;
				case 10: Arrays.fill(bool, false); bool[10] = true; break;
				case 11: Arrays.fill(bool, false); bool[11] = true; break;
				case 12: Arrays.fill(bool, false); bool[12] = true; break;
				default: Arrays.fill(bool, false); bool[13] = true; break;
			}
		}
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		
		compound.setShort("Color", (short)color);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		
		color = compound.getShort("Color");
	}

}
