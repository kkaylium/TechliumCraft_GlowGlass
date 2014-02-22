package kkaylium.TechliumCraft.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockGlowStone extends Block{

	public static final String[] stoneNames = new String[]{"White", "Black"};
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public BlockGlowStone(int par1) {
		super(par1, Material.rock);
		this.setLightValue(0.5F);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setTextureName("glowStone");
		this.setHardness(4.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int id, int meta){
		if(meta < 0 || meta >= this.icons.length){
			meta = 0;
		}
		return this.icons[meta];
	}

	@Override
	public int idDropped(int par1, Random rand, int par3){
		return this.blockID;
	}
	
	@Override
	public int damageDropped(int damage){
		return damage;
	}
	
	@Override
	public int quantityDropped(Random rand){
		return 1;
	}
	
	@Override
	public boolean canSilkHarvest(){
		return true;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs creatveTabs, List list){
		list.add(new ItemStack(par1, 1, 0)); //White
		list.add(new ItemStack(par1, 1, 1)); //Black
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
            this.icons = new Icon[stoneNames.length];
            
            for(int i = 0; i < this.icons.length; i++) {
                    this.icons[i] = iconRegister.registerIcon(Strings.MOD_ID + ":" + this.getTextureName() + stoneNames[i]);
            }
    }

}
