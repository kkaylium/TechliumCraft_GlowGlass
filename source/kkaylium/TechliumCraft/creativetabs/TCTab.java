package kkaylium.TechliumCraft.creativetabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TCTab extends CreativeTabs{
	
	public TCTab(int par1, String par2)
	{
		super(par1, par2);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
	//	return GGItems.glowCrystal.itemID;
		return Item.appleRed.itemID;
	}

}
