package kkaylium.TechliumCraft.blocks;

import java.util.Random;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.BlocksInit;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGlowLeaves extends BlockContainer{
	
	public BlockGlowLeaves(int par1) {
            super(par1, Material.leaves);
            this.setCreativeTab(TechliumCraft.GGTab);
            this.setStepSound(soundGrassFootstep);
            this.setHardness(0.2F);
            this.setLightValue(1.0F);
    }

    public boolean isOpaqueCube() {
            return false;
    }
    
    public int idDropped(int par1, Random rand, int par3) {
    		if(rand.nextInt(3) == 2)
    		{
    			return BlocksInit.glowSapling.blockID;
    		}
            return 0;
    }
    
    public int quantityDropped(Random par1Random) {
            return 1;
    }
    
	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}
}
