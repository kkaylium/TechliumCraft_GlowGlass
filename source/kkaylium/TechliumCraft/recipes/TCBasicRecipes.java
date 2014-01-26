package kkaylium.TechliumCraft.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import kkaylium.TechliumCraft.inits.BlocksInit;
import kkaylium.TechliumCraft.inits.ItemsInit;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class TCBasicRecipes {

	public static ItemStack glass = new ItemStack(Block.glass);
	public static ItemStack glowSticks = new ItemStack(ItemsInit.glowSticks);
	public static ItemStack glowPlanks = new ItemStack(BlocksInit.glowPlanks);
	public static ItemStack glowLog = new ItemStack(BlocksInit.glowLog);
	
	public static void initBasicRecipes() {
		
		//GameRegistry.addShapelessRecipe(new ItemStack(BlocksInit.glowPlanks, 4), "#", '#', glowLog);
		GameRegistry.addRecipe(new ItemStack(ItemsInit.glowSticks, 4), "#", "#",'#', glowPlanks);
		
	}

}
