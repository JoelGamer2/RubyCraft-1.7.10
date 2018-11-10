package RubyCraft.Bases;

import RubyCraft.RubyCraft;
import RubyCraft.Bloques.Polvo_de_Cemento_Amarillo;
import RubyCraft.Bloques.Polvo_de_Cemento_Azul;
import RubyCraft.Bloques.Polvo_de_Cemento_Azul_Claro;
import RubyCraft.Bloques.Polvo_de_Cemento_Blanco;
import RubyCraft.Bloques.Polvo_de_Cemento_Cyan;
import RubyCraft.Bloques.Polvo_de_Cemento_Gris;
import RubyCraft.Bloques.Polvo_de_Cemento_Gris_Oscuro;
import RubyCraft.Bloques.Polvo_de_Cemento_Magnenta;
import RubyCraft.Bloques.Polvo_de_Cemento_Marron;
import RubyCraft.Bloques.Polvo_de_Cemento_Morado;
import RubyCraft.Bloques.Polvo_de_Cemento_Naranja;
import RubyCraft.Bloques.Polvo_de_Cemento_Negro;
import RubyCraft.Bloques.Polvo_de_Cemento_Rojo;
import RubyCraft.Bloques.Polvo_de_Cemento_Rosa;
import RubyCraft.Bloques.Polvo_de_Cemento_Verde;
import RubyCraft.Bloques.Polvo_de_Cemento_Verde_Lima;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cementos_Bases {

	public static Block Cemento_Endurecido_Negro;
	public static Block Cemento_Endurecido_Naranja;
	public static Block Cemento_Endurecido_Amarillo;
	public static Block Cemento_Endurezido_Verde;
	public static Block Cemento_Endurezido_Azul;
	public static Block Cemento_Endurecido_Azul_Claro;
	public static Block Cemento_Endurecido_Cyan;
	public static Block Cemento_Endurecido_Verde_Lima;
	public static Block Cemento_Endurecido_Marron;
	public static Block Cemento_Endurecido_Morado;
	public static Block Cemento_Endurecido_Rojo;
	public static Block Cemento_Endurecido_Rosa;
	public static Block Cemento_Endurecido_Magnenta;
	public static Block Cemento_Endurecido_Blanco;
	public static Block Cemento_Endurecido_Gris;
	public static Block Cemento_Endurecido_Gris_Oscuro;
	
	public static Block Polvo_de_Cemento_Negro;
	public static Block Polvo_de_Cemento_Naranja;
	public static Block Polvo_de_Cemento_Amarillo;
	public static Block Polvo_de_Cemento_Verde;
	public static Block Polvo_de_Cemento_Azul;
	public static Block Polvo_de_Cemento_Azul_Claro;
	public static Block Polvo_de_Cemento_Cyan;
	public static Block Polvo_de_Cemento_Verde_Lima;
	public static Block Polvo_de_Cemento_Marron;
	public static Block Polvo_de_Cemento_Morado;
	public static Block Polvo_de_Cemento_Rojo;
	public static Block Polvo_de_Cemento_Rosa;
	public static Block Polvo_de_Cemento_Magnenta;
	public static Block Polvo_de_Cemento_Blanco;
	public static Block Polvo_de_Cemento_Gris;
	public static Block Polvo_de_Cemento_Gris_Oscuro;
	
	public static void Iniciar(){
		
		Iniciar_Cememto_Endurecido();
		Iniciar_Polvo_de_Cemento();
		Bloques();
		
		
	}
	
	private static void Iniciar_Cememto_Endurecido(){
		
		Cemento_Endurecido_Negro = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Negro").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Negro");
		Cemento_Endurecido_Naranja = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Naranja").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Naranja");
		Cemento_Endurecido_Amarillo = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Amarillo").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Amarillo");
		Cemento_Endurezido_Verde = new Cemento_Endurezido().setBlockName("Cemento_Endurezido_Verde").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurezido_Verde");
		Cemento_Endurezido_Azul = new Cemento_Endurezido().setBlockName("Cemento_Endurezido_Azul").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurezido_Azul");
		Cemento_Endurecido_Azul_Claro = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Azul_Claro").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Azul_Claro");
		Cemento_Endurecido_Cyan = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Cyan").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Cyan");
		Cemento_Endurecido_Verde_Lima = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Verde_Lima").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Verde_Lima");
		Cemento_Endurecido_Marron = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Marron").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Marron");
		Cemento_Endurecido_Morado = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Morado").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Morado");
		Cemento_Endurecido_Rojo = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Rojo").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Rojo");
		Cemento_Endurecido_Rosa = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Rosa").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Rosa");
		Cemento_Endurecido_Magnenta = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Magnenta").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Magnenta");
		Cemento_Endurecido_Blanco = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Blanco").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Blanco");
		Cemento_Endurecido_Gris = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Gris").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Gris");		
		Cemento_Endurecido_Gris_Oscuro = new Cemento_Endurezido().setBlockName("Cemento_Endurecido_Gris_Oscuro").setBlockTextureName(RubyCraft.modid + ":Cemento_Endurecido_Gris_Oscuro");
		
	}
	
	private static void Iniciar_Polvo_de_Cemento(){
		
		Polvo_de_Cemento_Negro = new Polvo_de_Cemento_Negro(Material.sand).setBlockName("Polvo_de_Cemento_Negro").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Negro");
		Polvo_de_Cemento_Naranja = new Polvo_de_Cemento_Naranja(Material.sand).setBlockName("Polvo_de_Cemento_Naranja").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Naranja");
		Polvo_de_Cemento_Amarillo = new Polvo_de_Cemento_Amarillo(Material.sand).setBlockName("Polvo_de_Cemento_Amarillo").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Amarillo");
		Polvo_de_Cemento_Verde = new Polvo_de_Cemento_Verde(Material.sand).setBlockName("Polvo_de_Cemento_Verde").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Verde");
		Polvo_de_Cemento_Azul = new Polvo_de_Cemento_Azul(Material.sand).setBlockName("Polvo_de_Cemento_Azul").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Azul");
		Polvo_de_Cemento_Azul_Claro = new Polvo_de_Cemento_Azul_Claro(Material.sand).setBlockName("Polvo_de_Cemento_Azul_Claro").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Azul_Claro");
		Polvo_de_Cemento_Cyan = new Polvo_de_Cemento_Cyan(Material.sand).setBlockName("Polvo_de_Cemento_Cyan").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Cyan");
		Polvo_de_Cemento_Verde_Lima = new Polvo_de_Cemento_Verde_Lima(Material.sand).setBlockName("Polvo_de_Cemento_Verde_Lima").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Verde_Lima");
		Polvo_de_Cemento_Marron = new Polvo_de_Cemento_Marron(Material.sand).setBlockName("Polvo_de_Cemento_Marron").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Marron");
		Polvo_de_Cemento_Morado = new Polvo_de_Cemento_Morado(Material.sand).setBlockName("Polvo_de_Cemento_Morado").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Morado");
		Polvo_de_Cemento_Rojo = new Polvo_de_Cemento_Rojo(Material.sand).setBlockName("Polvo_de_Cemento_Rojo").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Rojo");
		Polvo_de_Cemento_Rosa = new Polvo_de_Cemento_Rosa(Material.sand).setBlockName("Polvo_de_Cemento_Rosa").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Rosa");
		Polvo_de_Cemento_Magnenta = new Polvo_de_Cemento_Magnenta(Material.sand).setBlockName("Polvo_de_Cemento_Magnenta").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Magnenta");
		Polvo_de_Cemento_Blanco = new Polvo_de_Cemento_Blanco(Material.sand).setBlockName("Polvo_de_Cemento_Blanco").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Blanco");
		Polvo_de_Cemento_Gris = new Polvo_de_Cemento_Gris(Material.sand).setBlockName("Polvo_de_Cemento_Gris").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Gris");
		Polvo_de_Cemento_Gris_Oscuro = new Polvo_de_Cemento_Gris_Oscuro(Material.sand).setBlockName("Polvo_de_Cemento_Gris_Oscuro").setBlockTextureName(RubyCraft.modid + ":Polvo_de_Cemento_Gris_Oscuro");

	}
	
	public static void Bloques(){
		
		//Cemento Endurecido
        RegistrarBloque(Cemento_Endurecido_Negro);
		RegistrarBloque(Cemento_Endurecido_Naranja);
		RegistrarBloque(Cemento_Endurecido_Amarillo);
		RegistrarBloque(Cemento_Endurezido_Verde);
		RegistrarBloque(Cemento_Endurezido_Azul);
		RegistrarBloque(Cemento_Endurecido_Azul_Claro);
		RegistrarBloque(Cemento_Endurecido_Cyan);
		RegistrarBloque(Cemento_Endurecido_Verde_Lima);
		RegistrarBloque(Cemento_Endurecido_Marron);
		RegistrarBloque(Cemento_Endurecido_Morado);
		RegistrarBloque(Cemento_Endurecido_Rojo);
		RegistrarBloque(Cemento_Endurecido_Rosa);
		RegistrarBloque(Cemento_Endurecido_Magnenta);
		RegistrarBloque(Cemento_Endurecido_Blanco);
		RegistrarBloque(Cemento_Endurecido_Gris);
		RegistrarBloque(Cemento_Endurecido_Gris_Oscuro);
		
		//Polvo de Cemento
		
		RegistrarBloque(Polvo_de_Cemento_Negro);
		RegistrarBloque(Polvo_de_Cemento_Naranja);
		RegistrarBloque(Polvo_de_Cemento_Amarillo);
		RegistrarBloque(Polvo_de_Cemento_Verde);
		RegistrarBloque(Polvo_de_Cemento_Azul);
		RegistrarBloque(Polvo_de_Cemento_Azul_Claro);
		RegistrarBloque(Polvo_de_Cemento_Cyan);
		RegistrarBloque(Polvo_de_Cemento_Verde_Lima);
		RegistrarBloque(Polvo_de_Cemento_Marron);
		RegistrarBloque(Polvo_de_Cemento_Morado);
		RegistrarBloque(Polvo_de_Cemento_Rojo);
		RegistrarBloque(Polvo_de_Cemento_Rosa);
		RegistrarBloque(Polvo_de_Cemento_Magnenta);
		RegistrarBloque(Polvo_de_Cemento_Blanco);
		RegistrarBloque(Polvo_de_Cemento_Gris);
		RegistrarBloque(Polvo_de_Cemento_Gris_Oscuro);
		
	}
	
	
	private static void RegistrarBloque(Block bloque){
		
		GameRegistry.registerBlock(bloque, bloque.getUnlocalizedName().substring(5));		
	}
	
}
