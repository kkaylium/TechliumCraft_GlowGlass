package kkaylium.TechliumCraft.blocks;

import java.util.LinkedList;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.gen.OverworldBiomeOreGen.OreInfo;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.lib.ItemIds;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlock;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlowBlock extends BlockContainer{

	@SideOnly(Side.CLIENT)
	private Icon[] textures = new Icon[12];
	@SideOnly(Side.CLIENT)
	private Icon currentTexture;
	public static String[] iconNames = new String[]{"GBWhite", "GBBlack", "GBRed", "GBOrange", "GBYellow", "GBLime", "GBGreen", "GBSky", "GBBlue", "GBLilac", "GBPurple", "GBPink", "GBSpecial"};
	public static TileEntityGlowBlock te = new TileEntityGlowBlock();
	
	public BlockGlowBlock(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setLightValue(0.5F);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
		 if (player.inventory.getCurrentItem() != null)
	        {
	            if (player.inventory.getCurrentItem().itemID == ItemsInit.glowCrystals.itemID)
	            {
	                if (player.inventory.getCurrentItem().getItemDamage() == 0)
	                {
	                	player.inventory.getCurrentItem().stackSize--;
	                	return true;
	                }
	            }
	        }
//		if (player.inventory.getCurrentItem() == new ItemStack(ItemsInit.glowCrystals, 0)) {
//			te.getCrystalUsed(0);
//			player.inventory.consumeInventoryItem(ItemIds.GLOW_CRYSTALS_defaultId);
//			return true;
//		} else if (player.inventory.getCurrentItem() == new ItemStack(ItemsInit.glowCrystals, 1)) {
//			te.getCrystalUsed(1);
//			player.inventory.consumeInventoryItem(ItemIds.GLOW_CRYSTALS_defaultId);
//			return true;
//			//player.inventory.getItemStack().equals(new ItemStack(ItemsInit.glowCrystals, 1));
//		}
//		else{
//			return false;
//		}
//		if (player.inventory.getCurrentItem().equals(new ItemStack(ItemsInit.glowCrystals, 0))){
//			te.getCrystalUsed(0);
//			player.inventory.consumeInventoryItem(ItemIds.GLOW_CRYSTALS_defaultId);
//		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
		if (te.bool[0]){
			return textures[0];
		}
		else if (te.bool[1]){
			return textures[1];
		}
		else if (te.bool[2]){
			return textures[2];
		}
		else if (te.bool[3]){
			return textures[3];
		}
		else if (te.bool[4]){
			return textures[4];
		}
		else if (te.bool[5]){
			return textures[5];
		}
		else if (te.bool[6]){
			return textures[6];
		}
		else{
        return this.blockIcon;
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		for(int i = 0; i < textures.length; i++){
			textures[i] = iconregister.registerIcon("tcgg:" + iconNames[i]);
		}
		blockIcon = iconregister.registerIcon("tcgg:GBBase");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityGlowBlock();
	}

}
