package Eventos.Verano.Principal;

import Eventos.Verano.Items.Libro_Evento_Verano;
import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Clase_Principal_Evento_Verano 
{
	
	//Bloques
	
	//Items
	
	public static Item Libro_Evento_Verano;
	
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
