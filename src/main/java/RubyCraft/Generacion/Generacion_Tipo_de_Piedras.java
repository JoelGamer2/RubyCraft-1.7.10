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

        generarrocas(Principal.Roca_Fosil, world, rand, x, z, 20, 40, 40, 70, 256, Blocks.stone);
        generarbarro(Principal.Barro, world, rand, x, z, 20, 40, 40, 60, 90, Blocks.water);
        generarhielo(Principal.Hielo_Glaciar, world, rand, x, z, 20, 40, 40, 63, 63, Blocks.ice);
        
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
            int yRand = 61;
            int zRand = z * 16 + rand.nextInt(16);
           if(world.getBiomeGenForCoords(xRand, zRand).biomeName.startsWith("Swampland")) {
            gen.generate(world, rand, xRand, yRand, zRand);

            barrocongelado.generate(world, rand, xRand, yRand - 1, zRand);
            barrocongeladoambar.generate(world, rand, xRand, yRand - 1, zRand);
            barrocongeladoadn.generate(world, rand, xRand, yRand - 1, zRand);
            barrocongeladohueso.generate(world, rand, xRand, yRand - 1, zRand);
                }
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