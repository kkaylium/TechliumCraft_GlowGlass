package kkaylium.TechliumCraft.renderers;

import kkaylium.TechliumCraft.lib.Strings;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class SpecialRendererInfuserL1 extends TileEntitySpecialRenderer{

	IModelCustom model = AdvancedModelLoader.loadModel(Strings.INFUSERL1);
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f)
	{
		 double dx=0, dy=0, dz=0;
         
             GL11.glPushMatrix();
             GL11.glDisable(GL11.GL_LIGHTING);

             // Scale, Translate, Rotate
             GL11.glScalef(0.90F, 0.90F, 0.90F);
             GL11.glTranslatef((float) (x + dx + 0.5F), (float)(y + dy - 1.005F), (float)(z + dz + 0.5F));
            // GL11.glRotatef(0.0F, 1.0F, 0.0F, 1.0F);

             // Bind texture
             FMLClientHandler.instance().getClient().renderEngine.bindTexture(Strings.INFUSERL1_TEXTURE);
           
             // Render
             model.renderAll();

             GL11.glEnable(GL11.GL_LIGHTING);
             GL11.glPopMatrix();	
	}
}
