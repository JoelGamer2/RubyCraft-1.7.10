package RubyCraft.Estructuras;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
public class generararboles implements IWorldGenerator{

	public static boolean pass;

public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
{
switch (world.provider.dimensionId)
{

case 0: generateSurface(world, random, chunkX*6, chunkZ*6);
}
}

private static int Bloquedebajo(World world, int x ,int z, boolean ignoreFluids, boolean ignoreWood, boolean ignoreFoliage){
	int currentTop = world.getHeightValue(x, z);
	Block blockBelow;
	for (int i = currentTop; i > 0; i--){
		pass = true;
	if(world.getBlock(x, i - 1, z).getMaterial() == Material.water) {
		pass = false;
	}else if(world.getBlock(x, i - 1, z).getMaterial() == Material.grass) {
		pass = true;
	}else if(world.getBlock(x, i - 1, z).getMaterial() == Material.air) {
		pass = false;
	}else if(world.getBlock(x, i - 1, z).getMaterial() == Material.ground) {
		pass = false;
	}
		
	}
	return currentTop;
	
}

public static void generateSurface(World world, Random rand, int chunkX, int chunkZ){

MonumentoMarino monumento = new  MonumentoMarino();
ArbolVerde arbolverde = new ArbolVerde();

boolean debug = true;
if(rand.nextInt(2) % 1 == 0 || debug){
	
int x = chunkX + rand.nextInt(2);
int z = chunkZ + rand.nextInt(2);
int y = Bloquedebajo(world, x, z, true, true, true);

if(pass == true){
	
//arbolverde.generate(world, rand, x, y, z);
      }
 } 
}
private void generateNether(World world, Random random, int blockX, int blockZ)
{
   }

}
