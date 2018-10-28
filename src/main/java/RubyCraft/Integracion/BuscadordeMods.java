package RubyCraft.Integracion;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.Loader;

public class BuscadordeMods {
	
	public static String Origins = "or";
	
	public static boolean isOriginsLoaded;
	
	public BuscadordeMods() {
		
		this.isOriginsLoaded = Loader.isModLoaded("or");
		
		
	}
	
	public static void Mensaje(){
		if(isOriginsLoaded){
			RubyCraft.logger.info("Origins a sido cargado correctamente");
		}else{
			RubyCraft.logger.info("Origins no se ha cargado quitando Integracion");
		}
	}
}