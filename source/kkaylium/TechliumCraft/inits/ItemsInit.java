package kkaylium.TechliumCraft.inits;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import kkaylium.TechliumCraft.items.ItemGlowSticks;
import kkaylium.TechliumCraft.lib.ItemIds;
import net.minecraft.item.Item;

public class ItemsInit {

	public static Item glowSticks;
	
	public static void initItems() {
		
		glowSticks = new ItemGlowSticks(ItemIds.glowStickDefaultId);
			GameRegistry.registerItem(glowSticks, "glowSticks");
		
	}
	public static void itemNames(){
		
		LanguageRegistry.addName(glowSticks, "Glow Sticks");
	}
}
