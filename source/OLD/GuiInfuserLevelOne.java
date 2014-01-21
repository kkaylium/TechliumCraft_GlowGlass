package OLD;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GuiInfuserLevelOne extends GuiScreen {
	
	@Override
	public void initGui() {
		// TODO Auto-generated method stub
		super.initGui();
	}
	@Override
	public void drawScreen(int par1, int par2, float par3)
    {
		drawDefaultBackground();
		
		//draw image
		this.mc.renderEngine.bindTexture(new ResourceLocation(""));
		//drawTexturedModalRect(posX, poY, imageX, imageY, width, height);
		
		drawString(this.fontRenderer, "Testing", 3, 50, 0xFFFFFF);
    }
	
	public void updateScreen() {};
	@Override
	public boolean doesGuiPauseGame() {
		// TODO Auto-generated method stub
		return super.doesGuiPauseGame();
	}
}
