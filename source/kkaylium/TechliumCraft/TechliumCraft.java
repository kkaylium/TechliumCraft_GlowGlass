package kkaylium.TechliumCraft;

import kkaylium.TechliumCraft.inits.BlocksInit;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(name = Strings.MOD_NAME, modid = Strings.MOD_ID, version = "1.0.0a")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TechliumCraft {
	
	@Instance("techliumcraft")
	public static TechliumCraft instance;
	
	@SidedProxy(clientSide = "kkaylium.TechliumCraft.proxy.ClientProxy", serverSide = "kkaylium.TechliumCraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		BlocksInit.blocksInit();
		BlocksInit.registerTileEntities();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
