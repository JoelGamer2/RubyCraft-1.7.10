package RubyCraft.xJuanathan;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Bloques.Barro;
import RubyCraft.xJuanathan.Bloques.Barro_Congelado;
import RubyCraft.xJuanathan.Bloques.Barro_Congelado_Adn;
import RubyCraft.xJuanathan.Bloques.Barro_Congelado_Ambar;
import RubyCraft.xJuanathan.Bloques.Barro_Congelado_Hueso;
import RubyCraft.xJuanathan.Bloques.Hielo_Glaciar;
import RubyCraft.xJuanathan.Bloques.Hielo_Glaciar_Adn;
import RubyCraft.xJuanathan.Bloques.Hielo_Glaciar_Ambar;
import RubyCraft.xJuanathan.Bloques.Hielo_Glaciar_Hueso;
import RubyCraft.xJuanathan.Bloques.Madera_Fosil;
import RubyCraft.xJuanathan.Bloques.Madera_Fosil_Adn;
import RubyCraft.xJuanathan.Bloques.Madera_Fosil_Ambar;
import RubyCraft.xJuanathan.Bloques.Madera_Fosil_Hueso;
import RubyCraft.xJuanathan.Bloques.Monton_de_fosiles;
import RubyCraft.xJuanathan.Bloques.Roca_Fosil;
import RubyCraft.xJuanathan.Bloques.Roca_Fosil_Adn;
import RubyCraft.xJuanathan.Bloques.Roca_Fosil_Ambar;
import RubyCraft.xJuanathan.Bloques.Roca_Fosil_Hueso;
import RubyCraft.xJuanathan.Items.Fragmento_de_fosil;
import RubyCraft.xJuanathan.Items.ambar;
import RubyCraft.xJuanathan.Items.calavera_elfo;
import RubyCraft.xJuanathan.Items.calavera_gigante;
import RubyCraft.xJuanathan.Items.calavera_troll;
import RubyCraft.xJuanathan.Items.calavera_yeti;
import RubyCraft.xJuanathan.Items.hueso_fosilizado;
import RubyCraft.xJuanathan.Items.vial_de_sangre_cenagosa;
import RubyCraft.xJuanathan.Items.vial_de_sangre_de_hielo;
import RubyCraft.xJuanathan.Items.vial_de_sangre_de_las_montanas;
import RubyCraft.xJuanathan.Items.vial_de_sangre_del_bosque;
import RubyCraft.xJuanathan.Items.vial_de_sangre_del_pantano;
import RubyCraft.xJuanathan.Items.vial_de_sangre_glaciar;
import RubyCraft.xJuanathan.Items.vial_de_sangre_rocosa;
import RubyCraft.xJuanathan.Items.vial_de_sangre_selvatica;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Principal {
	
	//Bloques

	public static Block Monton_de_fosiles;
	
	// Bloques Evento Navidad
	
	public static Block Hielo_Glaciar;
	public static Block Hielo_Glaciar_Hueso;
	public static Block Hielo_Glaciar_Adn;
	public static Block Hielo_Glaciar_Ambar;
	
	public static Block Barro;
	public static Block Barro_Congelado;
	public static Block Barro_Congelado_Hueso;
	public static Block Barro_Congelado_Adn;
	public static Block Barro_Congelado_Ambar;
	
	public static Block Roca_Fosil;
	public static Block Roca_Fosil_Hueso;
	public static Block Roca_Fosil_Adn;
	public static Block Roca_Fosil_Ambar;
	
	public static Block Madera_Fosil;
	public static Block Madera_Fosil_Hueso;
	public static Block Madera_Fosil_Adn;
	public static Block Madera_Fosil_Ambar;
	
	//Items
	
	public static Item Fragmento_de_fosil;
	
	//Items Evento Navidad
	
	public static Item ambar;
	
	public static Item vial_de_sangre_de_hielo;
	public static Item vial_de_sangre_glaciar;
	
	public static Item vial_de_sangre_del_pantano;
	public static Item vial_de_sangre_cenagosa;
	
	public static Item vial_de_sangre_de_las_montanas;
	public static Item vial_de_sangre_rocosa;
	
	public static Item vial_de_sangre_del_bosque;
	public static Item vial_de_sangre_selvatica;
	
	public static Item hueso_fosilizado;
	public static Item calavera_yeti;
	public static Item calavera_troll;
	public static Item calavera_gigante;
	public static Item calavera_elfo;
	
	
	public static void preinit() 
	{
		//Bloques
		
		Monton_de_fosiles = new Monton_de_fosiles(Material.rock).setBlockName("Monton_de_fosiles").setBlockTextureName(RubyCraft.modid+":Monton_de_fosiles").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Monton_de_fosiles, Monton_de_fosiles.getUnlocalizedName().substring(5));
		Monton_de_fosiles.setHarvestLevel("pickaxe", 1);
		
		//Bloques evento Navidad
		
		Hielo_Glaciar = new Hielo_Glaciar(Material.ice).setBlockName("Hielo_Glaciar").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar, Hielo_Glaciar.getUnlocalizedName().substring(5));
		Hielo_Glaciar.setHarvestLevel("pickaxe", 2);
		
		Hielo_Glaciar_Hueso = new Hielo_Glaciar_Hueso(Material.ice).setBlockName("Hielo_Glaciar_Hueso").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Hueso").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Hueso, Hielo_Glaciar_Hueso.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Hueso.setHarvestLevel("pickaxe", 2);
		
		Hielo_Glaciar_Adn = new Hielo_Glaciar_Adn(Material.ice).setBlockName("Hielo_Glaciar_Adn").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Adn").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Adn, Hielo_Glaciar_Adn.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Adn.setHarvestLevel("pickaxe", 2);
		
		Hielo_Glaciar_Ambar = new Hielo_Glaciar_Ambar(Material.ice).setBlockName("Hielo_Glaciar_Ambar").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Ambar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Ambar, Hielo_Glaciar_Ambar.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Ambar.setHarvestLevel("pickaxe", 2);
		
		Barro = new Barro(Material.sand).setBlockName("Barro").setBlockTextureName(RubyCraft.modid+":Barro").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro, Barro.getUnlocalizedName().substring(5));
		Barro.setHarvestLevel("shovel", 2);
		
		Barro_Congelado = new Barro_Congelado(Material.rock).setBlockName("Barro_Congelado").setBlockTextureName(RubyCraft.modid+":Barro_Congelado").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado, Barro_Congelado.getUnlocalizedName().substring(5));
		Barro_Congelado.setHarvestLevel("pickaxe", 2);
		
		Barro_Congelado_Hueso = new Barro_Congelado_Hueso(Material.rock).setBlockName("Barro_Congelado_Hueso").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Hueso").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Hueso, Barro_Congelado_Hueso.getUnlocalizedName().substring(5));
		Barro_Congelado_Hueso.setHarvestLevel("pickaxe", 2);
		
		Barro_Congelado_Adn = new Barro_Congelado_Adn(Material.rock).setBlockName("Barro_Congelado_Adn").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Adn").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Adn, Barro_Congelado_Adn.getUnlocalizedName().substring(5));
		Barro_Congelado_Adn.setHarvestLevel("pickaxe", 2);
		
		Barro_Congelado_Ambar = new Barro_Congelado_Ambar(Material.rock).setBlockName("Barro_Congelado_Ambar").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Ambar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Ambar, Barro_Congelado_Ambar.getUnlocalizedName().substring(5));
		Barro_Congelado_Ambar.setHarvestLevel("pickaxe", 2);
		
		Roca_Fosil = new Roca_Fosil(Material.rock).setBlockName("Roca_Fosil").setBlockTextureName(RubyCraft.modid+":Roca_Fosil").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil, Roca_Fosil.getUnlocalizedName().substring(5));
		Roca_Fosil.setHarvestLevel("pickaxe", 2);
		
		Roca_Fosil_Hueso = new Roca_Fosil_Hueso(Material.rock).setBlockName("Roca_Fosil_Hueso").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Hueso").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Hueso, Roca_Fosil_Hueso.getUnlocalizedName().substring(5));
		Roca_Fosil_Hueso.setHarvestLevel("pickaxe", 2);
		
		Roca_Fosil_Adn = new Roca_Fosil_Adn(Material.rock).setBlockName("Roca_Fosil_Adn").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Adn").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Adn, Roca_Fosil_Adn.getUnlocalizedName().substring(5));
		Roca_Fosil_Adn.setHarvestLevel("pickaxe", 2);
		
		Roca_Fosil_Ambar = new Roca_Fosil_Ambar(Material.rock).setBlockName("Roca_Fosil_Ambar").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Ambar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Ambar, Roca_Fosil_Ambar.getUnlocalizedName().substring(5));
		Roca_Fosil_Ambar.setHarvestLevel("pickaxe", 2);
		
		Madera_Fosil = new Madera_Fosil(Material.wood).setBlockName("Madera_Fosil").setBlockTextureName(RubyCraft.modid+":Madera_Fosil").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil, Madera_Fosil.getUnlocalizedName().substring(5));
		Madera_Fosil.setHarvestLevel("axe", 2);
		
		Madera_Fosil_Hueso = new Madera_Fosil_Hueso(Material.wood).setBlockName("Madera_Fosil_Hueso").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Hueso").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Hueso, Madera_Fosil_Hueso.getUnlocalizedName().substring(5));
		Madera_Fosil_Hueso.setHarvestLevel("axe", 2);
		
		Madera_Fosil_Adn = new Madera_Fosil_Adn(Material.wood).setBlockName("Madera_Fosil_Adn").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Adn").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Adn, Madera_Fosil_Adn.getUnlocalizedName().substring(5));
		Madera_Fosil_Adn.setHarvestLevel("axe", 2);
		
		Madera_Fosil_Ambar = new Madera_Fosil_Ambar(Material.wood).setBlockName("Madera_Fosil_Ambar").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Ambar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Ambar, Madera_Fosil_Ambar.getUnlocalizedName().substring(5));
		Madera_Fosil_Ambar.setHarvestLevel("axe", 2);
		
		
		//Items
		
		Fragmento_de_fosil = new Fragmento_de_fosil().setUnlocalizedName("Fragmento_de_fosil").setTextureName(RubyCraft.modid+":Fragmento_de_fosil").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(Fragmento_de_fosil, Fragmento_de_fosil.getUnlocalizedName().substring(5));
		
		
		//Items evento Navidad
		
		ambar = new ambar().setUnlocalizedName("ambar").setTextureName(RubyCraft.modid+":ambar").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(ambar, ambar.getUnlocalizedName().substring(5));
		
		vial_de_sangre_de_hielo = new vial_de_sangre_de_hielo().setUnlocalizedName("vial_de_sangre_de_hielo").setTextureName(RubyCraft.modid+":vial_de_sangre_de_hielo").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(vial_de_sangre_de_hielo, vial_de_sangre_de_hielo.getUnlocalizedName().substring(5));
		
		vial_de_sangre_glaciar = new vial_de_sangre_glaciar().setUnlocalizedName("vial_de_sangre_glaciar").setTextureName(RubyCraft.modid+":vial_de_sangre_glaciar").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(vial_de_sangre_glaciar, vial_de_sangre_glaciar.getUnlocalizedName().substring(5));
		
		vial_de_sangre_del_pantano = new vial_de_sangre_del_pantano().setUnlocalizedName("vial_de_sangre_del_pantano").setTextureName(RubyCraft.modid+":vial_de_sangre_del_pantano").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(vial_de_sangre_del_pantano, vial_de_sangre_del_pantano.getUnlocalizedName().substring(5));
		
		vial_de_sangre_cenagosa = new vial_de_sangre_cenagosa().setUnlocalizedName("vial_de_sangre_cenagosa").setTextureName(RubyCraft.modid+":vial_de_sangre_cenagosa").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(vial_de_sangre_cenagosa, vial_de_sangre_cenagosa.getUnlocalizedName().substring(5));

		vial_de_sangre_de_las_montanas = new vial_de_sangre_de_las_montanas().setUnlocalizedName("vial_de_sangre_de_las_montanas").setTextureName(RubyCraft.modid+":vial_de_sangre_de_las_montanas").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(vial_de_sangre_de_las_montanas, vial_de_sangre_de_las_montanas.getUnlocalizedName().substring(5));
		
		vial_de_sangre_rocosa = new vial_de_sangre_rocosa().setUnlocalizedName("vial_de_sangre_rocosa").setTextureName(RubyCraft.modid+":vial_de_sangre_rocosa").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(vial_de_sangre_rocosa, vial_de_sangre_rocosa.getUnlocalizedName().substring(5));
		
		vial_de_sangre_del_bosque = new vial_de_sangre_del_bosque().setUnlocalizedName("vial_de_sangre_del_bosque").setTextureName(RubyCraft.modid+":vial_de_sangre_del_bosque").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(vial_de_sangre_del_bosque, vial_de_sangre_del_bosque.getUnlocalizedName().substring(5));
		
		vial_de_sangre_selvatica = new vial_de_sangre_selvatica().setUnlocalizedName("vial_de_sangre_selvatica").setTextureName(RubyCraft.modid+":vial_de_sangre_selvatica").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(vial_de_sangre_selvatica, vial_de_sangre_selvatica.getUnlocalizedName().substring(5));
		
		hueso_fosilizado = new hueso_fosilizado().setUnlocalizedName("hueso_fosilizado").setTextureName(RubyCraft.modid+":hueso_fosilizado").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(hueso_fosilizado, hueso_fosilizado.getUnlocalizedName().substring(5));
		
		calavera_yeti = new calavera_yeti().setUnlocalizedName("calavera_yeti").setTextureName(RubyCraft.modid+":calavera_yeti").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(calavera_yeti, calavera_yeti.getUnlocalizedName().substring(5));
		
		calavera_troll = new calavera_troll().setUnlocalizedName("calavera_troll").setTextureName(RubyCraft.modid+":calavera_troll").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(calavera_troll, calavera_troll.getUnlocalizedName().substring(5));
		
		calavera_gigante = new calavera_gigante().setUnlocalizedName("calavera_gigante").setTextureName(RubyCraft.modid+":calavera_gigante").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(calavera_gigante, calavera_gigante.getUnlocalizedName().substring(5));
		
		calavera_elfo = new calavera_elfo().setUnlocalizedName("calavera_elfo").setTextureName(RubyCraft.modid+":calavera_elfo").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(calavera_elfo, calavera_elfo.getUnlocalizedName().substring(5));
		
		
		
	}
	
	
	
	public static void init() 
	{
		//Crafteos Items
		
		
		
		
	}
	
	
	public static void postinit() 
	{
		
	}
	
	
	
}
