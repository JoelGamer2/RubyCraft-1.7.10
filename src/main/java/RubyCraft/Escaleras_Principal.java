package RubyCraft;

import RubyCraft.Bases.Cementos_Bases;
import RubyCraft.Bases.Escalera_Base;
import RubyCraft.Escaleras.Escalera_de_Andesita_Pulida;
import RubyCraft.Escaleras.Escalera_de_Bloque_Luminiscente;
import RubyCraft.Escaleras.Escalera_de_Bloque_Reforzado_Tier_I;
import RubyCraft.Escaleras.Escalera_de_Bloque_de_diamante_trol;
import RubyCraft.Escaleras.Escalera_de_Bloquepurpur;
import RubyCraft.Escaleras.Escalera_de_Cuarzo_azul;
import RubyCraft.Escaleras.Escalera_de_Cuarzo_rojo;
import RubyCraft.Escaleras.Escalera_de_Cuarzo_verde;
import RubyCraft.Escaleras.Escalera_de_Diorita_Pulida;
import RubyCraft.Escaleras.Escalera_de_Granito_Pulido;
import RubyCraft.Escaleras.Escalera_de_Hueso;
import RubyCraft.Escaleras.Escalera_de_LadrilloMarino;
import RubyCraft.Escaleras.Escalera_de_Ladrillo_de_Andesita;
import RubyCraft.Escaleras.Escalera_de_Ladrillo_de_Diorita;
import RubyCraft.Escaleras.Escalera_de_Ladrillo_de_Granito;
import RubyCraft.Escaleras.Escalera_de_Ladrillo_de_Prismarina;
import RubyCraft.Escaleras.Escalera_de_LinternadelMar;
import RubyCraft.Escaleras.Escalera_de_MaderaVerde;
import RubyCraft.Escaleras.Escalera_de_Maderazul;
import RubyCraft.Escaleras.Escalera_de_Magma;
import RubyCraft.Escaleras.Escalera_de_Mesa_de_Trabajo_de_Zafiro;
import RubyCraft.Escaleras.Escalera_de_Obsidiana;
import RubyCraft.Escaleras.Escalera_de_Obsidiana_que_llora;
import RubyCraft.Escaleras.Escalera_de_Ojo_de_ender;
import RubyCraft.Escaleras.Escalera_de_Oro;
import RubyCraft.Escaleras.Escalera_de_Perla_de_Ender;
import RubyCraft.Escaleras.Escalera_de_Prismarina;
import RubyCraft.Escaleras.Escalera_de_Prismarina_de_Oscura;
import RubyCraft.Escaleras.Escalera_de_Ruby;
import RubyCraft.Escaleras.Escalera_de_Zafiro;
import RubyCraft.Escaleras.Escalera_de_regeneracion;
import RubyCraft.Escaleras.Escalera_de_slime;
import RubyCraft.Escaleras.Escalera_de_veneno;
import RubyCraft.Escaleras.Escalera_del_nether_rojo;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class Escaleras_Principal {
	
	public static Block Escalera_de_Diorita_Pulida;
	public static Block Escalera_de_Granito_Pulido;
	public static Block Escalera_de_Andesita_Pulida;
	public static Block Escalera_de_Magma;
	public static Block Escalera_de_regeneracion;
	public static Block Escalera_de_veneno;
	public static Block Escalera_de_Bloquepurpur;
	public static Block Escalera_de_LadrilloMarino;
	public static Block Escalera_de_Ruby;
	public static Block Escalera_de_Zafiro;
	public static Block Escalera_de_Hueso;
	public static Block Escalera_de_MaderaVerde;
	public static Block Escalera_de_Maderazul;
	public static Block Escalera_del_nether_rojo;
	public static Block Escalera_de_Oro;
	public static Block Escalera_de_Bloque_de_diamante_trol;
	public static Block Escalera_de_slime;
	public static Block Escalera_de_Mesa_de_Trabajo_de_Zafiro;
	public static Block Escalera_de_LinternadelMar;
	public static Block Escalera_de_Prismarina;
	public static Block Escalera_de_Ladrillo_de_Prismarina;
    public static Block Escalera_de_Prismarina_de_Oscura;
    public static Block Escalera_de_Ojo_de_ender;
    public static Block Escalera_de_Perla_de_Ender;
    public static Block Escalera_de_Obsidiana;
    public static Block Escalera_de_Ladrillo_de_Granito;
    public static Block Escalera_de_Ladrillo_de_Andesita;
    public static Block Escalera_de_Ladrillo_de_Diorita;
    public static Block Escalera_de_Cuarzo_azul;
    public static Block Escalera_de_Cuarzo_verde;
    public static Block Escalera_de_Cuarzo_rojo;
    public static Block Escalera_de_Obsidiana_que_llora;
	public static Block Escalera_de_Bloque_Luminiscente;
	public static Block Escalera_de_Bloque_Reforzado_Tier_I;
	public static Block Escalera_de_Bloque_Reforzado_Tier_II;
	public static Block Escalera_de_Bloque_Reforzado_Tier_III;
	public static Block Escalera_de_Bloque_Reforzado_Tier_IV ;
	public static Block Escalera_de_Bloque_Reforzado_Tier_V;
	public static Block Escalera_de_tronco_de_madera_verde;
	public static Block Escalera_de_trondo_de_madera_azul;
	public static Block Escalera_Bloque_de_cobre;
	public static Block Escalera_de_platino;
	public static Block Escalera_de_Ladrillo_de_piedra_del_end;
	
	public static Block Escalera_Cemento_Endurecido_Negro;
	public static Block Escalera_Cemento_Endurecido_Naranja;
	public static Block Escalera_Cemento_Endurecido_Amarillo;
	public static Block Escalera_Cemento_Endurezido_Verde;
	public static Block Escalera_Cemento_Endurezido_Azul;
	public static Block Escalera_Cemento_Endurecido_Azul_Claro;
	public static Block Escalera_Cemento_Endurecido_Cyan;
	public static Block Escalera_Cemento_Endurecido_Verde_Lima;
	public static Block Escalera_Cemento_Endurecido_Marron;
	public static Block Escalera_Cemento_Endurecido_Morado;
	public static Block Escalera_Cemento_Endurecido_Rojo;
	public static Block Escalera_Cemento_Endurecido_Rosa;
	public static Block Escalera_Cemento_Endurecido_Magnenta;
	public static Block Escalera_Cemento_Endurecido_Blanco;
	public static Block Escalera_Cemento_Endurecido_Gris;
	public static Block Escalera_Cemento_Endurecido_Gris_Oscuro;
	
	/**HerraCraft**/
	public static Block Escalera_De_corazon_de_redstone;
	public static Block Escalera_Invisible;
	
	public static void Iniciar(){
	/**Escaleras**/
		
		Escalera_de_Diorita_Pulida = new Escalera_de_Diorita_Pulida(RubyCraft.Diorita_Pulida, 0).setBlockName("Escalera_de_Diorita_Pulida");
		Escalera_de_Granito_Pulido = new Escalera_de_Granito_Pulido(RubyCraft.Granito_Pulido, 0).setBlockName("Escalera_de_Granito_Pulido");
		Escalera_de_Andesita_Pulida = new Escalera_de_Andesita_Pulida(RubyCraft.Andesita_Pulida, 0).setBlockName("Escalera_de_Andesita_Pulida");
		Escalera_de_Magma = new Escalera_de_Magma(RubyCraft.magma, 0).setBlockName("Escalera_de_Magma");
		Escalera_de_regeneracion = new Escalera_de_regeneracion(RubyCraft.Bloque_de_Regeneracion, 0).setBlockName("Escalera_de_regeneracion");
		Escalera_de_veneno = new Escalera_de_veneno(RubyCraft.Bloque_de_veneno, 0).setBlockName("Escalera_de_veneno");
		Escalera_de_Bloquepurpur = new Escalera_de_Bloquepurpur(RubyCraft.Bloquepurpur, 0).setBlockName("Escalera_de_Bloquepurpur");
		Escalera_de_LadrilloMarino = new Escalera_de_LadrilloMarino(RubyCraft.Ladrillo_Marino, 0).setBlockName("Escalera_de_LadrilloMarino");
		Escalera_de_Ruby = new Escalera_de_Ruby(RubyCraft.Bloquederuby, 0).setBlockName("Escalera_de_Ruby");
		Escalera_de_Zafiro = new Escalera_de_Zafiro(RubyCraft.BloquedeZafiro, 0).setBlockName("Escalera_de_Zafiro");
		Escalera_de_Hueso = new Escalera_de_Hueso(RubyCraft.Bloque_de_hueso, 0).setBlockName("Escalera_de_Hueso");
		Escalera_de_MaderaVerde = new Escalera_de_MaderaVerde(RubyCraft.maderaverde, 0).setBlockName("Escalera_de_MaderaVerde");
		Escalera_de_Maderazul = new Escalera_de_Maderazul(RubyCraft.Madera_Azul, 0).setBlockName("Escalera_de_Maderazul");
		Escalera_del_nether_rojo = new Escalera_del_nether_rojo(RubyCraft.Bloque_del_nether_rojo, 0).setBlockName("Escalera_del_nether_rojo");
		Escalera_de_Oro = new Escalera_de_Oro(Blocks.gold_block, 0).setBlockName("Escalera_de_Oro");
		Escalera_de_Bloque_de_diamante_trol = new Escalera_de_Bloque_de_diamante_trol(RubyCraft.Bloque_de_Diamante_Trol, 0).setBlockName("Escalera_de_Bloque_de_diamante_trol");
		Escalera_de_slime = new Escalera_de_slime(RubyCraft.Bloque_de_Slime, 0).setBlockName("Escalera_de_slime");
		Escalera_de_Mesa_de_Trabajo_de_Zafiro = new Escalera_de_Mesa_de_Trabajo_de_Zafiro(RubyCraft.MesadeTrabajodeZafiro, 0).setBlockName("Escalera_de_Mesa_de_Trabajo_de_Zafiro");
		Escalera_de_LinternadelMar = new Escalera_de_LinternadelMar(RubyCraft.linterna_de_mar, 0).setBlockName("Escalera_de_LinternadelMar");
		Escalera_de_Ladrillo_de_Prismarina  = new Escalera_de_Ladrillo_de_Prismarina(RubyCraft.Ladrillos_de_prismarina, 0).setBlockName("Escalera_de_Ladrillo_de_Prismarina");
		Escalera_de_Prismarina = new Escalera_de_Prismarina(RubyCraft.prismarina, 0).setBlockName("Escalera_de_Prismarina");
		Escalera_de_Prismarina_de_Oscura = new Escalera_de_Prismarina_de_Oscura(RubyCraft.Prismarina_oscura, 0).setBlockName("Escalera_de_Prismarina_de_Oscura");
		Escalera_de_Ojo_de_ender = new Escalera_de_Ojo_de_ender(RubyCraft.BloquedeOjodeEnder, 0).setBlockName("Escalera_de_Ojo_de_ender");
		Escalera_de_Perla_de_Ender = new Escalera_de_Perla_de_Ender(RubyCraft.BloquedeEnderPearld, 0).setBlockName("Escalera_de_Perla_de_Ender");
		Escalera_de_Obsidiana = new Escalera_de_Obsidiana(Blocks.obsidian, 0).setBlockName("Escalera_de_Obsidiana");
		Escalera_de_Ladrillo_de_Granito = new Escalera_de_Ladrillo_de_Granito(RubyCraft.Ladrillo_de_Granito, 0).setBlockName("Escalera_de_Ladrillo_de_Granito");
		Escalera_de_Ladrillo_de_Andesita = new Escalera_de_Ladrillo_de_Andesita(RubyCraft.Ladrillo_de_Andesita, 0).setBlockName("Escalera_de_Ladrillo_de_Andesita");
		Escalera_de_Ladrillo_de_Diorita = new Escalera_de_Ladrillo_de_Diorita(RubyCraft.Ladrillo_de_Diorita, 0).setBlockName("Escalera_de_Ladrillo_de_Diorita");
		Escalera_de_Cuarzo_azul = new Escalera_de_Cuarzo_azul(RubyCraft.Cuarzo_azul, 0).setBlockName("Escalera_de_Cuarzo_azul");
		Escalera_de_Cuarzo_verde = new Escalera_de_Cuarzo_verde(RubyCraft.Cuarzo_verde, 0).setBlockName("Escalera_de_Cuarzo_verde");
		Escalera_de_Cuarzo_rojo = new Escalera_de_Cuarzo_rojo(RubyCraft.Cuarzo_rojo, 0).setBlockName("Escalera_de_Cuarzo_rojo");
		Escalera_de_Obsidiana_que_llora = new Escalera_de_Obsidiana_que_llora(RubyCraft.obsidiana_que_llora, 0).setBlockName("Escalera_de_Obsidiana_que_llora");
	    Escalera_de_Bloque_Luminiscente = new Escalera_de_Bloque_Luminiscente(RubyCraft.Bloqueluminiscente, 0).setBlockName("Escalera_de_Bloque_Luminiscente");
		Escalera_de_Bloque_Reforzado_Tier_I = new Escalera_de_Bloque_Reforzado_Tier_I(RubyCraft.Bloque_Reforzado_Tier_1, 0).setBlockName("Escalera_de_Bloque_Reforzado_Tier_I");	
		Escalera_de_Bloque_Reforzado_Tier_II = new Escalera_Base(RubyCraft.Bloque_Reforzado_Tier_2, 0).setBlockName("Escalera_de_Bloque_Reforzado_Tier_II");
		Escalera_de_Bloque_Reforzado_Tier_III = new Escalera_Base(RubyCraft.Bloque_Reforzado_Tier_3, 0).setBlockName("Escalera_de_Bloque_Reforzado_Tier_III");
		Escalera_de_Bloque_Reforzado_Tier_IV = new Escalera_Base(RubyCraft.Bloque_Reforzado_Tier_4, 0).setBlockName("Escalera_de_Bloque_Reforzado_Tier_IV");
		Escalera_de_Bloque_Reforzado_Tier_V = new Escalera_Base(RubyCraft.Bloque_Reforzado_Tier_5, 0).setBlockName("Escalera_de_Bloque_Reforzado_Tier_V");
		Escalera_Cemento_Endurecido_Negro = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Negro, 0).setBlockName("Escalera_Cemento_Endurecido_Negro");
		Escalera_Cemento_Endurecido_Naranja = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Naranja, 0).setBlockName("Escalera_Cemento_Endurecido_Naranja");
		Escalera_Cemento_Endurecido_Amarillo = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Amarillo, 0).setBlockName("Escalera_Cemento_Endurecido_Amarillo");
		Escalera_Cemento_Endurezido_Verde = new Escalera_Base(Cementos_Bases.Cemento_Endurezido_Verde, 0).setBlockName("Escalera_Cemento_Endurezido_Verde");
		Escalera_Cemento_Endurezido_Azul = new Escalera_Base(Cementos_Bases.Cemento_Endurezido_Azul, 0).setBlockName("Escalera_Cemento_Endurezido_Azul");
		Escalera_Cemento_Endurecido_Azul_Claro = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Azul_Claro, 0).setBlockName("Escalera_Cemento_Endurecido_Azul_Claro");
		Escalera_Cemento_Endurecido_Cyan = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Cyan, 0).setBlockName("Escalera_Cemento_Endurecido_Cyan");
		Escalera_Cemento_Endurecido_Verde_Lima = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Verde_Lima, 0).setBlockName("Escalera_Cemento_Endurecido_Verde_Lima");
		Escalera_Cemento_Endurecido_Marron = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Marron, 0).setBlockName("Escalera_Cemento_Endurecido_Marron");
		Escalera_Cemento_Endurecido_Morado = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Morado, 0).setBlockName("Escalera_Cemento_Endurecido_Morado");
		Escalera_Cemento_Endurecido_Rojo = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Rojo, 0).setBlockName("Escalera_Cemento_Endurecido_Rojo");
		Escalera_Cemento_Endurecido_Rosa = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Rosa, 0).setBlockName("Escalera_Cemento_Endurecido_Rosa");
		Escalera_Cemento_Endurecido_Magnenta = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Magnenta, 0).setBlockName("Escalera_Cemento_Endurecido_Magnenta");
		Escalera_Cemento_Endurecido_Blanco = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Blanco, 0).setBlockName("Escalera_Cemento_Endurecido_Blanco");
		Escalera_Cemento_Endurecido_Gris = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Gris, 0).setBlockName("Escalera_Cemento_Endurecido_Gris");
		Escalera_Cemento_Endurecido_Gris_Oscuro = new Escalera_Base(Cementos_Bases.Cemento_Endurecido_Gris_Oscuro, 0).setBlockName("Escalera_Cemento_Endurecido_Gris_Oscuro");
		Escalera_de_tronco_de_madera_verde = new Escalera_Base(RubyCraft.troncoverde, 0).setBlockName("Escalera_de_tronco_de_madera_verde");
		Escalera_de_trondo_de_madera_azul = new Escalera_Base(RubyCraft.tronco_Azul, 0).setBlockName("Escalera_de_trondo_de_madera_azul");
		Escalera_Bloque_de_cobre = new Escalera_Base(RubyCraft.Bloque_de_Cobre, 0).setBlockName("Escalera_Bloque_de_cobre");
		Escalera_de_platino = new Escalera_Base(RubyCraft.Bloque_de_Platino, 0).setBlockName("Escalera_de_platino");
		Escalera_de_Ladrillo_de_piedra_del_end = new Escalera_Base(RubyCraft.Ladrillo_de_piedra_del_end, 0).setBlockName("Escalera_de_Ladrillo_de_piedra_del_end");
		
	}
	
	public static void Registrar(){
		
		RegitrarEscalera(Escalera_de_Diorita_Pulida, 1, 1, 1);
		RegitrarEscalera(Escalera_de_Granito_Pulido, 1, 1, 1);
		RegitrarEscalera(Escalera_de_Andesita_Pulida, 1, 1, 1);
		RegitrarEscalera(Escalera_de_Magma, 1, 1, 1);
		RegitrarEscalera(Escalera_de_regeneracion, 1, 1, 1);
		RegitrarEscalera(Escalera_de_veneno, 1, 1, 1);
		RegitrarEscalera(Escalera_de_Bloquepurpur, 1, 1, 1);
		RegitrarEscalera(Escalera_de_LadrilloMarino, 1, 1, 1);
		RegitrarEscalera(Escalera_de_Ruby, 3, 1, 2);
		RegitrarEscalera(Escalera_de_Zafiro, 6, 1, 2);
		RegitrarEscalera(Escalera_de_Hueso, 1, 1, 1);
		RegitrarEscalera(Escalera_de_MaderaVerde, 0.3F, 1, 1);
		RegitrarEscalera(Escalera_de_Maderazul, 0.3F, 1, 1);
		RegitrarEscalera(Escalera_del_nether_rojo, 1, 1, 1);
		RegitrarEscalera(Escalera_de_Oro, 2.5F, 4, 1);
		RegitrarEscalera(Escalera_de_Bloque_de_diamante_trol, Float.MAX_VALUE, Float.MAX_VALUE, 1);
		RegitrarEscalera(Escalera_de_slime, 1, 1, 0);
		RegitrarEscalera(Escalera_de_Mesa_de_Trabajo_de_Zafiro, 0.5F, 1, 0);
		RegitrarEscalera(Escalera_de_LinternadelMar, 1, 2, 1);
		RegitrarEscalera(Escalera_de_Prismarina, 1, 2, 1);
		RegitrarEscalera(Escalera_de_Prismarina_de_Oscura, 1, 2, 1);
		RegitrarEscalera(Escalera_de_Ladrillo_de_Prismarina, 1, 2, 1);
		RegitrarEscalera(Escalera_de_Ojo_de_ender, 1, 2, 1);
		RegitrarEscalera(Escalera_de_Perla_de_Ender, 1, 2, 1);
		RegitrarEscalera(Escalera_de_Obsidiana, 100, Float.MAX_VALUE, 3);
		RegitrarEscalera(Escalera_de_Ladrillo_de_Granito, 1.5F, 2, 0);
		RegitrarEscalera(Escalera_de_Ladrillo_de_Andesita, 1.5F, 2, 0);
		RegitrarEscalera(Escalera_de_Ladrillo_de_Diorita, 1.5F, 2, 0);
		RegitrarEscalera(Escalera_de_Cuarzo_rojo, 1.5F, 3, 0);
		RegitrarEscalera(Escalera_de_Cuarzo_azul, 1.5F, 3, 0);
		RegitrarEscalera(Escalera_de_Cuarzo_verde, 1.5F, 3, 0);
		RegitrarEscalera(Escalera_de_Obsidiana_que_llora, 50.0F, 2000.0F, 3);
		RegitrarEscalera(Escalera_de_Bloque_Luminiscente, 0.3F, 0.3F, 0);
		RegitrarEscalera(Escalera_de_Bloque_Reforzado_Tier_I, 70.0F, 50.0F, 3);		
		RegitrarEscalera(Escalera_de_Bloque_Reforzado_Tier_II, 80.0F, 100.0F, 3);
		RegitrarEscalera(Escalera_de_Bloque_Reforzado_Tier_III, 90.0F, 150.0F, 3);
		RegitrarEscalera(Escalera_de_Bloque_Reforzado_Tier_IV, 100.0F, 200.0F, 3);
		RegitrarEscalera(Escalera_de_Bloque_Reforzado_Tier_V, 110.0F, 250.0F, 3);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Negro, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Naranja, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Amarillo, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurezido_Verde, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurezido_Azul, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Azul_Claro, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Cyan, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Verde_Lima, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Marron, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Morado, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Rojo, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Rosa, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Magnenta, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Blanco, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Gris, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_Cemento_Endurecido_Gris_Oscuro, 1.0F, 2.0F, 2);
		RegitrarEscalera(Escalera_de_tronco_de_madera_verde, 1.0F, 0.5F, 1);
		RegitrarEscalera(Escalera_de_trondo_de_madera_azul, 1.0F, 0.5F, 1);
		RegitrarEscalera(Escalera_Bloque_de_cobre, 3.0F, 3.0F, 1);
		RegitrarEscalera(Escalera_de_platino, 13.0F, 13.0F, 2);
        RegitrarEscalera(Escalera_de_Ladrillo_de_piedra_del_end, 0.6F, 0.8F, 1);
		
	}
	
	public static void RegistrarCrafteos(){
		
		Crafteos(Escalera_de_Diorita_Pulida, RubyCraft.Diorita_Pulida);
		Crafteos(Escalera_de_Granito_Pulido, RubyCraft.Granito_Pulido);
		Crafteos(Escalera_de_Andesita_Pulida, RubyCraft.Andesita_Pulida);
		Crafteos(Escalera_de_Magma, RubyCraft.magma);
		Crafteos(Escalera_de_regeneracion, RubyCraft.Bloque_de_Regeneracion);
		Crafteos(Escalera_de_veneno, RubyCraft.Bloque_de_veneno);
		Crafteos(Escalera_de_Bloquepurpur, RubyCraft.Bloquepurpur);
		Crafteos(Escalera_de_LadrilloMarino, RubyCraft.Ladrillo_Marino);
		Crafteos(Escalera_de_Ruby, RubyCraft.Bloquederuby);
		Crafteos(Escalera_de_Zafiro, RubyCraft.BloquedeZafiro);
		Crafteos(Escalera_de_Hueso, RubyCraft.Bloque_de_hueso);
		Crafteos(Escalera_de_MaderaVerde, RubyCraft.maderaverde);
		Crafteos(Escalera_de_Maderazul, RubyCraft.Madera_Azul);
		Crafteos(Escalera_del_nether_rojo, RubyCraft.Bloque_del_nether_rojo);
		Crafteos(Escalera_de_Oro, Blocks.gold_block);
		Crafteos(Escalera_de_Bloque_de_diamante_trol, RubyCraft.Bloque_de_Diamante_Trol);
		Crafteos(Escalera_de_slime, RubyCraft.Bloque_de_Slime);
		Crafteos(Escalera_de_LinternadelMar, RubyCraft.linterna_de_mar);
		Crafteos(Escalera_de_Prismarina, RubyCraft.prismarina);
		Crafteos(Escalera_de_Prismarina_de_Oscura, RubyCraft.Prismarina_oscura);
		Crafteos(Escalera_de_Ladrillo_de_Prismarina, RubyCraft.Ladrillos_de_prismarina);
		Crafteos(Escalera_de_Ojo_de_ender, RubyCraft.BloquedeOjodeEnder);
		Crafteos(Escalera_de_Perla_de_Ender, RubyCraft.BloquedeEnderPearld);
		Crafteos(Escalera_de_Obsidiana, Blocks.obsidian);
		Crafteos(Escalera_de_Ladrillo_de_Granito, RubyCraft.Ladrillo_de_Granito);
		Crafteos(Escalera_de_Ladrillo_de_Andesita, RubyCraft.Ladrillo_de_Andesita);
		Crafteos(Escalera_de_Ladrillo_de_Diorita, RubyCraft.Ladrillo_de_Diorita);
		Crafteos(Escalera_de_Cuarzo_rojo, RubyCraft.Cuarzo_rojo);
		Crafteos(Escalera_de_Cuarzo_azul, RubyCraft.Cuarzo_azul);
		Crafteos(Escalera_de_Cuarzo_verde, RubyCraft.Cuarzo_verde);
		Crafteos(Escalera_de_Obsidiana_que_llora, RubyCraft.obsidiana_que_llora);
		Crafteos(Escalera_de_Bloque_Luminiscente, RubyCraft.Bloqueluminiscente);
		Crafteos(Escalera_de_Bloque_Reforzado_Tier_I, RubyCraft.Bloque_Reforzado_Tier_1);	
		Crafteos(Escalera_de_Bloque_Reforzado_Tier_II, RubyCraft.Bloque_Reforzado_Tier_2);
		Crafteos(Escalera_de_Bloque_Reforzado_Tier_III, RubyCraft.Bloque_Reforzado_Tier_3);
		Crafteos(Escalera_de_Bloque_Reforzado_Tier_IV, RubyCraft.Bloque_Reforzado_Tier_4);
		Crafteos(Escalera_de_Bloque_Reforzado_Tier_V, RubyCraft.Bloque_Reforzado_Tier_5);
		Crafteos(Escalera_Cemento_Endurecido_Negro, Cementos_Bases.Cemento_Endurecido_Negro);
		Crafteos(Escalera_Cemento_Endurecido_Naranja, Cementos_Bases.Cemento_Endurecido_Naranja);
		Crafteos(Escalera_Cemento_Endurecido_Amarillo, Cementos_Bases.Cemento_Endurecido_Amarillo);
		Crafteos(Escalera_Cemento_Endurezido_Verde, Cementos_Bases.Cemento_Endurezido_Verde);
		Crafteos(Escalera_Cemento_Endurezido_Azul, Cementos_Bases.Cemento_Endurezido_Azul);
		Crafteos(Escalera_Cemento_Endurecido_Azul_Claro, Cementos_Bases.Cemento_Endurecido_Azul_Claro);
		Crafteos(Escalera_Cemento_Endurecido_Cyan, Cementos_Bases.Cemento_Endurecido_Cyan);
		Crafteos(Escalera_Cemento_Endurecido_Verde_Lima, Cementos_Bases.Cemento_Endurecido_Verde_Lima);
		Crafteos(Escalera_Cemento_Endurecido_Marron, Cementos_Bases.Cemento_Endurecido_Marron);
		Crafteos(Escalera_Cemento_Endurecido_Morado, Cementos_Bases.Cemento_Endurecido_Morado);
		Crafteos(Escalera_Cemento_Endurecido_Rojo, Cementos_Bases.Cemento_Endurecido_Rojo);
		Crafteos(Escalera_Cemento_Endurecido_Rosa, Cementos_Bases.Cemento_Endurecido_Rosa);
		Crafteos(Escalera_Cemento_Endurecido_Magnenta, Cementos_Bases.Cemento_Endurecido_Magnenta);
		Crafteos(Escalera_Cemento_Endurecido_Blanco, Cementos_Bases.Cemento_Endurecido_Blanco);
		Crafteos(Escalera_Cemento_Endurecido_Gris, Cementos_Bases.Cemento_Endurecido_Gris);
		Crafteos(Escalera_Cemento_Endurecido_Gris_Oscuro, Cementos_Bases.Cemento_Endurecido_Gris_Oscuro);
		Crafteos(Escalera_de_tronco_de_madera_verde, RubyCraft.troncoverde);
		Crafteos(Escalera_de_trondo_de_madera_azul, RubyCraft.tronco_Azul);
		Crafteos(Escalera_Bloque_de_cobre, RubyCraft.Bloque_de_Cobre);
		Crafteos(Escalera_de_platino, RubyCraft.Bloque_de_Platino);
		Crafteos(Escalera_de_Ladrillo_de_piedra_del_end, RubyCraft.Ladrillo_de_piedra_del_end);
		
	}
	
	public static void RegitrarEscalera(Block Escalera, float TiempoenPicar, float Resistencia, int NiveldelPico){
		
		Escalera.setCreativeTab(RubyCraft.Rubycrafttab).setHardness(TiempoenPicar).setResistance(Resistencia).setHarvestLevel("pickaxe", NiveldelPico);
		GameRegistry.registerBlock(Escalera, Escalera.getUnlocalizedName().substring(5));
		
	}
	
	
	public static void Crafteos(Block Escalera, Block Materialdelqueestanechos){
		
		GameRegistry.addRecipe(new ItemStack(Escalera, 4), new Object[]{"m  ","mm ","mmm",'m', Materialdelqueestanechos});
		
	}
	
	public static void Variado(){
		
		Escaleras_Principal.Iniciar();
		Escaleras_Principal.Registrar();
		Escaleras_Principal.RegistrarCrafteos();
		
	}
	
}