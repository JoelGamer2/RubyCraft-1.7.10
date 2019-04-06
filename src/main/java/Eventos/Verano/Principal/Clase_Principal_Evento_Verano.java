package Eventos.Verano.Principal;

import Eventos.Navidad.Bloques.flor_de_las_montanas;
import Eventos.Verano.Items.Algodon;
import Eventos.Verano.Items.Libro_Evento_Verano;
import Eventos.Verano.Plantas.Planta_de_algodon;
import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Clase_Principal_Evento_Verano 
{
	
	//Bloques
	
	//Items
	
	public static Item Libro_Evento_Verano;
	
	public static Item Algodon;
	
	//Plantas
	
	public static Block Planta_de_algodon;
	
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
		Tab = RubyCraft.Rubycrafttab;
		
		//Bloques
		
		//Items
		
		Libro_Evento_Verano = new Libro_Evento_Verano().setUnlocalizedName("Libro_Evento_Verano").setTextureName(RubyCraft.modid+":Libro_Cerrado").setCreativeTab(Tab);
		GameRegistry.registerItem(Libro_Evento_Verano, Libro_Evento_Verano.getUnlocalizedName().substring(5));
		
		Algodon = new Algodon().setUnlocalizedName("Algodon").setTextureName(RubyCraft.modid+":Algodon").setCreativeTab(Tab);
		GameRegistry.registerItem(Algodon, Algodon.getUnlocalizedName().substring(5));
		
		//Plantas
		
		Planta_de_algodon = new Planta_de_algodon().setBlockName("Planta_de_algodon").setCreativeTab(Tab).setResistance(3.0F);
		GameRegistry.registerBlock(Planta_de_algodon, Planta_de_algodon.getUnlocalizedName().substring(5));
		Planta_de_algodon.setHarvestLevel("shovel", 2);
		
		//Semillas
		
		Semilla_Algodon = new ItemSeeds(Planta_de_algodon, Blocks.farmland).setUnlocalizedName("Semilla_Algodon").setTextureName(RubyCraft.modid+":Semilla_Algodon").setCreativeTab(Tab);
		GameRegistry.registerItem(Semilla_Algodon, Semilla_Algodon.getUnlocalizedName().substring(5));
		
		//Herramientas
		
		//Armas
		
		//Armaduras
	}
	
	public static void init() 
	{
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Libro_Evento_Verano, 1), new Object[] {"h",'h',Items.apple});
		GameRegistry.addRecipe(new ItemStack(Clase_Principal_Evento_Verano.Libro_Evento_Verano, 1), new Object[] {"h",'h',Clase_Principal_Evento_Verano.Libro_Evento_Verano,'p',Items.paper});
		
    }
	
	
	public static void postinit() 
	{
		
	}

}
