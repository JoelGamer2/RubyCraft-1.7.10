package Eventos.Verano.Generacion;

import java.util.Random;

import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Generacion_Plantas implements IWorldGenerator{

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
		generarPlantas(world, rand, x, z, 1, Clase_Principal_Evento_Verano.Algodon_Salvaje, Blocks.grass, BiomeGenBase.plains);
    }
	
	
	
	public void generarPlantas(World world, Random rand, int chunkX, int chunkZ, int chance, Block block, Block  generatein, BiomeGenBase bioma)
    {
        int probrand = rand.nextInt(10);
     	
     	WorldGenMinable gen = new WorldGenMinable(block, 5, generatein);
     	WorldGenMinable gencesped = new WorldGenMinable(Blocks.grass, 5, Blocks.dirt);

     	
     	if(probrand <= 3) 
     	{
     		int xRand = chunkX * 16 + rand.nextInt(16);
     		int zRand = chunkZ * 16 + rand.nextInt(16);
     		int yRand = world.getHeightValue(xRand, zRand) -1;
     		
     		if(world.getBiomeGenForCoords(xRand, zRand) == bioma && /**yRand > 10 &&**/ world.getBlock(xRand, yRand, zRand) == Blocks.grass) 
     		{
     			world.setBlock(xRand, yRand, zRand, Blocks.grass);
     			world.setBlock(xRand, yRand +1, zRand, Clase_Principal_Evento_Verano.Algodon_Salvaje);
     		}
     	}
     }

}
