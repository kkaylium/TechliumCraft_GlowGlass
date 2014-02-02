package kkaylium.TechliumCraft.blocks;

import java.util.List;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.BlocksInit;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.BlockIds;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlock;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowFence;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlowFence extends BlockFence implements ITileEntityProvider{

	private final String field_94464_a;
	@SideOnly(Side.CLIENT)
    private Icon[] textures = new Icon[13];
    public String[] iconNames = new String[] {"GFWhite", "GFBlack", "GFRed", "GFOrange", "GFYellow", "GFLime", "GFGreen", "GFSky", "GFBlue", "GFLilac", "GFPurple", "GFPink", "GFSpecial", Strings.GLOW_FENCE_KEY};

	public BlockGlowFence(int par1, String par2String) 
	{
		super(par1, par2String, Material.glass);
		this.field_94464_a = par2String;
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setLightValue(1.0F);
		this.setHardness(4.0F);
		this.setResistance(10.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister)
    {
		 for (int i = 0; i < textures.length; i++)
	        {
	            textures[i] = iconregister.registerIcon("tcgg:" + iconNames[i]);
	        }
        this.blockIcon = iconregister.registerIcon("tcgg:" + this.field_94464_a);
    }
	
	@Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (!par1World.isRemote)
        {
            TileEntity t = par1World.getBlockTileEntity(par2, par3, par4);
            if (t instanceof TileEntityGlowFence && ((TileEntityGlowFence)t).color == 14)
            {
                if (player.inventory.getCurrentItem() != null)
                {
                    if (player.inventory.getCurrentItem().itemID == ItemsInit.glowCrystals.itemID)
                    {
                        ((TileEntityGlowFence) t).getCrystalUsed(player.inventory.getCurrentItem().getItemDamage());
                        par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 3);
                        this.setLightValue(1.0F);
                        player.inventory.getCurrentItem().stackSize--;
                        return true;
                    }
                }
            }
            return false;
        }
        else
        {
            return false;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        TileEntity t = par1IBlockAccess.getBlockTileEntity(par2, par3, par4);
        if (t instanceof TileEntityGlowFence)
        {
            if (((TileEntityGlowFence)t).color <= 13) return textures[((TileEntityGlowFence)t).color];
            else return this.blockIcon;
        }
        else
        {
            return this.blockIcon;
        }
    }
	
	@SuppressWarnings({"rawtypes"})
	public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	{
		boolean flag = this.canConnectFenceTo(par1World, par2, par3, par4 - 1);
		boolean flag1 = this.canConnectFenceTo(par1World, par2, par3, par4 + 1);
		boolean flag2 = this.canConnectFenceTo(par1World, par2 - 1, par3, par4);
		boolean flag3 = this.canConnectFenceTo(par1World, par2 + 1, par3, par4);
		float f = 0.375F;
		float f1 = 0.625F;
		float f2 = 0.375F;
		float f3 = 0.625F;

		if (flag)
		{
			f2 = 0.0F;
		}

		if (flag1)
		{
			f3 = 1.0F;
		}

		if (flag || flag1)
		{
			this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}

		f2 = 0.375F;
		f3 = 0.625F;

		if (flag2)
		{
			f = 0.0F;
		}

		if (flag3)
		{
			f1 = 1.0F;
		}

		if (flag2 || flag3 || !flag && !flag1)
		{
			this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
			super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
		}

		if (flag)
		{
			f2 = 0.0F;
		}

		if(flag1)
		{
			f3 = 1.0F;
		}

		this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess par1BlockAccess, int par2, int par3, int par4)
	{
		boolean flag = this.canConnectFenceTo(par1BlockAccess, par2, par3, par4 - 1);
		boolean flag1 = this.canConnectFenceTo(par1BlockAccess, par2, par3, par4 + 1);
		boolean flag2 = this.canConnectFenceTo(par1BlockAccess, par2 - 1, par3, par4);
		boolean flag3 = this.canConnectFenceTo(par1BlockAccess, par2 + 1, par3, par4);
		float f = 0.375F;
		float f1 = 0.625F;
		float f2 = 0.375F;
		float f3 = 0.625F;

		if (flag)
		{
			f2 = 0.0F;
		}

		if (flag1)
		{
			f3 = 1.0F;
		}

		if (flag2)
		{
			f = 0.0F;
		}

		if (flag3)
		{
			f1 = 1.0F;
		}

		this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }

	public boolean getBlocksMovement(IBlockAccess par1BlockAccess, int par2, int par3, int par4)
	{
		return false;
	}

	public int getRenderType()
	{
		return 11;
	}

	@Override
	public boolean canConnectFenceTo(IBlockAccess par1BlockAccess, int par2, int par3, int par4)
	{
		int l = par1BlockAccess.getBlockId(par2, par3, par4);

		if(l != this.blockID && l != Block.fenceGate.blockID && l != BlockIds.GLOW_FENCE_ID)
		{
			Block block = Block.blocksList[l];
			return block != null && block.blockMaterial.isOpaque() && block.renderAsNormalBlock() ? block.blockMaterial != Material.pumpkin : false;
		}
	    else
		{
			return true;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
	{
		return true;
	}
	
	@SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return BlocksInit.glowFence.blockID;
    }
    
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6){       
        TileEntity t = par1World.getBlockTileEntity(par2, par3, par4);
        EntityItem entityCrystal = new EntityItem(par1World, (double)(par2), (double)(par3), (double)(par4), new ItemStack(ItemsInit.glowCrystals.itemID, 1, ((TileEntityGlowFence)t).color));
        if (t instanceof TileEntityGlowFence && ((TileEntityGlowFence)t).color != 14){
        	par1World.spawnEntityInWorld(entityCrystal);
        }
        par1World.removeBlockTileEntity(par2, par3, par4);
    }

	@Override
	public TileEntity createNewTileEntity(World world) {	
		return new TileEntityGlowFence();
	}

}
