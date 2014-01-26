package kkaylium.TechliumCraft.blocks;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.ItemsInit;
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
	public static boolean change = false;
	
	public BlockGlowBlock(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setLightValue(1.0F);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		
		final ItemStack itemstack = player.inventory.getCurrentItem();
		if(itemstack == new ItemStack(ItemsInit.glowCrystals, 0)){
			currentTexture = textures[1];
			change = true;
		}
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int side)
	{
		//TileEntityGlowBlock block = (TileEntityGlowBlock)world.getBlockTileEntity(x, y, z);
		return change ? currentTexture : blockIcon;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconregister){
		for(int i = 0; i < textures.length; i++){
			textures[i] = iconregister.registerIcon("tcgg:" + iconNames[i]);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityGlowBlock();
	}

}
