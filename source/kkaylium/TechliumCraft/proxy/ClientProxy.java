package kkaylium.TechliumCraft.proxy;

import kkaylium.TechliumCraft.mobs.entities.EntityRainbowSlime;
import kkaylium.TechliumCraft.mobs.models.ModelRainbowSlime;
import kkaylium.TechliumCraft.mobs.renderers.RenderRainbowSlimes;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
//	@Override
//	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//		switch (ID) {
//			case 0: return new GuiInfuserLevelOne();
//			default: return null;
//		}
//	}
	
	public void registerRenderInformation()
	{
		super.registerRenderInformation();
		//RenderingRegistry.registerEntityRenderingHandler(EntityRainbowSlime.class, new RenderRainbowSlime(ModelSlime(16), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityRainbowSlime.class, new RenderRainbowSlimes(new ModelRainbowSlime(16), new ModelRainbowSlime(0), 0.5F));
	}
}
