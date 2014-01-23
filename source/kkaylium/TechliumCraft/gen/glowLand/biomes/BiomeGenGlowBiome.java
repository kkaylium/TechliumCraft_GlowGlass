package kkaylium.TechliumCraft.gen.glowLand.biomes;

import kkaylium.TechliumCraft.inits.BlocksInit;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenGlowBiome extends BiomeGenBase {
	
    public final Material blockMaterial;
    
    public BiomeGenGlowBiome(int par1)
    {
            super(par1);
            this.blockMaterial = Material.water;
            this.minHeight = 0.1F;
            this.maxHeight = 0.6F;
            this.spawnableMonsterList.clear();
            this.spawnableCreatureList.clear();
            this.topBlock = ((byte)BlocksInit.glowDirt.blockID);
            this.fillerBlock = ((byte)BlocksInit.glowStone.blockID);
            this.setBiomeName("Glow Biome");

            this.waterColorMultiplier = 0xE42D17;
    }

}
