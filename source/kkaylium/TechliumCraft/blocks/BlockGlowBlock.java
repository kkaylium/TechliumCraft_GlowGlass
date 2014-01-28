package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlock;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlowBlock extends BlockContainer{

	@SideOnly(Side.CLIENT)
	private Icon[] textures = new Icon[12];
	private boolean changedTexture = false;
	public String[] iconNames = new String[]{"GBWhite", "GBBlack", "GBRed", "GBOrange", "GBYellow", "GBLime", "GBGreen", "GBSky", "GBBlue", "GBLilac", "GBPurple", "GBPink", "GBSpecial"};
	private TileEntity t; 
	private boolean texturebool[] = new boolean[12];
	
	public BlockGlowBlock(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setLightValue(0.5F);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9) {
		 t = par1World.getBlockTileEntity(par2, par3, par4);
		 if (player.inventory.getCurrentItem() != null)
	        {
	            if (player.inventory.getCurrentItem().itemID == ItemsInit.glowCrystals.itemID)
	            {
	                if (player.inventory.getCurrentItem().getItemDamage() == 0)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(0);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 1)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(1);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 2)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(2);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 3)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(3);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 4)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(4);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 5)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(5);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 6)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(6);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 7)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(7);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 8)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(8);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 9)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(9);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 10)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(10);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 11)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(11);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                if (player.inventory.getCurrentItem().getItemDamage() == 12)
	                {
	                	if(t instanceof TileEntityGlowBlock){
	                		((TileEntityGlowBlock)t).getCrystalUsed(12);
	                		player.inventory.getCurrentItem().stackSize--;
	                		texturebool = ((TileEntityGlowBlock)t).bool;
	                		changedTexture = true;
	                	}
	                	else{
	                		return false;
	                	}
	                	return true;
	                }
	                else{
	                	return false;
	                }
	            }
	            else{
	            	return false;
	            }
	            
	        }
		 else{
			 return false;
		 }
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
		if (texturebool[0]){
			return textures[0];
		}
		else if (texturebool[1]){
			return textures[1];
		}
		else if (texturebool[2]){
			return textures[2];
		}
		else if (texturebool[3]){
			return textures[3];
		}
		else if (texturebool[4]){
			return textures[4];
		}
		else if (texturebool[5]){
			return textures[5];
		}
		else if (texturebool[6]){
			return textures[6];
		}
		else if (texturebool[7]){
			return textures[7];
		}
		else if (texturebool[8]){
			return textures[8];
		}
		else if (texturebool[9]){
			return textures[9];
		}
		else if (texturebool[10]){
			return textures[10];
		}
		else if (texturebool[11]){
			return textures[11];
		}
//		else if (texturebool[12]){
//			return textures[12];
//		}
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
