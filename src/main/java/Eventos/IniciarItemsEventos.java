package Eventos;

import HerraCraft.herracraft;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class IniciarItemsEventos {

	
	public static void Iniciartodo() {
		Navidad();
		Hallowen();
		Crafteos();
	}
	
	public static void Navidad() {
		if(RubyCraft.Navidad) {
			
		}
		
	}
	
	
	public static void Hallowen() {
		if(RubyCraft.HalloWen) {
			
			herracraft.Lingote_Demoniaco.setCreativeTab(herracraft.Herra);
			herracraft.Generator_Boss.setCreativeTab(herracraft.Herra);
			
		}
	}
	
	
	
	public static void Crafteos() {
		
		if(RubyCraft.HalloWen) {
			GameRegistry.addRecipe(new ItemStack(herracraft.Generator_Boss, 1), new Object[] { "aaa","aaa","aaa",'a',herracraft.Lingote_Demoniaco});
		}
		
		
		if(RubyCraft.Navidad) {
			
		}
		
	}
	
}
