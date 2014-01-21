package OLD;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.tileentities.TileEntityGlowBaseBlock;
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

public class BlockGlowBaseBlock extends BlockContainer{
	
	public BlockGlowBaseBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setLightValue(0.5F);
		this.setHardness(5.0F);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9){
		return true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int side)
	{
		return blockIcon;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		this.blockIcon = register.registerIcon("tcgg:GBBase");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityGlowBaseBlock();
	}

}
