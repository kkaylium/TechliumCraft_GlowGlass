package kkaylium.TechliumCraft.events;

import kkaylium.TechliumCraft.blocks.BlockGlowSapling;
import kkaylium.TechliumCraft.inits.BlocksInit;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class EventClass {
	
    @ForgeSubscribe
    public void bonemealUsed(BonemealEvent event)
    {
    	 if (event.ID == BlocksInit.glowSapling.blockID)
         {
             if (!event.world.isRemote)
             {
                 ((BlockGlowSapling)BlocksInit.glowSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
             }
             event.setResult(Result.ALLOW);
         }
    }

}
