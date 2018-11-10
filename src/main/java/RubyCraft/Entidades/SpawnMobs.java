package RubyCraft.Entidades;

import RubyCraft.Entidades.Mobs.AlejandroMob;
import RubyCraft.Entidades.Mobs.AlienMob;
import RubyCraft.Entidades.Mobs.HombreCerdo;
import RubyCraft.Entidades.Mobs.Iratxe;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class SpawnMobs {

	public static void SpanwearBichos(){
		
    EntityRegistry.addSpawn(AlienMob.class, 3, 2, 5, EnumCreatureType.monster, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.jungle, BiomeGenBase.birchForest, BiomeGenBase.forest);
    EntityRegistry.addSpawn(AlejandroMob.class, 1, 1, 2, EnumCreatureType.monster, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.jungle, BiomeGenBase.birchForest, BiomeGenBase.forest);
    EntityRegistry.addSpawn(Iratxe.class, 2, 2, 3, EnumCreatureType.monster, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.jungle, BiomeGenBase.birchForest, BiomeGenBase.forest);
    EntityRegistry.addSpawn(HombreCerdo.class, 3, 3, 4, EnumCreatureType.creature, BiomeGenBase.desert, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.birchForest);
    
	}
	
}
