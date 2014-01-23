package kkaylium.TechliumCraft.inits;

import kkaylium.TechliumCraft.gen.glowLand.biomes.BiomeGenGlowBiome;
import kkaylium.TechliumCraft.lib.Reference;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomesInit {
	
	public static BiomeGenBase glowBiome;
	
	public static void biomesInit(){
		glowBiome = new BiomeGenGlowBiome(Reference.GLOW_BIOME_defaultId).setEnableSnow();
	}

}
