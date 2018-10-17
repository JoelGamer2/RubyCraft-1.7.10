package Eventos;

import HerraCraft.herracraft;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
			
			herracraft.Lingote_Demoniaco.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Generator_Boss.setCreativeTab(RubyCraft.EventosTab);
			RubyCraft.bossparca.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Espada_Demoniaca.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Espada_Demoniaca.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Casco_Demoniaco.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Pechera_Demoniaca.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Pantalones_Demoniacos.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Botas_Demoniacas.setCreativeTab(RubyCraft.EventosTab);	
			herracraft.Bloque_Demoniaco.setCreativeTab(RubyCraft.EventosTab);
			herracraft.guadana_Tenebrosa.setCreativeTab(RubyCraft.EventosTab);	
			herracraft.Altar_de_JoelGamer2.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Iratxe.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Alejandro.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Wither_Storm.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Sans.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Miguelperez.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Herobrine.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Entity303.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Jeb.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Lick.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Altar_de_Noch.setCreativeTab(RubyCraft.EventosTab);
			
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
			GameRegistry.addRecipe(new ItemStack(herracraft.Generator_Boss, 1), new Object[]{"stz","wcw","zts",'s', herracraft.Esencia_monstruosa, 't', RubyCraft.Totem_de_la_no_muerte, 'z', RubyCraft.BloquedeZafiro, 'w', herracraft.Espada_de_Wither, 'c', herracraft.Bloque_de_comando});
			GameRegistry.addRecipe(new ItemStack(herracraft.Altar_de_Alejandro, 1), new Object[]{"nen","ede","nen",'n', Blocks.netherrack, 'e',Items.ender_pearl ,'d', Items.diamond});
		    GameRegistry.addRecipe(new ItemStack(herracraft.Altar_de_JoelGamer2, 1), new Object[]{"nrn","rgr","nrn",'n', Blocks.netherrack, 'r',Items.redstone, 'g', Items.gold_ingot});
		    GameRegistry.addRecipe(new ItemStack(herracraft.Invocador_Celestial, 1), new Object[] {"aaa","dmd","zzz",'a',herracraft.Azula,'d',Items.diamond,'z',RubyCraft.zafiro,'m',Items.flint_and_steel});
		}
		
		
		if(RubyCraft.Navidad) {
			
		}
		
	}
	
}
