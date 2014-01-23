package kkaylium.TechliumCraft.gen.glowLand;

import net.minecraft.util.ChunkCoordinates;

public class GlowLandPortalPosition extends ChunkCoordinates{
	
	public long field_85087_d;
    
    final GlowLandTeleporter field_85088_e;
    
    public GlowLandPortalPosition(GlowLandTeleporter glowTeleporter, int par2, int par3, int par4, long par5)
    {
            super(par2, par3, par4);
            this.field_85088_e = glowTeleporter;
            this.field_85087_d = par5;
    }

}
