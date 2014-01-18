package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlockTryOne;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGlowBlockTryOne extends BlockContainer{

	protected BlockGlowBlockTryOne(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(TechliumCraft.TCTab);
		
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityGlowBlockTryOne();
	}

}
