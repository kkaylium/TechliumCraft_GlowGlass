package kkaylium.TechliumCraft.blocks.machines;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.tileentities.TileEntityInfuserT1;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockInfuserT1 extends BlockContainer{

	public BlockInfuserT1(int par1) {
		super(par1, Material.glass);
		this.setCreativeTab(TechliumCraft.TCTab);
	}
	
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}

	@Override
	public boolean isOpaqueCube()
	{
	   return false;
	}
	
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		
		return new TileEntityInfuserT1();
	}

}