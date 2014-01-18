package kkaylium.TechliumCraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlockGlowBlockTryOne extends Item{

	private int blockID;
	
	public ItemBlockGlowBlockTryOne(int par1, int blockId) {
		super(par1);
		this.blockID = blockId;
	}
	
	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int something, float fone, float ftwo, float fthree)
	{
		int var11 = world.getBlockId(x, y, z);
		
		if(var11 == 0){}
		return true;	
	}

}
