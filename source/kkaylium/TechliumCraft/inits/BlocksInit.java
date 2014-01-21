package kkaylium.TechliumCraft.inits;

import kkaylium.TechliumCraft.blocks.BlockGlowOre;
import kkaylium.TechliumCraft.blocks.ItemBlockGlowOre;
import kkaylium.TechliumCraft.lib.BlockIds;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class BlocksInit {

	public static Block glowOres;
	
	public static void blocksInit()
	{
		glowOres = new BlockGlowOre(BlockIds.GLOW_ORE_defaultId).setUnlocalizedName("GO");
			GameRegistry.registerBlock(glowOres, ItemBlockGlowOre.class, "glowOres");
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 0), "Glow Ore: White");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 1), "Glow Ore: Black");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 2), "Glow Ore: Red");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 3), "Glow Ore: Orange");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 4), "Glow Ore: Yellow");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 5), "Glow Ore: Lime");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 6), "Glow Ore: Green");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 7), "Glow Ore: Sky");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 8), "Glow Ore: Blue");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 9), "Glow Ore: Lilac");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 10), "Glow Ore: Purple");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 11), "Glow Ore: Pink");
	}
	
	public static void registerTileEntities()
	{
		//GameRegistry.registerTileEntity(TileEntityGlowBlock.class, "TileEntityGlowBlock");
	}

}
