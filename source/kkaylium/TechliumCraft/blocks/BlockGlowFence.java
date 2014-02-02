package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.tileentities.TileEntityGlowFence;
import net.minecraft.block.BlockFence;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGlowFence extends BlockFence implements ITileEntityProvider{

	public BlockGlowFence(int par1, String par2Str, Material par3Material) {
		super(par1, par2Str, par3Material);
		
	}

	@Override
	public TileEntity createNewTileEntity(World world) {	
		return new TileEntityGlowFence();
	}

}
