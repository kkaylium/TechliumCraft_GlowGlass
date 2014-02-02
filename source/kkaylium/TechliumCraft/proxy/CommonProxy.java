package kkaylium.TechliumCraft.proxy;

import kkaylium.TechliumCraft.mobs.entities.EntityRainbowSlime;
import cpw.mods.fml.common.registry.EntityRegistry;


public class CommonProxy{

//	public CommonProxy() {
//		NetworkRegistry.instance().registerGuiHandler(TechliumCraft.instance, this);
//	}
//	
//	@Override
//	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//		return null;
//	}
//
//	@Override
//	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//		return null;
//	}

	public void registerRenderInformation()
	{
		EntityRegistry.registerGlobalEntityID(EntityRainbowSlime.class, "RainbowSlime", EntityRegistry.findGlobalUniqueEntityId(), 10, 0);
	}
	
}
