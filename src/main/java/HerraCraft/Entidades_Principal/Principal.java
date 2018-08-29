package HerraCraft.Entidades_Principal;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class Principal {

	public static void mainRegistry(){
		
		 RegistrarEntidad();
	}
	
	public static void RegistrarEntidad(){
		
		createEntity(Tank.class, "Tank", 0xFFFFFF, 0x000000);
//		createEntity(Slenderman.class, "Slenderman", 0x000000, 0xFF0000);
        createEntity(Invisiteibol.class, "Invisiteibol", 0x808080, 0xFFFFFF);
		createEntity(JoelGamer2.class, "JoelGamer2", 0x0026FF, 0x00FFFF);
		createEntity(Miguelperez.class, "Miguelperez", 0x00FF21, 0xFF0000);
		createEntity(Wither_Storm.class, "Wither_Storm", 0x000000, 0xB200FF);
		createEntity(Prakxisredstoner.class, "Prakxisredstoner", 0x000000, 0xFF0000);
		createEntity(Herobrine.class, "Herobrine", 0xFFFFFF, 0x00FFFF);
		
	}
	
	private static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		Spawn_Mobs.SpanwearBichos();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, RubyCraft.instance, 64, 1, true);
		createEgg(randomId, solidColour, spotColour);
	}
	
	
	private static void createEgg(int randomId, int solidColour, int spotColour) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColour, spotColour));
		
	}
	
}
