package kkaylium.TechliumCraft.inits;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import kkaylium.TechliumCraft.blocks.BlockGlowBlock;
import kkaylium.TechliumCraft.lib.BlockIds;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlock;
import net.minecraft.block.Block;

public class BlocksInit {
	
	public static Block GBWhite;
	
	public static void blocksInit()
	{
		GBWhite = new BlockGlowBlock(BlockIds.GB_WHITE_defaultId).setUnlocalizedName("GBWhite");
			GameRegistry.registerBlock(GBWhite, "GBWhite");
			LanguageRegistry.addName(GBWhite, "Glow Block: White");
	}
	
	public static void addNames()
	{
		
	}
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityGlowBlock.class, "TileEntityGlowBlock");
	}

}
