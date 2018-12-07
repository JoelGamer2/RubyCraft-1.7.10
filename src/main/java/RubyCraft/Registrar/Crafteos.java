package RubyCraft.Registrar;

import HerraCraft.herracraft;
import RubyCraft.Escaleras_Principal;
import RubyCraft.RubyCraft;
import RubyCraft.Bases.Cementos_Bases;
import RubyCraft.Bases.Crafteos_Bases;
import RubyCraft.Integracion.Crafteos_InteGracion;
import RubyCraft.Registrar.Registros_Importantes.Registros;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafteos {
	
	public static void IniciarPrincipal(){
		
		MesaMineCraft();
		IniciarCrafteosMesadeRuby();
		IniciarCrafteosMesadeZafiro();
		IniciarCrafteosTransformadoraBloques();
		Crafteos_InteGracion.CrafteosInteGracionIniciar();
		
	}

	public static void MesaMineCraft(){
		//recetas con formas Mesa(MineCraft)
		GameRegistry.addRecipe(new ItemStack(RubyCraft.MesadeTrabajodeRuby, 1), new Object[]{"brb","rmr","brb",'b',RubyCraft.Bloquederuby,'r',RubyCraft.ruby,'m',Blocks.crafting_table});    	
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Bloque_de_Diamante_Trol, 1), new Object[]{"edr","dld","rde",'e', Items.ender_pearl,'d',Items.diamond,'r',Items.redstone,'l',Items.lava_bucket});
	    GameRegistry.addRecipe(new ItemStack(RubyCraft.amuleto, 1),new Object[]{" m ", "mcm", " m ", 'm', RubyCraft.Marcodelamuleto, 'c', RubyCraft.colores});
	    GameRegistry.addRecipe(new ItemStack(RubyCraft.Marcodelamuleto, 1), new Object[]{" b ","blb"," b ",'b', Blocks.gold_block, 'l', Items.gold_ingot});
	    GameRegistry.addRecipe(new ItemStack(RubyCraft.colores, 1), new Object[]{" l ","rdi"," u ",'d', Items.dye, 'r', Items.redstone, 'i', Items.iron_ingot, 'u', RubyCraft.uranio, 'l', Items.water_bucket});
	    GameRegistry.addRecipe(new ItemStack(RubyCraft.anillo, 1), new Object[]{" d ","o o"," o ",'d', Items.diamond,'o', Items.gold_ingot});
	    GameRegistry.addRecipe(new ItemStack(RubyCraft.Bloqueluminiscente, 1), new Object[]{" u ","upu"," u ",'u', RubyCraft.uranio, 'p', Items.glowstone_dust});
	    GameRegistry.addRecipe(new ItemStack(RubyCraft.Pandecalabaza, 1), new Object[]{"   ","tct","   ",'c', Items.pumpkin_seeds, 't', Items.wheat});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.paloverde, 4), new Object[]{"v","v",'v', RubyCraft.maderaverde}); 
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Granada_de_Uranio, 4), new Object[]{"tat","upu","tat", 'u', RubyCraft.uranio, 't', Blocks.tnt, 'p', Items.gunpowder, 'a', Blocks.sand});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Granada_de_Ruby, 4), new Object[]{"pap","rtr","pap",'p',Items.gunpowder,'r',RubyCraft.ruby,'a',Blocks.sand,'t',Blocks.tnt});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Bloque_del_nether_rojo, 1), new Object[] {"vl","lv",'l',Items.netherbrick,'v',Items.nether_wart});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Frutapurpur, 4), new Object[]{" t ","tmt"," t ", 'm', Items.apple, 't', new ItemStack(Items.dye, 1, 9)});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Bloque_de_Slime, 1), new Object[]{"sss","sss","sss",'s',Items.slime_ball});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Granada_de_Zafiro, 4), new Object[]{"tat","zpz","tat", 'z', RubyCraft.zafiro, 't', Blocks.tnt, 'p', Items.gunpowder, 'a', Blocks.sand});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Arco_de_Ruby, 1), new Object[]{" pr","p r"," pr", 'r', RubyCraft.ruby, 'p', Items.stick});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Arco_de_Zafiro, 1), new Object[]{" pz","p z"," pz", 'p', RubyCraft.paloverde, 'z', RubyCraft.zafiro});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.uranio, 2), new Object[]{"sr","rh", 's', Items.slime_ball, 'r', RubyCraft.ruby, 'h', Items.iron_ingot});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.CanciondeSansDisco, 1), new Object[]{"lhl","hrh","lhl",'l', new ItemStack(Blocks.wool, 1, 14), 'h', Items.iron_ingot, 'r', RubyCraft.ruby});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Granito_Pulido, 4), new Object[]{"gg","gg",'g',RubyCraft.Granito});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Andesita_Pulida, 4), new Object[]{"aa","aa",'a',RubyCraft.Andesita});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Diorita_Pulida, 4), new Object[]{"dd","dd",'d',RubyCraft.Diorita});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.cascodeUranio, 1), new Object[]{"uuu","u u",'u',RubyCraft.uranio});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.PetodeUranio, 1), new Object[]{"u u","uuu","uuu",'u',RubyCraft.uranio});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.PantacasdeUranio, 1), new Object[]{"uuu","u u","u u",'u',RubyCraft.uranio});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.botasdeUranio, 1), new Object[]{"u u","u u",'u',RubyCraft.uranio});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.varita, 1), new Object[]{" rr"," pr","p  ",'r',RubyCraft.ruby,'p',Items.stick});
    	GameRegistry.addRecipe(new ItemStack(Escaleras_Principal.Escalera_de_Mesa_de_Trabajo_de_Zafiro, 2), new Object[]{"rmr","dze","rmr",'r',RubyCraft.ruby,'m',Escaleras_Principal.Escalera_de_MaderaVerde,'e',Escaleras_Principal.Escalera_de_Ruby,'d',Escaleras_Principal.Escalera_de_Bloque_de_diamante_trol,'z',RubyCraft.zafiro});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.ruby, 1), new Object[]{"ppp","ppp","ppp",'p',RubyCraft.Pepita_de_Ruby});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.zafiro, 1), new Object[]{"ppp","ppp","ppp",'p',RubyCraft.Pepita_de_Zafiro});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.Ladrillo_de_Infrapiedra, 4), new Object[]{"nn","nn",'n', Blocks.netherrack});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Barras_de_Aluminio, 3), new Object[]{"aaa",'a', RubyCraft.Aluminio});
    	GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 1), new Object[]{"ppp","ppp","ppp",'p',RubyCraft.Pepita_de_Hierro});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Ladrillo_de_Granito, 4), new Object[]{"gg","gg",'g',RubyCraft.Granito_Pulido});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Ladrillo_de_Andesita, 4), new Object[]{"gg","gg",'g',RubyCraft.Andesita_Pulida});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Ladrillo_de_Diorita, 4), new Object[]{"gg","gg",'g',RubyCraft.Diorita_Pulida});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.obsidiana_que_llora, 1), new Object[]{" l ","lol"," l ",'l',new ItemStack(Items.dye, 1, 4), 'o',Blocks.obsidian});
    	GameRegistry.addRecipe(new ItemStack(RubyCraft.Palo_Morado, 4), new Object[]{"p","p","t",'p',Items.stick,'t',new ItemStack(Items.dye, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(RubyCraft.Tijera_de_ruby, 1), new Object[]{"o  "," o ",'o', RubyCraft.ruby});
		GameRegistry.addRecipe(new ItemStack(RubyCraft.Tijeras_de_zafiro, 1), new Object[]{"o  "," o ",'o', RubyCraft.zafiro});
	    GameRegistry.addRecipe(new ItemStack(RubyCraft.Bloque_de_Actualizaciones, 1), new Object[]{"oro","dcd","oro",'o', Items.gold_ingot,'r',Items.redstone,'d',Items.diamond,'c',Items.comparator});	
	    
		//Mesas de Trabajo Vanilla
        GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{"mm","mm",'m',new ItemStack(Blocks.planks, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.Mesa_de_trabajo_de_abeto, 1), new Object[]{"mm","mm",'m',new ItemStack(Blocks.planks, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.Mesa_de_trabajo_de_abedul, 1), new Object[]{"mm","mm",'m',new ItemStack(Blocks.planks, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.Mesa_de_trabajo_de_jungla, 1), new Object[]{"mm","mm",'m',new ItemStack(Blocks.planks, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.Mesa_de_trabajo_de_acacia, 1), new Object[]{"mm","mm",'m',new ItemStack(Blocks.planks, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(RubyCraft.Mesa_de_trabajo_de_roble_oscuro, 1), new Object[]{"mm","mm",'m',new ItemStack(Blocks.planks, 1, 5)});

    	//Crafteos Con Metedos
    	Crafteos_Bases.Bloques(Items.nether_wart, RubyCraft.Bloque_de_verruga);
    	Crafteos_Bases.Bloques_OreDictonary("ingotcopper", RubyCraft.Bloque_de_Cobre);
    	Crafteos_Bases.Bloques(Items.bone, RubyCraft.Bloque_de_hueso);
    	Crafteos_Bases.Bloques(RubyCraft.zafiro, RubyCraft.BloquedeZafiro);
    	Crafteos_Bases.Bloques(RubyCraft.uranio, RubyCraft.Bloquedeuranio);
    	Crafteos_Bases.Bloques(Items.flint, RubyCraft.Bloque_de_Pedernal);
    	Crafteos_Bases.Bloques(RubyCraft.ruby, RubyCraft.Bloquederuby);
    	Crafteos_Bases.Bloques(Items.ender_eye, RubyCraft.BloquedeOjodeEnder);
    	Crafteos_Bases.Bloques(Items.ender_pearl, RubyCraft.BloquedeEnderPearld);	
    	Crafteos_Bases.Bloques(RubyCraft.Platino, RubyCraft.Bloque_de_Platino);
    	Crafteos_Bases.Bloques(RubyCraft.Aluminio, RubyCraft.Bloque_de_Aluminio);
    	Crafteos_Bases.Bloques(RubyCraft.Lingote_Galactico, RubyCraft.Bloque_Galactico);   
    	Crafteos_Bases.Bloques(herracraft.Caca, RubyCraft.Bloquedecaca);
    	//Crafteo Cemento
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Negro, 0);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Rojo, 1);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Verde, 2);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Marron, 3);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Azul, 4);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Morado, 5);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Cyan, 6);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Gris, 7);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Gris_Oscuro, 8);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Rosa, 9);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Verde_Lima, 10);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Amarillo, 11);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Azul_Claro, 12);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Magnenta, 13);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Naranja, 14);
    	Crafteos_Bases.Crafteo_Polvo_de_Cemento(Cementos_Bases.Polvo_de_Cemento_Blanco, 15); 	
    	
    	Crafteos_Bases.Herramientas(RubyCraft.Cobre, RubyCraft.Palo_Morado, RubyCraft.Pico_de_cobre, RubyCraft.espada_de_cobre, RubyCraft.Hacha_de_cobre, RubyCraft.Pala_de_cobre, RubyCraft.Azada_de_cobre, RubyCraft.Tijeras_de_cobre);
    
    	
    	//Crafteo Bloque reforzado Tiers
    	Crafteos_Bases.Crafteo_Bloque_Reforzado(RubyCraft.Bloque_Reforzado_Tier_1, Blocks.stone);
    	Crafteos_Bases.Crafteo_Bloque_Reforzado(RubyCraft.Bloque_Reforzado_Tier_2, Blocks.diamond_block);
    	Crafteos_Bases.Crafteo_Bloque_Reforzado(RubyCraft.Bloque_Reforzado_Tier_3, RubyCraft.Bloquederuby);
    	Crafteos_Bases.Crafteo_Bloque_Reforzado(RubyCraft.Bloque_Reforzado_Tier_4, RubyCraft.BloquedeZafiro);
    	Crafteos_Bases.Crafteo_Bloque_Reforzado(RubyCraft.Bloque_Reforzado_Tier_5, RubyCraft.Bloque_de_Platino);
    	
        //Crafteos sin Formas Mesa(MineCraft)
    	
    	//DesCrafteos
        GameRegistry.addShapelessRecipe(new ItemStack(herracraft.Caca, 9), new Object[]{RubyCraft.Bloquedecaca});
        GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Pepita_de_Hierro, 9), new Object[]{Items.iron_ingot});
        GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Lingote_Galactico , 9), new Object[]{RubyCraft.Bloque_Galactico});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Cobre, 9), new Object[]{RubyCraft.Bloque_de_Cobre});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Aluminio, 9), new Object[]{RubyCraft.Bloque_de_Aluminio});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Platino, 9), new Object[]{RubyCraft.Bloque_de_Platino});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.uranio, 9), new Object[]{RubyCraft.Bloquedeuranio});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.ruby, 9), new Object[]{RubyCraft.Bloquederuby});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.nether_wart, 9), new Object[]{RubyCraft.Bloque_de_verruga});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.bone, 9), new Object[] {RubyCraft.Bloque_de_hueso});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod, 25), new Object[]{RubyCraft.Bloque_de_Blaze});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), new Object[]{RubyCraft.BloquedeEnderPearld});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_eye, 9), new Object[]{RubyCraft.BloquedeOjodeEnder});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Pepita_de_Ruby, 9), new Object[]{RubyCraft.ruby});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Pepita_de_Zafiro, 9), new Object[]{RubyCraft.zafiro});
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar, 4), new Object[]{RubyCraft.Bloque_de_azucar});
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.pumpkin, 2), new Object[]{RubyCraft.Calabaza_Espectral, RubyCraft.Calabaza_Espectral});
        
    	//Crafteos
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball, 9), new Object[]{RubyCraft.Bloque_de_Slime});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.SlimePistonNormal, 1), new Object[]{Blocks.piston});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.SlimePistonPegajoso, 1), new Object[]{Blocks.sticky_piston});
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.piston, 1), new Object[]{RubyCraft.SlimePistonNormal});
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sticky_piston, 1), new Object[]{RubyCraft.SlimePistonPegajoso});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Aluminio, 1), new Object[]{RubyCraft.Barras_de_Aluminio});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Ladrillo_de_piedra_del_end, 1), new Object[]{Blocks.end_stone,Blocks.end_stone,Blocks.end_stone,Blocks.end_stone});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Bloque_de_azucar, 1), new Object[]{Items.sugar,Items.sugar,Items.sugar,Items.sugar});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Cuarzo_azul, 4), new Object[]{Blocks.quartz_block,Blocks.quartz_block,Blocks.quartz_block,Blocks.quartz_block,Items.water_bucket});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Cuarzo_verde, 4), new Object[]{Blocks.quartz_block,Blocks.quartz_block,Blocks.quartz_block,Blocks.quartz_block,Blocks.cactus});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Cuarzo_rojo, 4), new Object[]{Blocks.quartz_block,Blocks.quartz_block,Blocks.quartz_block,Blocks.quartz_block,Items.redstone});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Ladrillo_de_obsidiana, 4), new Object[]{Blocks.obsidian,Blocks.obsidian,Blocks.obsidian,Blocks.obsidian});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.zafiro, 9), new Object[]{RubyCraft.BloquedeZafiro});
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.tronco_Azul, 1), new Object[]{Blocks.log,Items.water_bucket});
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Madera_Azul, 4), new Object[]{RubyCraft.tronco_Azul});
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.PilarPurpur, 4), new Object[]{RubyCraft.Bloquepurpur,RubyCraft.Bloquepurpur,RubyCraft.Bloquepurpur,RubyCraft.Bloquepurpur});
	    GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.BoladeResina, 9), new Object[]{Blocks.coal_block,Items.gold_nugget});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.maderaverde, 4), new Object[] {RubyCraft.troncoverde});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.troncoverde, 1), new Object[] {Blocks.log,Blocks.cactus});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.magma, 1), new Object[] {Items.magma_cream,Items.magma_cream,Items.magma_cream,Items.magma_cream});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.prismarina, 4), new Object[] {RubyCraft.fragmento_de_prismarina,RubyCraft.fragmento_de_prismarina,RubyCraft.fragmento_de_prismarina,RubyCraft.fragmento_de_prismarina});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Prismarina_oscura, 4), new Object[] {RubyCraft.prismarina,RubyCraft.prismarina});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Ladrillos_de_prismarina, 4), new Object[] {RubyCraft.prismarina,RubyCraft.prismarina,RubyCraft.prismarina,RubyCraft.prismarina});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.fragmento_de_prismarina, 2), new Object[] {Items.water_bucket,Blocks.stone});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.cristal_de_prismarina, 2), new Object[] {Blocks.glass,RubyCraft.fragmento_de_prismarina});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.linterna_de_mar, 4), new Object[] {Blocks.glowstone,RubyCraft.cristal_de_prismarina,Blocks.glass});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Bloquepurpur, 4), new Object[] {RubyCraft.frutapurpurcocinada,RubyCraft.frutapurpurcocinada,RubyCraft.frutapurpurcocinada,RubyCraft.frutapurpurcocinada});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Ladrillo_Marino, 4), new Object[]{Blocks.brick_block,Blocks.brick_block,Items.water_bucket,Items.water_bucket});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Ladrillo_del_Bosque, 4), new Object[]{Blocks.brick_block,Blocks.brick_block,Blocks.cactus,Blocks.cactus});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Bloque_de_veneno, 4), new Object[]{RubyCraft.magma,RubyCraft.magma,RubyCraft.magma,RubyCraft.magma,Items.poisonous_potato});
    	GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Bloque_de_Regeneracion, 4), new Object[]{RubyCraft.magma,RubyCraft.magma,RubyCraft.magma,RubyCraft.magma,Items.golden_apple});
        GameRegistry.addShapelessRecipe(new ItemStack(RubyCraft.Calabaza_Espectral, 2), new Object[]{Blocks.pumpkin, Blocks.pumpkin});
    	//Horno
    	
    	GameRegistry.addSmelting(RubyCraft.Frutapurpur, new ItemStack(RubyCraft.frutapurpurcocinada, 1), 10.0F);
    	GameRegistry.addSmelting(RubyCraft.BoladeResina, new ItemStack(RubyCraft.Plastico, 1), 10.0F);
    	GameRegistry.addSmelting(RubyCraft.Mena_de_Ruby, new ItemStack(RubyCraft.ruby, 1), 10.0F);
    	GameRegistry.addSmelting(RubyCraft.Mena_de_Zafiro, new ItemStack(RubyCraft.zafiro, 1), 10.0F);
    	GameRegistry.addSmelting(RubyCraft.Mena_de_Ruby_end, new ItemStack(RubyCraft.ruby, 1), 20.0F);
    	GameRegistry.addSmelting(RubyCraft.Mena_de_Zafiroend, new ItemStack(RubyCraft.zafiro, 1), 20.0F);
    	GameRegistry.addSmelting(RubyCraft.Mena_de_Cobre, new ItemStack(RubyCraft.Cobre, 1), 10.0F);
    	GameRegistry.addSmelting(RubyCraft.Mena_de_Platino, new ItemStack(RubyCraft.Platino, 1), 40.0F);
    	GameRegistry.addSmelting(RubyCraft.Mena_de_Aluminio, new ItemStack(RubyCraft.Aluminio, 1), 10.0F);
    	GameRegistry.addSmelting(Items.egg, new ItemStack(RubyCraft.Huevo_frito, 1), 10.0F);
    	
    	}
	public static void IniciarCrafteosMesadeRuby(){
		
		 Registros.addRecipeRuby(new ItemStack(RubyCraft.Bloque_de_Blaze, 1), new Object[]{"bbbbb","bbbbb","bbbbb","bbbbb","bbbbb",'b',Items.blaze_rod});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Cristal_Verde_Lima, 21), new Object[]{"vvvvv","vvtvv","vtvtv","vvtvv","vvvvv",'v',new ItemStack(Blocks.stained_glass,1,5),'t',new ItemStack(Items.dye,1,2)});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Cristal_azul_claro, 21), new Object[]{"aaaaa","aataa","atata","aataa","aaaaa",'a',new ItemStack(Blocks.stained_glass,1,3),'t',new ItemStack(Items.dye,1,12)});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Picoderuby, 1), new Object[]{"rrrrr","  p  ","  p  ","  p  ","  p  ",'r',RubyCraft.ruby,'p',Items.stick});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Hachaderuby, 1), new Object[]{" rr  "," rp  ","  p  ","  p  ","  p  ",'r',RubyCraft.ruby,'p',Items.stick});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Azadaderuby, 1), new Object[]{" rr  ","  p  ","  p  ","  p  ","  p  ",'r',RubyCraft.ruby,'p',Items.stick});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Paladeruby, 1), new Object[]{"  r  ","  p  ","  p  ","  p  ","  p  ",'r',RubyCraft.ruby,'p',Items.stick});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Espadaderuby, 1), new Object[]{"  r  ","  r  ","  r  ","  p  ","  p  ",'r',RubyCraft.ruby,'p',Items.stick});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Picodezafiro , 1), new Object[]{"zzzzz","  p  ","  p  ","  p  ","  p  ",'z',RubyCraft.zafiro,'p',RubyCraft.paloverde});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Hachadezafiro, 1), new Object[]{" zz  "," zp  ","  p  ","  p  ","  p  ",'z',RubyCraft.zafiro,'p',RubyCraft.paloverde});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Azadadezafiro, 1), new Object[]{" zz  ","  p  ","  p  ","  p  ","  p  ",'z',RubyCraft.zafiro,'p',RubyCraft.paloverde});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Paladezafiro, 1), new Object[]{"  z  ","  p  ","  p  ","  p  ","  p  ",'z',RubyCraft.zafiro,'p',RubyCraft.paloverde});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Espadadezafiro, 1), new Object[]{"  z  ","  z  ","  z  ","  p  ","  p  ",'z',RubyCraft.zafiro,'p',RubyCraft.paloverde});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Lampara_de_Ruby_Apagada, 10), new Object[]{"burub","uuluu","rlplr","uuluu","burub",'b',RubyCraft.Bloquederuby,'u',RubyCraft.uranio,'p',Blocks.redstone_lamp,'r',RubyCraft.ruby,'l',RubyCraft.Bloqueluminiscente});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.Mesa_de_Trabajo_de_Zafiro_Basica, 1), new Object[]{"zbbbz","bmmmb","bmdmb","bmmmb","zbbbz", 'z', RubyCraft.zafiro, 'm', Blocks.crafting_table, 'd', Items.diamond, 'b', RubyCraft.Bloquederuby});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.CascodeRuby, 1), new Object[]{"rrrrr","r   r","r   r",'r',RubyCraft.ruby});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.PetodeRuby, 1), new Object[]{"r   r","rrrrr","rrrrr","rrrrr","rrrrr",'r',RubyCraft.ruby});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.PantacasdeRuby, 1), new Object[]{"rrrrr","r   r","r   r","r   r","r   r",'r',RubyCraft.ruby});
         Registros.addRecipeRuby(new ItemStack(RubyCraft.botasdeRuby, 1), new Object[]{"r   r","r   r","rr rr",'r',RubyCraft.ruby});
         
        //Sin Forma
         Registros.addRecipeRuby(new ItemStack(RubyCraft.ruby, 9), new Object[]{"b",'b',RubyCraft.Bloquederuby});
       
         
	  }
    public static void IniciarCrafteosMesadeZafiro(){
    	
    	 Registros.addRecipeZafiro(new ItemStack(RubyCraft.Lampara_de_Zafiro_Apagada , 4), new Object[]{"zppz","rllr","rllr","zppz",'z',RubyCraft.zafiro,'p',Items.glowstone_dust,'r',Items.redstone,'l',Blocks.redstone_lamp});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Manzana_de_diamante, 1), new Object[]{"zodz","dmmo","ommd","zdoz",'z',RubyCraft.zafiro,'o',Items.golden_apple,'d',Items.diamond,'m',Items.apple});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Transformador_de_Losas_a_Bloques, 2), new Object[]{"prpr","rmmp","pmmr","rprp", 'r', new ItemStack(Blocks.stone_slab, 1, 3), 'p', new ItemStack(Blocks.stone_slab, 1, 5), 'm', Blocks.crafting_table});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.CascodeZafiro ,1), new Object[]{"zzz","z z",'z',RubyCraft.zafiro});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.PetodeZafiro ,1), new Object[]{"z z","zzz","zzz",'z',RubyCraft.zafiro});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.PantacasdeZafiro ,1), new Object[]{"zzz","z z","z z",'z',RubyCraft.zafiro});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.botasdeZafiro ,1), new Object[]{"z z","z z",'z',RubyCraft.zafiro});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Mesa_De_Conjuraciones, 1), new Object[]{"cppu","varv","vzav","uppc",'c',RubyCraft.Bloquedecaca,'p',RubyCraft.Plastico,'v',RubyCraft.varita,'a',RubyCraft.anillo,'u',RubyCraft.uranio,'z',RubyCraft.zafiro,'r',RubyCraft.ruby});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Cofre_de_Ruby, 2), new Object[]{"mrrm","rmcr","rcmr","mrrm",'m',RubyCraft.Moldes_para_cofres,'r',RubyCraft.ruby,'c',Blocks.chest});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Moldes_para_cofres, 2), new Object[]{"hpph","phcp","pchp","hpph",'h',Items.iron_ingot,'p',RubyCraft.Pepita_de_Hierro,'c',Blocks.chest});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.PetodePlatino, 1), new Object []{"b  b","bzzb","bppb","bppb",'b',RubyCraft.Bloque_de_Platino,'z',RubyCraft.BloquedeZafiro,'p',RubyCraft.Platino});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.pantacasdePlatino, 1), new Object[]{"bzzb","r  r","b  b","b  b",'b',RubyCraft.Bloque_de_Platino,'r',RubyCraft.Bloquederuby,'z',RubyCraft.BloquedeZafiro});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.cascodePlatino, 1), new Object[]{"bbbb","a  a","b  b","####",'b',RubyCraft.Bloque_de_Platino,'a',RubyCraft.amuleto});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.botasdePlatino, 1), new Object[]{"####","b  b","b  b","bpzb",'b',RubyCraft.Bloque_de_Platino,'z',RubyCraft.zafiro,'p',RubyCraft.Platino});    
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Pico_de_Platino, 1), new Object[] {"pppp"," vv "," vv "," vv ",'p',RubyCraft.Bloque_de_Platino,'v',RubyCraft.varita});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Espada_de_Platino, 1), new Object[] {"pp","pp","pp","vv",'v',RubyCraft.varita,'p',RubyCraft.Bloque_de_Platino});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Hacha_de_Platino, 1), new Object[] {" ppp"," vvp"," vv "," vv ",'v',RubyCraft.varita,'p',RubyCraft.Bloque_de_Platino});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Pala_de_Platino, 1), new Object[] {" pp "," vv "," vv "," vv ",'v',RubyCraft.varita,'p',RubyCraft.Bloque_de_Platino});
         Registros.addRecipeZafiro(new ItemStack(RubyCraft.Azada_de_Platino, 1), new Object[] {" ppp"," vv "," vv "," vv ",'v',RubyCraft.varita,'p',RubyCraft.Bloque_de_Platino});
         Registros.addShapelessRecipeZafiro(new ItemStack(RubyCraft.Tijeras_de_Platino, 1), new Object[] {RubyCraft.Bloque_de_Platino,RubyCraft.Bloque_de_Platino});

      }
    public static void IniciarCrafteosTransformadoraBloques(){
    	
    	Registros.addRecipeTransformador(new ItemStack(Blocks.stone, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 0), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.sandstone, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 1), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.cobblestone, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 3), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.brick_block, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 4), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.stonebrick, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 5), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.nether_brick, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 6), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.quartz_block, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 7), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 0), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 0), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 1), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 2), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 2), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 3), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 3), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 4), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 4), 'm', Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 5), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 5), 'm', Blocks.planks});
        //Lo mismo pero con el combustible(Carbón)
    	Registros.addRecipeTransformador(new ItemStack(Blocks.stone, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 0), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.sandstone, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 1), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.cobblestone, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 3), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.brick_block, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 4), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.stonebrick, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 5), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.nether_brick, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 6), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.quartz_block, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 7), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 0), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 0), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 1), new Object[]{"ll","mm",'l', new ItemStack(Blocks.stone_slab, 1, 1), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 2), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 2), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 3), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 3), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 4), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 4), 'm', Items.coal});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 1, 5), new Object[]{"ll","mm",'l', new ItemStack(Blocks.wooden_slab, 1, 5), 'm', Items.coal});
    	
    	
       }
    
      public static void IniciarCrafteosVersionTrol(){
    	
    	GameRegistry.addRecipe(new ItemStack(Blocks.planks, 4), new Object[]{"mm","mm",'m',Blocks.planks});
    	Registros.addRecipeRuby(new ItemStack(Blocks.planks, 4), new Object[]{"mm","mm",'m',Blocks.planks});
    	Registros.addRecipeZafiro(new ItemStack(Blocks.planks, 4), new Object[]{"mm","mm",'m',Blocks.planks});
    	Registros.addRecipeTransformador(new ItemStack(Blocks.planks, 4), new Object[]{"mm","mm",'m',Blocks.planks});
    	
    }
      
      public static void IniciarCrafteosNavidad(){
      }
      
      public static void IniciarCrafteosDiaHerobrine(){
    	  
      }
      
      public static void IniciarCrafteosDiadelosInocentes(){
    	  
      }
      
      public static void IniciarCrafteosHallowen(){
    	  
      }
    
}