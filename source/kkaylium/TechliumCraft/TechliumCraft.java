package kkaylium.TechliumCraft;

import kkaylium.TechliumCraft.creativetabs.GGTab;
import kkaylium.TechliumCraft.creativetabs.TCTab;
import kkaylium.TechliumCraft.gen.OverworldBiomeOreGen;
import kkaylium.TechliumCraft.inits.BlocksInit;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(name = Strings.MOD_NAME, modid = Strings.MOD_ID, version = "1.0.0a")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TechliumCraft {
	
	@Instance("tcgg")
	public static TechliumCraft instance;
	
	@SidedProxy(clientSide = "kkaylium.TechliumCraft.proxy.ClientProxy", serverSide = "kkaylium.TechliumCraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs GGTab = new GGTab(CreativeTabs.getNextID(), "Glow Glass");
	public static CreativeTabs TCTab = new TCTab(CreativeTabs.getNextID(), "Techlium Craft");
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LanguageRegistry.instance().addStringLocalization("itemGroup.Glow Glass", "Glow Glass");
		LanguageRegistry.instance().addStringLocalization("itemGroup.TechliumCraft", "TechliumCraft");
		
		BlocksInit.blocksInit();
		BlocksInit.addNames();
		BlocksInit.registerTileEntities();
		ItemsInit.initItems();
		ItemsInit.itemNames();
		
		GameRegistry.registerWorldGenerator(new OverworldBiomeOreGen());
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
