package HerraCraft.Registrar;

import HerraCraft.Eventos.Cuchillo;
import cpw.mods.fml.common.FMLCommonHandler;

public class Eventos {

	public static void Iniciar(){
		
		FMLCommonHandler.instance().bus().register(new Cuchillo());
		
	}
	
}
