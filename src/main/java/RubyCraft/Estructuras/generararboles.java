package RubyCraft.Estructuras;

import java.util.Random;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

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
    	
    	if(RubyCraft.Navidad) {
    	generatetreegrande(world, rand, x, z, 1);
    	}
    	
    	
    }
    
    public void generatetree(World world, Random rand, int chunkX, int chunkZ, int chance){
       int probrand = rand.nextInt(20);
    	ArbolVerde gen = new ArbolVerde();
    	if(probrand <= 3) {
    		int xRand = chunkX * 16 + rand.nextInt(16);
    		int zRand = chunkZ * 16 + rand.nextInt(16);
    		int yRand = world.getHeightValue(xRand, zRand) -1;
    		if(world.getBlock(xRand, yRand, zRand) == Blocks.grass) {
    		gen.generate(world, rand, xRand, yRand + 1, zRand);

    		}
    		
    	}
    }
    public void generatetreegrande(World world, Random rand, int chunkX, int chunkZ, int chance){
        int probrand = rand.nextInt(150);
     	Arbol gen = new Arbol();
     	if(probrand <= 3) {
     		int xRand = chunkX * 16 + rand.nextInt(16);
     		int zRand = chunkZ * 16 + rand.nextInt(16);
     		int yRand = world.getHeightValue(xRand, zRand) -1;
     		if(world.getBlock(xRand, yRand, zRand) == Blocks.grass) {
     		gen.generate_r0(world, xRand, yRand -8, zRand);

     		}
     		
     	}
     }
    
	}