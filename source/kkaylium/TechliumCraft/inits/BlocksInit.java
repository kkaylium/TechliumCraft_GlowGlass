package kkaylium.TechliumCraft.inits;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import kkaylium.TechliumCraft.blocks.BlockGlowBlock;
import net.minecraft.block.Block;

public class BlocksInit {
	
	public static Block GBWhite;
	
	public static void blocksInit()
	{
		GBWhite = new BlockGlowBlock(500).setUnlocalizedName("GBWhite").setTextureName("tcgg:GBWhite");
			GameRegistry.registerBlock(GBWhite, "GBWhite");
			LanguageRegistry.addName(GBWhite, "Glow Block: White");
	}

}
