package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGlowStone extends Block{

	public BlockGlowStone(int par1) {
		super(par1, Material.rock);
		this.setLightValue(0.5F);
		this.setCreativeTab(TechliumCraft.GGTab);
	}

}
