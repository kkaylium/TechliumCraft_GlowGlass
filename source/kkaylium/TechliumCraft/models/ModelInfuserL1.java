package kkaylium.TechliumCraft.models;

import kkaylium.TechliumCraft.lib.Strings;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelInfuserL1 {

	private IModelCustom modelBase;

	public ModelInfuserL1() {
		modelBase = AdvancedModelLoader.loadModel(Strings.INFUSERL1);
	}

	public void render() {
		modelBase.renderAll();
	}

	public void renderPart(String partName) {
		modelBase.renderPart(partName);
	}
}
