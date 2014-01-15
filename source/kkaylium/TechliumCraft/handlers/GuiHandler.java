package kkaylium.TechliumCraft.handlers;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.gui.GuiInfuserLevelOne;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler{

	public GuiHandler()
	{
		NetworkRegistry.instance().registerGuiHandler(TechliumCraft.instance, this);
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		switch (ID)
		{
		case 0:
			return new GuiInfuserLevelOne();
		default:
			return null;
		}
	}
}
