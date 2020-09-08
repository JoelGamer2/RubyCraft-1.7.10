package RubyCraft.Actualizaciones;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import RubyCraft.RubyCraft;
import RubyCraft.Bloques.Bloque_de_Actualizaciones;

public class Buscar_Actualizaciones {

	private static final String Actualizacion_Url = "https://www.dropbox.com/s/fan0ya9zg5m10y9/RubyCraft-Updates.txt?raw=1";
	private static boolean NuevaVersion = false;
	public static  boolean URLNOVALIDA = false;
    public static boolean mysql = true;
	public static String version_ultima = "";
	public static void MirarActualizaciones(){
		
		
		if(!mysql) {
			Buscar_drop();
		}else {
			try {
				new mysql().iniciar(1);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
			
		}
	
	
	
	
	public static void Buscar_drop(){
		new Thread("Actualizaciones"){
			
			public void run(){
				try {
					URL url = new URL(Actualizacion_Url);
					Scanner scanner = new Scanner(url.openStream());
					String UltimaVersion = scanner.nextLine();
					String Mensaje1 = scanner.nextLine();
					String Mensaje2 = scanner.nextLine();
					String Mensaje3 = scanner.nextLine();
					String ChangeLog = scanner.nextLine();
					scanner.close();
					if(!RubyCraft.version.equals(UltimaVersion) && !URLNOVALIDA){
						Bloque_de_Actualizaciones.actualizacion = 15;
						RubyCraft.logger.info(UltimaVersion + " Esta es la Ultima Version de RubyCraft Disponible");
						Bloque_de_Actualizaciones.UltimaVersion = UltimaVersion;
						TestearActualizaciones.ChangeLog = ChangeLog;
						Bloque_de_Actualizaciones.changeLog = ChangeLog;
						if(!Mensaje1.equals("")){
						RubyCraft.logger.info(Mensaje1);
					    TestearActualizaciones.Mensaje1 = Mensaje1;
					    Bloque_de_Actualizaciones.Mensaje1 = Mensaje1;				    
					}if(!Mensaje2.equals("")){
						RubyCraft.logger.info(Mensaje2);
						TestearActualizaciones.Mensaje2 = Mensaje2;
						Bloque_de_Actualizaciones.Mensaje2 = Mensaje2;
					}else{
						TestearActualizaciones.Mensaje2a = false;
					}
					if(!Mensaje3.equals("")){
						RubyCraft.logger.info(Mensaje3);
						TestearActualizaciones.Mensaje3 = Mensaje3;
						Bloque_de_Actualizaciones.Mensaje3 = Mensaje3;
					}else{
						TestearActualizaciones.Mensaje3a = false;
					}if(Mensaje1.equals("") && Mensaje2.equals("") && Mensaje3.equals("")){
						RubyCraft.logger.info("No hay Cambios en la actualizacion");
						TestearActualizaciones.Mensaje1 = "No hay Cambios en la actualizacion";
					}
						TestearActualizaciones.UltimaVersion = UltimaVersion;
						FijarNuevaVersion();
					}
				} catch (MalformedURLException e) {
					System.err.println("La Url No Sirve");
				} catch (IOException e) {
				   System.out.println("Error " + e);
				   URLNOVALIDA = true;
				}
			}
			
		}.start();
	}
	
	public static synchronized void FijarNuevaVersion(){
		NuevaVersion = true;
	}
	
	public static synchronized boolean HayNuevaVersion(){
		return NuevaVersion;
	}
	
}
