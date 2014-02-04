package kkaylium.TechliumCraft.blocks.liquids;

import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSerumDirtyFlowing extends BlockFlowing{

	public BlockSerumDirtyFlowing(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(100.0F);
		this.setLightOpacity(3);
		this.setLightValue(1.0F);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.theIcon = new Icon[] {
                iconRegister.registerIcon(Strings.MOD_ID + ":SerumDirtyStill"),
                iconRegister.registerIcon(Strings.MOD_ID + ":SerumDirtyFlowing") };
    }
}
