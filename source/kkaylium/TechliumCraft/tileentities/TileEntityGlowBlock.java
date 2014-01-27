package kkaylium.TechliumCraft.tileentities;

import net.minecraft.tileentity.TileEntity;

public class TileEntityGlowBlock extends TileEntity{
	
	public static int color; //13 is base color
	
	public TileEntityGlowBlock() {
		color = 13;
	}
	
	@Override
	public void updateEntity() {
		if (!worldObj.isRemote){
			switch(color){
				case 0: color = 0; break;
				case 1: color = 1; break;
				case 2: color = 2; break;
				case 3: color = 3; break;
				case 4: color = 4; break;
				case 5: color = 5; break;
				case 6: color = 6; break;
				case 7: color = 7; break;
				case 8: color = 8; break;
				case 9: color = 9; break;
				case 10: color = 10; break;
				case 11: color = 11; break;
				case 12: color = 12; break;
				default: color = 13; break;
			}
		}
	}
	
	public void changeColor(int x, int y, int z){
		
	}

}
