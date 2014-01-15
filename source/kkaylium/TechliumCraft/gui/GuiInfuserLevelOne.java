package kkaylium.TechliumCraft.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiInfuserLevelOne extends GuiScreen {
	
	@Override
	public void drawScreen(int par1, int par2, float par3)
    {
        for (int k = 0; k < this.buttonList.size(); ++k)
        {
            GuiButton guibutton = (GuiButton)this.buttonList.get(k);
            guibutton.drawButton(this.mc, par1, par2);
        }
    }


}
