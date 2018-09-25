package RubyCraft.Eventos;

import Eventos.Eventos_especiales;
import HerraCraft.Registrar.Eventos;
import RubyCraft.Teclas.Evento_Teclas;
import cpw.mods.fml.common.FMLCommonHandler;

public class Eventos_Principal {

	public static void IniciarEventos(){
		FMLCommonHandler.instance().bus().register(new MinaRuby());
		FMLCommonHandler.instance().bus().register(new CrafteaMesadeRuby());
		FMLCommonHandler.instance().bus().register(new CrafteaBloquedeRuby());
		FMLCommonHandler.instance().bus().register(new CrafteaPicoRuby());
		FMLCommonHandler.instance().bus().register(new CrafteaEspadaRuby());
		FMLCommonHandler.instance().bus().register(new CubretedeRubys());
		
		FMLCommonHandler.instance().bus().register(new MinaZafiro());
		FMLCommonHandler.instance().bus().register(new CrafteaBloquedeZafiro());
		FMLCommonHandler.instance().bus().register(new CrafteaMesadeZafiro());
		FMLCommonHandler.instance().bus().register(new CrafteaPicoZafiro());
		FMLCommonHandler.instance().bus().register(new CrafteaEspadaZafiro());
		FMLCommonHandler.instance().bus().register(new CubretedeZafiros());

		
		FMLCommonHandler.instance().bus().register(new RevolucionMob());
		
		FMLCommonHandler.instance().bus().register(new ConsigueUranio());
		
		FMLCommonHandler.instance().bus().register(new Evento_Teclas());
		
		FMLCommonHandler.instance().bus().register(new CrafteaMesadeConjuraciones());
		
		FMLCommonHandler.instance().bus().register(new Totem());
		
		FMLCommonHandler.instance().bus().register(new Eventos_especiales());		
		
	//	FMLCommonHandler.instance().bus().register(new QuitarVidaSiUranio());
		
		//Herracraft
		Eventos.Iniciar();
	}
	
}
