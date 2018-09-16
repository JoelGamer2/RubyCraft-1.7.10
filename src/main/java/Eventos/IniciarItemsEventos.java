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
			herracraft.Espada_Demoniaca.setCreativeTab(herracraft.Herra);
			herracraft.Espada_Demoniaca.setCreativeTab(herracraft.Herra);
			herracraft.Casco_Demoniaco.setCreativeTab(herracraft.Herra);
			herracraft.Pechera_Demoniaca.setCreativeTab(herracraft.Herra);
			herracraft.Pantalones_Demoniacos.setCreativeTab(herracraft.Herra);
			herracraft. Botas_Demoniacas.setCreativeTab(herracraft.Herra);	
			herracraft.Bloque_Demoniaco.setCreativeTab(herracraft.Herra);
			herracraft.Guadaña_Tenebrosa.setCreativeTab(herracraft.Herra);
		}
	}
	
	
	
	public static void Crafteos() {
		
		
		if(RubyCraft.HalloWen) {
			GameRegistry.addRecipe(new ItemStack(herracraft.Bloque_Demoniaco, 1), new Object[] { "aaa","aaa","aaa",'a',herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Casco_Demoniaco, 1), new Object[]{"lll","l#l","###",'l',herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Pechera_Demoniaca, 1), new Object[]{"l#l","lll","lll",'l',herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Pantalones_Demoniacos, 1), new Object[]{"lll","l#l","l#l",'l',herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Botas_Demoniacas, 1), new Object[]{"###","l#l","l#l",'l', herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Bloque_Demoniaco, 1), new Object[]{"lll","lll","lll",'l', herracraft.Lingote_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Espada_Demoniaca, 1), new Object[]{"#b#","#b#","#p#",'b', herracraft.Bloque_Demoniaco, 'p', herracraft.Palos_de_blaze});
			GameRegistry.addRecipe(new ItemStack(herracraft.Generator_Boss, 1), new Object[]{"stp","wcw","pts",'s', herracraft.Esencia_monstruosa, 't', RubyCraft.Totem_de_la_no_muerte, 'p', RubyCraft.Bloque_de_Platino, 'w', herracraft.Espada_de_Wither, 'c', herracraft.Bloque_de_comando});
		}
		
		
		if(RubyCraft.Navidad) {
			
		}
		
	}
	
}
