package kkaylium.TechliumCraft.proxy;

import kkaylium.TechliumCraft.lib.BlockIds;
import kkaylium.TechliumCraft.lib.Strings;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class TechliumCraftConfig {

	public static void configInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		BlockIds.GLOW_DIRT_ID = config.getBlock(Strings.GLOW_DIRT_NAME, 250).getInt();

		BlockIds.GLOW_STONE_ID = config.getBlock(Strings.GLOW_STONE_NAME, 251).getInt();

		BlockIds.GLOW_LOG_ID = config.getBlock(Strings.GLOW_LOG_NAME, 252).getInt();

		BlockIds.GLOW_LEAVES_ID = config.getBlock(Strings.GLOW_LEAVES_NAME, 250).getInt();
		
		BlockIds.GLOW_BLOCK_ID = config.getBlock(Strings.GLOW_BLOCK_NAME, 500).getInt();

		BlockIds.GLOW_GLASS_ID = config.getBlock(Strings.GLOW_GLASS_NAME, 501).getInt();

		BlockIds.GLOW_ORE_ID = config.getBlock(Strings.GLOW_ORE_NAME, 502).getInt();
		
		BlockIds.GLOW_PLANKS_ID = config.getBlock(Strings.GLOW_PLANKS_NAME, 503).getInt();		

		BlockIds.GLOW_SAPLING_ID = config.getBlock(Strings.GLOW_SAPLING_NAME, 504).getInt();

		BlockIds.GLOW_PORTAL_ID = config.getBlock(Strings.GLOW_PORTAL_NAME, 506).getInt();
		
		BlockIds.GLOW_FENCE_ID = config.getBlock(Strings.GLOW_FENCE_NAME, 507).getInt();
		
		BlockIds.GLOW_GATE_ID = config.getBlock(Strings.GLOW_GATE_NAME, 508).getInt();
		
		config.save();
	}
}
