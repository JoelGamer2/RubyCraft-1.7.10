package Eventos.Verano.Principal;

import Eventos.Verano.Generacion.Generacion_Principal_Verano;
import Eventos.Verano.Items.Algodon;
import Eventos.Verano.Items.Cuero_Curtido;
import Eventos.Verano.Items.Documento_Perdido;
import Eventos.Verano.Items.Hilo_de_algodon;
import Eventos.Verano.Items.Libro_Evento_Verano;
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

public class Clase_Principal_Evento_Verano 
{
	
	//Bloques
	
	//Items
	
	public static Item Documento_Perdido;

	public static Item Cuero_Curtido;
	public static Item Tablilla;
	public static Item Pergamino;
	public static Item Tapa_Libro;
	public static Item Libro_Evento_Verano;
	
	public static Item Algodon;
	public static Item Hilo_de_algodon;
	
	public static Item Silex;
	
	//Plantas
	
	public static Block Planta_de_algodon;
	public static Block Algodon_Salvaje;
	
	//Semillas
	
	public static Item Semilla_Algodon;
	
	//Herramientas
	
	//Armas
	
	//Armaduras
	
	//Materiales (nivel, durabilidad, eficiencia, daño, nivel encantamiento) Al daño puesto minecraft le suma 1 a la pala, 2 al pico, 3 al hacha y 4 a la espada.
	
	//CreativeTab
	
	public static CreativeTabs Tab;
		
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
		
		//Armas
		
		//Armaduras
	}
	
	public static void init() 
	{
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Hilo_de_algodon, 1), new Object[] {"hhh", "hhh", "hhh",'h',Clase_Principal_Evento_Verano.Algodon});
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Silex, 1), new Object[] {"hh",'h',Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Cuero_Curtido, 1), new Object[] {"hhh", "hsh", "hhh",'h',Items.leather,'s',Clase_Principal_Evento_Verano.Silex});
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Tablilla, 1), new Object[] {"hsh", 'h', new ItemStack(Blocks.planks, 1, 0),'s',Clase_Principal_Evento_Verano.Silex});
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Tapa_Libro, 1), new Object[] {"hhh", "hsh", "hhh", 'h', Clase_Principal_Evento_Verano.Cuero_Curtido,'s',Clase_Principal_Evento_Verano.Tablilla});
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Pergamino, 1), new Object[] {"hhh", "hsh", "hhh", 's', Clase_Principal_Evento_Verano.Cuero_Curtido,'h',Clase_Principal_Evento_Verano.Silex});
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Libro_Evento_Verano, 1), new Object[] {"hhh", "lpl", "ttt", 't', new ItemStack(Items.dye, 1, 10),'h',Clase_Principal_Evento_Verano.Hilo_de_algodon, 'l', Clase_Principal_Evento_Verano.Tapa_Libro, 'p', Clase_Principal_Evento_Verano.Pergamino});
    }
	
	
	public static void postinit() 
	{
		
	}

}
