package RubyCraft.Registrar;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import RubyCraft.RubyCraft;

public class BuscarVersionTrol {

	private static final String VersionTrol_URL = "https://www.dropbox.com/s/8zfias96hsflmsm/RubyCraft-VersionTrol.txt?raw=1";
	private static boolean NuevaVersionTrol = false;
	
	public static void MirarVersionTrol(){
		new Thread("Trol"){
			
			public void run(){
				try {
					URL url = new URL(VersionTrol_URL);
					Scanner scanner = new Scanner(url.openStream());
					String Activada = scanner.nextLine();
					scanner.close();
					if(Activada.equals("VersionTrol:true")){
						RubyCraft.VersionTrol = true;
						RubyCraft.VersionTrolActivar();
						FijarVersionTrol();
					}
				} catch (MalformedURLException e) {
					System.err.println("La Url No Sirve");
				} catch (IOException e) {
				   System.out.println("Error 9090");
				}
			}
			
		}.start();
	}
	
	public static synchronized void FijarVersionTrol(){
		NuevaVersionTrol = true;
	}
	
	public static synchronized boolean HayVersionTrol(){
		return NuevaVersionTrol;
	}
	
}
