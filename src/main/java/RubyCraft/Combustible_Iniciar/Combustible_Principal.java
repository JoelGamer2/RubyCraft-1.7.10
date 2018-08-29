package RubyCraft.Combustible_Iniciar;

import RubyCraft.NoCombustible_Iniciar.NoCombustibleBloquedeAzucar;
import RubyCraft.NoCombustible_Iniciar.NoCombustibleMesaRuby;
import RubyCraft.NoCombustible_Iniciar.NoCombustibleMesaZafiro;
import cpw.mods.fml.common.registry.GameRegistry;

public class Combustible_Principal {
	
	public static void IniciarCombstibles(){
		//Combustibles
		GameRegistry.registerFuelHandler(new CombustiblePaloVerde());
	    GameRegistry.registerFuelHandler(new Combustiblebloqueblaze());
	    GameRegistry.registerFuelHandler(new CombustibleMaderaAzul());
	    GameRegistry.registerFuelHandler(new CombustibleMaderaVerde());
	    GameRegistry.registerFuelHandler(new CombustibleTroncoAzul());
	    GameRegistry.registerFuelHandler(new CombustibleTroncoVerde());
	    GameRegistry.registerFuelHandler(new CombustibleMagma());
	    
	    //No Combustibles
	    
	    GameRegistry.registerFuelHandler(new NoCombustibleBloquedeAzucar());
	    GameRegistry.registerFuelHandler(new NoCombustibleMesaRuby());
	    GameRegistry.registerFuelHandler(new NoCombustibleMesaZafiro());
	    
	}
	
}
