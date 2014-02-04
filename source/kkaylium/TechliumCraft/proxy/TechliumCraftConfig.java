package kkaylium.TechliumCraft.proxy;

import kkaylium.TechliumCraft.lib.BlockIds;
import kkaylium.TechliumCraft.lib.ItemIds;
import kkaylium.TechliumCraft.lib.Strings;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class TechliumCraftConfig {

	public static void configInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		BlockIds.GLOW_DIRT_ID = config.getBlock(Strings.GLOW_DIRT_NAME, BlockIds.GLOW_DIRT_defaultId).getInt();

		BlockIds.GLOW_STONE_ID = config.getBlock(Strings.GLOW_STONE_NAME, BlockIds.GLOW_STONE_defaultId).getInt();

		BlockIds.GLOW_LOG_ID = config.getBlock(Strings.GLOW_LOG_NAME, BlockIds.GLOW_LOG_defaultId).getInt();

		BlockIds.GLOW_LEAVES_ID = config.getBlock(Strings.GLOW_LEAVES_NAME, BlockIds.GLOW_LEAVES_defaultId).getInt();
		
		BlockIds.GLOW_BLOCK_ID = config.getBlock(Strings.GLOW_BLOCK_NAME, BlockIds.GLOW_BLOCK_defaultId).getInt();

		BlockIds.GLOW_GLASS_ID = config.getBlock(Strings.GLOW_GLASS_NAME, BlockIds.GLOW_GLASS_defaultId).getInt();

		BlockIds.GLOW_ORE_ID = config.getBlock(Strings.GLOW_ORE_NAME, BlockIds.GLOW_ORE_defaultId).getInt();
		
		BlockIds.GLOW_PLANKS_ID = config.getBlock(Strings.GLOW_PLANKS_NAME, BlockIds.GLOW_PLANKS_defaultId).getInt();		

		BlockIds.GLOW_SAPLING_ID = config.getBlock(Strings.GLOW_SAPLING_NAME, BlockIds.GLOW_SAPLING_defaultId).getInt();

		BlockIds.GLOW_PORTAL_ID = config.getBlock(Strings.GLOW_PORTAL_NAME, BlockIds.GLOW_PORTAL_defaultId).getInt();
		
		BlockIds.GLOW_FENCE_ID = config.getBlock(Strings.GLOW_FENCE_NAME, BlockIds.GLOW_FENCE_defaultId).getInt();
		
		BlockIds.GLOW_GATE_ID = config.getBlock(Strings.GLOW_GATE_NAME, BlockIds.GLOW_GATE_defaultId).getInt();
		
		BlockIds.GLOW_DOOR_ID = config.getBlock(Strings.GLOW_DOOR_NAME, BlockIds.GLOW_DOOR_defaultId).getInt();		
		
		//Liquids
		BlockIds.SERUM_DIRTY_STILL_ID = config.getBlock(Strings.SERUM_DIRTY_STILL_NAME, BlockIds.SERUM_DIRTY_STILL_defaultId).getInt();
		BlockIds.SERUM_DIRTY_FLOWING_ID = config.getBlock(Strings.SERUM_DIRTY_FLOWING_NAME, BlockIds.SERUM_DIRTY_FLOWING_defaultId).getInt();
		
		//Items
		ItemIds.GLOW_CRYSTALS_ID = config.getItem(Strings.GLOW_CRYSTALS_NAME, ItemIds.GLOW_CRYSTALS_defaultId).getInt();
		ItemIds.GLOW_STICK_ID = config.getItem(Strings.GLOW_STICKS_NAME, ItemIds.GLOW_DOOR_ITEM_defaultId).getInt();
		ItemIds.GLOW_DOOR_ITEM_ID = config.getItem(Strings.GLOW_DOOR_ITEM_KEY, ItemIds.GLOW_DOOR_ITEM_defaultId).getInt();
		
		config.save();
	}
}
