package Eventos.Verano.Generacion;

import java.util.Random;

import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import RubyCraft.xJuanathan.Principal;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Generacion_Bloques_Overworld implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		}
	}
	
	
	
	public void generateOverworld(World world,Random rand, int x, int z)
	{
		if (RubyCraft.Verano)
		{
			generarAguamarina(Clase_Principal_Evento_Verano.Aguamarina, world, rand, x, z, 2, 6, 40, 0, 80, Blocks.stone);
		}
    }
	
	public void generarAguamarina(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generatein)
	{
    	int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
    	
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, generatein);
    	
    	for(int i = 0; i < chance; i++)
    	{
    		int xRand = chunkX * 16 + random.nextInt(16);
    		int yRand = minY + random.nextInt(maxY);
    		int zRand = chunkZ * 16 + random.nextInt(16);
    		
    		if(world.getBlock(xRand, yRand - 1, zRand) == Blocks.stone) 
    		{
    			gen.generate(world, random, xRand, yRand, zRand);
    		}
    	}
    }
}
