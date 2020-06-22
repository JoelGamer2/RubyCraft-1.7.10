package RubyCraft.Entidades;

import Eventos.Halloween.Entidades.BossParca;
import Eventos.Navidad.Entidades.Lich;
import Eventos.Navidad.Entidades.YetiLich;
import Eventos.Navidad.Entidades.YetiLichEstatua;
import Eventos.Verano.Entidades.Elemental_de_Agua_Guardian;
import Eventos.Verano.Entidades.Elemental_de_Agua_Soldado;
import Eventos.Verano.Entidades.Elemental_de_Tierra_Guardian;
import Eventos.Verano.Entidades.Elemental_de_Tierra_Soldado;
import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import RubyCraft.Entidades.Granadas.EntidadGranada_de_Ruby;
import RubyCraft.Entidades.Granadas.EntidadGranada_de_Zafiro;
import RubyCraft.Entidades.Granadas.EntidadGranda_de_Uranio;
import RubyCraft.Entidades.Mobs.AlejandroMob;
import RubyCraft.Entidades.Mobs.AlienMob;
import RubyCraft.Entidades.Mobs.Entityprueba;
import RubyCraft.Entidades.Mobs.HombreCerdo;
import RubyCraft.Entidades.Mobs.Invocador;
import RubyCraft.Entidades.Mobs.Iratxe;
import RubyCraft.Entidades.Mobs.Jose;
import RubyCraft.Entidades.Mobs.Patxis;
import RubyCraft.Entidades.Mobs.Shulker;
import RubyCraft.Items.Ruby;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class Entidades_Principal {

	public static void mainRegistry(){
		
		 RegistrarEntidad();
	}
	
	public static void RegistrarEntidad(){
		//Entidades que el juego no creara el huvo de generar
		createEntitySinHuevo(EntidadGranada_de_Ruby.class,"Granada_de_Ruby");
		createEntitySinHuevo(EntidadGranada_de_Zafiro.class, "Granada_de_Zafiro");
		createEntitySinHuevo(EntidadGranda_de_Uranio.class, "Granada_de_Uranio");	
		createEntitySinHuevo(BossParca.class, "Parca");
		createEntitySinHuevo(YetiLich.class, "YetiLichR");
		createEntitySinHuevo(Lich.class, "LichR");
		createEntitySinHuevo(Elemental_de_Agua_Guardian.class, "Elemental_de_Agua_Guardian");
		createEntitySinHuevo(Elemental_de_Agua_Soldado.class, "Elemental_de_Agua_Soldado");
		createEntitySinHuevo(Elemental_de_Tierra_Guardian.class, "Elemental_de_Tierra_Guardian");
		createEntitySinHuevo(Elemental_de_Tierra_Soldado.class, "Elemental_de_Tierra_Soldado");
		//Entidades Normales
		createEntity(AlienMob.class, "AlienR", 0x6B6B6B, 0x00FF1D);
		createEntity(AlejandroMob.class, "Alejandro", 0x0280FF, 0x0C00FF);
		createEntity(Shulker.class, "shulker", 0x57007F, 0x000000);
		createEntity(Iratxe.class, "Iratxe", 0x9DFF26, 0x3AD1FF);
		createEntity(Invocador.class, "Invocador", 0x808080, 0x000000);
		createEntity(HombreCerdo.class, "HombreCerdo", 0xFF8488, 0xFF60F4);
		createEntity(Jose.class, "Joseoscar1", 0xFFBB7C, 0xFF1C58);
		createEntity(Patxis.class, "PatxisGamer", 0xFF0008, 0xFF9B49);
		createEntity(YetiLichEstatua.class, "YetiLichRE", 0x000000, 0x195D42);
		
		
		if(Control_de_Version.Version_de_desarrolador&& RubyCraft.cliente) {
			
			createEntity(Entityprueba.class, "RPrueba", 0x173766, 0xB86421);
			
		}
	}
	
	private static void createEntity(Class entityClass, String entityName, int ColordeFondo, int ColordeLosPuntos) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		
		SpawnMobs.SpanwearBichos();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, RubyCraft.instance, 64, 1, true);
		createEgg(randomId, ColordeFondo, ColordeLosPuntos);
		
		if(entityName == "YetiLichRE") {
			Lich.idyetilich = randomId;
		}
		
	}
	
	private static void createEntitySinHuevo(Class claseentidad, String nombre) {
		int RandomId = EntityRegistry.findGlobalUniqueEntityId();
		
	
		EntityRegistry.registerGlobalEntityID(claseentidad, nombre, RandomId);
		EntityRegistry.registerModEntity(claseentidad, nombre, RandomId, RubyCraft.instance, 64, 1, true);
		
	}
	
	private static void createEgg(int randomId, int ColordeFondo, int ColordeLosPuntos) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, ColordeFondo, ColordeLosPuntos));
		
	}
	
}
