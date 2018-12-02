package Eventos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Scanner;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Crafteos;

public class Verificar_Fecha {

	public static int puerto;
	public static String ip;

	
	public static String Mensajedelserver;
	public static String mensajecliente;
	public static DataOutputStream dout1;
	
	public static boolean Iniciado = false;	
	public static boolean inicia = true;	
	public static boolean HalloWen = false;
	public static boolean Navidad = false;
	
	private static String URL = "https://www.dropbox.com/s/i7r1eebqvl01hv3/RubyCraft-DiasEventos.txt?raw=1";
	
	
public static boolean URLNOVALIDAERROR = false;
	
	
	public static void iniciar() {
		IniciarVerificador();
		
	}
	
	
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
					
					Ver_fecha_calendario_usuario.IHalloween = Integer.parseInt(IHalloween);
					Ver_fecha_calendario_usuario.AHalloween = Integer.parseInt(AHalloween);
					Ver_fecha_calendario_usuario.MesHalloween = Integer.parseInt(MesHalloween);
					
					Ver_fecha_calendario_usuario.INavidad = Integer.parseInt(INavidad);
					Ver_fecha_calendario_usuario.ANavidad = Integer.parseInt(ANavidad);
					Ver_fecha_calendario_usuario.MesNavidad = Integer.parseInt(MesNavidad);
					
					scanner.close();
				} catch (MalformedURLException e) {
					RubyCraft.logger.info("No se ha podido verificar la fecha del evento error:" + e);
					URLNOVALIDAERROR = true;
					
				} catch (IOException e1) {
					RubyCraft.logger.info("No se ha podido verificar la fecha del evento error:" + e1);
					URLNOVALIDAERROR = true;
				}
			}
			
		}.start();
	}
	
	
	public static void VerIpePuerto(){
		new Thread("VerIpePuerto"){
			
			public void run(){
				try {
					URL url = new URL(URL);
					Scanner scanner = new Scanner(url.openStream());
					String hueco = scanner.nextLine();
					
					String ipacojer = scanner.nextLine();
					String puertoacojer = scanner.nextLine();
					
					ip = ipacojer;
					puerto = Integer.parseInt(puertoacojer);
					
					scanner.close();
				} catch (MalformedURLException e) {
					URLNOVALIDAERROR = true;
					
				} catch (IOException e1) {
					URLNOVALIDAERROR = true;
				}
			}
			
		}.start();
	}
	
	public static void IniciarVerificador() {
		try {
			
			Socket s = new Socket(ip,puerto);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			s.setSoTimeout(10000);
			
			dout1 = dout;
			dout=dout1;
			
			String msgin="",msgout="";	
			
			while(inicia) {
				
			if(HalloWen == true && !Iniciado) {
				dout.writeUTF("Hallowen");
				dout.flush();
				Iniciado = true;
			}else if(Navidad == true && !Iniciado) {
				dout.writeUTF("Navidad");
				dout.flush();
				Iniciado = true;
			}
			
			msgin = din.readUTF();
			
			if(msgin.equals("true") && HalloWen == true) {
				
				RubyCraft.HalloWen = true;
	    		Crafteos.IniciarCrafteosHallowen();
	    		if(RubyCraft.cliente) {
	    		Cambiador_de_Texturas.Texturas();
	    		}
	    		IniciarItemsEventos.Iniciartodo();
				inicia = false;
				
			}else if(HalloWen == true && msgin.equals("false")) {
       
				inicia = false;
				if(RubyCraft.cliente) {
		    		Cambiador_de_Texturas.Texturas();
		    		}
				
			}else if(Navidad == true && msgin.equals("true")) {
			
				 RubyCraft.Navidad = true;
				 Crafteos.IniciarCrafteosNavidad();
				 if(RubyCraft.cliente) {
			     Cambiador_de_Texturas.Texturas();
				 }
			     IniciarItemsEventos.Iniciartodo();
				inicia = false;
				
			}else if(Navidad == true && msgin.equals("false")) {

				inicia = false;
				if(RubyCraft.cliente) {
		    		Cambiador_de_Texturas.Texturas();
		    		}
			     }		

			}
			
	}catch (Exception e) {
		
		inicia = false;
		RubyCraft.Navidad = false;
		RubyCraft.HalloWen = false;
		Navidad = false;
		HalloWen = false;
		Cambiador_de_Texturas.Texturas();
		System.out.println(e);
		
	      }
	
     }

}
