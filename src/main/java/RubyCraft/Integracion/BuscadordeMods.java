package RubyCraft.Integracion;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.Loader;

public class BuscadordeMods {
	
	public static String MigeCrafmoid = "mc";
	
	public static boolean isMigueCraftLoaded;
	
	public BuscadordeMods() {
		
		this.isMigueCraftLoaded = Loader.isModLoaded("mc");
		
		
	}
	
	public static void Mensaje(){
		if(isMigueCraftLoaded){
			RubyCraft.logger.info("MigueCraf a sido Cargado Correctamente");
		}else{
			RubyCraft.logger.info("MigueCraf No se Cargo No se inclullen cosas Extras");
		}
	}
}