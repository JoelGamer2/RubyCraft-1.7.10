package Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class IniciarItemsEventos {


	public static void Iniciartodo() 
	{
		Navidad();
		//Hallowen();
		Verano();
		Crafteos();
	}
	
	public static void Navidad() 
	{
		if(RubyCraft.Navidad) 
		{
			 Principal.altar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.altar_central.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Hielo_Glaciar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Hielo_Glaciar_Hueso.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Hielo_Glaciar_Adn.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Hielo_Glaciar_Ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Barro.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Barro_Congelado.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Barro_Congelado_Hueso.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Barro_Congelado_Adn.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Barro_Congelado_Ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Roca_Fosil.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Roca_Fosil_Hueso.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Roca_Fosil_Adn.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Roca_Fosil_Ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Madera_Fosil.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Madera_Fosil_Hueso.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Madera_Fosil_Adn.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Madera_Fosil_Ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.flor_de_las_nieves.setCreativeTab(RubyCraft.EventosTab);
			 Principal.flor_del_Pantano.setCreativeTab(RubyCraft.EventosTab);
			 Principal.flor_de_las_montanas.setCreativeTab(RubyCraft.EventosTab);
			 Principal.flor_del_bosque.setCreativeTab(RubyCraft.EventosTab);
			 Principal.piedra_ancestral.setCreativeTab(RubyCraft.EventosTab);	
			 Principal.bloque_de_ambar_ancestral.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pico_de_arqueologo.setCreativeTab(RubyCraft.EventosTab);
			 Principal.hacha_de_arqueologo.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pala_de_arqueologo.setCreativeTab(RubyCraft.EventosTab);
			 Principal.Pico_de_roca_fosilizada.setCreativeTab(RubyCraft.EventosTab);
			 Principal.hacha_de_roca_fosilizada.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pala_de_roca_fosilizada.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pico_de_hueso_fosilizado.setCreativeTab(RubyCraft.EventosTab);
			 Principal.hacha_de_hueso_fosilizado.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pala_de_hueso_fosilizado.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pico_de_ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.hacha_de_ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pala_de_ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.espada_de_arqueologo.setCreativeTab(RubyCraft.EventosTab);
			 Principal.espada_de_roca_fosilizada.setCreativeTab(RubyCraft.EventosTab);
			 Principal.espada_de_hueso_fosilizado.setCreativeTab(RubyCraft.EventosTab);
			 Principal.espada_de_ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.espada_ancestral.setCreativeTab(RubyCraft.EventosTab);
		     Principal.mango_de_herramientas.setCreativeTab(RubyCraft.EventosTab);
			 Principal.ambar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.vial_de_sangre_de_hielo.setCreativeTab(RubyCraft.EventosTab);
			 Principal.vial_de_sangre_glaciar.setCreativeTab(RubyCraft.EventosTab);
			 Principal.vial_de_sangre_del_pantano.setCreativeTab(RubyCraft.EventosTab);
			 Principal.vial_de_sangre_cenagosa.setCreativeTab(RubyCraft.EventosTab);
			 Principal.vial_de_sangre_de_las_montanas.setCreativeTab(RubyCraft.EventosTab);
			 Principal.vial_de_sangre_rocosa.setCreativeTab(RubyCraft.EventosTab);
			 Principal.vial_de_sangre_del_bosque.setCreativeTab(RubyCraft.EventosTab);
			 Principal.vial_de_sangre_selvatica.setCreativeTab(RubyCraft.EventosTab);
			 Principal.hueso_fosilizado.setCreativeTab(RubyCraft.EventosTab);	
			 Principal.calavera_yeti.setCreativeTab(RubyCraft.EventosTab);
			 Principal.calavera_troll.setCreativeTab(RubyCraft.EventosTab);
			 Principal.calavera_gigante.setCreativeTab(RubyCraft.EventosTab);
			 Principal.calavera_elfo.setCreativeTab(RubyCraft.EventosTab);
			 Principal.esencia_de_los_hielos.setCreativeTab(RubyCraft.EventosTab);
			 Principal.esencia_del_pantano.setCreativeTab(RubyCraft.EventosTab);
			 Principal.esencia_de_las_montanas.setCreativeTab(RubyCraft.EventosTab);
			 Principal.esencia_del_bosque.setCreativeTab(RubyCraft.EventosTab);
			 Principal.esencia_ancestral.setCreativeTab(RubyCraft.EventosTab);
			 Principal.diamante_activado.setCreativeTab(RubyCraft.EventosTab);
			 Principal.catalizador_de_esencias.setCreativeTab(RubyCraft.EventosTab);
			 Principal.silex.setCreativeTab(RubyCraft.EventosTab);
			 Principal.roca_fosilizada_afilada.setCreativeTab(RubyCraft.EventosTab);
			 Principal.hueso_tallado.setCreativeTab(RubyCraft.EventosTab);
			 Principal.polvo_de_diamante.setCreativeTab(RubyCraft.EventosTab);
			 Principal.cubo_de_ambar_fundido.setCreativeTab(RubyCraft.EventosTab);
			 Principal.cubo_de_ambar_con_diamante.setCreativeTab(RubyCraft.EventosTab);
			 Principal.cubo_de_ambar_endurecido.setCreativeTab(RubyCraft.EventosTab);
			 Principal.ambar_endurecido.setCreativeTab(RubyCraft.EventosTab);
			 Principal.monton_de_polvo_de_diamante.setCreativeTab(RubyCraft.EventosTab);
			 Principal.hilo_de_cuerda.setCreativeTab(RubyCraft.EventosTab);
			 Principal.cuerda.setCreativeTab(RubyCraft.EventosTab);
			 Principal.cuerda_trenzada.setCreativeTab(RubyCraft.EventosTab);
			 Principal.mango_de_espada.setCreativeTab(RubyCraft.EventosTab);
			 Principal.punta_de_espada_de_silex.setCreativeTab(RubyCraft.EventosTab);
			 Principal.punta_de_espada_de_roca_fosilizada.setCreativeTab(RubyCraft.EventosTab);
			 Principal.punta_de_espada_de_hueso_fosilizado.setCreativeTab(RubyCraft.EventosTab);
			 Principal.punta_de_espada_de_ambar.setCreativeTab(RubyCraft.EventosTab);	
			 Principal.ambar_sangriento.setCreativeTab(RubyCraft.EventosTab);
			 Principal.ambar_de_poder.setCreativeTab(RubyCraft.EventosTab);
			 Principal.ambar_mistico.setCreativeTab(RubyCraft.EventosTab);
			 Principal.ambar_ancestral.setCreativeTab(RubyCraft.EventosTab);
			 Principal.lingote_de_ambar_ancestral.setCreativeTab(RubyCraft.EventosTab);
			 Principal.piedra_ancestral_sangrienta.setCreativeTab(RubyCraft.EventosTab);
			 Principal.piedra_ancestral_de_poder.setCreativeTab(RubyCraft.EventosTab);
			 Principal.piedra_ancestral_esencial.setCreativeTab(RubyCraft.EventosTab);
			 Principal.piedra_ancestral_poseida.setCreativeTab(RubyCraft.EventosTab);
			 Principal.diamante_de_poder.setCreativeTab(RubyCraft.EventosTab);
			 Principal.casco_ancestral.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pechera_ancestral.setCreativeTab(RubyCraft.EventosTab);
			 Principal.pantalones_ancestrales.setCreativeTab(RubyCraft.EventosTab);
			 Principal.botas_ancestrales.setCreativeTab(RubyCraft.EventosTab);
			 Principal.sangre_ancestral.setCreativeTab(RubyCraft.EventosTab);
		}
	}
	
	
	/*public static void Hallowen()                  ay que volver a hacer el evento de hallowen
	{
		if(RubyCraft.HalloWen) 
		{
			
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
		}
	}*/
	//POR SI NO SE CAMBIA LA TAB
	public static void Verano_PostInit() {
		
	}
	
	public static void Verano() 
	{
		if(RubyCraft.Verano) 
		{
			  
			
		}
	}
	
	public static void Crafteos() 
	{
		if(RubyCraft.Verano) 
        {
			/**Clase_Principal_Evento_Verano.Aguamarina.setCreativeTab(RubyCraft.EventosTab);
		    Clase_Principal_Evento_Verano.Documento_Perdido.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Cuero_Curtido.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Tablilla.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Pergamino.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Tapa_Libro.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Libro_Evento_Verano.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Algodon.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Hilo_de_algodon.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Vendaje.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Silex.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_Azul.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_Amarilla.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_Verde.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_AzulOscuro.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_Transparente.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Hierro_Fundido.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Hierro_Fundido_con_Carbon.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Acero_Fundido.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Lingote_de_Acero.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Azul.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Amarilla.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Verde.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_AzulOscuro.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Acero_Fundido_con_Aguamarina_Transparente.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_Azul_Fundida.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_Amarilla_Fundida.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_Verde_Fundida.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_AzulOscuro_Fundida.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Aguamarina_Transparente_Fundida.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Azul.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Amarilla.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Verde.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_AzulOscuro.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Lingote_de_Aguamarina_Transparente.setCreativeTab(RubyCraft.EventosTab);	
			//Plantas
			Clase_Principal_Evento_Verano.Planta_de_algodon.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Algodon_Salvaje.setCreativeTab(RubyCraft.EventosTab);
			//Semillas
			Clase_Principal_Evento_Verano.Semilla_Algodon.setCreativeTab(RubyCraft.EventosTab);
			//Herramientas
		    Clase_Principal_Evento_Verano.Pico_de_acero.setCreativeTab(RubyCraft.EventosTab);
			//Armas
			Clase_Principal_Evento_Verano.Espada_de_Aguamarina_Azul.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Espada_de_Aguamarina_Amarilla.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Espada_de_Aguamarina_Verde.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Espada_de_Aguamarina_AzulOscuro.setCreativeTab(RubyCraft.EventosTab);
			Clase_Principal_Evento_Verano.Espada_de_Aguamarina_Transparente.setCreativeTab(RubyCraft.EventosTab);**/
		}
		
		/*if(RubyCraft.HalloWen) 
		{
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
		}*/
		
		
		if(RubyCraft.Navidad) 
		{
			
			GameRegistry.addRecipe(new ItemStack(Principal.mango_de_herramientas, 1), new Object[] {" m "," m ","mmm",'m', new ItemStack(Blocks.planks, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Principal.mango_de_espada, 1), new Object[] {"idi"," m ",'m', Principal.mango_de_herramientas,'i',Items.iron_ingot,'d',Items.diamond});
			
			GameRegistry.addRecipe(new ItemStack(Principal.vial_de_sangre_glaciar, 1), new Object[] {"eae","fcf","vvv",'e',Principal.esencia_de_los_hielos,'a',Principal.catalizador_de_esencias,'v',Principal.vial_de_sangre_de_hielo,'f',Principal.flor_de_las_nieves,'c',Principal.calavera_yeti});
			GameRegistry.addRecipe(new ItemStack(Principal.vial_de_sangre_cenagosa, 1), new Object[] {"eae","fcf","vvv",'e',Principal.esencia_del_pantano,'a',Principal.catalizador_de_esencias,'v',Principal.vial_de_sangre_del_pantano,'f',Principal.flor_del_Pantano,'c',Principal.calavera_troll});
			GameRegistry.addRecipe(new ItemStack(Principal.vial_de_sangre_rocosa, 1), new Object[] {"eae","fcf","vvv",'e',Principal.esencia_de_las_montanas,'a',Principal.catalizador_de_esencias,'v',Principal.vial_de_sangre_de_las_montanas,'f',Principal.flor_de_las_montanas,'c',Principal.calavera_gigante});
			GameRegistry.addRecipe(new ItemStack(Principal.vial_de_sangre_selvatica, 1), new Object[] {"eae","fcf","vvv",'e',Principal.esencia_del_bosque,'a',Principal.catalizador_de_esencias,'v',Principal.vial_de_sangre_del_bosque,'f',Principal.flor_del_bosque,'c',Principal.calavera_elfo});
        

			GameRegistry.addRecipe(new ItemStack(Principal.silex, 1), new Object[] {"s","b",'s',Blocks.cobblestone,'b',Blocks.gravel});
			GameRegistry.addRecipe(new ItemStack(Principal.roca_fosilizada_afilada, 1), new Object[] {"s","s",'s',Principal.Roca_Fosil});
			GameRegistry.addRecipe(new ItemStack(Principal.hueso_tallado, 1), new Object[] {"s","b",'s',Blocks.cobblestone,'b',Principal.hueso_fosilizado});
			
			GameRegistry.addRecipe(new ItemStack(Principal.punta_de_espada_de_silex, 1), new Object[] {"s","s",'s',Principal.silex});
			GameRegistry.addRecipe(new ItemStack(Principal.punta_de_espada_de_roca_fosilizada, 1), new Object[] {"s","s",'s',Principal.roca_fosilizada_afilada});
			GameRegistry.addRecipe(new ItemStack(Principal.punta_de_espada_de_hueso_fosilizado, 1), new Object[] {"s","s",'s',Principal.hueso_tallado});
			GameRegistry.addRecipe(new ItemStack(Principal.punta_de_espada_de_ambar, 1), new Object[] {"s","s",'s',Principal.ambar_endurecido});
            
			GameRegistry.addRecipe(new ItemStack(Principal.espada_de_arqueologo, 1), new Object[] {"cec"," p ",'e',Principal.punta_de_espada_de_silex,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_espada});
            GameRegistry.addRecipe(new ItemStack(Principal.pico_de_arqueologo, 1), new Object[] {"sss"," c "," p ",'s',Principal.silex,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            GameRegistry.addRecipe(new ItemStack(Principal.hacha_de_arqueologo, 1), new Object[] {" ss"," cs"," p ",'s',Principal.silex,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            GameRegistry.addRecipe(new ItemStack(Principal.pala_de_arqueologo, 1), new Object[] {" s ","cpc",'s',Principal.silex,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
           
            GameRegistry.addRecipe(new ItemStack(Principal.espada_de_roca_fosilizada, 1), new Object[] {"cec"," p ",'e',Principal.punta_de_espada_de_roca_fosilizada,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_espada});
            GameRegistry.addRecipe(new ItemStack(Principal.Pico_de_roca_fosilizada, 1), new Object[] {"sss"," c "," p ",'s',Principal.roca_fosilizada_afilada,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            GameRegistry.addRecipe(new ItemStack(Principal.hacha_de_roca_fosilizada, 1), new Object[] {" ss"," cs"," p ",'s',Principal.roca_fosilizada_afilada,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            GameRegistry.addRecipe(new ItemStack(Principal.pala_de_roca_fosilizada, 1), new Object[] {" s ","cpc",'s',Principal.roca_fosilizada_afilada,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            
            GameRegistry.addRecipe(new ItemStack(Principal.espada_de_hueso_fosilizado, 1), new Object[] {"cec"," p ",'e',Principal.punta_de_espada_de_hueso_fosilizado,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_espada});
            GameRegistry.addRecipe(new ItemStack(Principal.pico_de_hueso_fosilizado, 1), new Object[] {"sss"," c "," p ",'s',Principal.hueso_tallado,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            GameRegistry.addRecipe(new ItemStack(Principal.hacha_de_hueso_fosilizado, 1), new Object[] {" ss"," cs"," p ",'s',Principal.hueso_tallado,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            GameRegistry.addRecipe(new ItemStack(Principal.pala_de_hueso_fosilizado, 1), new Object[] {" s ","cpc",'s',Principal.hueso_tallado,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            
            GameRegistry.addRecipe(new ItemStack(Principal.espada_de_ambar, 1), new Object[] {"cec"," p ",'e',Principal.punta_de_espada_de_ambar,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_espada});
            GameRegistry.addRecipe(new ItemStack(Principal.pico_de_ambar, 1), new Object[] {"sss"," c "," p ",'s',Principal.ambar_endurecido,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            GameRegistry.addRecipe(new ItemStack(Principal.hacha_de_ambar, 1), new Object[] {" ss"," cs"," p ",'s',Principal.ambar_endurecido,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            GameRegistry.addRecipe(new ItemStack(Principal.pala_de_ambar, 1), new Object[] {" s ","cpc",'s',Principal.ambar_endurecido,'c',Principal.cuerda_trenzada,'p',Principal.mango_de_herramientas});
            
            GameRegistry.addRecipe(new ItemStack(Principal.hilo_de_cuerda, 1), new Object[] {"h","h","h",'h',Items.string});
            GameRegistry.addRecipe(new ItemStack(Principal.cuerda, 3), new Object[] {"h","h","h",'h',Principal.hilo_de_cuerda});
            GameRegistry.addRecipe(new ItemStack(Principal.cuerda_trenzada, 3), new Object[] {"chc","hch","chc",'c',Principal.cuerda,'h',Principal.hilo_de_cuerda});
           
            GameRegistry.addRecipe(new ItemStack(Principal.diamante_activado, 1), new Object[] {" b ","hdm"," p ",'b',Principal.vial_de_sangre_del_bosque,'h',Principal.vial_de_sangre_de_hielo,'d',Items.diamond,'m',Principal.vial_de_sangre_de_las_montanas,'p',Principal.vial_de_sangre_del_pantano});
            GameRegistry.addRecipe(new ItemStack(Principal.diamante_de_poder, 1), new Object[] {" b ","hdm"," p ",'b',Principal.vial_de_sangre_selvatica,'h',Principal.vial_de_sangre_glaciar,'d',Principal.diamante_activado,'m',Principal.vial_de_sangre_rocosa,'p',Principal.vial_de_sangre_cenagosa});
            GameRegistry.addRecipe(new ItemStack(Principal.catalizador_de_esencias, 1), new Object[] {" b ","hdm"," p ",'b',Principal.esencia_del_bosque,'h',Principal.esencia_de_los_hielos,'d',Principal.diamante_activado,'m',Principal.esencia_de_las_montanas,'p',Principal.esencia_del_pantano});
		
            GameRegistry.addRecipe(new ItemStack(Principal.polvo_de_diamante, 3), new Object[] {"h",'h',Items.diamond});
            GameRegistry.addRecipe(new ItemStack(Items.diamond, 1), new Object[] {"h h"," h ",'h',Principal.monton_de_polvo_de_diamante});
            GameRegistry.addRecipe(new ItemStack(Principal.monton_de_polvo_de_diamante, 1), new Object[] {"h h"," h ",'h',Principal.polvo_de_diamante});
            GameRegistry.addSmelting(new ItemStack(Principal.monton_de_polvo_de_diamante, 1), new ItemStack(Items.diamond, 1), 10.0F);
            GameRegistry.addSmelting(Principal.ambar, new ItemStack(Principal.cubo_de_ambar_fundido, 1), 10.0F);
            GameRegistry.addRecipe(new ItemStack(Principal.cubo_de_ambar_con_diamante, 1), new Object[] {"ddd","dcd","ddd",'c',Principal.cubo_de_ambar_fundido,'d',Principal.polvo_de_diamante});
            GameRegistry.addSmelting(Principal.cubo_de_ambar_con_diamante, new ItemStack(Principal.cubo_de_ambar_endurecido, 1), 10.0F);
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_endurecido, 1), new Object[] {"c","a",'c',Principal.cubo_de_ambar_endurecido,'a',Items.water_bucket});
            
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_sangriento, 1), new Object[] {"pmh","hab","bpm",'a',Principal.ambar,'m',Principal.vial_de_sangre_de_las_montanas,'h',Principal.vial_de_sangre_de_hielo,'b',Principal.vial_de_sangre_del_bosque,'p',Principal.vial_de_sangre_del_pantano});
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_de_poder, 1), new Object[] {"pmh","hab","bpm",'a',Principal.ambar_sangriento,'m',Principal.vial_de_sangre_rocosa,'h',Principal.vial_de_sangre_glaciar,'b',Principal.vial_de_sangre_selvatica,'p',Principal.vial_de_sangre_cenagosa});
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_mistico, 1), new Object[] {"pmh","hab","bpm",'a',Principal.ambar_de_poder,'m',Principal.esencia_de_las_montanas,'h',Principal.esencia_de_los_hielos,'b',Principal.esencia_del_bosque,'p',Principal.esencia_del_pantano});
            GameRegistry.addRecipe(new ItemStack(Principal.ambar_ancestral, 1), new Object[] {"eee","eae","eee",'a',Principal.ambar_mistico,'e',Principal.esencia_ancestral});
            GameRegistry.addRecipe(new ItemStack(Principal.bloque_de_ambar_ancestral, 1), new Object[] {"eee","e e","eee",'e',Principal.ambar_ancestral});
            GameRegistry.addSmelting(Principal.bloque_de_ambar_ancestral, new ItemStack(Principal.lingote_de_ambar_ancestral, 1), 10.0F);
            
            GameRegistry.addRecipe(new ItemStack(Principal.espada_ancestral, 1), new Object[] {" a "," a "," p ",'a',Principal.lingote_de_ambar_ancestral,'p',Principal.mango_de_espada});
            
            GameRegistry.addRecipe(new ItemStack(Principal.piedra_ancestral_sangrienta, 1), new Object[] {"pmh","hab","bpm",'a',Principal.piedra_ancestral,'m',Principal.vial_de_sangre_de_las_montanas,'h',Principal.vial_de_sangre_de_hielo,'b',Principal.vial_de_sangre_del_bosque,'p',Principal.vial_de_sangre_del_pantano});
            GameRegistry.addRecipe(new ItemStack(Principal.piedra_ancestral_de_poder, 1), new Object[] {"pmh","hab","bpm",'a',Principal.piedra_ancestral_sangrienta,'m',Principal.vial_de_sangre_rocosa,'h',Principal.vial_de_sangre_glaciar,'b',Principal.vial_de_sangre_selvatica,'p',Principal.vial_de_sangre_cenagosa});
            GameRegistry.addRecipe(new ItemStack(Principal.piedra_ancestral_esencial, 1), new Object[] {"pmh","hab","bpm",'a',Principal.piedra_ancestral_de_poder,'m',Principal.esencia_de_las_montanas,'h',Principal.esencia_de_los_hielos,'b',Principal.esencia_del_bosque,'p',Principal.esencia_del_pantano});
            GameRegistry.addRecipe(new ItemStack(Principal.piedra_ancestral_poseida, 1), new Object[] {"pmh","hab","bpm",'a',Principal.piedra_ancestral_esencial,'m',Principal.calavera_gigante,'h',Principal.calavera_yeti,'b',Principal.calavera_elfo,'p',Principal.calavera_troll});
            GameRegistry.addRecipe(new ItemStack(Principal.altar, 1), new Object[] {"ppp","dpd","ppp",'p',Principal.piedra_ancestral_poseida,'d',Principal.diamante_activado});
            GameRegistry.addRecipe(new ItemStack(Principal.altar_central, 1), new Object[] {"pap","dpd","ppp",'p',Principal.piedra_ancestral_poseida,'a',Principal.diamante_activado,'d',Principal.diamante_de_poder});
		    
            GameRegistry.addRecipe(new ItemStack(Principal.casco_ancestral, 1), new Object[] {"bbb","bab",'a',Items.diamond_helmet,'b',Principal.bloque_de_ambar_ancestral});
            GameRegistry.addRecipe(new ItemStack(Principal.pechera_ancestral, 1), new Object[] {"bab","bbb","bbb",'a',Items.diamond_chestplate,'b',Principal.bloque_de_ambar_ancestral});
            GameRegistry.addRecipe(new ItemStack(Principal.pantalones_ancestrales, 1), new Object[] {"bbb","bab","b b",'a',Items.diamond_leggings,'b',Principal.bloque_de_ambar_ancestral});
            GameRegistry.addRecipe(new ItemStack(Principal.botas_ancestrales, 1), new Object[] {"b b","bab",'a',Items.diamond_boots,'b',Principal.bloque_de_ambar_ancestral});

            GameRegistry.addRecipe(new ItemStack(Principal.sangre_ancestral, 1), new Object[] {"ymg","hlb","tpe",'l',Principal.lingote_de_ambar_ancestral,'m',Principal.vial_de_sangre_rocosa,'h',Principal.vial_de_sangre_glaciar,'b',Principal.vial_de_sangre_selvatica,'p',Principal.vial_de_sangre_cenagosa,'y',Principal.calavera_yeti,'g',Principal.calavera_gigante,'t',Principal.calavera_troll,'e',Principal.calavera_elfo});
		}
		
	}
	
}
