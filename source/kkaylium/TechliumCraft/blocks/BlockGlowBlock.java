package kkaylium.TechliumCraft.blocks;

import java.util.Random;

import kkaylium.TechliumCraft.TechliumCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockGlowBlock extends Block{
	
	public BlockGlowBlock(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightOpacity(1);
		this.setLightValue(1.0F);
	}
	
	public int quantityDropped(Random par1Random)
    {
        return 1;
    }
	
//	@Override
//    @SideOnly(Side.CLIENT)
//    public void registerIcons(IconRegister iconRegister) {
//    	this.blockIcon = iconRegister.registerIcon("glowglass" + ":" + (this.getUnlocalizedName().substring(5)));
//    }
	
	 public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	    {
		 	par5EntityPlayer.openGui(TechliumCraft.class, 0, world, x, y, z);
	        return true;
	    }

}
