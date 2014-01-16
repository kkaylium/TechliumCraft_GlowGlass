package kkaylium.TechliumCraft.tileentities;

import kkaylium.TechliumCraft.lib.BlockIds;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGlowBlock extends TileEntity{
	
	private int timer;
	
	public TileEntityGlowBlock()
	{
		timer = 100;
	}
	
	@Override
	public void updateEntity()
	{
		if (!worldObj.isRemote) {
			if (timer == 0 && !worldObj.isRemote) {
				leak(xCoord + 1, yCoord, zCoord);
				leak(xCoord - 1, yCoord, zCoord);
				leak(xCoord, yCoord, zCoord + 1);
				leak(xCoord, yCoord, zCoord - 1);
				worldObj.addBlockEvent(xCoord, yCoord, zCoord, BlockIds.GB_WHITE_defaultId, 1, 0);
			}

			timer--;
		}
	}
	
	private void leak(int x, int y, int z)
	{
		if(worldObj.isAirBlock(x, y, z))
		{
			worldObj.setBlock(x, y, z, BlockIds.GB_WHITE_defaultId);
		}
	}
	
	@Override
	public boolean receiveClientEvent(int id, int value)
	{
		if(worldObj.isRemote && id == 1)
		{
			if (value == 0)
			{
				timer = -1;
			}
			else
			{
				timer = 100;
			}
			worldObj.markBlockForRenderUpdate(xCoord, yCoord, zCoord);
		}
		
		return true;
	}
	
	public boolean isIdle()
	{
		return timer > 0;
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		
		compound.setShort("Timer", (short)timer);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		
		timer = compound.getShort("Timer");
	}

}
