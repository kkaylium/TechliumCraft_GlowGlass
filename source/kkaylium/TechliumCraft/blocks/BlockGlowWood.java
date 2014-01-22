package kkaylium.TechliumCraft.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import kkaylium.TechliumCraft.TechliumCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockGlowWood extends BlockRotatedPillar implements ITileEntityProvider{

	public static final String[] woodType = new String[] {"Default"};
    @SideOnly(Side.CLIENT)
    private Icon[] field_111052_c;
    @SideOnly(Side.CLIENT)
    private Icon[] tree_top;
	
	public BlockGlowWood(int par1) {
		super(par1, Material.wood);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setLightValue(1.0F);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
	}
	
	public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.wood.blockID;
    }

    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte b0 = 4;
        int j1 = b0 + 1;

        if (par1World.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2 + j1, par3 + j1, par4 + j1))
        {
            for (int k1 = -b0; k1 <= b0; ++k1)
            {
                for (int l1 = -b0; l1 <= b0; ++l1)
                {
                    for (int i2 = -b0; i2 <= b0; ++i2)
                    {
                        int j2 = par1World.getBlockId(par2 + k1, par3 + l1, par4 + i2);

                        if (Block.blocksList[j2] != null)
                        {
                            Block.blocksList[j2].beginLeavesDecay(par1World, par2 + k1, par3 + l1, par4 + i2);
                        }
                    }
                }
            }
        }
    }

	@SideOnly(Side.CLIENT)
	/**
	 * The icon for the tops and bottoms of the block.
	 */
	protected Icon getEndIcon(int par1) {
		return this.tree_top[par1];
	}

	/**
	 * returns a number between 0 and 3
	 */
	public static int limitToValidMetadata(int par0) {
		return par0 & 3;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerIcons(IconRegister par1IconRegister) {
		this.field_111052_c = new Icon[woodType.length];
		this.tree_top = new Icon[woodType.length];

		for (int i = 0; i < this.field_111052_c.length; ++i) {
			this.field_111052_c[i] = par1IconRegister.registerIcon(this
					.getTextureName() + "_" + woodType[i]);
			this.tree_top[i] = par1IconRegister.registerIcon(this
					.getTextureName() + "_" + woodType[i] + "_top");
		}
	}

	@Override
	public boolean canSustainLeaves(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public boolean isWood(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	protected Icon getSideIcon(int i) {
		return null;
	}

}
