package kkaylium.TechliumCraft.inits;

import kkaylium.TechliumCraft.blocks.BlockGlowDirt;
import kkaylium.TechliumCraft.blocks.BlockGlowLeaves;
import kkaylium.TechliumCraft.blocks.BlockGlowLog;
import kkaylium.TechliumCraft.blocks.BlockGlowOre;
import kkaylium.TechliumCraft.blocks.BlockGlowPlanks;
import kkaylium.TechliumCraft.blocks.BlockGlowSapling;
import kkaylium.TechliumCraft.blocks.BlockGlowStone;
import kkaylium.TechliumCraft.blocks.ItemBlockGlowOre;
import kkaylium.TechliumCraft.lib.BlockIds;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class BlocksInit {

	public static Block glowOres;
	public static Block glowDirt;
	public static Block glowStone;
	public static Block glowLog;
	public static Block glowLeaves;
	public static Block glowSapling;
	public static Block glowPlanks;
	
	public static void blocksInit()
	{
		glowOres = new BlockGlowOre(BlockIds.GLOW_ORE_defaultId).setUnlocalizedName("GO");
			GameRegistry.registerBlock(glowOres, ItemBlockGlowOre.class, "glowOres");
		glowDirt = new BlockGlowDirt(BlockIds.GLOW_DIRT_defaultId).setUnlocalizedName("glowDirt").setTextureName("tcgg:glowDirt");
			GameRegistry.registerBlock(glowDirt, "glowDirt");
		glowStone = new BlockGlowStone(BlockIds.GLOW_STONE_defaultId).setUnlocalizedName("glowStone").setTextureName("tcgg:glowStone");
			GameRegistry.registerBlock(glowStone, "glowStone");
		glowLog = new BlockGlowLog(BlockIds.GLOW_WOOD_defaultId).setUnlocalizedName("glowLog").setTextureName("tcgg:glowLog");
			GameRegistry.registerBlock(glowLog, "glowLog");
		glowLeaves = new BlockGlowLeaves(BlockIds.GLOW_LEAVES_defaultId).setUnlocalizedName("glowLeaves").setTextureName("tcgg:glowLeaves");
			GameRegistry.registerBlock(glowLeaves, "glowLeaves");
		glowSapling = new BlockGlowSapling(BlockIds.GLOW_SAPLING_defaultId).setUnlocalizedName("glowSapling").setTextureName("tcgg:glowSapling");
			GameRegistry.registerBlock(glowSapling, "glowSapling");
		glowPlanks = new BlockGlowPlanks(BlockIds.GLOW_PLANKS_defaultId).setUnlocalizedName("glowPlanks").setTextureName("tcgg:glowPlanks");
			GameRegistry.registerBlock(glowPlanks, "glowPlanks");
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
		
		LanguageRegistry.addName(glowDirt, "Glow Dirt");
		LanguageRegistry.addName(glowStone, "Glow Stone");
		LanguageRegistry.addName(glowLog, "Glow Log");
		LanguageRegistry.addName(glowLeaves, "Glow Leaves");
		LanguageRegistry.addName(glowSapling, "Glow Sapling");
		LanguageRegistry.addName(glowPlanks, "Glow Planks");
	}
	
	public static void registerTileEntities()
	{
		//GameRegistry.registerTileEntity(TileEntityGlowBlock.class, "TileEntityGlowBlock");
	}

}
