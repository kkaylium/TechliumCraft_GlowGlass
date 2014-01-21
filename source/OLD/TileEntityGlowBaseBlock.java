package OLD;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGlowBaseBlock extends TileEntity{
	
	public static String texture;
	
	public TileEntityGlowBaseBlock()
	{
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setString("Texture", texture);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		
		texture = compound.getString("Texture");
	}

}
