package RubyCraft.Estructuras;

import java.util.Random;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class generararboles implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;	
		}
	}

	public void generateOverworld(World world,Random rand, int x, int z){
		//generateOre(block,                world, rand, x, z, min, max, chance, minY, maxY, generateIn);
    	generatetree(world, rand, x,z,1);
    	

    	
    	
    }
    
    public void generatetree(World world, Random rand, int chunkX, int chunkZ, int chance){
       int prob = 0;
       int generar = rand.nextInt(10) - 100;
        prob = generar * 1 / 100;
        System.out.println(prob);
    	ArbolVerde gen = new ArbolVerde();
    	if(prob <= 10 && !(prob == 0)) {
    		int xRand = chunkX * 16 + rand.nextInt(16);
    		int zRand = chunkZ * 16 + rand.nextInt(16);
    		int yRand = world.getHeightValue(xRand, zRand) -1;
    		if(world.getBlock(xRand, yRand, zRand) == Blocks.grass) {
    		gen.generate(world, rand, xRand, yRand + 1, zRand);
    		}
    		
    	}
    }

    
	}