package Eventos;

import java.util.Calendar;

import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import RubyCraft.Maquinas.MesadeTrabajodeRuby;
import RubyCraft.Navidad.Cambiador_de_Texturas;
import RubyCraft.Registrar.Crafteos;

public class Ver_fecha_calendario_usuario {

	
	public static void iniciar() {
		
		
		
		/** Testear Calendario **/
		 
		//Testear Navidad
			Calendar calendar = Calendar.getInstance();

		    if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 31 && Control_de_Version.Navidad_Activar == false){
		       Verificar_Fecha.Navidad = true;
		       Verificar_Fecha.Iniciar();
		       
		      //Testear el Dia de Los Inocentes
	    		if(calendar.get(2) + 1 == 12 && calendar.get(5) == 28){
	    			Crafteos.IniciarCrafteosDiadelosInocentes();
	    			RubyCraft.Dia_de_Los_Inocentes = true;
	    		}
		        
		    }else{
		    	//Testear Hallowen
		    	if(calendar.get(2) + 1 == 10 && calendar.get(5) >= 28 && calendar.get(5) <= 31){
		    		 Verificar_Fecha.HalloWen = true;
		    		Verificar_Fecha.Iniciar();
		    	
		    	}else{
		    			//Testear Dia de Herobrine
		    		  if(calendar.get(2) + 1 == MesadeTrabajodeRuby.Mes && calendar.get(5) == MesadeTrabajodeRuby.Dia){
		    			  Crafteos.IniciarCrafteosDiaHerobrine();
		    			  MesadeTrabajodeRuby.Dia_de_Herobrine = true;
		    			  Cambiador_de_Texturas.Texturas();
		    		  }else if (Control_de_Version.Navidad_Activar == false){
		    			RubyCraft.Navidad = false;
		    			RubyCraft.HalloWen = false;
		    			RubyCraft.Dia_de_Los_Inocentes = false;
		    			MesadeTrabajodeRuby.Dia_de_Herobrine = false;
		    			
		    			Cambiador_de_Texturas.Texturas();
		    		}else if(Control_de_Version.Navidad_Activar == true) {
		    			
		    			Cambiador_de_Texturas.Texturas_Navidad();
		    			RubyCraft.Navidad = true;
		    			
		    		}
		    	}
		    }
		    
		  
		
		
	}
	
}
