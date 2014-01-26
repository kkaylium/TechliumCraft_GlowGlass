package kkaylium.TechliumCraft.tileentities;

import kkaylium.TechliumCraft.lib.BlockIds;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGlowBlock extends TileEntity{
	
	public int type = 0;
	public static String[] icons = new String[]{"GBWhite", "GBBlack", "GBRed", "GBOrange", "GBYellow", "GBLime", "GBGreen", "GBSky", "GBBlue", "GBLilac", "GBPurple", "GBPink", "GBSpecial"};
	
	public TileEntityGlowBlock(){
		
	}
	
	@Override
	public void updateEntity() {
		if (!worldObj.isRemote) {
				worldObj.addBlockEvent(xCoord, yCoord, zCoord, BlockIds.GLOW_BLOCK_defaultId, 1, 0);
			}
	}
	
	public int blockChangeTexture()
	{
		//this.blockType.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9)
		return 0;
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
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		type = nbt.getInteger("Type");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("Type", type);
	}

}
