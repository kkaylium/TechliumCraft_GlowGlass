package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGlowDirt extends Block{

	public BlockGlowDirt(int par1) {
		super(par1, Material.ground);
		this.setLightValue(0.5F);
		this.setCreativeTab(TechliumCraft.GGTab);
	}

}
