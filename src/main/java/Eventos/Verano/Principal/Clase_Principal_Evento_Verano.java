package Eventos.Verano.Principal;

import Eventos.IniciarItemsEventos;
import Eventos.Verano.Armas.Espada_de_Aguamarina_Amarilla;
import Eventos.Verano.Armas.Espada_de_Aguamarina_Azul;
import Eventos.Verano.Armas.Espada_de_Aguamarina_AzulOscuro;
import Eventos.Verano.Armas.Espada_de_Aguamarina_Transparente;
import Eventos.Verano.Armas.Espada_de_Aguamarina_Verde;
import Eventos.Verano.Bloques.Aguamarina;
import Eventos.Verano.Generacion.Generacion_Principal_Verano;
import Eventos.Verano.Herramientas.Pico_de_acero;
import Eventos.Verano.Items.Acero_Fundido;
import Eventos.Verano.Items.Acero_Fundido_con_Aguamarina_Amarilla;
import Eventos.Verano.Items.Acero_Fundido_con_Aguamarina_Azul;
import Eventos.Verano.Items.Acero_Fundido_con_Aguamarina_AzulOscuro;
import Eventos.Verano.Items.Acero_Fundido_con_Aguamarina_Transparente;
import Eventos.Verano.Items.Acero_Fundido_con_Aguamarina_Verde;
import Eventos.Verano.Items.Aguamarina_Amarilla;
import Eventos.Verano.Items.Aguamarina_Amarilla_Fundida;
import Eventos.Verano.Items.Aguamarina_Azul;
import Eventos.Verano.Items.Aguamarina_AzulOscuro;
import Eventos.Verano.Items.Aguamarina_AzulOscuro_Fundida;
import Eventos.Verano.Items.Aguamarina_Azul_Fundida;
import Eventos.Verano.Items.Aguamarina_Transparente;
import Eventos.Verano.Items.Aguamarina_Transparente_Fundida;
import Eventos.Verano.Items.Aguamarina_Verde;
import Eventos.Verano.Items.Aguamarina_Verde_Fundida;
import Eventos.Verano.Items.Algodon;
import Eventos.Verano.Items.Cuero_Curtido;
import Eventos.Verano.Items.Documento_Perdido;
import Eventos.Verano.Items.Hierro_Fundido;
import Eventos.Verano.Items.Hierro_Fundido_con_Carbon;
import Eventos.Verano.Items.Hilo_de_algodon;
import Eventos.Verano.Items.Libro_Evento_Verano;
import Eventos.Verano.Items.Lingote_de_Acero;
import Eventos.Verano.Items.Lingote_de_Aguamarina_Amarilla;
import Eventos.Verano.Items.Lingote_de_Aguamarina_Azul;
import Eventos.Verano.Items.Lingote_de_Aguamarina_AzulOscuro;
import Eventos.Verano.Items.Lingote_de_Aguamarina_Transparente;
import Eventos.Verano.Items.Lingote_de_Aguamarina_Verde;
import Eventos.Verano.Items.Pergamino;
import Eventos.Verano.Items.Silex;
import Eventos.Verano.Items.Tablilla;
import Eventos.Verano.Items.Tapa_Libro;
import Eventos.Verano.Plantas.Algodon_Salvaje;
import Eventos.Verano.Plantas.Planta_de_algodon;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class Clase_Principal_Evento_Verano 
{
	
	//Bloques
	
	public static Block Aguamarina;
	
	//Items
	
	public static Item Documento_Perdido;

	public static Item Cuero_Curtido;
	public static Item Tablilla;
	public static Item Pergamino;
	public static Item Tapa_Libro;
	public static Item Libro_Evento_Verano;
	
	public static Item Algodon;
	public static Item Hilo_de_algodon;
	public static Item Vendaje;
	
	public static Item Silex;
	
	public static Item Aguamarina_Azul;
	public static Item Aguamarina_Amarilla;
	public static Item Aguamarina_Verde;
	public static Item Aguamarina_AzulOscuro;
	public static Item Aguamarina_Transparente;
	
	public static Item Hierro_Fundido;
	public static Item Hierro_Fundido_con_Carbon;
	public static Item Acero_Fundido;
	public static Item Lingote_de_Acero;
	
	public static Item Acero_Fundido_con_Aguamarina_Azul;
	public static Item Acero_Fundido_con_Aguamarina_Amarilla;
	public static Item Acero_Fundido_con_Aguamarina_Verde;
	public static Item Acero_Fundido_con_Aguamarina_AzulOscuro;
	public static Item Acero_Fundido_con_Aguamarina_Transparente;
	
	public static Item Aguamarina_Azul_Fundida;
	public static Item Aguamarina_Amarilla_Fundida;
	public static Item Aguamarina_Verde_Fundida;
	public static Item Aguamarina_AzulOscuro_Fundida;
	public static Item Aguamarina_Transparente_Fundida;
	
	public static Item Lingote_de_Aguamarina_Azul;
	public static Item Lingote_de_Aguamarina_Amarilla;
	public static Item Lingote_de_Aguamarina_Verde;
	public static Item Lingote_de_Aguamarina_AzulOscuro;
	public static Item Lingote_de_Aguamarina_Transparente;
	
	//Plantas
	
	public static Block Planta_de_algodon;
	public static Block Algodon_Salvaje;
	
	//Semillas
	
	public static Item Semilla_Algodon;
	
	//Herramientas
	
	public static Item Pico_de_acero;
	
	//Armas
	
	public static Item Espada_de_Aguamarina_Azul;
	public static Item Espada_de_Aguamarina_Amarilla;
	public static Item Espada_de_Aguamarina_Verde;
	public static Item Espada_de_Aguamarina_AzulOscuro;
	public static Item Espada_de_Aguamarina_Transparente;
	
	//Armaduras
	
	//Materiales (nivel, durabilidad, eficiencia, daño, nivel encantamiento) Al daño puesto minecraft le suma 1 a la pala, 2 al pico, 3 al hacha y 4 a la espada.
	
	public static final Item.ToolMaterial Acero = EnumHelper.addToolMaterial("Acero", 20, 350, 6.0F, 2.0F, 45);
	public static final Item.ToolMaterial AguamarinaAzul = EnumHelper.addToolMaterial("AguamarinaAzul", 20, 500, 6.0F, 6.0F, 45);
	public static final Item.ToolMaterial AguamarinaAmarilla = EnumHelper.addToolMaterial("AguamarinaAmarilla", 20, 750, 6.0F, 16.0F, 45);
	public static final Item.ToolMaterial AguamarinaVerde = EnumHelper.addToolMaterial("AguamarinaVerde", 20, 1500, 6.0F, 26.0F, 45);
	public static final Item.ToolMaterial AguamarinaAzulOscuro = EnumHelper.addToolMaterial("AguamarinaAzulOscuro", 20, 3000, 6.0F, 46.0F, 45);
	public static final Item.ToolMaterial AguamarinaTransparente = EnumHelper.addToolMaterial("AguamarinaTransparente", 20, 10000, 6.0F, 96.0F, 45);
	
	//CreativeTab
	
	public static CreativeTabs Tab;
	
	public static final int guiIdLibro = 21;

	public static final int guiIdDocumento = 100;
		
	public static void preinit() 
	{
		Generacion_Principal_Verano.InicicializarGeneraciones();
		
		//Tab = RubyCraft.Rubycrafttab;
		
		if (RubyCraft.Verano)
		{
			Tab = RubyCraft.EventosTab;
		}
		
		else 
		{
			Tab = RubyCraft.Rubycrafttab;
		}
		
		//Bloques
		
		Aguamarina = new Aguamarina(Material.rock).setBlockName("Aguamarina").setBlockTextureName(RubyCraft.modid+":Eventos/Verano/Aguamarina").setCreativeTab(Tab).setHardness(8.0F).setResistance(300.0F);
		GameRegistry.registerBlock(Aguamarina, Aguamarina.getUnlocalizedName().substring(5));
		Aguamarina.setHarvestLevel("pickaxe", 20);
		
		//Items
		
		Documento_Perdido = new Documento_Perdido().setUnlocalizedName("Documento_Perdido").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Documento_Perdido").setCreativeTab(Tab);
		GameRegistry.registerItem(Documento_Perdido, Documento_Perdido.getUnlocalizedName().substring(5));
		
		Libro_Evento_Verano = new Libro_Evento_Verano().setUnlocalizedName("Libro_Evento_Verano").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Libro_Cerrado").setCreativeTab(Tab);
		GameRegistry.registerItem(Libro_Evento_Verano, Libro_Evento_Verano.getUnlocalizedName().substring(5));
		
		Algodon = new Algodon().setUnlocalizedName("Algodon").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Algodon").setCreativeTab(Tab);
		GameRegistry.registerItem(Algodon, Algodon.getUnlocalizedName().substring(5));
		
		Hilo_de_algodon = new Hilo_de_algodon().setUnlocalizedName("Hilo_de_algodon").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Hilo_de_algodon").setCreativeTab(Tab);
		GameRegistry.registerItem(Hilo_de_algodon, Hilo_de_algodon.getUnlocalizedName().substring(5));
		
		Cuero_Curtido = new Cuero_Curtido().setUnlocalizedName("Cuero_Curtido").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Cuero_Curtido").setCreativeTab(Tab);
		GameRegistry.registerItem(Cuero_Curtido, Cuero_Curtido.getUnlocalizedName().substring(5));
		
		Silex = new Silex().setUnlocalizedName("Silex").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Silex").setCreativeTab(Tab);
		GameRegistry.registerItem(Silex, Silex.getUnlocalizedName().substring(5));
		
		Tablilla = new Tablilla().setUnlocalizedName("Tablilla").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Tablilla").setCreativeTab(Tab);
		GameRegistry.registerItem(Tablilla, Tablilla.getUnlocalizedName().substring(5));
		
		Tapa_Libro = new Tapa_Libro().setUnlocalizedName("Tapa_Libro").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Tapa_Libro").setCreativeTab(Tab);
		GameRegistry.registerItem(Tapa_Libro, Tapa_Libro.getUnlocalizedName().substring(5));
		
		Pergamino = new Pergamino().setUnlocalizedName("Pergamino").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Pergamino").setCreativeTab(Tab);
		GameRegistry.registerItem(Pergamino, Pergamino.getUnlocalizedName().substring(5));
		
		
		
		Aguamarina_Azul = new Aguamarina_Azul().setUnlocalizedName("Aguamarina_Azul").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_Azul").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_Azul, Aguamarina_Azul.getUnlocalizedName().substring(5));
		
		Aguamarina_AzulOscuro = new Aguamarina_AzulOscuro().setUnlocalizedName("Aguamarina_AzulOscuro").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_AzulOscuro").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_AzulOscuro, Aguamarina_AzulOscuro.getUnlocalizedName().substring(5));
		
		Aguamarina_Amarilla = new Aguamarina_Amarilla().setUnlocalizedName("Aguamarina_Amarilla").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_Amarilla").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_Amarilla, Aguamarina_Amarilla.getUnlocalizedName().substring(5));
		
		Aguamarina_Verde = new Aguamarina_Verde().setUnlocalizedName("Aguamarina_Verde").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_Verde").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_Verde, Aguamarina_Verde.getUnlocalizedName().substring(5));
		
		Aguamarina_Transparente = new Aguamarina_Transparente().setUnlocalizedName("Aguamarina_Transparente").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_Transparente").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_Transparente, Aguamarina_Transparente.getUnlocalizedName().substring(5));
		
		
		
		Hierro_Fundido = new Hierro_Fundido().setUnlocalizedName("Hierro_Fundido").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Hierro_Fundido").setCreativeTab(Tab);
		GameRegistry.registerItem(Hierro_Fundido, Hierro_Fundido.getUnlocalizedName().substring(5));
		
		Hierro_Fundido_con_Carbon = new Hierro_Fundido_con_Carbon().setUnlocalizedName("Hierro_Fundido_con_Carbon").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Hierro_Fundido_con_Carbon").setCreativeTab(Tab);
		GameRegistry.registerItem(Hierro_Fundido_con_Carbon, Hierro_Fundido_con_Carbon.getUnlocalizedName().substring(5));
		
		Acero_Fundido = new Acero_Fundido().setUnlocalizedName("Acero_Fundido").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Acero_Fundido").setCreativeTab(Tab);
		GameRegistry.registerItem(Acero_Fundido, Acero_Fundido.getUnlocalizedName().substring(5));
		
		Lingote_de_Acero = new Lingote_de_Acero().setUnlocalizedName("Lingote_de_Acero").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Lingote_de_Acero").setCreativeTab(Tab);
		GameRegistry.registerItem(Lingote_de_Acero, Lingote_de_Acero.getUnlocalizedName().substring(5));
		
		
		
		Acero_Fundido_con_Aguamarina_Azul = new Acero_Fundido_con_Aguamarina_Azul().setUnlocalizedName("Acero_Fundido_con_Aguamarina_Azul").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Acero_Fundido_con_Aguamarina_Azul").setCreativeTab(Tab);
		GameRegistry.registerItem(Acero_Fundido_con_Aguamarina_Azul, Acero_Fundido_con_Aguamarina_Azul.getUnlocalizedName().substring(5));
		
		Acero_Fundido_con_Aguamarina_Amarilla = new Acero_Fundido_con_Aguamarina_Amarilla().setUnlocalizedName("Acero_Fundido_con_Aguamarina_Amarilla").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Acero_Fundido_con_Aguamarina_Amarilla").setCreativeTab(Tab);
		GameRegistry.registerItem(Acero_Fundido_con_Aguamarina_Amarilla, Acero_Fundido_con_Aguamarina_Amarilla.getUnlocalizedName().substring(5));
		
		Acero_Fundido_con_Aguamarina_Verde = new Acero_Fundido_con_Aguamarina_Verde().setUnlocalizedName("Acero_Fundido_con_Aguamarina_Verde").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Acero_Fundido_con_Aguamarina_Verde").setCreativeTab(Tab);
		GameRegistry.registerItem(Acero_Fundido_con_Aguamarina_Verde, Acero_Fundido_con_Aguamarina_Verde.getUnlocalizedName().substring(5));
		
		Acero_Fundido_con_Aguamarina_AzulOscuro = new Acero_Fundido_con_Aguamarina_AzulOscuro().setUnlocalizedName("Acero_Fundido_con_Aguamarina_AzulOscuro").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Acero_Fundido_con_Aguamarina_AzulOscuro").setCreativeTab(Tab);
		GameRegistry.registerItem(Acero_Fundido_con_Aguamarina_AzulOscuro, Acero_Fundido_con_Aguamarina_AzulOscuro.getUnlocalizedName().substring(5));
		
		Acero_Fundido_con_Aguamarina_Transparente = new Acero_Fundido_con_Aguamarina_Transparente().setUnlocalizedName("Acero_Fundido_con_Aguamarina_Transparente").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Acero_Fundido_con_Aguamarina_Transparente").setCreativeTab(Tab);
		GameRegistry.registerItem(Acero_Fundido_con_Aguamarina_Transparente, Acero_Fundido_con_Aguamarina_Transparente.getUnlocalizedName().substring(5));
		
		
		
		Aguamarina_Azul_Fundida = new Aguamarina_Azul_Fundida().setUnlocalizedName("Aguamarina_Azul_Fundida").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_Azul_Fundida").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_Azul_Fundida, Aguamarina_Azul_Fundida.getUnlocalizedName().substring(5));
		
		Aguamarina_Amarilla_Fundida = new Aguamarina_Amarilla_Fundida().setUnlocalizedName("Aguamarina_Amarilla_Fundida").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_Amarilla_Fundida").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_Amarilla_Fundida, Aguamarina_Amarilla_Fundida.getUnlocalizedName().substring(5));
		
		Aguamarina_Verde_Fundida = new Aguamarina_Verde_Fundida().setUnlocalizedName("Aguamarina_Verde_Fundida").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_Verde_Fundida").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_Verde_Fundida, Aguamarina_Verde_Fundida.getUnlocalizedName().substring(5));
		
		Aguamarina_AzulOscuro_Fundida = new Aguamarina_AzulOscuro_Fundida().setUnlocalizedName("Aguamarina_AzulOscuro_Fundida").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_AzulOscuro_Fundida").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_AzulOscuro_Fundida, Aguamarina_AzulOscuro_Fundida.getUnlocalizedName().substring(5));
		
		Aguamarina_Transparente_Fundida = new Aguamarina_Transparente_Fundida().setUnlocalizedName("Aguamarina_Transparente_Fundida").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Aguamarina_Transparente_Fundida").setCreativeTab(Tab);
		GameRegistry.registerItem(Aguamarina_Transparente_Fundida, Aguamarina_Transparente_Fundida.getUnlocalizedName().substring(5));
		
		
		
		Lingote_de_Aguamarina_Azul = new Lingote_de_Aguamarina_Azul().setUnlocalizedName("Lingote_de_Aguamarina_Azul").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Lingote_de_Aguamarina_Azul").setCreativeTab(Tab);
		GameRegistry.registerItem(Lingote_de_Aguamarina_Azul, Lingote_de_Aguamarina_Azul.getUnlocalizedName().substring(5));
		
		Lingote_de_Aguamarina_Amarilla = new Lingote_de_Aguamarina_Amarilla().setUnlocalizedName("Lingote_de_Aguamarina_Amarilla").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Lingote_de_Aguamarina_Amarilla").setCreativeTab(Tab);
		GameRegistry.registerItem(Lingote_de_Aguamarina_Amarilla, Lingote_de_Aguamarina_Amarilla.getUnlocalizedName().substring(5));
		
		Lingote_de_Aguamarina_Verde = new Lingote_de_Aguamarina_Verde().setUnlocalizedName("Lingote_de_Aguamarina_Verde").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Lingote_de_Aguamarina_Verde").setCreativeTab(Tab);
		GameRegistry.registerItem(Lingote_de_Aguamarina_Verde, Lingote_de_Aguamarina_Verde.getUnlocalizedName().substring(5));
		
		Lingote_de_Aguamarina_AzulOscuro = new Lingote_de_Aguamarina_AzulOscuro().setUnlocalizedName("Lingote_de_Aguamarina_AzulOscuro").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Lingote_de_Aguamarina_AzulOscuro").setCreativeTab(Tab);
		GameRegistry.registerItem(Lingote_de_Aguamarina_AzulOscuro, Lingote_de_Aguamarina_AzulOscuro.getUnlocalizedName().substring(5));
		
		Lingote_de_Aguamarina_Transparente = new Lingote_de_Aguamarina_Transparente().setUnlocalizedName("Lingote_de_Aguamarina_Transparente").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Lingote_de_Aguamarina_Transparente").setCreativeTab(Tab);
		GameRegistry.registerItem(Lingote_de_Aguamarina_Transparente, Lingote_de_Aguamarina_Transparente.getUnlocalizedName().substring(5));
		
		//Plantas
		
		Planta_de_algodon = new Planta_de_algodon().setBlockName("Planta_de_algodon").setResistance(1.0F);
		GameRegistry.registerBlock(Planta_de_algodon, Planta_de_algodon.getUnlocalizedName().substring(5));
		Planta_de_algodon.setHarvestLevel("shovel", 2);
		
		Algodon_Salvaje = new Algodon_Salvaje(Material.plants).setBlockName("Algodon_Salvaje").setBlockTextureName(RubyCraft.modid+":Eventos/Verano/Planta_de_algodon4").setHardness(0.1F).setResistance(1.0F);
		GameRegistry.registerBlock(Algodon_Salvaje, Algodon_Salvaje.getUnlocalizedName().substring(5));
		Algodon_Salvaje.setHarvestLevel("axe", 2);
		
		//Semillas
		
		Semilla_Algodon = new ItemSeeds(Planta_de_algodon, Blocks.farmland).setUnlocalizedName("Semilla_Algodon").setTextureName(RubyCraft.modid+":Eventos/Evento_Verano/Semilla_Algodon").setCreativeTab(Tab);
		GameRegistry.registerItem(Semilla_Algodon, Semilla_Algodon.getUnlocalizedName().substring(5));
		
		//Herramientas
		
		Pico_de_acero = new Pico_de_acero(Acero).setUnlocalizedName("Pico_de_acero").setTextureName(RubyCraft.modid + ":Eventos/Evento_Verano/Pico_de_acero").setCreativeTab(Tab);
		GameRegistry.registerItem(Pico_de_acero, Pico_de_acero.getUnlocalizedName().substring(5));
		
		//Armas
		
		Espada_de_Aguamarina_Azul = new Espada_de_Aguamarina_Azul(AguamarinaAzul).setUnlocalizedName("Espada_de_Aguamarina_Azul").setTextureName(RubyCraft.modid + ":Eventos/Evento_Verano/Espada_de_Aguamarina_Azul").setCreativeTab(Tab);
		GameRegistry.registerItem(Espada_de_Aguamarina_Azul, Espada_de_Aguamarina_Azul.getUnlocalizedName().substring(5));
		
		Espada_de_Aguamarina_Amarilla = new Espada_de_Aguamarina_Amarilla(AguamarinaAmarilla).setUnlocalizedName("Espada_de_Aguamarina_Amarilla").setTextureName(RubyCraft.modid + ":Eventos/Evento_Verano/Espada_de_Aguamarina_Amarilla").setCreativeTab(Tab);
		GameRegistry.registerItem(Espada_de_Aguamarina_Amarilla, Espada_de_Aguamarina_Amarilla.getUnlocalizedName().substring(5));
		
		Espada_de_Aguamarina_Verde = new Espada_de_Aguamarina_Verde(AguamarinaVerde).setUnlocalizedName("Espada_de_Aguamarina_Verde").setTextureName(RubyCraft.modid + ":Eventos/Evento_Verano/Espada_de_Aguamarina_Verde").setCreativeTab(Tab);
		GameRegistry.registerItem(Espada_de_Aguamarina_Verde, Espada_de_Aguamarina_Verde.getUnlocalizedName().substring(5));
		
		Espada_de_Aguamarina_AzulOscuro = new Espada_de_Aguamarina_AzulOscuro(AguamarinaAzulOscuro).setUnlocalizedName("Espada_de_Aguamarina_AzulOscuro").setTextureName(RubyCraft.modid + ":Eventos/Evento_Verano/Espada_de_Aguamarina_AzulOscuro").setCreativeTab(Tab);
		GameRegistry.registerItem(Espada_de_Aguamarina_AzulOscuro, Espada_de_Aguamarina_AzulOscuro.getUnlocalizedName().substring(5));
		
		Espada_de_Aguamarina_Transparente = new Espada_de_Aguamarina_Transparente(AguamarinaTransparente).setUnlocalizedName("Espada_de_Aguamarina_Transparente").setTextureName(RubyCraft.modid + ":Eventos/Evento_Verano/Espada_de_Aguamarina_Transparente").setCreativeTab(Tab);
		GameRegistry.registerItem(Espada_de_Aguamarina_Transparente, Espada_de_Aguamarina_Transparente.getUnlocalizedName().substring(5));
		IniciarItemsEventos.Verano_PostInit();

		//Armaduras
	}
	
	public static void init() 
	{
		if (RubyCraft.Verano)
		{
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Hilo_de_algodon, 1), new Object[] {"hhh", "hhh", "hhh",'h',Clase_Principal_Evento_Verano.Algodon});
			
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Silex, 1), new Object[] {"hh",'h',Blocks.cobblestone});
			
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Cuero_Curtido, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.leather,'s',Clase_Principal_Evento_Verano.Silex});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Tablilla, 1), new Object[] {"hsh", 'h', new ItemStack(Blocks.planks, 1, 0),'s',Clase_Principal_Evento_Verano.Silex});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Tapa_Libro, 1), new Object[] {"hhh", "hsh", "hhh", 'h', Clase_Principal_Evento_Verano.Cuero_Curtido,'s',Clase_Principal_Evento_Verano.Tablilla});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Pergamino, 1), new Object[] {"hhh", "hsh", "hhh", 's', Clase_Principal_Evento_Verano.Cuero_Curtido,'h',Clase_Principal_Evento_Verano.Silex});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Libro_Evento_Verano, 1), new Object[] {"hhh", "lpl", "ttt", 't', new ItemStack(Items.dye, 1, 10),'h',Clase_Principal_Evento_Verano.Hilo_de_algodon, 'l', Clase_Principal_Evento_Verano.Tapa_Libro, 'p', Clase_Principal_Evento_Verano.Pergamino});
			
			GameRegistry.addSmelting(Blocks.iron_block, new ItemStack(Clase_Principal_Evento_Verano.Hierro_Fundido, 1), 10F);
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Hierro_Fundido_con_Carbon, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.coal,'s',Clase_Principal_Evento_Verano.Hierro_Fundido});
			GameRegistry.addSmelting(Clase_Principal_Evento_Verano.Hierro_Fundido_con_Carbon, new ItemStack(Clase_Principal_Evento_Verano.Acero_Fundido, 1), 10.0F);
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Lingote_de_Acero, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.water_bucket,'s',Clase_Principal_Evento_Verano.Acero_Fundido});
			
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Azul, 1), new Object[] {"hhh", "hsh", "hhh",'h',Clase_Principal_Evento_Verano.Aguamarina_Azul,'s',Clase_Principal_Evento_Verano.Acero_Fundido});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Amarilla, 1), new Object[] {"hhh", "hsh", "hhh",'h',Clase_Principal_Evento_Verano.Aguamarina_Amarilla,'s',Clase_Principal_Evento_Verano.Acero_Fundido});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Verde, 1), new Object[] {"hhh", "hsh", "hhh",'h',Clase_Principal_Evento_Verano.Aguamarina_Verde,'s',Clase_Principal_Evento_Verano.Acero_Fundido});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_AzulOscuro, 1), new Object[] {"hhh", "hsh", "hhh",'h',Clase_Principal_Evento_Verano.Aguamarina_AzulOscuro,'s',Clase_Principal_Evento_Verano.Acero_Fundido});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Transparente, 1), new Object[] {"hhh", "hsh", "hhh",'h',Clase_Principal_Evento_Verano.Aguamarina_Transparente,'s',Clase_Principal_Evento_Verano.Acero_Fundido});
			
			GameRegistry.addSmelting(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Azul, new ItemStack(Clase_Principal_Evento_Verano.Aguamarina_Azul_Fundida, 1), 10.0F);
			GameRegistry.addSmelting(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Amarilla, new ItemStack(Clase_Principal_Evento_Verano.Aguamarina_Amarilla_Fundida, 1), 10.0F);
			GameRegistry.addSmelting(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Verde, new ItemStack(Clase_Principal_Evento_Verano.Aguamarina_Verde_Fundida, 1), 10.0F);
			GameRegistry.addSmelting(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_AzulOscuro, new ItemStack(Clase_Principal_Evento_Verano.Aguamarina_AzulOscuro_Fundida, 1), 10.0F);
			GameRegistry.addSmelting(Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Transparente, new ItemStack(Clase_Principal_Evento_Verano.Aguamarina_Transparente_Fundida, 1), 10.0F);
			
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Azul, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.water_bucket,'s',Clase_Principal_Evento_Verano.Aguamarina_Azul_Fundida});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Amarilla, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.water_bucket,'s',Clase_Principal_Evento_Verano.Aguamarina_Amarilla_Fundida});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Verde, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.water_bucket,'s',Clase_Principal_Evento_Verano.Aguamarina_Verde_Fundida});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_AzulOscuro, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.water_bucket,'s',Clase_Principal_Evento_Verano.Aguamarina_AzulOscuro_Fundida});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Transparente, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.water_bucket,'s',Clase_Principal_Evento_Verano.Aguamarina_Transparente_Fundida});
			
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Espada_de_Aguamarina_Azul, 1), new Object[] {" h ", " h ", " p ",'h',Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Azul,'p',Items.stick});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Espada_de_Aguamarina_Amarilla, 1), new Object[] {" h ", " h ", " p ",'h',Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Amarilla,'p',Items.stick});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Espada_de_Aguamarina_Verde, 1), new Object[] {" h ", " h ", " p ",'h',Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Verde,'p',Items.stick});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Espada_de_Aguamarina_AzulOscuro, 1), new Object[] {" h ", " h ", " p ",'h',Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_AzulOscuro,'p',Items.stick});
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Espada_de_Aguamarina_Transparente, 1), new Object[] {" h ", " h ", " p ",'h',Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Transparente,'p',Items.stick});
			
			GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Pico_de_acero, 1), new Object[] {"hhh", " p ", " p ",'h',Clase_Principal_Evento_Verano.Lingote_de_Acero,'p',Items.stick});
		}
    }
	
	
	public static void postinit() 
	{
		
	}

}
