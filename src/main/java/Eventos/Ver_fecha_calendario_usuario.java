package Eventos;

import java.util.Calendar;

import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import RubyCraft.Maquinas.MesadeTrabajodeRuby;
import RubyCraft.Registrar.Crafteos;

public class Ver_fecha_calendario_usuario {

	public static int IHalloween;
	public static int AHalloween;
	public static int MesHalloween;
	
	public static int INavidad;
	public static int ANavidad;
	public static int MesNavidad;
	
	public static void iniciar() {
		
		
		/** Testear Calendario **/
		 
		//Testear Navidad
			Calendar calendar = Calendar.getInstance();
          
		    if (calendar.get(2) + 1 == MesNavidad && calendar.get(5) >= INavidad && calendar.get(5) <= ANavidad && Control_de_Version.Navidad_Activar == false){
		       Verificar_Fecha.Navidad = true;
		       
		       if(RubyCraft.cliente) {
		       Verificar_Fecha.iniciar();
		       }else if(!RubyCraft.cliente) {
		    	   RubyCraft.Navidad = true;
		    	   
		       }
		       
		      //Testear el Dia de Los Inocentes
	    		if(calendar.get(2) + 1 == 12 && calendar.get(5) == 28){
	    			Crafteos.IniciarCrafteosDiadelosInocentes();
	    			RubyCraft.Dia_de_Los_Inocentes = true;
	    		}
		        
		    }else{
		    	//Testear Hallowen
		    	if(calendar.get(2) + 1 == MesHalloween && calendar.get(5) >= IHalloween && calendar.get(5) <= AHalloween){
		    		 Verificar_Fecha.HalloWen = true;
		    		 if(RubyCraft.cliente) {
		  		       Verificar_Fecha.iniciar();
		  		       }else if(!RubyCraft.cliente) {
				    	   RubyCraft.HalloWen = true;
				    	   
				       }
		    	
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
