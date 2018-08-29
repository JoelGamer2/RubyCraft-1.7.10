package HerraCraft.Entidades_Principal;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class Spawn_Mobs {
	public static void SpanwearBichos(){
		
	    EntityRegistry.addSpawn(Tank.class, 3, 2, 10, EnumCreatureType.monster, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.jungle, BiomeGenBase.birchForest, BiomeGenBase.forest);
        
	//   EntityRegistry.addSpawn(Slenderman.class, 3, 2, 10, EnumCreatureType.monster, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.jungle, BiomeGenBase.birchForest, BiomeGenBase.forest);
	    
	    EntityRegistry.addSpawn(JoelGamer2.class, 3, 2, 5, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.desert);
	    
	    EntityRegistry.addSpawn(Miguelperez.class, 3, 2, 5, EnumCreatureType.monster, BiomeGenBase.plains, BiomeGenBase.desert);
	    
	    EntityRegistry.addSpawn(DoctorNok.class, 3, 2, 7, EnumCreatureType.monster, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.jungle, BiomeGenBase.birchForest, BiomeGenBase.forest);
	    
	    EntityRegistry.addSpawn(Herobrine.class, 1, 1, 1, EnumCreatureType.monster, BiomeGenBase.sky, BiomeGenBase.desert);
	    
	   
	    
	   
	    
		}
}
