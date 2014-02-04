package kkaylium.TechliumCraft.blocks;

import java.util.List;
import java.util.Random;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlowOre extends Block{

	public static final String[] oreNames = new String[]{"White", "Black", "Red", "Orange", "Yellow", "Lime", "Green", "Sky", "Blue", "Lilac", "Purple", "Pink"};
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public BlockGlowOre(int par1) {
		super(par1, Material.rock);
		this.setTextureName("GO");
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setLightValue(0.5F);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundStoneFootstep);
		this.setTickRandomly(true);
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
		switch(par3){
		case 0:
			return ItemsInit.glowCrystals.itemID;
		default:
			return ItemsInit.glowCrystals.itemID;
		}
	}
	
	@Override
	public int damageDropped(int damage){
		return damage;
	}
	
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(2);
	}
	
	public int quantityDroppedWithBonus(int par1, Random rand){
		return this.quantityDropped(rand) + rand.nextInt(par1 + 1);
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
		list.add(new ItemStack(par1, 1, 2)); //Red
		list.add(new ItemStack(par1, 1, 3)); //Orange
		list.add(new ItemStack(par1, 1, 4)); //Yellow
		list.add(new ItemStack(par1, 1, 5)); //Lime
		list.add(new ItemStack(par1, 1, 6)); //Green
		list.add(new ItemStack(par1, 1, 7)); //Sky
		list.add(new ItemStack(par1, 1, 8)); //Blue
		list.add(new ItemStack(par1, 1, 9)); //Lilac
		list.add(new ItemStack(par1, 1, 10)); //Purple
		list.add(new ItemStack(par1, 1, 11)); //Pink
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
            this.icons = new Icon[oreNames.length];
            
            for(int i = 0; i < this.icons.length; i++) {
                    this.icons[i] = iconRegister.registerIcon(Strings.MOD_ID + ":" + this.getTextureName() + oreNames[i]);
            }
    }
	
	public void randomDisplayTick(World world, int par2, int par3, int par4, Random random) {
            this.sparkle(world, par2, par3, par4);
    }
    
    private void sparkle(World world, int par2, int par3, int par4) {
            Random random = world.rand;
            double d0 = 0.0625D;
            for(int i = 0; i < 1; i++){
                    double d1 = (double)((float)par2 + random.nextFloat());
                    double d2 = (double)((float)par3 + random.nextFloat());
                    double d3 = (double)((float)par4 + random.nextFloat());
                    
			if (i == 0 && !world.isBlockOpaqueCube(par2, par3 + 1, par4)) {
				d2 = (double) (par3 + 1) + d0;
			}

			if (i == 1 && !world.isBlockOpaqueCube(par2, par3 - 1, par4)) {
				d2 = (double) (par3 + 0) - d0;
			}

			if (i == 2 && !world.isBlockOpaqueCube(par2, par3, par4 + 1)) {
				d3 = (double) (par4 + 1) + d0;
			}

			if (i == 3 && !world.isBlockOpaqueCube(par2, par3, par4 - 1)) {
				d3 = (double) (par4 + 0) - d0;
			}

			if (i == 4 && !world.isBlockOpaqueCube(par2 + 1, par3, par4)) {
				d1 = (double) (par2 + 1) + d0;
			}

			if (i == 5 && !world.isBlockOpaqueCube(par2 - 1, par3, par4)) {
				d1 = (double) (par2 + 0) - d0;
			}

			if (d1 < (double) par2 || d1 > (double) (par2 + 1) || d2 < 0.0D || d2 > (double) (par3 + 1) || d3 < (double) par4|| d3 > (double) (par4 + 1)) {
				switch (oreNames.length) {
				case 0:
					world.spawnParticle("reddust", d1, d2, d3, 0.7D, 0.9D, 1.0D);
					break;
				case 1:
					world.spawnParticle("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
					break;
				case 2:
					world.spawnParticle("reddust", d1, d2, d3, 25.0D, 0.0D,
							0.0D);
					break;
				case 3:
					world.spawnParticle("reddust", d1, d2, d3, 0.9D, 0.2D, 0.0D);
					break;
				case 4:
					world.spawnParticle("reddust", d1, d2, d3, 0.8D, 0.4D, 0.1D);
					break;
				case 5:
					world.spawnParticle("reddust", d1, d2, d3, 0.5D, 1.0D, 0.4D);
					break;
				case 6:
					world.spawnParticle("reddust", d1, d2, d3, 0.3D, 0.7D, 0.5D);
					break;
				case 7:
					world.spawnParticle("reddust", d1, d2, d3, 0.1D, 0.0D, 0.0D);
					break;
				case 8:
					world.spawnParticle("reddust", d1, d2, d3, 0.7D, 0.9D, 1.0D);
					break;
				default:
					world.spawnParticle("reddust", d1, d2, d3, 0.7D, 0.9D, 1.0D);
					break;
				}

			}

		}

    }
    
	
	
}
