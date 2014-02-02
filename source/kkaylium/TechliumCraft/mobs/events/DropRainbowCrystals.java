package kkaylium.TechliumCraft.mobs.events;

import kkaylium.TechliumCraft.inits.ItemsInit;
import kkaylium.TechliumCraft.mobs.entities.EntityRainbowSlime;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class DropRainbowCrystals {
	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event){
		if(event.entity instanceof EntityRainbowSlime){
			event.entity.entityDropItem(new ItemStack(ItemsInit.glowCrystals, 1, 12), 0.0F);
		}
	}

}
