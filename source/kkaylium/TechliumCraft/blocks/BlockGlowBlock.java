package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.BlocksInit;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.Strings;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlock;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlowBlock extends BlockContainer
{

    @SideOnly(Side.CLIENT)
    private Icon[] textures = new Icon[13];
    public String[] iconNames = new String[] {"GBWhite", "GBBlack", "GBRed", "GBOrange", "GBYellow", "GBLime", "GBGreen", "GBSky", "GBBlue", "GBLilac", "GBPurple", "GBPink", "GBSpecial", "GBBase"};

    public BlockGlowBlock(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(TechliumCraft.GGTab);
        this.setLightValue(0.5F);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
    }

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (!par1World.isRemote)
        {
            TileEntity t = par1World.getBlockTileEntity(par2, par3, par4);
            if (t instanceof TileEntityGlowBlock && ((TileEntityGlowBlock)t).color == 14)
            {
                if (player.inventory.getCurrentItem() != null)
                {
                    if (player.inventory.getCurrentItem().itemID == ItemsInit.glowCrystals.itemID)
                    {
                        ((TileEntityGlowBlock) t).getCrystalUsed(player.inventory.getCurrentItem().getItemDamage());
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
        if (t instanceof TileEntityGlowBlock)
        {
            if (((TileEntityGlowBlock)t).color <= 13) return textures[((TileEntityGlowBlock)t).color];
            else return this.blockIcon;
        }
        else
        {
            return this.blockIcon;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconregister)
    {
        for (int i = 0; i < textures.length; i++)
        {
            textures[i] = iconregister.registerIcon(Strings.MOD_ID + ":" + iconNames[i]);
        }
        blockIcon = iconregister.registerIcon(Strings.MOD_ID + ":GBBase");
    }

    @Override
    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityGlowBlock();
    }
    
    @SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return BlocksInit.glowBlock.blockID;
    }
    
    @Override
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6){       
        TileEntity t = par1World.getBlockTileEntity(par2, par3, par4);
        EntityItem entityCrystal = new EntityItem(par1World, (double)(par2), (double)(par3), (double)(par4), new ItemStack(ItemsInit.glowCrystals.itemID, 1, ((TileEntityGlowBlock)t).color));
        if (t instanceof TileEntityGlowBlock && ((TileEntityGlowBlock)t).color != 14){
        	par1World.spawnEntityInWorld(entityCrystal);
        }
        par1World.removeBlockTileEntity(par2, par3, par4);
    }
}
