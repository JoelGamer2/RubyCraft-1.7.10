package RubyCraft.Generacion;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Generacion_Tipo_de_Piedras implements IWorldGenerator{

	
	private static int barroadn = 0;
	private static int barroambar = 0;
	private static int barrohueso = 0;
	
	private static int rocaadn = 0;
	private static int rocaambar = 0;
	private static int rocahueso = 0;
	
	private static int hieloadn = 0;
	private static int hieloambar = 0;
	private static int hielohueso = 0;
	
	private static int maderaadn = 0;
	private static int maderaambar = 0;
	private static int maderahueso = 0;
	
	private static BiomeGenBase biomas;
	
	private static int vienSize;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		}
	}
	public void generateOverworld(World world,Random rand, int x, int z){
		//generateOre(block, world, rand, x, z, minVienSize, maxVienSize, chance, minY, maxY, generateIn);
    	generateOre(RubyCraft.Andesita, world, rand, x, z, 20, 21, 25, 8, 60, Blocks.stone);
    	generateOre(RubyCraft.Diorita, world, rand, x, z, 20, 21, 25, 8, 60, Blocks.stone);
    	generateOre(RubyCraft.Granito, world, rand, x, z, 20, 21, 25, 8, 60, Blocks.stone);
    	
    	generarbloquesenagua(world, rand, x, z, RubyCraft.coral_amarillo, Blocks.water, BiomeGenBase.ocean);
		generarbloquesenagua(world, rand, x, z, RubyCraft.coral_rojo, Blocks.water, BiomeGenBase.ocean);
		generarbloquesenagua(world, rand, x, z, RubyCraft.coral_morado, Blocks.water, BiomeGenBase.ocean);
		generarbloquesenagua(world, rand, x, z, RubyCraft.coral_azul, Blocks.water, BiomeGenBase.ocean);
		generarbloquesenagua(world, rand, x, z, RubyCraft.coral_rosa, Blocks.water, BiomeGenBase.ocean);

    	
    	if (RubyCraft.Navidad)
    	{
    		generateOreLadodelava(Principal.piedra_ancestral, world, rand, x, z, 2, 9, 15, 2, 8, Blocks.stone);

    		generarrocas(Principal.Roca_Fosil, world, rand, x, z, 20, 40, 40, 70, 256, Blocks.stone);
    		generarbarro(Principal.Barro, world, rand, x, z, 20, 40, 40, 60, 90, Blocks.water);
    		generarhielo(Principal.Hielo_Glaciar, world, rand, x, z, 20, 40, 40, 63, 63, Blocks.ice);
        
    		generarflores(world, rand, x, z, 1, Principal.flor_de_las_nieves, Blocks.snow_layer, BiomeGenBase.icePlains);
    		generarflores(world, rand, x, z, 1, Principal.flor_del_Pantano, Blocks.air, BiomeGenBase.swampland);
    		generarflores(world, rand, x, z, 1, Principal.flor_de_las_montanas, Blocks.air, BiomeGenBase.extremeHills);
    		generarflores(world, rand, x, z, 1, Principal.flor_del_bosque, Blocks.air, BiomeGenBase.forest);
    		
    		

    		
    	}
    }
    
	 public void generarbloquesenagua(World world, Random rand, int chunkX, int chunkZ, Block block, Block  generatein, BiomeGenBase bioma){
		  int probrand = rand.nextInt(100);
	     	
	     	 WorldGenMinable gen = new WorldGenMinable(block, 5, generatein);
	     	if(probrand  <= 5) {
	     		int xRand = chunkX * 16 + rand.nextInt(16);
	     		int zRand = chunkZ * 16 + rand.nextInt(16);
	     		int yRand = world.getHeightValue(xRand, zRand) - 3;
	     		if(world.getBiomeGenForCoords(xRand, zRand) == bioma && yRand > 10 && world.getBlock(xRand, yRand, zRand) == Blocks.water) {
	     			
	     			int ybase = yRand - (14 + probrand);
                   world.setBlock(xRand+1, ybase, zRand, block);
	        		world.setBlock(xRand-1, ybase, zRand, block);
	        		world.setBlock(xRand, ybase, zRand+1, block);
	        		world.setBlock(xRand, ybase, zRand-1, block);
	        		world.setBlock(xRand, ybase+1, zRand, block);
	        		world.setBlock(xRand, ybase+2, zRand, block);
	        		world.setBlock(xRand, ybase+3, zRand, block);
	        		world.setBlock(xRand, ybase+4, zRand, block);
	        		world.setBlock(xRand+1, ybase+3, zRand, block);
	        		world.setBlock(xRand-1, ybase+3, zRand, block);
	        		world.setBlock(xRand, ybase+3, zRand+1, block);
	        		world.setBlock(xRand, ybase+3, zRand-1, block);
	        		world.setBlock(xRand, ybase, zRand, block);

	     		}

	     		
	     		
	     	}
	     }
	    
	
    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generatein){
    	int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
    	int heightRange = maxY - minY;
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, generatein);
    	for(int i = 0; i < chance; i++){
    		int xRand = chunkX * 16 + random.nextInt(16);
    		int yRand = random.nextInt(heightRange);
    		int zRand = chunkZ * 16 + random.nextInt(16);
    		gen.generate(world, random, xRand, yRand, zRand);
    		
    	    }
        }
    
    public void generateOreLadodelava(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generatein){
    	int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, generatein);
    	for(int i = 0; i < chance; i++){
    		int xRand = chunkX * 16 + random.nextInt(16);
    		int yRand = minY + random.nextInt(maxY);
    		int zRand = chunkZ * 16 + random.nextInt(16);
    		if(world.getBlock(xRand + 1, yRand, zRand) == Blocks.lava || world.getBlock(xRand, yRand, zRand + 1) == Blocks.lava || world.getBlock(xRand - 1, yRand, zRand) == Blocks.lava || world.getBlock(xRand, yRand, zRand - 1) == Blocks.lava || world.getBlock(xRand, yRand - 1, zRand) == Blocks.lava || world.getBlock(xRand , yRand + 1, zRand) == Blocks.lava) {
    		gen.generate(world, random, xRand, yRand, zRand);
    		  }
    	    }
        }
    
    public void generarflores(World world, Random rand, int chunkX, int chunkZ, int chance, Block block, Block  generatein, BiomeGenBase bioma){
        int probrand = rand.nextInt(10);
     	
     	 WorldGenMinable gen = new WorldGenMinable(block, 5, generatein);
     	if(probrand <= 3) {
     		int xRand = chunkX * 16 + rand.nextInt(16);
     		int zRand = chunkZ * 16 + rand.nextInt(16);
     		int yRand = world.getHeightValue(xRand, zRand) -1;
     		if(world.getBiomeGenForCoords(xRand, zRand) == bioma && yRand > 10 && world.getBlock(xRand, yRand, zRand) == Blocks.grass) {
     	   world.setBlock(xRand, yRand, zRand, Blocks.grass);
     		world.setBlock(xRand, yRand+1, zRand, block);
     		}

     		
     		
     	}
     }
    
    public void generarbarro(Block block,World world, Random rand, int x,int z, int min,int max, int chance, int ymin, int ymax, Block togenerate) {


        int vienSize = min + rand.nextInt(max - min);
        int menas = vienSize;
        barrohueso = rand.nextInt(menas - 3);
        barroambar = rand.nextInt(menas - 4);
        barroadn = 1 + rand.nextInt(menas - 15);
        WorldGenMinable gen = new WorldGenMinable(block, vienSize, togenerate);
        WorldGenMinable barrocongelado = new WorldGenMinable(Principal.Barro_Congelado, vienSize,Principal.Barro);

        WorldGenMinable barrocongeladohueso = new WorldGenMinable(Principal.Barro_Congelado_Hueso,barrohueso, Principal.Barro_Congelado);
        WorldGenMinable barrocongeladoambar = new WorldGenMinable(Principal.Barro_Congelado_Ambar, barroambar, Principal.Barro_Congelado);
        WorldGenMinable barrocongeladoadn = new WorldGenMinable(Principal.Barro_Congelado_Adn, barroadn, Principal.Barro_Congelado);


        for(int i = 0; i < chance; i++){
            int xRand = x * 16 + rand.nextInt(16);
            int zRand = z * 16 + rand.nextInt(16);
            int yRand = 61;
           if(world.getBiomeGenForCoords(xRand, zRand).biomeName.startsWith("Swampland")) {
        	         
            gen.generate(world, rand, xRand, yRand, zRand);
        	   }

            barrocongelado.generate(world, rand, xRand, yRand - 1, zRand);
            barrocongeladoambar.generate(world, rand, xRand, yRand - 1, zRand);
            barrocongeladoadn.generate(world, rand, xRand, yRand - 1, zRand);
            barrocongeladohueso.generate(world, rand, xRand, yRand - 1, zRand);
                }
             
          }
    
    
    public void generarrocas(Block block, World world, Random rand, int x, int z, int min, int max, int chance, int ymin, int ymax, Block togenerate) {

        
    	int vienSize = min + rand.nextInt(max);
    	
		rocahueso = (35 * vienSize)/100;
		rocaambar = (20 * vienSize)/100;
    	rocaadn = (10 * vienSize)/100;
    	
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, togenerate);
    	
    	WorldGenMinable rocahuesogen = new WorldGenMinable(Principal.Roca_Fosil_Hueso,rocahueso, Principal.Roca_Fosil);
    	WorldGenMinable rocaadngen = new WorldGenMinable(Principal.Roca_Fosil_Adn, rocaadn, Principal.Roca_Fosil);
    	WorldGenMinable rocaambargen = new WorldGenMinable(Principal.Roca_Fosil_Ambar, rocaambar, Principal.Roca_Fosil);

    	for(int i = 0; i < chance; i++){
    		int xRand = x * 16 + rand.nextInt(16);
    		int yRand = ymin + rand.nextInt(ymax);
    		int zRand = z * 16 + rand.nextInt(16);
    	   if(world.getBiomeGenForCoords(xRand, zRand).biomeName.startsWith("Extreme")) {
    		gen.generate(world, rand, xRand, yRand, zRand);
    		
    		rocaambargen.generate(world, rand, xRand, yRand - 1, zRand);
    		rocaadngen.generate(world, rand, xRand, yRand - 1, zRand);
    		rocahuesogen.generate(world, rand, xRand, yRand - 1, zRand);
                }
    	     }  
          }   
    
    
public void generarhielo(Block block, World world, Random rand, int x, int z, int min, int max, int chance, int ymin, int ymax, Block togenerate) {

        
    	int vienSize = min + rand.nextInt(max);
    	
		hielohueso = (15 * vienSize)/100;
		hieloambar = (10 * vienSize)/100;
    	hieloadn = (7 * vienSize)/100;
    	
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, togenerate);
    	
    	WorldGenMinable hielohuesogen = new WorldGenMinable(Principal.Hielo_Glaciar_Hueso,hielohueso, Blocks.water);
    	WorldGenMinable hieloadngen = new WorldGenMinable(Principal.Hielo_Glaciar_Adn, hieloadn, Blocks.water);
    	WorldGenMinable hieloambargen = new WorldGenMinable(Principal.Hielo_Glaciar_Ambar, hieloambar, Blocks.water);

    	for(int i = 0; i < chance; i++){
    		int xRand = x * 16 + rand.nextInt(16);
    		int yRand = 63;
    		int zRand = z * 16 + rand.nextInt(16);
    	   if(world.getBiomeGenForCoords(xRand, zRand).biomeName.equalsIgnoreCase("FrozenRiver")) {
    		gen.generate(world, rand, xRand, yRand, zRand);
    		
    		hieloambargen.generate(world, rand, xRand, yRand - 1, zRand);
    		hieloadngen.generate(world, rand, xRand, yRand - 1, zRand);
    		hielohuesogen.generate(world, rand, xRand, yRand - 1, zRand);
                }
    	     }  
          }   
	}