package Eventos;

import HerraCraft.herracraft;
import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
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
			herracraft.Invocador_Celestial.setCreativeTab(RubyCraft.EventosTab);
			
		}else if(RubyCraft.Navidad) {
			
			herracraft.Invocador_Celestial.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Generator_Boss.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Fragmento_de_Hielo_Supercongelado.setCreativeTab(RubyCraft.EventosTab);
			herracraft.Hielo_Supercongelado.setCreativeTab(RubyCraft.EventosTab);

			
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
			GameRegistry.addShapelessRecipe(new ItemStack(herracraft.Lingote_Demoniaco, 9), new Object[]{herracraft.Bloque_Demoniaco});
			GameRegistry.addRecipe(new ItemStack(herracraft.Espada_Demoniaca, 1), new Object[]{"#b#","#b#","#p#",'b', herracraft.Bloque_Demoniaco, 'p', herracraft.Palos_de_blaze});
			GameRegistry.addRecipe(new ItemStack(herracraft.Generator_Boss, 1), new Object[]{"stz","wcw","zts",'s', herracraft.Esencia_monstruosa, 't', RubyCraft.Totem_de_la_no_muerte, 'z', RubyCraft.BloquedeZafiro, 'w', herracraft.Espada_de_Wither, 'c', herracraft.Bloque_de_comando});
			GameRegistry.addRecipe(new ItemStack(herracraft.Altar_de_Alejandro, 1), new Object[]{"nen","ede","nen",'n', Blocks.netherrack, 'e',Items.ender_pearl ,'d', Items.diamond});
		    GameRegistry.addRecipe(new ItemStack(herracraft.Altar_de_JoelGamer2, 1), new Object[]{"nrn","rgr","nrn",'n', Blocks.netherrack, 'r',Items.redstone, 'g', Items.gold_ingot});
		    GameRegistry.addRecipe(new ItemStack(herracraft.Invocador_Celestial, 1), new Object[] {"aaa","dmd","zzz",'a',herracraft.Azula,'d',Items.diamond,'z',RubyCraft.zafiro,'m',Items.flint_and_steel});
		}
		
		
		if(RubyCraft.Navidad) {
			
			GameRegistry.addRecipe(new ItemStack(Principal.vial_de_sangre_glaciar, 1), new Object[] {"eae","fcf","vvv",'e',Principal.esencia_de_los_hielos,'a',Principal.catalizador_de_esencias,'v',Principal.vial_de_sangre_de_hielo,'f',Principal.flor_de_las_nieves,'c',Principal.calavera_yeti});
			GameRegistry.addRecipe(new ItemStack(Principal.vial_de_sangre_del_pantano, 1), new Object[] {"eae","fcf","vvv",'e',Principal.esencia_del_pantano,'a',Principal.catalizador_de_esencias,'v',Principal.vial_de_sangre_del_pantano,'f',Principal.flor_del_Pantano,'c',Principal.calavera_troll});
			GameRegistry.addRecipe(new ItemStack(Principal.vial_de_sangre_rocosa, 1), new Object[] {"eae","fcf","vvv",'e',Principal.esencia_de_las_montanas,'a',Principal.catalizador_de_esencias,'v',Principal.vial_de_sangre_de_las_montanas,'f',Principal.flor_de_las_montanas,'c',Principal.calavera_gigante});
			GameRegistry.addRecipe(new ItemStack(Principal.vial_de_sangre_selvatica, 1), new Object[] {"eae","fcf","vvv",'e',Principal.esencia_del_bosque,'a',Principal.catalizador_de_esencias,'v',Principal.vial_de_sangre_del_bosque,'f',Principal.flor_del_bosque,'c',Principal.calavera_elfo});
           

			GameRegistry.addRecipe(new ItemStack(Principal.silex, 1), new Object[] {"s","b",'s',Blocks.cobblestone,'b',Blocks.gravel});
			GameRegistry.addRecipe(new ItemStack(Principal.roca_fosilizada_afilada, 1), new Object[] {"s","s",'s',Principal.Roca_Fosil});
			GameRegistry.addRecipe(new ItemStack(Principal.hueso_tallado, 1), new Object[] {"s","b",'s',Blocks.cobblestone,'b',Principal.hueso_fosilizado});
			
			GameRegistry.addRecipe(new ItemStack(Principal.punta_de_espada_de_silex, 1), new Object[] {"s","s",'s',Principal.silex});
			GameRegistry.addRecipe(new ItemStack(Principal.punta_de_espada_de_roca_fosilizada, 1), new Object[] {"s","s",'s',Principal.roca_fosilizada_afilada});
			GameRegistry.addRecipe(new ItemStack(Principal.punta_de_espada_de_hueso_fosilizado, 1), new Object[] {"s","s",'s',Principal.hueso_tallado});
			GameRegistry.addRecipe(new ItemStack(Principal.punta_de_espada_de_ambar, 1), new Object[] {"s","s",'s',Principal.ambar_endurecido});
            
			GameRegistry.addRecipe(new ItemStack(Principal.espada_de_arqueologo, 1), new Object[] {" e ","cmc"," p ",'e',Principal.punta_de_espada_de_silex,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.pico_de_arqueologo, 1), new Object[] {"sms"," c "," p ",'s',Principal.silex,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.hacha_de_arqueologo, 1), new Object[] {"sms"," cs"," p ",'s',Principal.silex,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.pala_de_arqueologo, 1), new Object[] {" s ","cmc"," p ",'s',Principal.silex,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
           
            GameRegistry.addRecipe(new ItemStack(Principal.espada_de_roca_fosilizada, 1), new Object[] {" e ","cmc"," p ",'e',Principal.punta_de_espada_de_roca_fosilizada,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.Pico_de_roca_fosilizada, 1), new Object[] {"sms"," c "," p ",'s',Principal.roca_fosilizada_afilada,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.hacha_de_roca_fosilizada, 1), new Object[] {"sms"," cs"," p ",'s',Principal.roca_fosilizada_afilada,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.pala_de_roca_fosilizada, 1), new Object[] {" s ","cmc"," p ",'s',Principal.roca_fosilizada_afilada,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            
            GameRegistry.addRecipe(new ItemStack(Principal.espada_de_hueso_fosilizado, 1), new Object[] {" e ","cmc"," p ",'e',Principal.punta_de_espada_de_hueso_fosilizado,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.pico_de_hueso_fosilizado, 1), new Object[] {"sms"," c "," p ",'s',Principal.hueso_tallado,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.hacha_de_hueso_fosilizado, 1), new Object[] {"sms"," cs"," p ",'s',Principal.hueso_tallado,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.pala_de_hueso_fosilizado, 1), new Object[] {" s ","cmc"," p ",'s',Principal.hueso_tallado,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            
            GameRegistry.addRecipe(new ItemStack(Principal.espada_de_ambar, 1), new Object[] {" e ","cmc"," p ",'e',Principal.punta_de_espada_de_ambar,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.pico_de_ambar, 1), new Object[] {"sms"," c "," p ",'s',Principal.ambar_endurecido,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.hacha_de_ambar, 1), new Object[] {"sms"," cs"," p ",'s',Principal.ambar_endurecido,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            GameRegistry.addRecipe(new ItemStack(Principal.pala_de_ambar, 1), new Object[] {" s ","cmc"," p ",'s',Principal.ambar_endurecido,'c',Principal.cuerda_trenzada,'p',Items.stick,'m', new ItemStack(Blocks.planks, 1, 5)});
            
            GameRegistry.addRecipe(new ItemStack(Principal.hilo_de_cuerda, 1), new Object[] {"h","h","h",'h',Items.string});
            GameRegistry.addRecipe(new ItemStack(Principal.cuerda, 3), new Object[] {"h","h","h",'h',Principal.hilo_de_cuerda});
            GameRegistry.addRecipe(new ItemStack(Principal.cuerda_trenzada, 3), new Object[] {"chc","hch","chc",'c',Principal.cuerda,'h',Principal.hilo_de_cuerda});
           
            GameRegistry.addRecipe(new ItemStack(Principal.diamante_activado, 1), new Object[] {" b ","hdm"," p ",'b',Principal.vial_de_sangre_del_bosque,'h',Principal.vial_de_sangre_de_hielo,'d',Items.diamond,'m',Principal.vial_de_sangre_de_las_montanas,'p',Principal.vial_de_sangre_del_pantano});
            GameRegistry.addRecipe(new ItemStack(Principal.catalizador_de_esencias, 1), new Object[] {" b ","hdm"," p ",'b',Principal.esencia_del_bosque,'h',Principal.esencia_de_los_hielos,'d',Principal.diamante_activado,'m',Principal.esencia_de_las_montanas,'p',Principal.esencia_del_pantano});
		
            GameRegistry.addRecipe(new ItemStack(Principal.polvo_de_diamante, 3), new Object[] {"h",'h',Items.diamond});
            GameRegistry.addRecipe(new ItemStack(Items.diamond, 1), new Object[] {"h  ","  h"," h ",'h',Principal.monton_de_polvo_de_diamante});
            GameRegistry.addSmelting(new ItemStack(Principal.monton_de_polvo_de_diamante, 1), new ItemStack(Items.diamond, 1), 10.0F);
            GameRegistry.addSmelting(Principal.ambar, new ItemStack(Principal.cubo_de_ambar_fundido, 1), 10.0F);
            GameRegistry.addRecipe(new ItemStack(Principal.cubo_de_ambar_con_diamante, 1), new Object[] {"ddd","dcd","ddd",'c',Principal.cubo_de_ambar_fundido,'d',Principal.polvo_de_diamante});
            GameRegistry.addSmelting(Principal.cubo_de_ambar_con_diamante, new ItemStack(Principal.cubo_de_ambar_endurecido, 1), 10.0F);
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_endurecido, 1), new Object[] {"c","a",'c',Principal.cubo_de_ambar_endurecido,'a',Items.water_bucket});
            
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_sangriento, 1), new Object[] {"pmh","hab","bpm",'a',Principal.ambar,'m',Principal.vial_de_sangre_de_las_montanas,'h',Principal.vial_de_sangre_de_hielo,'b',Principal.vial_de_sangre_del_bosque,'p',Principal.vial_de_sangre_del_pantano});
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_de_poder, 1), new Object[] {"pmh","hab","bpm",'a',Principal.ambar_sangriento,'m',Principal.vial_de_sangre_rocosa,'h',Principal.vial_de_sangre_glaciar,'b',Principal.vial_de_sangre_selvatica,'p',Principal.vial_de_sangre_cenagosa});
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_mistico, 1), new Object[] {"pmh","hab","bpm",'a',Principal.ambar_de_poder,'m',Principal.esencia_de_las_montanas,'h',Principal.esencia_de_los_hielos,'b',Principal.esencia_del_bosque,'p',Principal.esencia_del_pantano});
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_ancestral, 1), new Object[] {"eee","eae","eee",'a',Principal.ambar_mistico,'m',Principal.esencia_ancestral});
            GameRegistry.addRecipe(new ItemStack(Principal.bloque_de_ambar_ancestral, 1), new Object[] {"eee","e e","eee",'m',Principal.ambar_ancestral});
            GameRegistry.addSmelting(Principal.bloque_de_ambar_ancestral, new ItemStack(Principal.lingote_de_ambar_ancestral, 1), 10.0F);
		}
		
	}
	
}
