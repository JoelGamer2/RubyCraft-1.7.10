package HerraCraft.ConectarWebs;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Fechas_Proyectos {

	
	public static String URL = "https://www.dropbox.com/s/v12oapjfp2msomf/RubyCraft-DiasProyectos.txt?raw=1";
    public static String Dias = "";
    public static String Salida_EnderGames = "";
	
	
public static boolean URLNOVALIDAERROR = false;
	
	public static void VerDias(){
		new Thread("VerDias"){
			
			public void run(){
				try {
					URL url = new URL(URL);
					Scanner scanner = new Scanner(url.openStream());
					String Mensaje1 = scanner.nextLine();
					String Diasmapa = scanner.nextLine();
					String Mensaje2 = scanner.nextLine();
					String Diasnetwork = scanner.nextLine();
					Dias = Diasmapa;
					Salida_EnderGames = Diasnetwork;
					scanner.close();
				} catch (MalformedURLException e) {
					URLNOVALIDAERROR = true;
					
				} catch (IOException e1) {
					URLNOVALIDAERROR = true;
				}
			}
			
		}.start();
	}
}
