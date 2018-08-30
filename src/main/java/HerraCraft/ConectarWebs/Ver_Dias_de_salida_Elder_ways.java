package HerraCraft.ConectarWebs;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ver_Dias_de_salida_Elder_ways {

	
	public static String URL = "https://www.dropbox.com/s/v12oapjfp2msomf/RubyCraft-DiasSalirMapa.txt?raw=1";
    public static String Dias_ = "";
	
	
public static boolean URLNOVALIDAERROR = false;
	
	public static void VerDias(){
		new Thread("VerDias"){
			
			public void run(){
				try {
					URL url = new URL(URL);
					Scanner scanner = new Scanner(url.openStream());
					String Mensaje1 = scanner.nextLine();
					String Dias = scanner.nextLine();
                    
					Dias_ = Dias;
                   
				} catch (MalformedURLException e) {
					URLNOVALIDAERROR = true;
					
				} catch (IOException e1) {
					URLNOVALIDAERROR = true;
				}
			}
			
		}.start();
	}
}
