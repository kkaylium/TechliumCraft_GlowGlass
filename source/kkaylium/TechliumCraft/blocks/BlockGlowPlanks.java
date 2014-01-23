package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGlowPlanks extends BlockContainer{

	public BlockGlowPlanks(int par1) {
		super(par1, Material.wood);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setLightValue(1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}

}
