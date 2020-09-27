package Eventos;

import RubyCraft.RubyCraft;

public class Cambiador_de_Texturas {

	private static String modid = RubyCraft.modid + ":";
	private static String normal = modid;
	private static String Navidad = modid + "Navidad/";
	private static String HalloWen = modid + "HalloWen/";
	
	public static void Texturas(){
		if(RubyCraft.cliente) {
		if(RubyCraft.Navidad){
			Texturas_Navidad();
		}else if(RubyCraft.HalloWen){
			Texturas_Hallowen();
		}else if(!RubyCraft.Navidad && !RubyCraft.HalloWen){
			Texturas_Normales();
	
		}
	  }
	}
	
	public static void Texturas_Navidad(){
		
		RubyCraft.linterna_de_mar.setBlockTextureName(Navidad + "linterna_de_mar");
		RubyCraft.Mesa_De_Conjuraciones.setBlockTextureName(Navidad + "Mesa_De_Conjuraciones");
		RubyCraft.Bloque_de_comandos.setBlockTextureName(Navidad + "Bloque_de_comandos");
		RubyCraft.Bloqueluminiscente.setBlockTextureName(Navidad + "Bloqueluminiscente");
		RubyCraft.magma.setBlockTextureName(Navidad + "magma");
		RubyCraft.prismarina.setBlockTextureName(Navidad + "prismarina");
		RubyCraft.Prismarina_oscura.setBlockTextureName(Navidad + "Prismarina_oscura");
	    RubyCraft.Ladrillos_de_prismarina.setBlockTextureName(Navidad + "Ladrillos_de_prismarina");
	    RubyCraft.Bloquepurpur.setBlockTextureName(Navidad + "Bloquepurpur");

	}
	
	public static void Texturas_Normales(){
		
		RubyCraft.linterna_de_mar.setBlockTextureName(normal + "linterna_de_mar");
		RubyCraft.Mesa_De_Conjuraciones.setBlockTextureName(normal + "Mesa_De_Conjuraciones");
		RubyCraft.Bloque_de_comandos.setBlockTextureName(normal + "Bloque_de_comandos");
		RubyCraft.Bloqueluminiscente.setBlockTextureName(normal + "Bloqueluminiscente");
		RubyCraft.magma.setBlockTextureName(normal + "magma");
	    RubyCraft.prismarina.setBlockTextureName(normal + "prismarina");
	    RubyCraft.Prismarina_oscura.setBlockTextureName(normal + "Prismarina_oscura");
		RubyCraft.Ladrillos_de_prismarina.setBlockTextureName(normal + "Ladrillos_de_prismarina");
	    RubyCraft.Bloquepurpur.setBlockTextureName(normal + "Bloquepurpur");
		
	}
	
	public static void Texturas_Hallowen(){
	   
		RubyCraft.linterna_de_mar.setBlockTextureName(HalloWen + "linterna_de_mar");
		RubyCraft.Mesa_De_Conjuraciones.setBlockTextureName(HalloWen + "Mesa_De_Conjuraciones");
		RubyCraft.Bloque_de_comandos.setBlockTextureName(HalloWen + "Bloque_de_comandos");
		RubyCraft.Bloqueluminiscente.setBlockTextureName(HalloWen + "Bloqueluminiscente");
		RubyCraft.magma.setBlockTextureName(HalloWen + "magma");
	    RubyCraft.prismarina.setBlockTextureName(HalloWen + "prismarina");
	    RubyCraft.Prismarina_oscura.setBlockTextureName(HalloWen + "Prismarina_oscura");
		RubyCraft.Ladrillos_de_prismarina.setBlockTextureName(HalloWen + "Ladrillos_de_prismarina");
	    RubyCraft.Bloquepurpur.setBlockTextureName(HalloWen + "Bloquepurpur");

	}
	
}
