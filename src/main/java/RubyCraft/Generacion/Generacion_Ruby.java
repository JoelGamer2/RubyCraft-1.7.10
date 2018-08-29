package RubyCraft.Generacion;

import java.util.Random;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Generacion_Ruby implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		case 1:
			generateEnd(world, random, chunkX, chunkZ);
			break;
		}
	}
	
    private void generateEnd(World world, Random rand, int x, int z) {
    	//generateOre(block, world, rand, x, z, minVienSize, maxVienSize, chance, minY, maxY, generateIn);
		generateOre(RubyCraft.Mena_de_Ruby_end, world, rand, x, z, 5,10, 6, 0, 101, Blocks.end_stone);
		
	}

	public void generateOverworld(World world,Random rand, int x, int z){
    	//generateOre(block, world, rand, x, z, minVienSize, maxVienSize, chance, minY, maxY, generateIn);
    	generateOre(RubyCraft.Mena_de_Ruby, world, rand, x, z, 4, 10, 5, 1, 40, Blocks.stone);
    	generateOre(RubyCraft.Mena_de_Ruby, world, rand, x, z, 4, 10, 5, 1, 20, RubyCraft.Andesita);
    	generateOre(RubyCraft.Mena_de_Ruby, world, rand, x, z, 4, 10, 5, 1, 20, RubyCraft.Diorita);
    	generateOre(RubyCraft.Mena_de_Ruby, world, rand, x, z, 4, 10, 5, 1, 20, RubyCraft.Granito);
    }
    
    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn){
    	int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
    	int heightRange = maxY - minY;
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
    	for(int i = 0; i < chance; i++){
    		int xRand = chunkX * 16 + random.nextInt(16);
    		int yRand = random.nextInt(heightRange);
    		int zRand = chunkZ * 16 + random.nextInt(16);
    		gen.generate(world, random, xRand, yRand, zRand);
    		
    		
    	}
    }

	}