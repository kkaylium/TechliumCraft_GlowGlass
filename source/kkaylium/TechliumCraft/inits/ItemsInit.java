package kkaylium.TechliumCraft.inits;

import kkaylium.TechliumCraft.items.ItemGlowCrystals;
import kkaylium.TechliumCraft.lib.ItemIds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class ItemsInit {

	public static Item glowCrystals;
	
	public static void initItems() {
		glowCrystals = new ItemGlowCrystals(ItemIds.GLOW_CRYSTALS_defaultId).setUnlocalizedName("GC");
			GameRegistry.registerItem(glowCrystals, "glowCrystals");
	}
	public static void itemNames(){
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 0), "Glow Crystal: White");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 1), "Glow Crystal: Black");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 2), "Glow Crystal: Red");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 3), "Glow Crystal: Orange");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 4), "Glow Crystal: Yellow");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 5), "Glow Crystal: Lime");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 6), "Glow Crystal: Green");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 7), "Glow Crystal: Sky");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 8), "Glow Crystal: Blue");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 9), "Glow Crystal: Lilac");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 10), "Glow Crystal: Purple");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 11), "Glow Crystal: Pink");
		LanguageRegistry.addName(new ItemStack(glowCrystals, 1, 12), "Glow Crystal: Special");
	}
}
