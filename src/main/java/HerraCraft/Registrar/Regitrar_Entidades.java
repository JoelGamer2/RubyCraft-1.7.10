package HerraCraft.Registrar;

import HerraCraft.Entidades.Render.HerobrineRenderModel;
import HerraCraft.Entidades.Render.JoelGamer2Render;
import HerraCraft.Entidades.Render.MiguelperezRender;
import HerraCraft.Entidades.Render.RenderDoctorNokTexture;
import HerraCraft.Entidades.Render.RenderHerobrineTexture;
import HerraCraft.Entidades.Render.RenderInvisiteibolTexture;
import HerraCraft.Entidades.Render.RenderJoelGamer2Texture;
import HerraCraft.Entidades.Render.RenderMiguelperezTexture;
import HerraCraft.Entidades.Render.RenderTankTexture;
import HerraCraft.Entidades.Render.RenderWither_StormTexture;
import HerraCraft.Entidades.Render.TankRender;
import HerraCraft.Entidades.Render.Wither_StormRender;
import HerraCraft.Entidades_Principal.DoctorNok;
import HerraCraft.Entidades_Principal.Herobrine;
import HerraCraft.Entidades_Principal.Invisiteibol;
import HerraCraft.Entidades_Principal.JoelGamer2;
import HerraCraft.Entidades_Principal.Miguelperez;
import HerraCraft.Entidades_Principal.Spawn_Mobs;
import HerraCraft.Entidades_Principal.Tank;
import HerraCraft.Entidades_Principal.Wither_Storm;
import RubyCraft.RubyCraft;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityList;

public class Regitrar_Entidades {

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
		createEntity(DoctorNok.class, "DoctorNok", 0xDDB690, 0xFF0000);
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
	
	private static void createEntitySinHuevo(Class entityClass, String entityName) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();

		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, RubyCraft.instance, 64, 1, true);
		
	}
	
	
}
