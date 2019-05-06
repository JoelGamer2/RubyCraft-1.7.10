package Eventos;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Scanner;

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
	
	public static int IVerano;
	public static int AVerano;
	public static int MesVerano;
	
	public static int ano;
	public static String URL = "https://www.dropbox.com/s/i7r1eebqvl01hv3/RubyCraft-DiasEventos.txt?raw=1";

	public static void VerFechasEventos(){
		new Thread("VerFechaEventos"){
			
			public void run(){
				try {
					URL url = new URL(URL);
					Scanner scanner = new Scanner(url.openStream());
					String hueco1 = scanner.nextLine();
					String hueco2 = scanner.nextLine();
					String hueco3 = scanner.nextLine();
					String hueco4 = scanner.nextLine();
					String hueco5 = scanner.nextLine();
					String hueco6 = scanner.nextLine();
					
					String IHalloween = scanner.nextLine();
					String AHalloween = scanner.nextLine();
					String MesHalloween = scanner.nextLine();
					
					String hueco7 = scanner.nextLine();

					String INavidad = scanner.nextLine();
					String ANavidad = scanner.nextLine();
					String MesNavidad = scanner.nextLine();
					
					String hueco8 = scanner.nextLine();
					
					String IVerano = scanner.nextLine();
					String AVerano = scanner.nextLine();
					String MesVerano = scanner.nextLine();
					
					Ver_fecha_calendario_usuario.IHalloween = Integer.parseInt(IHalloween);
					Ver_fecha_calendario_usuario.AHalloween = Integer.parseInt(AHalloween);
					Ver_fecha_calendario_usuario.MesHalloween = Integer.parseInt(MesHalloween);
					
					Ver_fecha_calendario_usuario.INavidad = Integer.parseInt(INavidad);
					Ver_fecha_calendario_usuario.ANavidad = Integer.parseInt(ANavidad);
					Ver_fecha_calendario_usuario.MesNavidad = Integer.parseInt(MesNavidad);
					
					Ver_fecha_calendario_usuario.IVerano = Integer.parseInt(IVerano);
					Ver_fecha_calendario_usuario.AVerano = Integer.parseInt(AVerano);
					Ver_fecha_calendario_usuario.MesVerano = Integer.parseInt(MesVerano);
					scanner.close();
					iniciar();
				} catch (MalformedURLException e) {
					RubyCraft.logger.info("No se ha podido verificar la fecha del evento error:" + e);
					
					
				} catch (IOException e1) {
					RubyCraft.logger.info("No se ha podido verificar la fecha del evento error:" + e1);
					
				}
			}
			
		}.start();
	}
	
	
	public static void iniciar() {
		
		
			Calendar calendar = Calendar.getInstance();
			
			//Testear Verano
	    	if(calendar.get(2) + 1 == MesVerano && calendar.get(5) >= IVerano && calendar.get(5) <= AVerano){
	    		Verificar_Fecha.Verano = true;
	    		 if(RubyCraft.cliente) {
		  		       Verificar_Fecha.iniciar();
		  		       }else if(!RubyCraft.cliente) {
				    	   RubyCraft.Verano = true;
							IniciarItemsEventos.Iniciartodo();
				    	  
				    	   
				       }
	    	}else {
	    		IniciarItemsEventos.Iniciartodo();
	    	}

          //Testear aniversario
		/**	if(calendar.get(2) + 1 == 3 && calendar.get(5) >= 13 && calendar.get(5) <= 20) {
				RubyCraft.Aniversario = true;
				ano = calendar.get(calendar.YEAR);
				ano = ano - 2017;
			}**/
			//Testear Navidad
		    if (calendar.get(2) + 1 == MesNavidad && calendar.get(5) >= INavidad && calendar.get(5) <= ANavidad && Control_de_Version.Navidad_Activar == false){
		       Verificar_Fecha.Navidad = true;
		       if(RubyCraft.cliente) {
		       Verificar_Fecha.iniciar();
		       }else if(!RubyCraft.cliente) {
		    	   RubyCraft.Navidad = true;
					Crafteos.IniciarCrafteosNavidad();
						 IniciarItemsEventos.Iniciartodo();
						 
		    	   
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
							Crafteos.IniciarCrafteosHallowen();
							IniciarItemsEventos.Iniciartodo();
				    	  
				    	   
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
