package kkaylium.TechliumCraft;

import net.minecraft.creativetab.CreativeTabs;
import kkaylium.TechliumCraft.inits.BlocksInit;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.proxy.CommonProxy;
import kkaylium.TechliumCraft.recipes.TCBasicRecipes;
import kkaylium.TechliumCraft.creativetabs.*;
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
	
	public static CreativeTabs GGTab = new GGTab(CreativeTabs.getNextID(), "Glow Glass");
	public static CreativeTabs TCTab = new TCTab(CreativeTabs.getNextID(), "Techlium Craft");
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		BlocksInit.blocksInit();
		BlocksInit.registerTileEntities();
		BlocksInit.addNames();
		ItemsInit.initItems();
		ItemsInit.itemNames();
		TCBasicRecipes.initBasicRecipes();
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
