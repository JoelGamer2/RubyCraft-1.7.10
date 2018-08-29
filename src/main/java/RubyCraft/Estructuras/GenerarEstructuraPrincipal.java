
package RubyCraft.Estructuras;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class GenerarEstructuraPrincipal implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch(world.provider.dimensionId){
		case 0 : generateOverWorld(world, random, chunkX*16, chunkZ*16);
		
		}	
	}

	private void generateOverWorld(World world, Random random, int x, int z) 
	{
		
		  int Xcoord1 = x;
		  int Ycoord1 = world.getTopSolidOrLiquidBlock(x, z);
		  int Zcoord1 = z;
		   
		//(new MonumentoMarino()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
	} 
	
}