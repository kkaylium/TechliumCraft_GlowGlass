package OLD;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGlowGlassBase extends BlockContainer{

	protected BlockGlowGlassBase(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(3.0F);
		this.setLightValue(0.5F);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}

}
