package kkaylium.TechliumCraft.items;

import java.util.List;

import kkaylium.TechliumCraft.TechliumCraft;
import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGlowCrystals extends Item{
	
	private String[] crystalNames = new String[]{"White", "Black", "Red", "Orange", "Yellow", "Lime", "Green", "Sky", "Blue", "Lilac", "Purple", "Pink", "Special"};
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	public ItemGlowCrystals(int id){
		super (id);
		this.setCreativeTab(TechliumCraft.GGTab);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		StringBuilder unlocalizedName = new StringBuilder();
        int meta = MathHelper.clamp_int(itemstack.getItemDamage(), 0, 12);
        
        unlocalizedName.append("item.");
        unlocalizedName.append(Strings.MOD_ID + ":");
        unlocalizedName.append("GC");
        unlocalizedName.append(crystalNames[meta]);
        
        return unlocalizedName.toString();
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int damage) {
		int i = MathHelper.clamp_int(damage, 0, 12);
		return this.icons[i];
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs creativetabs, List list) {
		for(int i = 0; i < 13; i++){
			list.add(new ItemStack(par1, 1, i));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.icons = new Icon[crystalNames.length];
		for(int i = 0; i < crystalNames.length; i++){
			icons[i] = iconRegister.registerIcon(Strings.MOD_ID + ":GC" + crystalNames[i]);
		}
	}
	
//	@Override
//	public boolean onItemUse(ItemStack tool, EntityPlayer player, World world, int x, int y, int z, int par7, float xFloat, float yFloat, float zFloat) {
//		if(!player.canPlayerEdit(x, y, z, par7, tool)){
//			
//		}
//		return true;
//	}

}
