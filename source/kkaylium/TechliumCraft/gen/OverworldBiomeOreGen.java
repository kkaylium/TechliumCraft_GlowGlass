package kkaylium.TechliumCraft.gen;

import java.util.LinkedList;
import java.util.Random;

import kkaylium.TechliumCraft.inits.BlocksInit;
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class OverworldBiomeOreGen implements IWorldGenerator{

	public class OreInfo
	{
		public int maxHeight;
		public int minHeight;
		public int maxCluster;
		public int minCluster;
		public int clustersPerChunk;
		public int oreType;
		public int metaOre;
		public BiomeGenBase spawnBiome;
		
		public OreInfo(int MaxHeight, int MinHeight, int MaxCluster, int MinCluster, int ClustersPerChunk, int OreType, int MetaOre, BiomeGenBase SpawnBiome){
			maxHeight = MaxHeight;
			minHeight = MinHeight;
			maxCluster = MaxCluster;
			minCluster = MinCluster;
			clustersPerChunk = ClustersPerChunk;
			oreType = OreType;
			metaOre = MetaOre;
			spawnBiome = SpawnBiome;
		}
	}
	
	private LinkedList<OreInfo> oreList;
	
	public OverworldBiomeOreGen(){
		oreList = new LinkedList<OreInfo>();
		OreInfo info;
		
		info = new OreInfo(60, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 0, BiomeGenBase.extremeHills); //White
		 oreList.add(info);
		info = new OreInfo(60, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 0, BiomeGenBase.extremeHillsEdge); //White
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 1, BiomeGenBase.extremeHills); //Black
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 1, BiomeGenBase.extremeHillsEdge); //Black
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 2, BiomeGenBase.desert); //Red
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 2, BiomeGenBase.desertHills); //Red
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 2, BiomeGenBase.beach); //Red
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 3, BiomeGenBase.desert); //Orange
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 3, BiomeGenBase.desertHills); //Orange
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 3, BiomeGenBase.beach); //Orange
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 4, BiomeGenBase.desert); //Yellow
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 4, BiomeGenBase.desertHills); //Yellow
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 4, BiomeGenBase.beach); //Yellow
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 5, BiomeGenBase.jungle); //Lime
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 5, BiomeGenBase.jungleHills); //Lime
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 6, BiomeGenBase.forest); //Green
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 6, BiomeGenBase.forestHills); //Green
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 6, BiomeGenBase.swampland); //Green
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 6, BiomeGenBase.taiga); //Green
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 6, BiomeGenBase.taigaHills); //Green
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 7, BiomeGenBase.frozenOcean); //Sky
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 7, BiomeGenBase.frozenRiver); //Sky
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 7, BiomeGenBase.iceMountains); //Sky
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 7, BiomeGenBase.icePlains); //Sky
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 7, BiomeGenBase.taiga); //Sky
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 7, BiomeGenBase.taigaHills); //Sky
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 8, BiomeGenBase.frozenOcean); //Blue
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 8, BiomeGenBase.frozenRiver); //Blue
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 8, BiomeGenBase.iceMountains); //Blue
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 8, BiomeGenBase.icePlains); //Blue
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 8, BiomeGenBase.ocean); //Blue
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 8, BiomeGenBase.river); //Blue
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 9, BiomeGenBase.plains); //Lilac
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 9, BiomeGenBase.forest); //Lilac
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 9, BiomeGenBase.forestHills); //Lilac
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 10, BiomeGenBase.plains); //Purple
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 10, BiomeGenBase.forest); //Purple
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 10, BiomeGenBase.forestHills); //Purple
		 oreList.add(info);
		info = new OreInfo(40, 1, 12, 2, 2, BlocksInit.glowOres.blockID, 11, BiomeGenBase.plains); //Pink
		 oreList.add(info);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		 
		 int x,y,z;
         int numOre;
         int numCluster;
         @SuppressWarnings("unused")
         int tcount = 0;
         if (world.provider.dimensionId != 0) {//Only generate in the main world.  
                 return;
         }
         for(OreInfo info: oreList) {
                 tcount++;
                 numCluster = random.nextInt(info.clustersPerChunk);
                 if(numCluster == 0 && info.clustersPerChunk != 0){
                         numCluster = 1;
                 }
                 
                 for(int count = 0; count < numCluster; count++) {
                         x = random.nextInt(16);
                         z = random.nextInt(16);
                         y = random.nextInt(info.maxHeight - info.minHeight);
                         x = x + (16 * chunkX);
                         z = z + (16 * chunkZ);
                         y = y + info.minHeight;
                         numOre = MathHelper.clamp_int(random.nextInt(info.maxCluster), info.minCluster, info.maxCluster);
                         
                         if (info.spawnBiome == null ||(info.spawnBiome != null && world.getBiomeGenForCoords(x, z).equals(info.spawnBiome))) {
                           generateOre(world, random, x, y, z, info.oreType, info.metaOre, numOre);
                         }   
                 }
         }
	}
	
	private void generateOre(World world, Random random, int x, int y, int z, int blockID, int metadata, int ntg) {
		int lx, ly, lz;
		lx = x;
		ly = y;
		lz = z;
		int id;
		id = world.getBlockId(x, y, z);
		int Metadata = metadata;
		if (id != Block.stone.blockID) {
			return;
		}
		for (int i = 0; i < ntg; i++) {
			id = world.getBlockId(lx, ly, lz);

			world.setBlock(lx, ly, lz, blockID, Metadata, 2);
			switch (random.nextInt(3)) {
			case 0:
				lx = lx + (random.nextInt(4) - 2);
				break;
			case 1:
				ly = ly + (random.nextInt(4) - 2);
				break;
			case 2:
				lz = lz + (random.nextInt(4) - 2);
				break;
			}
		}
	}

}
