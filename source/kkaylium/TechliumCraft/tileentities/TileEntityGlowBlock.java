package kkaylium.TechliumCraft.tileentities;

import java.util.Arrays;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGlowBlock extends TileEntity
{

    public int color; // 13 is base color

    public boolean isDirty = false;

    public TileEntityGlowBlock()
    {
        color = 13;
    }

    @Override
    public void updateEntity()
    {
        if (isDirty)
        {
            isDirty = false;
            worldObj.markBlockForRenderUpdate(xCoord, yCoord, zCoord);   
        }
    }

    public int getCrystalUsed(int cc)
    {
        if (cc <= 12) color = cc;
        else color = 13;
        isDirty = true;
        return color;
    }

    @Override
    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);

        compound.setShort("Color", (short) color);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);

        color = compound.getShort("Color");
    }

    /* Packets */
    @Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound tag = new NBTTagCompound();
        writeToNBT(tag);
        return new Packet132TileEntityData(xCoord, yCoord, zCoord, 1, tag);
    }

    @Override
    public void onDataPacket(INetworkManager net, Packet132TileEntityData packet)
    {
        readFromNBT(packet.data);
        worldObj.markBlockForRenderUpdate(xCoord, yCoord, zCoord);
    }
}
