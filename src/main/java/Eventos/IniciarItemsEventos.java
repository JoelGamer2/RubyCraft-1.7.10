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
			RubyCraft.bossparca.setCreativeTab(RubyCraft.Rubycrafttab);
		}
	}
	
	
	
	public static void Crafteos() {
		
		
		if(RubyCraft.HalloWen) {
			GameRegistry.addRecipe(new ItemStack(herracraft.Generator_Boss, 1), new Object[] { "aaa","aaa","aaa",'a',herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Casco_Demoniaco, 1), new Object[]{"lll","l#l","###",'l',herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Pechera_Demoniaca, 1), new Object[]{"l#l","lll","lll",'l',herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Pantalones_Demoniacos, 1), new Object[]{"lll","l#l","l#l",'l',herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Botas_Demoniacas, 1), new Object[]{"###","l#l","l#l",'l', herracraft.Lingote_Demoniaco});
		}
		
		
		if(RubyCraft.Navidad) {
			
		}
		
	}
	
}
