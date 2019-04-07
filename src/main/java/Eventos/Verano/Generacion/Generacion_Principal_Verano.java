package Eventos.Verano.Generacion;

import cpw.mods.fml.common.registry.GameRegistry;

public class Generacion_Principal_Verano {
	
	public static void InicicializarGeneraciones()
	{
		GameRegistry.registerWorldGenerator(new Generacion_Plantas(), 100);
 
	}

}
