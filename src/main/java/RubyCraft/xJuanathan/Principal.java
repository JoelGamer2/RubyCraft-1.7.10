package RubyCraft.xJuanathan;

import Eventos.Navidad.Altares.altar;
import Eventos.Navidad.Altares.altar_central;
import Eventos.Navidad.Armaduras.botas_ancestrales;
import Eventos.Navidad.Armaduras.casco_ancestral;
import Eventos.Navidad.Armaduras.pantalones_ancestrales;
import Eventos.Navidad.Armaduras.pechera_ancestral;
import Eventos.Navidad.Armas.espada_ancestral;
import Eventos.Navidad.Armas.espada_de_ambar;
import Eventos.Navidad.Armas.espada_de_arqueologo;
import Eventos.Navidad.Armas.espada_de_hueso_fosilizado;
import Eventos.Navidad.Armas.espada_de_roca_fosilizada;
import Eventos.Navidad.Bloques.Barro;
import Eventos.Navidad.Bloques.Barro_Congelado;
import Eventos.Navidad.Bloques.Barro_Congelado_Adn;
import Eventos.Navidad.Bloques.Barro_Congelado_Ambar;
import Eventos.Navidad.Bloques.Barro_Congelado_Hueso;
import Eventos.Navidad.Bloques.Hielo_Glaciar;
import Eventos.Navidad.Bloques.Hielo_Glaciar_Adn;
import Eventos.Navidad.Bloques.Hielo_Glaciar_Ambar;
import Eventos.Navidad.Bloques.Hielo_Glaciar_Hueso;
import Eventos.Navidad.Bloques.Madera_Fosil;
import Eventos.Navidad.Bloques.Madera_Fosil_Adn;
import Eventos.Navidad.Bloques.Madera_Fosil_Ambar;
import Eventos.Navidad.Bloques.Madera_Fosil_Hueso;
import Eventos.Navidad.Bloques.Monton_de_fosiles;
import Eventos.Navidad.Bloques.Roca_Fosil;
import Eventos.Navidad.Bloques.Roca_Fosil_Adn;
import Eventos.Navidad.Bloques.Roca_Fosil_Ambar;
import Eventos.Navidad.Bloques.Roca_Fosil_Hueso;
import Eventos.Navidad.Bloques.bloque_de_ambar_ancestral;
import Eventos.Navidad.Bloques.flor_de_las_montanas;
import Eventos.Navidad.Bloques.flor_de_las_nieves;
import Eventos.Navidad.Bloques.flor_del_Pantano;
import Eventos.Navidad.Bloques.flor_del_bosque;
import Eventos.Navidad.Bloques.piedra_ancestral;
import Eventos.Navidad.Bloques.piedra_ancestral_de_poder;
import Eventos.Navidad.Bloques.piedra_ancestral_esencial;
import Eventos.Navidad.Bloques.piedra_ancestral_poseida;
import Eventos.Navidad.Bloques.piedra_ancestral_sangrienta;
import Eventos.Navidad.Herramientas.Pico_de_roca_fosilizada;
import Eventos.Navidad.Herramientas.hacha_de_ambar;
import Eventos.Navidad.Herramientas.hacha_de_arqueologo;
import Eventos.Navidad.Herramientas.hacha_de_hueso_fosilizado;
import Eventos.Navidad.Herramientas.hacha_de_roca_fosilizada;
import Eventos.Navidad.Herramientas.pala_de_ambar;
import Eventos.Navidad.Herramientas.pala_de_arqueologo;
import Eventos.Navidad.Herramientas.pala_de_hueso_fosilizado;
import Eventos.Navidad.Herramientas.pala_de_roca_fosilizada;
import Eventos.Navidad.Herramientas.pico_de_ambar;
import Eventos.Navidad.Herramientas.pico_de_arqueologo;
import Eventos.Navidad.Herramientas.pico_de_hueso_fosilizado;
import Eventos.Navidad.Items.Fragmento_de_fosil;
import Eventos.Navidad.Items.ambar;
import Eventos.Navidad.Items.ambar_ancestral;
import Eventos.Navidad.Items.ambar_de_poder;
import Eventos.Navidad.Items.ambar_endurecido;
import Eventos.Navidad.Items.ambar_mistico;
import Eventos.Navidad.Items.ambar_sangriento;
import Eventos.Navidad.Items.calavera_elfo;
import Eventos.Navidad.Items.calavera_gigante;
import Eventos.Navidad.Items.calavera_troll;
import Eventos.Navidad.Items.calavera_yeti;
import Eventos.Navidad.Items.catalizador_de_esencias;
import Eventos.Navidad.Items.cubo_de_ambar_con_diamante;
import Eventos.Navidad.Items.cubo_de_ambar_endurecido;
import Eventos.Navidad.Items.cubo_de_ambar_fundido;
import Eventos.Navidad.Items.cuerda;
import Eventos.Navidad.Items.cuerda_trenzada;
import Eventos.Navidad.Items.diamante_activado;
import Eventos.Navidad.Items.diamante_de_poder;
import Eventos.Navidad.Items.esencia_ancestral;
import Eventos.Navidad.Items.esencia_de_las_montanas;
import Eventos.Navidad.Items.esencia_de_los_hielos;
import Eventos.Navidad.Items.esencia_del_bosque;
import Eventos.Navidad.Items.esencia_del_pantano;
import Eventos.Navidad.Items.hilo_de_cuerda;
import Eventos.Navidad.Items.hueso_fosilizado;
import Eventos.Navidad.Items.hueso_tallado;
import Eventos.Navidad.Items.lingote_de_ambar_ancestral;
import Eventos.Navidad.Items.mango_de_espada;
import Eventos.Navidad.Items.mango_de_herramientas;
import Eventos.Navidad.Items.monton_de_polvo_de_diamante;
import Eventos.Navidad.Items.polvo_de_diamante;
import Eventos.Navidad.Items.punta_de_espada_de_ambar;
import Eventos.Navidad.Items.punta_de_espada_de_hueso_fosilizado;
import Eventos.Navidad.Items.punta_de_espada_de_roca_fosilizada;
import Eventos.Navidad.Items.punta_de_espada_de_silex;
import Eventos.Navidad.Items.roca_fosilizada_afilada;
import Eventos.Navidad.Items.sangre_ancestral;
import Eventos.Navidad.Items.silex;
import Eventos.Navidad.Items.vial_de_sangre_cenagosa;
import Eventos.Navidad.Items.vial_de_sangre_de_hielo;
import Eventos.Navidad.Items.vial_de_sangre_de_las_montanas;
import Eventos.Navidad.Items.vial_de_sangre_del_bosque;
import Eventos.Navidad.Items.vial_de_sangre_del_pantano;
import Eventos.Navidad.Items.vial_de_sangre_glaciar;
import Eventos.Navidad.Items.vial_de_sangre_rocosa;
import Eventos.Navidad.Items.vial_de_sangre_selvatica;
import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.EnumHelper;

public class Principal {
	
	//Bloques

	public static Block Monton_de_fosiles;
	
	// Altar Evento Navidad
	
	public static Block altar;
	public static Block altar_central;
	
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
	
	public static Block flor_de_las_nieves;
	public static Block flor_del_Pantano;
	public static Block flor_de_las_montanas;
	public static Block flor_del_bosque;
	
	public static Block piedra_ancestral;
	public static Block piedra_ancestral_sangrienta;
	public static Block piedra_ancestral_de_poder;
	public static Block piedra_ancestral_esencial;
	public static Block piedra_ancestral_poseida;
	
	public static Block bloque_de_ambar_ancestral;
	
	//Items
	
	public static Item Fragmento_de_fosil;
	
	//Heramientas Evento Navidad
	
	public static Item pico_de_arqueologo;
	public static Item hacha_de_arqueologo;
	public static Item pala_de_arqueologo;
	
	public static Item Pico_de_roca_fosilizada;
	public static Item hacha_de_roca_fosilizada;
	public static Item pala_de_roca_fosilizada;
	
	public static Item pico_de_hueso_fosilizado;
	public static Item hacha_de_hueso_fosilizado;
	public static Item pala_de_hueso_fosilizado;
	
	public static Item pico_de_ambar;
	public static Item hacha_de_ambar;
	public static Item pala_de_ambar;
	
	
	//Armas Evento Navidad
	
	public static Item espada_de_arqueologo;
	public static Item espada_de_roca_fosilizada;
	public static Item espada_de_hueso_fosilizado;
	public static Item espada_de_ambar;
	
	public static Item espada_ancestral;
	
	
	//Armaduras
	
	public static Item casco_ancestral;
	public static Item pechera_ancestral;
	public static Item pantalones_ancestrales;
	public static Item botas_ancestrales;
	
	public static NBTTagCompound nbt;
	
	//Items Evento Navidad
	
	public static Item mango_de_herramientas;
	
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
	
	public static Item esencia_de_los_hielos;
	public static Item esencia_del_pantano;
	public static Item esencia_de_las_montanas;
	public static Item esencia_del_bosque;
	
	public static Item esencia_ancestral;
	
	public static Item diamante_activado;
	public static Item diamante_de_poder;
	public static Item catalizador_de_esencias;
	
	public static Item silex;
	public static Item roca_fosilizada_afilada;
	
	public static Item hueso_tallado;
	
	public static Item polvo_de_diamante;
	public static Item cubo_de_ambar_fundido;
	public static Item cubo_de_ambar_con_diamante;
	public static Item cubo_de_ambar_endurecido;
	public static Item ambar_endurecido;
	
	public static Item monton_de_polvo_de_diamante;
	
	public static Item hilo_de_cuerda;
	public static Item cuerda;
	public static Item cuerda_trenzada;
	
	public static Item mango_de_espada;
	
	public static Item punta_de_espada_de_silex;
	public static Item punta_de_espada_de_roca_fosilizada;
	public static Item punta_de_espada_de_hueso_fosilizado;
	public static Item punta_de_espada_de_ambar;
	
	public static Item ambar_sangriento;
	public static Item ambar_de_poder;
	public static Item ambar_mistico;
	public static Item ambar_ancestral;
	public static Item lingote_de_ambar_ancestral;
	
	public static Item sangre_ancestral;
	
	
	//Materiales  (nivel, durabilidad, eficiencia, daño, nivel encantamiento) Al daño puesto minecraft le suma 1 a la pala, 2 al pico, 3 al hacha y 4 a la espada.
	
	public static final Item.ToolMaterial arqueologotoolmaterial = EnumHelper.addToolMaterial("arqueologotoolmaterial", 10, 350, 6.0F, 2.0F, 45);       
	public static final Item.ToolMaterial rocafosilidadtoolmaterial = EnumHelper.addToolMaterial("rocafosilidadtoolmaterial", 11, 700, 8.0F, 3.0F, 45); 
	public static final Item.ToolMaterial huesofosiltoolmaterial = EnumHelper.addToolMaterial("huesofosiltoolmaterial", 12, 1200, 10.0F, 4.0F, 45);
	public static final Item.ToolMaterial ambarfosiltoolmaterial = EnumHelper.addToolMaterial("ambarfosiltoolmaterial", 13, 1500, 12.0F, 5.0F, 45);
	public static final Item.ToolMaterial espadaancestraltoolmaterial = EnumHelper.addToolMaterial("espadaancestraltoolmaterial", 14, 10000, 14.0F, 496.0F, 45);
	
	public static ItemArmor.ArmorMaterial armaduraancestral = EnumHelper.addArmorMaterial("armaduraancestral", 10000, new int[]{10,10,10,10}, 0);
	
	//CreativeTab Seleccion
	
	public static CreativeTabs Prueba;
	
	
	
	public static void preinit() 
	{
		Prueba = RubyCraft.Rubycrafttab;
		//Bloques
		
		Monton_de_fosiles = new Monton_de_fosiles(Material.rock).setBlockName("Monton_de_fosiles").setBlockTextureName(RubyCraft.modid+":Monton_de_fosiles").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Monton_de_fosiles, Monton_de_fosiles.getUnlocalizedName().substring(5));
		Monton_de_fosiles.setHarvestLevel("pickaxe", 1);
		
		//Altar evento Navidad
		
		altar = new altar(Material.rock).setBlockName("altar").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(altar, altar.getUnlocalizedName().substring(5));
		altar.setHarvestLevel("pickaxe", 10);
		
		altar_central = new altar_central(Material.rock).setBlockName("altar_central").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(altar_central, altar_central.getUnlocalizedName().substring(5));
		altar_central.setHarvestLevel("pickaxe", 10);
		
		//Bloques evento Navidad
		
		Hielo_Glaciar = new Hielo_Glaciar(Material.ice).setBlockName("Hielo_Glaciar").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar, Hielo_Glaciar.getUnlocalizedName().substring(5));
		Hielo_Glaciar.setHarvestLevel("pickaxe", 10);
		
		Hielo_Glaciar_Hueso = new Hielo_Glaciar_Hueso(Material.ice).setBlockName("Hielo_Glaciar_Hueso").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Hueso").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Hueso, Hielo_Glaciar_Hueso.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Hueso.setHarvestLevel("pickaxe", 11);
		
		Hielo_Glaciar_Adn = new Hielo_Glaciar_Adn(Material.ice).setBlockName("Hielo_Glaciar_Adn").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Adn").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Adn, Hielo_Glaciar_Adn.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Adn.setHarvestLevel("pickaxe", 13);
		
		Hielo_Glaciar_Ambar = new Hielo_Glaciar_Ambar(Material.ice).setBlockName("Hielo_Glaciar_Ambar").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Ambar").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Ambar, Hielo_Glaciar_Ambar.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Ambar.setHarvestLevel("pickaxe", 12);
		
		Barro = new Barro(Material.sand).setBlockName("Barro").setBlockTextureName(RubyCraft.modid+":Barro").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro, Barro.getUnlocalizedName().substring(5));
		Barro.setHarvestLevel("shovel", 10);
		
		Barro_Congelado = new Barro_Congelado(Material.rock).setBlockName("Barro_Congelado").setBlockTextureName(RubyCraft.modid+":Barro_Congelado").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado, Barro_Congelado.getUnlocalizedName().substring(5));
		Barro_Congelado.setHarvestLevel("pickaxe", 10);
		
		Barro_Congelado_Hueso = new Barro_Congelado_Hueso(Material.rock).setBlockName("Barro_Congelado_Hueso").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Hueso").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Hueso, Barro_Congelado_Hueso.getUnlocalizedName().substring(5));
		Barro_Congelado_Hueso.setHarvestLevel("pickaxe", 11);
		
		Barro_Congelado_Adn = new Barro_Congelado_Adn(Material.rock).setBlockName("Barro_Congelado_Adn").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Adn").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Adn, Barro_Congelado_Adn.getUnlocalizedName().substring(5));
		Barro_Congelado_Adn.setHarvestLevel("pickaxe", 13);
		
		Barro_Congelado_Ambar = new Barro_Congelado_Ambar(Material.rock).setBlockName("Barro_Congelado_Ambar").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Ambar").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Ambar, Barro_Congelado_Ambar.getUnlocalizedName().substring(5));
		Barro_Congelado_Ambar.setHarvestLevel("pickaxe", 12);
		
		Roca_Fosil = new Roca_Fosil(Material.rock).setBlockName("Roca_Fosil").setBlockTextureName(RubyCraft.modid+":Roca_Fosil").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil, Roca_Fosil.getUnlocalizedName().substring(5));
		Roca_Fosil.setHarvestLevel("pickaxe", 10);
		
		Roca_Fosil_Hueso = new Roca_Fosil_Hueso(Material.rock).setBlockName("Roca_Fosil_Hueso").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Hueso").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Hueso, Roca_Fosil_Hueso.getUnlocalizedName().substring(5));
		Roca_Fosil_Hueso.setHarvestLevel("pickaxe", 11);
		
		Roca_Fosil_Adn = new Roca_Fosil_Adn(Material.rock).setBlockName("Roca_Fosil_Adn").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Adn").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Adn, Roca_Fosil_Adn.getUnlocalizedName().substring(5));
		Roca_Fosil_Adn.setHarvestLevel("pickaxe", 13);
		
		Roca_Fosil_Ambar = new Roca_Fosil_Ambar(Material.rock).setBlockName("Roca_Fosil_Ambar").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Ambar").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Ambar, Roca_Fosil_Ambar.getUnlocalizedName().substring(5));
		Roca_Fosil_Ambar.setHarvestLevel("pickaxe", 12);
		
		Madera_Fosil = new Madera_Fosil(Material.wood).setBlockName("Madera_Fosil").setBlockTextureName(RubyCraft.modid+":Madera_Fosil").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil, Madera_Fosil.getUnlocalizedName().substring(5));
		Madera_Fosil.setHarvestLevel("axe", 10);
		
		Madera_Fosil_Hueso = new Madera_Fosil_Hueso(Material.wood).setBlockName("Madera_Fosil_Hueso").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Hueso").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Hueso, Madera_Fosil_Hueso.getUnlocalizedName().substring(5));
		Madera_Fosil_Hueso.setHarvestLevel("axe", 11);
		
		Madera_Fosil_Adn = new Madera_Fosil_Adn(Material.wood).setBlockName("Madera_Fosil_Adn").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Adn").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Adn, Madera_Fosil_Adn.getUnlocalizedName().substring(5));
		Madera_Fosil_Adn.setHarvestLevel("axe", 13);
		
		Madera_Fosil_Ambar = new Madera_Fosil_Ambar(Material.wood).setBlockName("Madera_Fosil_Ambar").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Ambar").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Ambar, Madera_Fosil_Ambar.getUnlocalizedName().substring(5));
		Madera_Fosil_Ambar.setHarvestLevel("axe", 12);
		
		flor_de_las_nieves = new flor_de_las_nieves(Material.plants).setBlockName("flor_de_las_nieves").setBlockTextureName(RubyCraft.modid+":flor_de_las_nieves").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(flor_de_las_nieves, flor_de_las_nieves.getUnlocalizedName().substring(5));
		flor_de_las_nieves.setHarvestLevel("axe", 2);
		
		flor_del_Pantano = new flor_del_Pantano(Material.plants).setBlockName("flor_del_Pantano").setBlockTextureName(RubyCraft.modid+":flor_del_Pantano").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(flor_del_Pantano, flor_del_Pantano.getUnlocalizedName().substring(5));
		flor_del_Pantano.setHarvestLevel("axe", 2);
		
		flor_de_las_montanas = new flor_de_las_montanas(Material.plants).setBlockName("flor_de_las_montanas").setBlockTextureName(RubyCraft.modid+":flor_de_las_montanas").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(flor_de_las_montanas, flor_de_las_montanas.getUnlocalizedName().substring(5));
		flor_de_las_montanas.setHarvestLevel("axe", 2);
		
		flor_del_bosque = new flor_del_bosque(Material.plants).setBlockName("flor_del_bosque").setBlockTextureName(RubyCraft.modid+":flor_del_bosque").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(flor_del_bosque, flor_del_bosque.getUnlocalizedName().substring(5));
		flor_del_bosque.setHarvestLevel("axe", 2);
		
		piedra_ancestral = new piedra_ancestral(Material.rock).setBlockName("piedra_ancestral").setBlockTextureName(RubyCraft.modid+":piedra_ancestral").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(piedra_ancestral, piedra_ancestral.getUnlocalizedName().substring(5));
		piedra_ancestral.setHarvestLevel("pickaxe", 13);
		
		piedra_ancestral_sangrienta = new piedra_ancestral_sangrienta(Material.rock).setBlockName("piedra_ancestral_sangrienta").setBlockTextureName(RubyCraft.modid+":piedra_ancestral_sangrienta").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(piedra_ancestral_sangrienta, piedra_ancestral_sangrienta.getUnlocalizedName().substring(5));
		piedra_ancestral.setHarvestLevel("pickaxe", 13);
		
		piedra_ancestral_de_poder = new piedra_ancestral_de_poder(Material.rock).setBlockName("piedra_ancestral_de_poder").setBlockTextureName(RubyCraft.modid+":piedra_ancestral_de_poder").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(piedra_ancestral_de_poder, piedra_ancestral_de_poder.getUnlocalizedName().substring(5));
		piedra_ancestral.setHarvestLevel("pickaxe", 13);
		
		piedra_ancestral_esencial = new piedra_ancestral_esencial(Material.rock).setBlockName("piedra_ancestral_esencial").setBlockTextureName(RubyCraft.modid+":piedra_ancestral_esencial").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(piedra_ancestral_esencial, piedra_ancestral_esencial.getUnlocalizedName().substring(5));
		piedra_ancestral.setHarvestLevel("pickaxe", 13);
		
		piedra_ancestral_poseida = new piedra_ancestral_poseida(Material.rock).setBlockName("piedra_ancestral_poseida").setBlockTextureName(RubyCraft.modid+":piedra_ancestral_poseida").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(piedra_ancestral_poseida, piedra_ancestral_poseida.getUnlocalizedName().substring(5));
		piedra_ancestral.setHarvestLevel("pickaxe", 13);
		
		bloque_de_ambar_ancestral = new bloque_de_ambar_ancestral(Material.rock).setBlockName("bloque_de_ambar_ancestral").setBlockTextureName(RubyCraft.modid+":bloque_de_ambar_ancestral").setCreativeTab(Prueba).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(bloque_de_ambar_ancestral, bloque_de_ambar_ancestral.getUnlocalizedName().substring(5));
		bloque_de_ambar_ancestral.setHarvestLevel("pickaxe", 13);
		
		
		//Items
		
		Fragmento_de_fosil = new Fragmento_de_fosil().setUnlocalizedName("Fragmento_de_fosil").setTextureName(RubyCraft.modid+":Fragmento_de_fosil").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(Fragmento_de_fosil, Fragmento_de_fosil.getUnlocalizedName().substring(5));
		
		
		
		//Herramientas evento Navidad
		
		pico_de_arqueologo = new pico_de_arqueologo(arqueologotoolmaterial).setUnlocalizedName("pico_de_arqueologo").setTextureName(RubyCraft.modid + ":pico_de_arqueologo").setCreativeTab(Prueba);
		GameRegistry.registerItem(pico_de_arqueologo, pico_de_arqueologo.getUnlocalizedName().substring(5));
		 
		hacha_de_arqueologo = new hacha_de_arqueologo(arqueologotoolmaterial).setUnlocalizedName("hacha_de_arqueologo").setTextureName(RubyCraft.modid + ":hacha_de_arqueologo").setCreativeTab(Prueba);
		GameRegistry.registerItem(hacha_de_arqueologo, hacha_de_arqueologo.getUnlocalizedName().substring(5));
		
		pala_de_arqueologo = new pala_de_arqueologo(arqueologotoolmaterial).setUnlocalizedName("pala_de_arqueologo").setTextureName(RubyCraft.modid + ":pala_de_arqueologo").setCreativeTab(Prueba);
		GameRegistry.registerItem(pala_de_arqueologo, pala_de_arqueologo.getUnlocalizedName().substring(5));
		
		
		
		Pico_de_roca_fosilizada = new Pico_de_roca_fosilizada(rocafosilidadtoolmaterial).setUnlocalizedName("Pico_de_roca_fosilizada").setTextureName(RubyCraft.modid + ":Pico_de_roca_fosilizada").setCreativeTab(Prueba);
		GameRegistry.registerItem(Pico_de_roca_fosilizada, Pico_de_roca_fosilizada.getUnlocalizedName().substring(5));
		
		hacha_de_roca_fosilizada = new hacha_de_roca_fosilizada(rocafosilidadtoolmaterial).setUnlocalizedName("hacha_de_roca_fosilizada").setTextureName(RubyCraft.modid + ":hacha_de_roca_fosilizada").setCreativeTab(Prueba);
		GameRegistry.registerItem(hacha_de_roca_fosilizada, hacha_de_roca_fosilizada.getUnlocalizedName().substring(5));
		
		pala_de_roca_fosilizada = new pala_de_roca_fosilizada(rocafosilidadtoolmaterial).setUnlocalizedName("pala_de_roca_fosilizada").setTextureName(RubyCraft.modid + ":pala_de_roca_fosilizada").setCreativeTab(Prueba);
		GameRegistry.registerItem(pala_de_roca_fosilizada, pala_de_roca_fosilizada.getUnlocalizedName().substring(5));
		
		
		
		pico_de_hueso_fosilizado = new pico_de_hueso_fosilizado(huesofosiltoolmaterial).setUnlocalizedName("pico_de_hueso_fosilizado").setTextureName(RubyCraft.modid + ":pico_de_hueso_fosilizado").setCreativeTab(Prueba);
		GameRegistry.registerItem(pico_de_hueso_fosilizado, pico_de_hueso_fosilizado.getUnlocalizedName().substring(5));
		
		hacha_de_hueso_fosilizado = new hacha_de_hueso_fosilizado(huesofosiltoolmaterial).setUnlocalizedName("hacha_de_hueso_fosilizado").setTextureName(RubyCraft.modid + ":hacha_de_hueso_fosilizado").setCreativeTab(Prueba);
		GameRegistry.registerItem(hacha_de_hueso_fosilizado, hacha_de_hueso_fosilizado.getUnlocalizedName().substring(5));
		
		pala_de_hueso_fosilizado = new pala_de_hueso_fosilizado(huesofosiltoolmaterial).setUnlocalizedName("pala_de_hueso_fosilizado").setTextureName(RubyCraft.modid + ":pala_de_hueso_fosilizado").setCreativeTab(Prueba);
		GameRegistry.registerItem(pala_de_hueso_fosilizado, pala_de_hueso_fosilizado.getUnlocalizedName().substring(5));
		
		
		
		pico_de_ambar = new pico_de_ambar(ambarfosiltoolmaterial).setUnlocalizedName("pico_de_ambar").setTextureName(RubyCraft.modid + ":pico_de_ambar").setCreativeTab(Prueba);
		GameRegistry.registerItem(pico_de_ambar, pico_de_ambar.getUnlocalizedName().substring(5));
		
		hacha_de_ambar = new hacha_de_ambar(ambarfosiltoolmaterial).setUnlocalizedName("hacha_de_ambar").setTextureName(RubyCraft.modid + ":hacha_de_ambar").setCreativeTab(Prueba);
		GameRegistry.registerItem(hacha_de_ambar, hacha_de_ambar.getUnlocalizedName().substring(5));
		
		pala_de_ambar = new pala_de_ambar(ambarfosiltoolmaterial).setUnlocalizedName("pala_de_ambar").setTextureName(RubyCraft.modid + ":pala_de_ambar").setCreativeTab(Prueba);
		GameRegistry.registerItem(pala_de_ambar, pala_de_ambar.getUnlocalizedName().substring(5));
		
		
		//Armas evento Navidad
		
		espada_de_arqueologo = new espada_de_arqueologo(arqueologotoolmaterial).setUnlocalizedName("espada_de_arqueologo").setTextureName(RubyCraft.modid + ":espada_de_arqueologo").setCreativeTab(Prueba);
		GameRegistry.registerItem(espada_de_arqueologo, espada_de_arqueologo.getUnlocalizedName().substring(5));
		
		espada_de_roca_fosilizada = new espada_de_roca_fosilizada(rocafosilidadtoolmaterial).setUnlocalizedName("espada_de_roca_fosilizada").setTextureName(RubyCraft.modid + ":espada_de_roca_fosilizada").setCreativeTab(Prueba);
		GameRegistry.registerItem(espada_de_roca_fosilizada, espada_de_roca_fosilizada.getUnlocalizedName().substring(5));
		
		espada_de_hueso_fosilizado = new espada_de_hueso_fosilizado(huesofosiltoolmaterial).setUnlocalizedName("espada_de_hueso_fosilizado").setTextureName(RubyCraft.modid + ":espada_de_hueso_fosilizado").setCreativeTab(Prueba);
		GameRegistry.registerItem(espada_de_hueso_fosilizado, espada_de_hueso_fosilizado.getUnlocalizedName().substring(5));
		
		espada_de_ambar = new espada_de_ambar(ambarfosiltoolmaterial).setUnlocalizedName("espada_de_ambar").setTextureName(RubyCraft.modid + ":espada_de_ambar").setCreativeTab(Prueba);
		GameRegistry.registerItem(espada_de_ambar, espada_de_ambar.getUnlocalizedName().substring(5));
		
		espada_ancestral = new espada_ancestral(espadaancestraltoolmaterial).setUnlocalizedName("espada_ancestral").setTextureName(RubyCraft.modid + ":espada_ancestral").setCreativeTab(Prueba);
		GameRegistry.registerItem(espada_ancestral, espada_ancestral.getUnlocalizedName().substring(5));
		
		
		//Armaduras
		
		casco_ancestral = new casco_ancestral(armaduraancestral, 0, 0).setUnlocalizedName("casco_ancestral").setTextureName(RubyCraft.modid + ":casco_ancestral").setCreativeTab(Prueba);
		GameRegistry.registerItem(casco_ancestral, casco_ancestral.getUnlocalizedName().substring(5));
		
		pechera_ancestral = new pechera_ancestral(armaduraancestral, 0, 1).setUnlocalizedName("pechera_ancestral").setTextureName(RubyCraft.modid + ":pechera_ancestral").setCreativeTab(Prueba);
		GameRegistry.registerItem(pechera_ancestral, pechera_ancestral.getUnlocalizedName().substring(5));
		
		pantalones_ancestrales = new pantalones_ancestrales(armaduraancestral, 0, 2).setUnlocalizedName("pantalones_ancestrales").setTextureName(RubyCraft.modid + ":pantalones_ancestrales").setCreativeTab(Prueba);
		GameRegistry.registerItem(pantalones_ancestrales, pantalones_ancestrales.getUnlocalizedName().substring(5));
		
		botas_ancestrales = new botas_ancestrales(armaduraancestral, 0, 3).setUnlocalizedName("botas_ancestrales").setTextureName(RubyCraft.modid + ":botas_ancestrales").setCreativeTab(Prueba);
		GameRegistry.registerItem(botas_ancestrales, botas_ancestrales.getUnlocalizedName().substring(5));
		
		
		//Items evento Navidad
		
		mango_de_herramientas = new mango_de_herramientas().setUnlocalizedName("mango_de_herramientas").setTextureName(RubyCraft.modid+":mango_de_herramientas").setCreativeTab(Prueba);
		GameRegistry.registerItem(mango_de_herramientas, mango_de_herramientas.getUnlocalizedName().substring(5));
		
		mango_de_espada = new mango_de_espada().setUnlocalizedName("mango_de_espada").setTextureName(RubyCraft.modid+":mango_de_espada").setCreativeTab(Prueba);
		GameRegistry.registerItem(mango_de_espada, mango_de_espada.getUnlocalizedName().substring(5));
		
		ambar = new ambar().setUnlocalizedName("ambar").setTextureName(RubyCraft.modid+":ambar").setCreativeTab(Prueba);
		GameRegistry.registerItem(ambar, ambar.getUnlocalizedName().substring(5));
		
		vial_de_sangre_de_hielo = new vial_de_sangre_de_hielo().setUnlocalizedName("vial_de_sangre_de_hielo").setTextureName(RubyCraft.modid+":vial_de_sangre_de_hielo").setCreativeTab(Prueba);
		GameRegistry.registerItem(vial_de_sangre_de_hielo, vial_de_sangre_de_hielo.getUnlocalizedName().substring(5));
		
		vial_de_sangre_glaciar = new vial_de_sangre_glaciar().setUnlocalizedName("vial_de_sangre_glaciar").setTextureName(RubyCraft.modid+":vial_de_sangre_glaciar").setCreativeTab(Prueba);
		GameRegistry.registerItem(vial_de_sangre_glaciar, vial_de_sangre_glaciar.getUnlocalizedName().substring(5));
		
		vial_de_sangre_del_pantano = new vial_de_sangre_del_pantano().setUnlocalizedName("vial_de_sangre_del_pantano").setTextureName(RubyCraft.modid+":vial_de_sangre_del_pantano").setCreativeTab(Prueba);
		GameRegistry.registerItem(vial_de_sangre_del_pantano, vial_de_sangre_del_pantano.getUnlocalizedName().substring(5));
		
		vial_de_sangre_cenagosa = new vial_de_sangre_cenagosa().setUnlocalizedName("vial_de_sangre_cenagosa").setTextureName(RubyCraft.modid+":vial_de_sangre_cenagosa").setCreativeTab(Prueba);
		GameRegistry.registerItem(vial_de_sangre_cenagosa, vial_de_sangre_cenagosa.getUnlocalizedName().substring(5));

		vial_de_sangre_de_las_montanas = new vial_de_sangre_de_las_montanas().setUnlocalizedName("vial_de_sangre_de_las_montanas").setTextureName(RubyCraft.modid+":vial_de_sangre_de_las_montanas").setCreativeTab(Prueba);
		GameRegistry.registerItem(vial_de_sangre_de_las_montanas, vial_de_sangre_de_las_montanas.getUnlocalizedName().substring(5));
		
		vial_de_sangre_rocosa = new vial_de_sangre_rocosa().setUnlocalizedName("vial_de_sangre_rocosa").setTextureName(RubyCraft.modid+":vial_de_sangre_rocosa").setCreativeTab(Prueba);
		GameRegistry.registerItem(vial_de_sangre_rocosa, vial_de_sangre_rocosa.getUnlocalizedName().substring(5));
		
		vial_de_sangre_del_bosque = new vial_de_sangre_del_bosque().setUnlocalizedName("vial_de_sangre_del_bosque").setTextureName(RubyCraft.modid+":vial_de_sangre_del_bosque").setCreativeTab(Prueba);
		GameRegistry.registerItem(vial_de_sangre_del_bosque, vial_de_sangre_del_bosque.getUnlocalizedName().substring(5));
		
		vial_de_sangre_selvatica = new vial_de_sangre_selvatica().setUnlocalizedName("vial_de_sangre_selvatica").setTextureName(RubyCraft.modid+":vial_de_sangre_selvatica").setCreativeTab(Prueba);
		GameRegistry.registerItem(vial_de_sangre_selvatica, vial_de_sangre_selvatica.getUnlocalizedName().substring(5));
		
		hueso_fosilizado = new hueso_fosilizado().setUnlocalizedName("hueso_fosilizado").setTextureName(RubyCraft.modid+":hueso_fosilizado").setCreativeTab(Prueba);
		GameRegistry.registerItem(hueso_fosilizado, hueso_fosilizado.getUnlocalizedName().substring(5));
		
		calavera_yeti = new calavera_yeti().setUnlocalizedName("calavera_yeti").setTextureName(RubyCraft.modid+":calavera_yeti").setCreativeTab(Prueba);
		GameRegistry.registerItem(calavera_yeti, calavera_yeti.getUnlocalizedName().substring(5));
		
		calavera_troll = new calavera_troll().setUnlocalizedName("calavera_troll").setTextureName(RubyCraft.modid+":calavera_troll").setCreativeTab(Prueba);
		GameRegistry.registerItem(calavera_troll, calavera_troll.getUnlocalizedName().substring(5));
		
		calavera_gigante = new calavera_gigante().setUnlocalizedName("calavera_gigante").setTextureName(RubyCraft.modid+":calavera_gigante").setCreativeTab(Prueba);
		GameRegistry.registerItem(calavera_gigante, calavera_gigante.getUnlocalizedName().substring(5));
		
		calavera_elfo = new calavera_elfo().setUnlocalizedName("calavera_elfo").setTextureName(RubyCraft.modid+":calavera_elfo").setCreativeTab(Prueba);
		GameRegistry.registerItem(calavera_elfo, calavera_elfo.getUnlocalizedName().substring(5));
		
		esencia_de_los_hielos = new esencia_de_los_hielos().setUnlocalizedName("esencia_de_los_hielos").setTextureName(RubyCraft.modid+":esencia_de_los_hielos").setCreativeTab(Prueba);
		GameRegistry.registerItem(esencia_de_los_hielos, esencia_de_los_hielos.getUnlocalizedName().substring(5));
		
		esencia_del_pantano = new esencia_del_pantano().setUnlocalizedName("esencia_del_pantano").setTextureName(RubyCraft.modid+":esencia_del_pantano").setCreativeTab(Prueba);
		GameRegistry.registerItem(esencia_del_pantano, esencia_del_pantano.getUnlocalizedName().substring(5));
		
		esencia_de_las_montanas = new esencia_de_las_montanas().setUnlocalizedName("esencia_de_las_montanas").setTextureName(RubyCraft.modid+":esencia_de_las_montanas").setCreativeTab(Prueba);
		GameRegistry.registerItem(esencia_de_las_montanas, esencia_de_las_montanas.getUnlocalizedName().substring(5));
		
		esencia_del_bosque = new esencia_del_bosque().setUnlocalizedName("esencia_del_bosque").setTextureName(RubyCraft.modid+":esencia_del_bosque").setCreativeTab(Prueba);
		GameRegistry.registerItem(esencia_del_bosque, esencia_del_bosque.getUnlocalizedName().substring(5));
		
		esencia_ancestral = new esencia_ancestral().setUnlocalizedName("esencia_ancestral").setTextureName(RubyCraft.modid+":esencia_ancestral").setCreativeTab(Prueba);
		GameRegistry.registerItem(esencia_ancestral, esencia_ancestral.getUnlocalizedName().substring(5));
		
		diamante_activado = new diamante_activado().setUnlocalizedName("diamante_activado").setTextureName(RubyCraft.modid+":diamante_activado").setCreativeTab(Prueba);
		GameRegistry.registerItem(diamante_activado, diamante_activado.getUnlocalizedName().substring(5));
		
		diamante_de_poder = new diamante_de_poder().setUnlocalizedName("diamante_de_poder").setTextureName(RubyCraft.modid+":diamante_de_poder").setCreativeTab(Prueba);
		GameRegistry.registerItem(diamante_de_poder, diamante_de_poder.getUnlocalizedName().substring(5));
		
		catalizador_de_esencias = new catalizador_de_esencias().setUnlocalizedName("catalizador_de_esencias").setTextureName(RubyCraft.modid+":catalizador_de_esencias").setCreativeTab(Prueba);
		GameRegistry.registerItem(catalizador_de_esencias, catalizador_de_esencias.getUnlocalizedName().substring(5));
		
		silex = new silex().setUnlocalizedName("silex").setTextureName(RubyCraft.modid+":silex").setCreativeTab(Prueba);
		GameRegistry.registerItem(silex, silex.getUnlocalizedName().substring(5));
		
		roca_fosilizada_afilada = new roca_fosilizada_afilada().setUnlocalizedName("roca_fosilizada_afilada").setTextureName(RubyCraft.modid+":roca_fosilizada_afilada").setCreativeTab(Prueba);
		GameRegistry.registerItem(roca_fosilizada_afilada, roca_fosilizada_afilada.getUnlocalizedName().substring(5));
		
		hueso_tallado = new hueso_tallado().setUnlocalizedName("hueso_tallado").setTextureName(RubyCraft.modid+":hueso_tallado").setCreativeTab(Prueba);
		GameRegistry.registerItem(hueso_tallado, hueso_tallado.getUnlocalizedName().substring(5));
		
		polvo_de_diamante = new polvo_de_diamante().setUnlocalizedName("polvo_de_diamante").setTextureName(RubyCraft.modid+":polvo_de_diamante").setCreativeTab(Prueba);
		GameRegistry.registerItem(polvo_de_diamante, polvo_de_diamante.getUnlocalizedName().substring(5));
		
		monton_de_polvo_de_diamante = new monton_de_polvo_de_diamante().setUnlocalizedName("monton_de_polvo_de_diamante").setTextureName(RubyCraft.modid+":monton_de_polvo_de_diamante").setCreativeTab(Prueba);
		GameRegistry.registerItem(monton_de_polvo_de_diamante, monton_de_polvo_de_diamante.getUnlocalizedName().substring(5));
		
		cubo_de_ambar_fundido = new cubo_de_ambar_fundido().setUnlocalizedName("cubo_de_ambar_fundido").setTextureName(RubyCraft.modid+":cubo_de_ambar_fundido").setCreativeTab(Prueba);
		GameRegistry.registerItem(cubo_de_ambar_fundido, cubo_de_ambar_fundido.getUnlocalizedName().substring(5));
		
		cubo_de_ambar_con_diamante = new cubo_de_ambar_con_diamante().setUnlocalizedName("cubo_de_ambar_con_diamante").setTextureName(RubyCraft.modid+":cubo_de_ambar_con_diamante").setCreativeTab(Prueba);
		GameRegistry.registerItem(cubo_de_ambar_con_diamante, cubo_de_ambar_con_diamante.getUnlocalizedName().substring(5));
		
		cubo_de_ambar_endurecido = new cubo_de_ambar_endurecido().setUnlocalizedName("cubo_de_ambar_endurecido").setTextureName(RubyCraft.modid+":cubo_de_ambar_endurecido").setCreativeTab(Prueba);
		GameRegistry.registerItem(cubo_de_ambar_endurecido, cubo_de_ambar_endurecido.getUnlocalizedName().substring(5));
		
		ambar_endurecido = new ambar_endurecido().setUnlocalizedName("ambar_endurecido").setTextureName(RubyCraft.modid+":ambar_endurecido").setCreativeTab(Prueba);
		GameRegistry.registerItem(ambar_endurecido, ambar_endurecido.getUnlocalizedName().substring(5));
		
		hilo_de_cuerda = new hilo_de_cuerda().setUnlocalizedName("hilo_de_cuerda").setTextureName(RubyCraft.modid+":hilo_de_cuerda").setCreativeTab(Prueba);
		GameRegistry.registerItem(hilo_de_cuerda, hilo_de_cuerda.getUnlocalizedName().substring(5));
		
		cuerda = new cuerda().setUnlocalizedName("cuerda").setTextureName(RubyCraft.modid+":cuerda").setCreativeTab(Prueba);
		GameRegistry.registerItem(cuerda, cuerda.getUnlocalizedName().substring(5));
		
		cuerda_trenzada = new cuerda_trenzada().setUnlocalizedName("cuerda_trenzada").setTextureName(RubyCraft.modid+":cuerda_trenzada").setCreativeTab(Prueba);
		GameRegistry.registerItem(cuerda_trenzada, cuerda_trenzada.getUnlocalizedName().substring(5));
		
		punta_de_espada_de_silex = new punta_de_espada_de_silex().setUnlocalizedName("punta_de_espada_de_silex").setTextureName(RubyCraft.modid + ":punta_de_espada_de_silex").setCreativeTab(Prueba);
		GameRegistry.registerItem(punta_de_espada_de_silex, punta_de_espada_de_silex.getUnlocalizedName().substring(5));
		
		punta_de_espada_de_roca_fosilizada = new punta_de_espada_de_roca_fosilizada().setUnlocalizedName("punta_de_espada_de_roca_fosilizada").setTextureName(RubyCraft.modid + ":punta_de_espada_de_roca_fosilizada").setCreativeTab(Prueba);
		GameRegistry.registerItem(punta_de_espada_de_roca_fosilizada, punta_de_espada_de_roca_fosilizada.getUnlocalizedName().substring(5));
		
		punta_de_espada_de_hueso_fosilizado = new punta_de_espada_de_hueso_fosilizado().setUnlocalizedName("punta_de_espada_de_hueso_fosilizado").setTextureName(RubyCraft.modid + ":punta_de_espada_de_hueso_fosilizado").setCreativeTab(Prueba);
		GameRegistry.registerItem(punta_de_espada_de_hueso_fosilizado, punta_de_espada_de_hueso_fosilizado.getUnlocalizedName().substring(5));
		
		punta_de_espada_de_ambar = new punta_de_espada_de_ambar().setUnlocalizedName("punta_de_espada_de_ambar").setTextureName(RubyCraft.modid + ":punta_de_espada_de_ambar").setCreativeTab(Prueba);
		GameRegistry.registerItem(punta_de_espada_de_ambar, punta_de_espada_de_ambar.getUnlocalizedName().substring(5));
		
		ambar_sangriento = new ambar_sangriento().setUnlocalizedName("ambar_sangriento").setTextureName(RubyCraft.modid + ":ambar_sangriento").setCreativeTab(Prueba);
		GameRegistry.registerItem(ambar_sangriento, ambar_sangriento.getUnlocalizedName().substring(5));
		
		ambar_de_poder = new ambar_de_poder().setUnlocalizedName("ambar_de_poder").setTextureName(RubyCraft.modid + ":ambar_de_poder").setCreativeTab(Prueba);
		GameRegistry.registerItem(ambar_de_poder, ambar_de_poder.getUnlocalizedName().substring(5));
		
		ambar_mistico = new ambar_mistico().setUnlocalizedName("ambar_mistico").setTextureName(RubyCraft.modid + ":ambar_mistico").setCreativeTab(Prueba);
		GameRegistry.registerItem(ambar_mistico, ambar_mistico.getUnlocalizedName().substring(5));
		
		ambar_ancestral = new ambar_ancestral().setUnlocalizedName("ambar_ancestral").setTextureName(RubyCraft.modid + ":ambar_ancestral").setCreativeTab(Prueba);
		GameRegistry.registerItem(ambar_ancestral, ambar_ancestral.getUnlocalizedName().substring(5));
		
		lingote_de_ambar_ancestral = new lingote_de_ambar_ancestral().setUnlocalizedName("lingote_de_ambar_ancestral").setTextureName(RubyCraft.modid + ":lingote_de_ambar_ancestral").setCreativeTab(Prueba);
		GameRegistry.registerItem(lingote_de_ambar_ancestral, lingote_de_ambar_ancestral.getUnlocalizedName().substring(5));
		
		sangre_ancestral = new sangre_ancestral().setUnlocalizedName("sangre_ancestral").setTextureName(RubyCraft.modid + ":sangre_ancestral").setCreativeTab(Prueba);
		GameRegistry.registerItem(sangre_ancestral, sangre_ancestral.getUnlocalizedName().substring(5));
		
	}
	
	
	
	public static void init() 
	{
		//Crafteos Items
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 15), Principal.Fragmento_de_fosil);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 10, 15), Principal.hueso_fosilizado);
    }
	
	
	public static void postinit() 
	{
		
	}
	
	
	
}
