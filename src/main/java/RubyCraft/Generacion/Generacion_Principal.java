package RubyCraft.Generacion;

import HerraCraft.Generacion.Generacion_Mena_de_Azula;
import RubyCraft.Estructuras.GenerarEstructuraPrincipal;
import RubyCraft.Estructuras.generararboles;
import cpw.mods.fml.common.registry.GameRegistry;

public class Generacion_Principal {

	public static void InicicializarGeneraciones(){
		
		GameRegistry.registerWorldGenerator(new Generacion_Tipo_de_Piedras(), 100);
		GameRegistry.registerWorldGenerator(new Generacion_Ruby(), 100);
    	GameRegistry.registerWorldGenerator(new Generacion_Zafiro(), 100);
    	GameRegistry.registerWorldGenerator(new Generacion_BloquedeMagma(), 0);
    	GameRegistry.registerWorldGenerator(new GenerarEstructuraPrincipal(), 100);
    	GameRegistry.registerWorldGenerator(new Generacion_Materiales_Preciosos(), 100);
    	GameRegistry.registerWorldGenerator(new generararboles(), 100);
    	GameRegistry.registerWorldGenerator(new Generacion_Mena_de_Azula(), 0);
 
	}
	
}