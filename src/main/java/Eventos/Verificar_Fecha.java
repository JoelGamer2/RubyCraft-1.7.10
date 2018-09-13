package Eventos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import RubyCraft.RubyCraft;
import RubyCraft.Navidad.Cambiador_de_Texturas;
import RubyCraft.Registrar.Crafteos;

public class Verificar_Fecha {

	public static int puerto1 = 1234;

	
	public static String Mensajedelserver;
	public static String mensajecliente;
	public static DataOutputStream dout1;
	
	public static String Version = "1.2";
	
	public static int Veces_chat_vacio = 0;

	public static boolean Iniciado = false;
	
	public static boolean inicia = true;
	
	public static boolean HalloWen = false;
	public static boolean Navidad = false;
	
	public static void Iniciar() {
		//ventana.iniciar();
		try {
			
			//System.out.println("Pepe Bot Cliente Version:" + Version);
			
			Socket s = new Socket("joelcraft2.ddns.net",puerto1);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
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
	    		Cambiador_de_Texturas.Texturas();
	    		
				inicia = false;
				
			}else if(HalloWen == true && msgin.equals("false")) {
				

				inicia = false;
				
				
				
			}else if(Navidad == true && msgin.equals("true")) {
			
				 RubyCraft.Navidad = true;
				 Crafteos.IniciarCrafteosNavidad();
			     Cambiador_de_Texturas.Texturas();
	
				inicia = false;
				
				
				
			}else if(Navidad == true && msgin.equals("false")) {


				inicia = false;

			}
	
				

			}
			
				
			
		
	}catch (Exception e) {
		
		System.out.println(e);
	}
	
     }
}
