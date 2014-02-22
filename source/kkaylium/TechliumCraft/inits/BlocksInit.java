package kkaylium.TechliumCraft.inits;

import kkaylium.TechliumCraft.blocks.BlockGlowBlock;
import kkaylium.TechliumCraft.blocks.BlockGlowDirt;
import kkaylium.TechliumCraft.blocks.BlockGlowFence;
import kkaylium.TechliumCraft.blocks.BlockGlowGlass;
import kkaylium.TechliumCraft.blocks.BlockGlowLandPortal;
import kkaylium.TechliumCraft.blocks.BlockGlowLeaves;
import kkaylium.TechliumCraft.blocks.BlockGlowLog;
import kkaylium.TechliumCraft.blocks.BlockGlowOre;
import kkaylium.TechliumCraft.blocks.BlockGlowPlanks;
import kkaylium.TechliumCraft.blocks.BlockGlowSapling;
import kkaylium.TechliumCraft.blocks.BlockGlowStone;
import kkaylium.TechliumCraft.blocks.ItemBlockGlowDirt;
import kkaylium.TechliumCraft.blocks.ItemBlockGlowOre;
import kkaylium.TechliumCraft.blocks.ItemBlockGlowStone;
import kkaylium.TechliumCraft.blocks.liquids.BlockSerumDirtyFlowing;
import kkaylium.TechliumCraft.blocks.liquids.BlockSerumDirtyStill;
import kkaylium.TechliumCraft.blocks.machines.BlockInfuserT1;
import kkaylium.TechliumCraft.lib.BlockIds;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlock;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowFence;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowGlass;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowPlanks;
import kkaylium.TechliumCraft.tileentities.TileEntityInfuserT1;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
	public static Block glowLandPortal;
	
	public static Block glowBlock;
	public static Block glowGlass;
	public static Block glowFence;
	public static Block glowGate;
	public static Block glowDoor;
	
	public static Block infuserT1;
	
	public static Block serumDirtyStill;
	public static Block serumDirtyFlowing;
	
	public static Block liquidPipeSolid;
	public static Block liquidPipeTranparent;
	
	public static void blocksInit()
	{
		glowOres = new BlockGlowOre(BlockIds.GLOW_ORE_ID).setUnlocalizedName(Strings.GLOW_ORE_KEY);
			GameRegistry.registerBlock(glowOres, ItemBlockGlowOre.class, Strings.GLOW_ORE_KEY);
		glowDirt = new BlockGlowDirt(BlockIds.GLOW_DIRT_ID).setUnlocalizedName(Strings.GLOW_DIRT_KEY);
			GameRegistry.registerBlock(glowDirt, ItemBlockGlowDirt.class, Strings.GLOW_DIRT_KEY);
		glowStone = new BlockGlowStone(BlockIds.GLOW_STONE_ID).setUnlocalizedName(Strings.GLOW_STONE_KEY);
			GameRegistry.registerBlock(glowStone, ItemBlockGlowStone.class, Strings.GLOW_STONE_KEY);
		glowLog = new BlockGlowLog(BlockIds.GLOW_LOG_ID).setUnlocalizedName(Strings.GLOW_LOG_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.GLOW_LOG_KEY);
			GameRegistry.registerBlock(glowLog, Strings.GLOW_LOG_KEY);
		glowLeaves = new BlockGlowLeaves(BlockIds.GLOW_LEAVES_ID).setUnlocalizedName(Strings.GLOW_LEAVES_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.GLOW_LEAVES_KEY);
			GameRegistry.registerBlock(glowLeaves, Strings.GLOW_LEAVES_KEY);
		glowSapling = new BlockGlowSapling(BlockIds.GLOW_SAPLING_ID).setUnlocalizedName(Strings.GLOW_SAPLING_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.GLOW_SAPLING_KEY);
			GameRegistry.registerBlock(glowSapling, Strings.GLOW_SAPLING_KEY);
		glowPlanks = new BlockGlowPlanks(BlockIds.GLOW_PLANKS_ID).setUnlocalizedName(Strings.GLOW_PLANKS_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.GLOW_PLANKS_KEY);
			GameRegistry.registerBlock(glowPlanks, Strings.GLOW_PLANKS_KEY);
		glowLandPortal = new BlockGlowLandPortal(BlockIds.GLOW_PORTAL_ID).setUnlocalizedName(Strings.GLOW_PORTAL_KEY);
			GameRegistry.registerBlock(glowLandPortal, Strings.GLOW_PORTAL_KEY);
		glowBlock = new BlockGlowBlock(BlockIds.GLOW_BLOCK_ID).setUnlocalizedName(Strings.GLOW_BLOCK_KEY);
			GameRegistry.registerBlock(glowBlock, Strings.GLOW_BLOCK_KEY);
		glowGlass = new BlockGlowGlass(BlockIds.GLOW_GLASS_ID).setUnlocalizedName(Strings.GLOW_GLASS_KEY);
			GameRegistry.registerBlock(glowGlass, Strings.GLOW_GLASS_KEY);
		glowFence = new BlockGlowFence(BlockIds.GLOW_FENCE_ID, Strings.GLOW_FENCE_KEY).setUnlocalizedName(Strings.GLOW_FENCE_KEY);
			GameRegistry.registerBlock(glowFence, Strings.GLOW_FENCE_KEY);
		glowDoor = new BlockGlowFence(BlockIds.GLOW_DOOR_ID, Strings.GLOW_DOOR_KEY).setUnlocalizedName(Strings.GLOW_DOOR_ITEM_KEY);
			GameRegistry.registerBlock(glowDoor, Strings.GLOW_DOOR_KEY);
			
		infuserT1 = new BlockInfuserT1(BlockIds.INFUSERL1_defaultId).setUnlocalizedName("infuserT1");
			GameRegistry.registerBlock(infuserT1, "infuserL1");
			
		serumDirtyStill = new BlockSerumDirtyStill(BlockIds.SERUM_DIRTY_STILL_ID, Material.water).setUnlocalizedName(Strings.SERUM_DIRTY_STILL_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.SERUM_DIRTY_STILL_KEY);
			GameRegistry.registerBlock(serumDirtyStill, Strings.SERUM_DIRTY_STILL_KEY);
		serumDirtyFlowing = new BlockSerumDirtyFlowing(BlockIds.SERUM_DIRTY_FLOWING_ID, Material.water).setUnlocalizedName(Strings.SERUM_DIRTY_FLOWING_KEY).setTextureName(Strings.MOD_ID + ":" + Strings.SERUM_DIRTY_FLOWING_KEY);
			GameRegistry.registerBlock(serumDirtyFlowing, Strings.SERUM_DIRTY_FLOWING_KEY);
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 0), Strings.GLOW_ORE_NAME + " : White");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 1), Strings.GLOW_ORE_NAME + " : Black");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 2), Strings.GLOW_ORE_NAME + " : Red");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 3), Strings.GLOW_ORE_NAME + " : Orange");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 4), Strings.GLOW_ORE_NAME + " : Yellow");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 5), Strings.GLOW_ORE_NAME + " : Lime");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 6), Strings.GLOW_ORE_NAME + " : Green");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 7), Strings.GLOW_ORE_NAME + " : Sky");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 8), Strings.GLOW_ORE_NAME + " : Blue");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 9), Strings.GLOW_ORE_NAME + " : Lilac");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 10), Strings.GLOW_ORE_NAME + " : Purple");
		LanguageRegistry.addName(new ItemStack(glowOres, 1, 11), Strings.GLOW_ORE_NAME + " : Pink");
		
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 0), Strings.GLOW_DIRT_NAME + " : White");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 1), Strings.GLOW_DIRT_NAME + " : Black");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 2), Strings.GLOW_DIRT_NAME + " : Red");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 3), Strings.GLOW_DIRT_NAME + " : Orange");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 4), Strings.GLOW_DIRT_NAME + " : Yellow");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 5), Strings.GLOW_DIRT_NAME + " : Lime");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 6), Strings.GLOW_DIRT_NAME + " : Green");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 7), Strings.GLOW_DIRT_NAME + " : Sky");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 8), Strings.GLOW_DIRT_NAME + " : Blue");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 9), Strings.GLOW_DIRT_NAME + " : Lilac");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 10), Strings.GLOW_DIRT_NAME + " : Purple");
		LanguageRegistry.addName(new ItemStack(glowDirt, 1, 11), Strings.GLOW_DIRT_NAME + " : Pink");
		
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 0), Strings.GLOW_STONE_NAME + " : White");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 1), Strings.GLOW_STONE_NAME + " : Black");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 2), Strings.GLOW_STONE_NAME + " : Red");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 3), Strings.GLOW_STONE_NAME + " : Orange");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 4), Strings.GLOW_STONE_NAME + " : Yellow");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 5), Strings.GLOW_STONE_NAME + " : Lime");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 6), Strings.GLOW_STONE_NAME + " : Green");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 7), Strings.GLOW_STONE_NAME + " : Sky");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 8), Strings.GLOW_STONE_NAME + " : Blue");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 9), Strings.GLOW_STONE_NAME + " : Lilac");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 10), Strings.GLOW_STONE_NAME + " : Purple");
		LanguageRegistry.addName(new ItemStack(glowStone, 1, 11), Strings.GLOW_STONE_NAME + " : Pink");
		
		LanguageRegistry.addName(glowLog, Strings.GLOW_LOG_NAME);
		LanguageRegistry.addName(glowLeaves, Strings.GLOW_LEAVES_NAME);
		LanguageRegistry.addName(glowSapling, Strings.GLOW_SAPLING_NAME);
		LanguageRegistry.addName(glowPlanks, Strings.GLOW_PLANKS_NAME);
		LanguageRegistry.addName(glowLandPortal, Strings.GLOW_PORTAL_NAME);
		LanguageRegistry.addName(glowBlock, Strings.GLOW_BLOCK_NAME);
		LanguageRegistry.addName(glowGlass, Strings.GLOW_GLASS_NAME);
		LanguageRegistry.addName(glowFence, Strings.GLOW_FENCE_NAME);
		LanguageRegistry.addName(glowDoor, Strings.GLOW_DOOR_NAME);
		
		LanguageRegistry.addName(infuserT1, "Serum Infuser: Tier One");
		
		LanguageRegistry.addName(serumDirtyStill, Strings.SERUM_DIRTY_STILL_NAME);
		LanguageRegistry.addName(serumDirtyFlowing, Strings.SERUM_DIRTY_FLOWING_NAME);
	}
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityGlowBlock.class, Strings.TE_GLOW_BLOCK_KEY);
		GameRegistry.registerTileEntity(TileEntityGlowGlass.class, Strings.TE_GLOW_GLASS_KEY);
		GameRegistry.registerTileEntity(TileEntityGlowPlanks.class, Strings.TE_GLOW_PLANKS_KEY);
		GameRegistry.registerTileEntity(TileEntityGlowFence.class, Strings.TE_GLOW_FENCE_KEY);
		GameRegistry.registerTileEntity(TileEntityGlowFence.class, Strings.TE_GLOW_DOOR_KEY);
		GameRegistry.registerTileEntity(TileEntityInfuserT1.class, "TileEntityInfuserT1");
	}

}
