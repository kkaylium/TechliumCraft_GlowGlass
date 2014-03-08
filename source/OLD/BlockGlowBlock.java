package OLD;

import java.util.Random;

import kkaylium.TechliumCraft.tileentities.TileEntityGlowBlock;
import net.minecraft.block.Block;
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

public class BlockGlowBlock extends BlockContainer {

	@SideOnly(Side.CLIENT)
	private Icon idleIcon;
	
	public BlockGlowBlock(int par1) {
		super(par1, Material.rock);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setHardness(2F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setLightOpacity(1);
		this.setLightValue(1.0F);
	}

	public int quantityDropped(Random par1Random) {
		return 1;
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		player.openGui(TechliumCraft.instance, 0, world, x, y, z);
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityGlowBlock();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.blockIcon = register.registerIcon("tcgg:GBWhite");
		this.idleIcon = register.registerIcon("tcgg:GBBlack");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int side)
	{
		TileEntityGlowBlock block = (TileEntityGlowBlock)world.getBlockTileEntity(x, y, z);
		return block.isIdle() ? blockIcon : idleIcon;
	}
	
}
