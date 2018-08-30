package HerraCraft;


import HerraCraft.ConectarWebs.Ver_Dias_de_salida_Elder_ways;
import HerraCraft.Dropeos.Dropeos_Handler;
import HerraCraft.Registrar.Eventos;
import HerraCraft.Registrar.Mesas;
import HerraCraft.Registrar.Regitrar_Entidades;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;



public class herracraft{
	
		
	//Bloques declarados
	public static Block Bloque_de_Plastico;
	public static Block Magma_Acuatico;
	public static Block Barrera;
    public static Block Almacen_de_energia;
    public static Block Cristal_de_ovni;
    public static Block Bloque_de_comando;
    public static Block Corazon_de_Redstone;
    public static Block Diorita;
    public static Block Bloque_de_ovni_camuflaje;
    public static Block Bloque_de_Ovni;
    public static Block Bloque_de_metal;
    public static Block Cristal_invisible;
    public static Block Mena_de_Azula;
    public static Block Bloque_de_Slime;
    public static Block Mesa_de_Azula;
    public static Block Piedra_base;
    public static Block Bloque_de_Azucar;
    public static Block Bloque_de_Enderpearl;
    public static Block Ordenador;
    public static Block Altar_de_JoelGamer2;
    public static Block Altar_de_Iratxe;
    public static Block Altar_de_Alejandro;
    public static Block Altar_de_Wither_Storm;
    public static Block Caja_de_Pastillas;
    public static Block Altar_de_Sans;
    public static Block Altar_de_Miguelperez;
    public static Block Bloque_Invisible;
    public static Block Bloque_de_Losa;
    public static Block Bloque_De_Estrella_Del_Wither;
    
    public static final int guiIDMesadeAzula = 10;/**Cambia el puto numeroooooooooooo¡¡¡¡¡¡ cuando hagas otra¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡**/
	//Items declarados
    public static Item Azula;
    public static Item Caca;
    public static Item Metal;
    public static Item Plastico;
    public static Item Dolares;
    public static Item Nucleo_de_ovni;
    public static Item Palos_de_blaze;
    public static Item Plutonio;
    public static Item Vapor_de_electrones;
    public static Item Crash;
    public static Item Fluido_de_suspension;
    public static Item Tortilla;
    public static Item Pepita_de_Azula;
    public static Item Chip;
    public static Item Antimateria;
    public static Item Petroleo;
    public static Item Metanfetamina;
    public static Item Pastilla_Z;
    public static Item Bateria;
    public static Item Gasolina;
    public static Item Bateria_recargada;
    public static Item Esencia_animal;
    public static Item Esencia_monstruosa;
    public static Item Tabaco;
    public static Item Cocaina;
    public static Item Hachis;
    public static Item Pildoras_analgesicas;
    public static Item Narcoticos;
    public static Item Azucarillos;
    public static Item Llave;
    public static Item Droga_Zombie;
    public static Item CSK;
    public static Item Tela;
    public static Item Lingote_de_Antimateria;
    public static Item Vozdca;
    public static Item Botella;
    public static Item Moneda;
    public static Item Pan_20;
    public static Item Alma_Roja;
    public static Item Sangre_de_animal;
    public static Item Sangre_de_monstruo;
    public static Item Vino;
    public static Item Carne_de_Oveja;
    public static Item Carne_de_Oveja_cocinada;
    public static Item Diamante_Troll;
    public static Item Manzana_W;
    public static Item Manzana_V;
    public static Item Manzana_R;
    public static Item Manzana_A;
    public static Item Manzana_I;
    public static Item Infusion_de_Vida;
    public static Item Infusion_de_Wither;
    public static Item Infusion_de_Veneno;
    public static Item Infusion_de_Invisibilidad;
    public static Item Pepita_de_Esmeralda;
    public static Item Hueso_de_Wither;
    public static Item Infusion_de_Dano;
    public static Item Manzana_D;
    public static Item Plata2;
    public static Item Polimeros;
    public static Item Mango_de_Antimateria;
    public static Item Filo_de_Antimateria;
    public static Item ElderWays;
    //Armaduras
    public static Item Casco_de_Azula;
    public static Item Pechera_de_Azula;
    public static Item Pantalones_de_Azula;
    public static Item Botas_de_Azula;
    
    public static Item Casco_de_Redstoner;
    public static Item Pechera_de_Redstoner;
    public static Item Pantalones_de_Redsoner;
    public static Item Botas_de_Redstoner;
    
    public static Item Casco_de_Caca;
    public static Item Pechera_de_Caca;
    public static Item Pantalones_de_Caca;
    public static Item Botas_de_Caca;
    
    public static Item Elitras;
    
    public static Item Casco_militar;
    public static Item Pechera_militar;
    public static Item Pantalones_de_militar;
    public static Item Botas_de_militar;
    
	//Herramientas declaradas
	public static Item Espada_de_Azula;
	public static Item Pico_de_Azula;
	public static Item Pala_de_Azula;
	public static Item Hacha_de_Azula;
	public static Item Azada_de_Azula;
	public static Item Espada_de_Wither;
	public static Item Espada_de_Caca;
	public static Item Sable_Kiver;
	public static Item Cuchillo;
	public static Item Espada_de_Antimateria;
	public static Item Hacha_de_Antimateria;
	public static Item Pala_de_Antimateria;
	public static Item Espada_de_Redstoner;
	public static Item Pico_de_Redstoner;
	public static Item Pala_de_Redstoner;
	public static Item Hacha_de_Redstoner;
	public static Item Espada_jedi;
	public static Item Espada_Siz;
	public static Item Espada_de_diamante;
	public static Item Espada_de_Plata;
	public static Item Espada_de_Sangre;
	public static Item Espada_Reforzada;
	public static Item Espada_del_Eden;

	
	public static final Item.ToolMaterial AzulaMaterial = EnumHelper.addToolMaterial("AzulaMaterial", 5, 3122, 10.0F, 12.0F, 45);
	public static final Item.ToolMaterial Wither = EnumHelper.addToolMaterial("Wither", 5, 10000, 10.0F, 21.0F, 45);
	public static final Item.ToolMaterial Mierda = EnumHelper.addToolMaterial("Caca", 5, 1, 0.1F, 0, 45);
	public static final Item.ToolMaterial Sable = EnumHelper.addToolMaterial("Sable", 5, 6000, 10.0F, 21.0F, 45);
	public static final Item.ToolMaterial Galaxya = EnumHelper.addToolMaterial("Galaxya", 5, 12000, 75.0F, 71.0F, 45);
	public static final Item.ToolMaterial Invisible = EnumHelper.addToolMaterial("Invisible", 5, 10000, 10.0F, 23.0F, 45);
	public static final Item.ToolMaterial Redstoner = EnumHelper.addToolMaterial("Redstoner", 5, 13000, 10.0F, 3.0F, 45);
	public static final Item.ToolMaterial Espada_laser = EnumHelper.addToolMaterial("Espada_laser", 5, 5000, 10.0F, 11.0F, 45);
	public static final Item.ToolMaterial Star_wars = EnumHelper.addToolMaterial("Star_wars", 5, 4000, 10.0F, 6.0F, 45);
	public static final Item.ToolMaterial Troll = EnumHelper.addToolMaterial("Troll", 5, 1, 1000, 0.1F, 45);
	public static final Item.ToolMaterial Plata = EnumHelper.addToolMaterial("Plata", 5, 2000, 5.0F, 3.0F, 45);
	public static final Item.ToolMaterial Sangre = EnumHelper.addToolMaterial("Sangre", 5, 1000, 10.0F, 4.0F, 45);
	public static final Item.ToolMaterial Reforzado = EnumHelper.addToolMaterial("Reforzado", 5, 1000, 10.0F, 20.0F, 45);
	public static final Item.ToolMaterial Eden = EnumHelper.addToolMaterial("Eden", 5, 25000, 1000, 96, 45);
	
	public static final ItemArmor.ArmorMaterial AzulaArmorMaterial = EnumHelper.addArmorMaterial("AzulaArmorMaterial", 1000, new int[]{7,6,5,2}, 45);
    public static final ItemArmor.ArmorMaterial RedstonerArmorMaterial = EnumHelper.addArmorMaterial("RedtonerArmorMAterial", 1000, new int[]{6,5,3,2}, 45);
	public static final ItemArmor.ArmorMaterial Elytras = EnumHelper.addArmorMaterial("Elytras", 9000, new int[]{7,8,4,2}, 45);
    public static final ItemArmor.ArmorMaterial Mierdecilla = EnumHelper.addArmorMaterial("Mierdecilla", 1, new int[]{1,1,1,1}, 45);
    public static final ItemArmor.ArmorMaterial Guerra = EnumHelper.addArmorMaterial("Guerra", 1000, new int[]{7,6,5,4}, 45);
    public static final ItemArmor.ArmorMaterial Enderman = EnumHelper.addArmorMaterial("Enderman", 5000, new int[]{7,6,5,4}, 45);
    public static final ItemArmor.ArmorMaterial Ciborg = EnumHelper.addArmorMaterial("Ciborg", 5000, new int[]{10,10,10,10}, 45);
	
    //Tabs
    public static CreativeTabs Herra = new HerraTab(CreativeTabs.getNextID(), "hr", "hr" + "." + "HerraCraft", 0);    
	public  static Item Espada_Invisible;
	private static Item Pico_de_Antimateria;
	
    
    public static void preinit(){
    	//variado
        Ver_Dias_de_salida_Elder_ways.VerDias();
    	Regitrar_Entidades.mainRegistry();
    	

    	
    	MinecraftForge.EVENT_BUS.register(new Dropeos_Handler());
    	
    	//Generacion
    	
    	
    	
    	//Armadura
    	
    	
    	Casco_de_Azula = new casco_de_Azula(AzulaArmorMaterial, 0, 0).setUnlocalizedName("casco_de_Azula").setTextureName("rc:Herra/Casco_de_Azula").setCreativeTab(Herra);
    	Pechera_de_Azula = new Pechera_de_Azula(AzulaArmorMaterial, 0, 1).setUnlocalizedName("Pechera_de_Azula").setTextureName("rc:Herra/Pechera_de_Azula").setCreativeTab(Herra);
    	Pantalones_de_Azula = new Pantalones_de_Azula(AzulaArmorMaterial, 0, 2).setUnlocalizedName("Pantalones_de_Azula").setTextureName("rc:Herra/Pantalones_de_Azula").setCreativeTab(Herra);
    	Botas_de_Azula = new Botas_de_Azula(AzulaArmorMaterial, 0, 3).setUnlocalizedName("Botas_de_Azula").setTextureName("rc:Herra/Botas_de_Azula").setCreativeTab(Herra);
    	
        Casco_de_Redstoner = new Casco_de_Redstoner(RedstonerArmorMaterial, 0, 0).setUnlocalizedName("Casco_de_Redstoner").setTextureName("rc:Herra/Casco_de_Redstoner").setCreativeTab(Herra);
    	Pechera_de_Redstoner = new Pechera_de_Redstoner(RedstonerArmorMaterial, 0, 1).setUnlocalizedName("Pechera_de_Redstoner").setTextureName("rc:Herra/Pechera_de_Redstoner").setCreativeTab(Herra);
    	Pantalones_de_Redsoner = new Pantalones_de_Redsoner(RedstonerArmorMaterial, 0, 2).setUnlocalizedName("Pantalones_de_Redstoner").setTextureName("rc:Herra/Pantalones_de_Redstoner").setCreativeTab(Herra);
    	Botas_de_Redstoner = new Botas_de_Redstoner(RedstonerArmorMaterial, 0, 3).setUnlocalizedName("Botas_de_Redstoner").setTextureName("rc:Herra/Botas_de_Redstoner").setCreativeTab(Herra);
    	
    	Casco_de_Caca = new Casco_de_Caca(Mierdecilla, 0, 0).setUnlocalizedName("Casco_de_Caca").setTextureName("rc:Herra/Casco_de_Caca").setCreativeTab(Herra);
    	Pechera_de_Caca = new Pechera_de_Caca(Mierdecilla, 0, 1).setUnlocalizedName("Pechera_de_Caca").setTextureName("rc:Herra/Pechera_de_Caca").setCreativeTab(Herra);
    	Pantalones_de_Caca = new Pantalones_de_Caca(Mierdecilla, 0, 2).setUnlocalizedName("Pantalones_de_Caca").setTextureName("rc:Herra/Pantalones_de_Caca").setCreativeTab(Herra);
    	Botas_de_Caca = new Botas_de_Caca(Mierdecilla, 0, 3).setUnlocalizedName("Botas_de_Caca").setTextureName("rc:Herra/Botas_de_Caca").setCreativeTab(Herra);
    	
    	Casco_militar = new Casco_militar(Guerra, 0, 0).setUnlocalizedName("Casco_militar").setTextureName("rc:Herra/Casco_de_militar").setCreativeTab(Herra);
    	Pechera_militar = new Pechera_militar(Guerra, 0, 1).setUnlocalizedName("Pechera_militar").setTextureName("rc:Herra/Pechera_de_militar").setCreativeTab(Herra);
    	Pantalones_de_militar = new Pantalones_de_militar(Guerra, 0, 2).setUnlocalizedName("Pantalones_de_militar").setTextureName("rc:Herra/Pantalones_de_militar").setCreativeTab(Herra);
    	Botas_de_militar = new Botas_de_militar(Guerra, 0, 3).setUnlocalizedName("Botas_de_militar").setTextureName("rc:Herra/Botas_de_militar").setCreativeTab(Herra);
    	
    	
    	
    	GameRegistry.registerItem(Casco_de_Azula, Casco_de_Azula.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Pechera_de_Azula, Pechera_de_Azula.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Pantalones_de_Azula, Pantalones_de_Azula.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Botas_de_Azula, Botas_de_Azula.getUnlocalizedName().substring(5));
    	
    	GameRegistry.registerItem(Casco_de_Caca, Casco_de_Caca.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Pechera_de_Caca, Pechera_de_Caca.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Pantalones_de_Caca, Pantalones_de_Caca.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Botas_de_Caca, Botas_de_Caca.getUnlocalizedName().substring(5));
    	
    	GameRegistry.registerItem(Casco_de_Redstoner, Casco_de_Redstoner.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Pechera_de_Redstoner, Pechera_de_Redstoner.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Pantalones_de_Redsoner, Pantalones_de_Redsoner.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Botas_de_Redstoner, Botas_de_Redstoner.getUnlocalizedName().substring(5));
    	
    	GameRegistry.registerItem(Casco_militar, Casco_militar.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Pechera_militar, Pechera_militar.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Pantalones_de_militar, Pantalones_de_militar.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(Botas_de_militar, Botas_de_militar.getUnlocalizedName().substring(5));
    	
        
    	
    	//Herramientas
    	Espada_de_Azula = new Espada_de_Azula(AzulaMaterial).setUnlocalizedName("Espada_de_Azula").setTextureName("rc:Herra/Espada_de_Azula").setCreativeTab(Herra);
        GameRegistry.registerItem(Espada_de_Azula, Espada_de_Azula.getUnlocalizedName().substring(5));
        
        Pico_de_Azula = new Pico_de_Azula(AzulaMaterial).setUnlocalizedName("Pico_de_Azula").setTextureName("rc:Herra/Pico_de_Azula").setCreativeTab(Herra);
        GameRegistry.registerItem(Pico_de_Azula, Pico_de_Azula.getUnlocalizedName().substring(5));
        
        Pala_de_Azula = new Pala_de_Azula(AzulaMaterial).setUnlocalizedName("Pala_de_Azula").setTextureName("rc:Herra/Pala_de_Azula").setCreativeTab(Herra);
        GameRegistry.registerItem(Pala_de_Azula, Pala_de_Azula.getUnlocalizedName().substring(5));
        
        Hacha_de_Azula = new Hacha_de_Azula(AzulaMaterial).setUnlocalizedName("Hacha_de_Azula").setTextureName("rc:Herra/Hacha_de_Azula").setCreativeTab(Herra);
    	GameRegistry.registerItem(Hacha_de_Azula, Hacha_de_Azula.getUnlocalizedName().substring(5));
    	
    	Azada_de_Azula = new Azada_de_Azula(AzulaMaterial).setUnlocalizedName("Azada_de_Azula").setTextureName("rc:Herra/Azada_de_Azula").setCreativeTab(Herra);
    	GameRegistry.registerItem(Azada_de_Azula, Azada_de_Azula.getUnlocalizedName().substring(5));
    	
    	Espada_de_Wither = new Espada_de_Wither(Wither).setUnlocalizedName("Espada_de_Wither").setTextureName("rc:Herra/Espada_de_Wither").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_de_Wither, Espada_de_Wither.getUnlocalizedName().substring(5));
    	
    	Espada_de_Caca = new Espada_de_Caca(Mierda).setUnlocalizedName("Espada_de_Caca").setTextureName("rc:Herra/Espada_de_Caca").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_de_Caca, Espada_de_Caca.getUnlocalizedName().substring(5));
    	
    	Sable_Kiver = new Sable_Kiver(Sable).setUnlocalizedName("Sable_Kiver").setTextureName("rc:Herra/Sable_Kiver").setCreativeTab(Herra);
    	GameRegistry.registerItem(Sable_Kiver, Sable_Kiver.getUnlocalizedName().substring(5));
    	
    	Cuchillo = new Cuchillo().setUnlocalizedName("Cuchillo").setTextureName("rc:Herra/Cuchillo").setCreativeTab(Herra);
    	GameRegistry.registerItem(Cuchillo, Cuchillo.getUnlocalizedName().substring(5));
    	
    	Espada_Invisible = new Espada_Invisible(Invisible).setUnlocalizedName("Espada_Invisible").setTextureName("rc:Herra/Espada_Invisible").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_Invisible, Espada_Invisible.getUnlocalizedName().substring(5));
    	
    	Espada_de_Antimateria = new Espada_de_Antimateria(Galaxya).setUnlocalizedName("Espada_de_Antimateria").setTextureName("rc:Herra/Espada_de_Antimateria").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_de_Antimateria, Espada_de_Antimateria.getUnlocalizedName().substring(5));
    	
    	Pico_de_Antimateria = new Pico_de_Antimateria(Galaxya).setUnlocalizedName("Pico_de_Antimateria").setTextureName("rc:Herra/Pico_de_Antimateria").setCreativeTab(Herra);
    	GameRegistry.registerItem(Pico_de_Antimateria, Pico_de_Antimateria.getUnlocalizedName().substring(5));
    	
    	Hacha_de_Antimateria = new Hacha_de_Antimateria(Galaxya).setUnlocalizedName("Hacha_de_Antimateria").setTextureName("rc:Herra/Hacha_de_Antimateria").setCreativeTab(Herra);
    	GameRegistry.registerItem(Hacha_de_Antimateria, Hacha_de_Antimateria.getUnlocalizedName().substring(5));
    	
    	Pala_de_Antimateria = new Pala_de_Antimateria(Galaxya).setUnlocalizedName("Pala_de_Antimateria").setTextureName("rc:Herra/Pala_de_Antimateria").setCreativeTab(Herra);
    	GameRegistry.registerItem(Pala_de_Antimateria, Pala_de_Antimateria.getUnlocalizedName().substring(5));
    	
    	Espada_de_Redstoner = new Espada_de_Redstoner(Redstoner).setUnlocalizedName("Espada_de_Redstoner").setTextureName("rc:Herra/Espada_de_Redstoner").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_de_Redstoner, Espada_de_Redstoner.getUnlocalizedName().substring(5));
    	
    	Pico_de_Redstoner = new Pico_de_Redstoner(Redstoner).setUnlocalizedName("Pico_de_Redstoner").setTextureName("rc:Herra/Pico_de_Redstoner").setCreativeTab(Herra);
    	GameRegistry.registerItem(Pico_de_Redstoner, Pico_de_Redstoner.getUnlocalizedName().substring(5));
    	
    	Pala_de_Redstoner = new Pala_de_Redstoner(Redstoner).setUnlocalizedName("Pala_de_Redstoner").setTextureName("rc:Herra/Pala_de_Redstoner").setCreativeTab(Herra);
    	GameRegistry.registerItem(Pala_de_Redstoner, Pala_de_Redstoner.getUnlocalizedName().substring(5));
    	
    	Hacha_de_Redstoner = new Hacha_de_Redstoner(Redstoner).setUnlocalizedName("Hacha_de_Redstoner").setTextureName("rc:Herra/Hacha_de_Redstoner").setCreativeTab(Herra);
    	GameRegistry.registerItem(Hacha_de_Redstoner, Hacha_de_Redstoner.getUnlocalizedName().substring(5));
    	
    	Espada_jedi = new Espada_jedi(Star_wars).setUnlocalizedName("Espada_jedi").setTextureName("rc:Herra/Espada_jedi").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_jedi, Espada_jedi.getUnlocalizedName().substring(5));
    	
    	Espada_Siz = new Espada_Siz(Star_wars).setUnlocalizedName("Espada_Siz").setTextureName("rc:Herra/Espada_Siz").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_Siz, Espada_Siz.getUnlocalizedName().substring(5));
    	
    	Espada_de_Plata = new Espada_de_Plata(Plata).setUnlocalizedName("Espada_de_Plata").setTextureName("rc:Herra/Espada_de_Plata");
    	GameRegistry.registerItem(Espada_de_Plata, Espada_de_Plata.getUnlocalizedName().substring(5));
    	
    	Espada_de_Sangre = new Espada_de_Sangre(Sangre).setUnlocalizedName("Espada_de_Sangre").setTextureName("rc:Herra/Espada_de_Sangre").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_de_Sangre, Espada_de_Sangre.getUnlocalizedName().substring(5));
    	
    	Espada_Reforzada = new Espada_Reforzada(Reforzado).setUnlocalizedName("Espada_Reforzada").setTextureName("rc:Herra/Espada_Reforzada").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_Reforzada, Espada_Reforzada.getUnlocalizedName().substring(5));
    	
    	Espada_del_Eden = new Espada_del_Eden(Eden).setUnlocalizedName("Espada_del_Eden").setTextureName("rc:Herra/Espada_del_Eden").setCreativeTab(Herra);
    	GameRegistry.registerItem(Espada_del_Eden, Espada_del_Eden.getUnlocalizedName().substring(5));
    //Bloques
    	
    Bloque_de_Plastico = new Bloque_de_Plastico(Material.rock).setBlockName("Bloque_de_Plastico").setBlockTextureName("rc:Herra/Bloque_de_Plastico").setCreativeTab(Herra).setHardness(1.0F);
    GameRegistry.registerBlock(Bloque_de_Plastico, Bloque_de_Plastico.getUnlocalizedName().substring(5));
    Bloque_de_Plastico.setHarvestLevel("pickaxe", 0);	
    	
    Barrera = new Barrera(Material.rock).setBlockName("Barrera").setBlockTextureName("rc:Herra/Barrera").setBlockTextureName("rc:Herra/Barrera").setCreativeTab(Herra).setResistance(Float.MAX_VALUE);
    GameRegistry.registerBlock(Barrera, Barrera.getUnlocalizedName().substring(5));
    Barrera.setBlockUnbreakable();
    
    Almacen_de_energia = new Almacen_de_energia(Material.rock).setBlockName("Almacen_de_energia").setBlockTextureName("rc:Herra/Almacen_de_energia").setCreativeTab(Herra).setHardness(9.0F);
    GameRegistry.registerBlock(Almacen_de_energia, Almacen_de_energia.getUnlocalizedName().substring(5));
    Almacen_de_energia.setHarvestLevel("pickaxe", 0);
    
    Bloque_de_comando = new Bloque_de_Comando(Material.rock).setBlockName("Bloque_de_comando").setBlockTextureName("rc:Herra/Bloque_de_comando").setCreativeTab(Herra).setHardness(9.0F);
    GameRegistry.registerBlock(Bloque_de_comando, Bloque_de_comando.getUnlocalizedName().substring(5));
    Bloque_de_comando.setHarvestLevel("pickaxe", 0);
    
    Corazon_de_Redstone = new Corazon_de_Redstone(MapColor.redColor).setBlockName("Corazon_de_Redstone").setBlockTextureName("rc:Herra/Corazon_de_Redstone").setCreativeTab(Herra).setHardness(5.0F).setResistance(5.0F);
    GameRegistry.registerBlock(Corazon_de_Redstone, Corazon_de_Redstone.getUnlocalizedName().substring(5));
    Corazon_de_Redstone.setHarvestLevel("pickaxe", 3);
    
    Cristal_de_ovni = new Cristal_de_ovni(Material.glass).setBlockName("Cristal_de_ovni").setBlockTextureName("rc:Herra/Cristal_de_ovni").setCreativeTab(Herra).setHardness(0.5F).setResistance(5.0F);
    GameRegistry.registerBlock(Cristal_de_ovni, Cristal_de_ovni.getUnlocalizedName().substring(5));
    Cristal_de_ovni.setHarvestLevel("pickaxe", 2);
    
    Bloque_de_metal = new Bloque_de_metal(Material.rock).setBlockName("Bloque_de_metal").setBlockTextureName("rc:Herra/Bloque_de_metal").setCreativeTab(Herra).setHardness(0.5F);
    GameRegistry.registerBlock(Bloque_de_metal, Bloque_de_metal.getUnlocalizedName().substring(5));
    Bloque_de_metal.setHarvestLevel("pickaxe", 1);
    
    Cristal_invisible = new Cristal_invisible(Material.glass).setBlockName("Cristal_invisible").setBlockTextureName("rc:Herra/Cristal_invisible").setHardness(0.5F);
    GameRegistry.registerBlock(Cristal_invisible, Cristal_invisible.getUnlocalizedName().substring(5));
    Cristal_invisible.setHarvestLevel("pickaxe", 0);
    
    Mena_de_Azula = new Mena_de_Azula(Material.rock).setBlockName("Mena_de_Azula").setBlockTextureName("rc:Herra/Mena_de_Azula").setHardness(1.0F).setCreativeTab(Herra);
    GameRegistry.registerBlock(Mena_de_Azula, Mena_de_Azula.getUnlocalizedName().substring(5));
    Mena_de_Azula.setHarvestLevel("pickaxe", 3);
    
    Mesa_de_Azula = new Mesa_de_Azula().setBlockName("Mesa_de_Azula");;
    GameRegistry.registerBlock(Mesa_de_Azula, Mesa_de_Azula.getUnlocalizedName().substring(5));
    Mesa_de_Azula.setHarvestLevel("axe", 0);
    
    Piedra_base = new Piedra_base(Material.rock).setBlockName("Piedra_base").setBlockTextureName("rc:Herra/Piedra_base").setHardness(0.5F).setCreativeTab(Herra).setResistance(Float.MAX_VALUE);
    GameRegistry.registerBlock(Piedra_base, Piedra_base.getUnlocalizedName().substring(5));
    Piedra_base.setHarvestLevel("pickaxe", 1);
    
    Bloque_de_Azucar = new Bloque_de_Azucar(Material.rock).setBlockName("Bloque_de_Azucar").setBlockTextureName("rc:Herra/Bloque_de_Azucar").setHardness(0.5F).setCreativeTab(Herra);
    GameRegistry.registerBlock(Bloque_de_Azucar, Bloque_de_Azucar.getUnlocalizedName().substring(5));
    
    Bloque_de_Enderpearl = new Bloque_de_Enderpearl(Material.rock).setBlockName("Bloque_de_Enderpearl").setBlockTextureName("rc:Herra/Bloque_de_Enderpearl").setHardness(0.5F).setCreativeTab(Herra);
    GameRegistry.registerBlock(Bloque_de_Enderpearl, Bloque_de_Enderpearl.getUnlocalizedName().substring(5));
    Bloque_de_Enderpearl.setHarvestLevel("pickaxe", 0);
    
    Caja_de_Pastillas = new Caja_de_Pastillas(Material.wood).setBlockName("Caja_de_Pastillas").setBlockTextureName("rc:Herra/Caja_de_Pastillas").setHardness(0.5F).setCreativeTab(Herra);
    GameRegistry.registerBlock(Caja_de_Pastillas, Caja_de_Pastillas.getUnlocalizedName().substring(5));
    
    Bloque_Invisible = new Bloque_Invisible(Material.rock).setBlockName("Bloque_Invisible").setBlockTextureName("rc:Herra/Bloque_Invisible").setHardness(0.7F).setCreativeTab(Herra).setResistance(Float.MAX_VALUE);
    GameRegistry.registerBlock(Bloque_Invisible, Bloque_Invisible.getUnlocalizedName().substring(5));
    Bloque_Invisible.setHarvestLevel("pickaxe", 0);
    
    Bloque_de_Losa = new Bloque_de_Losa(Material.rock).setBlockName("Bloque_de_Losa").setBlockTextureName("stone_slab_top").setHardness(0.7F).setCreativeTab(Herra);
    GameRegistry.registerBlock(Bloque_de_Losa, Bloque_de_Losa.getUnlocalizedName().substring(5));
    Bloque_de_Losa.setHarvestLevel("pickaxe", 0);
    
    Bloque_De_Estrella_Del_Wither = new Bloque_De_Estrella_Del_Wither(Material.rock).setBlockName("Bloque_De_Estrella_Del_Wither").setBlockTextureName("rc:Herra/Bloque_De_Estrella_Del_Wither").setCreativeTab(Herra);
    GameRegistry.registerBlock(Bloque_De_Estrella_Del_Wither, Bloque_De_Estrella_Del_Wither.getUnlocalizedName().substring(5));
    
    Magma_Acuatico = new Magma_Acuatico(Material.rock).setBlockName("Magma_Acuatico").setBlockTextureName("rc:Herra/acuatico").setHardness(0.9F).setCreativeTab(Herra);
    GameRegistry.registerBlock(Magma_Acuatico, Magma_Acuatico.getUnlocalizedName().substring(5));
    
    //Items
    Azula = new Azula().setUnlocalizedName("Azula").setTextureName("rc:Herra/Azula").setCreativeTab(Herra);
    GameRegistry.registerItem(Azula, Azula.getUnlocalizedName().substring(5));
    
    Caca = new Caca(6, 1.0F, false).setUnlocalizedName("Caca").setTextureName("rc:Herra/Caca").setCreativeTab(Herra);
	GameRegistry.registerItem(Caca, Caca.getUnlocalizedName().substring(5));
    
    Metal = new Metal().setUnlocalizedName("Metal").setTextureName("rc:Herra/Metal").setTextureName("rc:Herra/Metal").setCreativeTab(Herra);
    GameRegistry.registerItem(Metal, Metal.getUnlocalizedName().substring(5));
    
    Nucleo_de_ovni = new Nucleo_de_ovni().setUnlocalizedName("Nucleo_de_ovni").setTextureName("rc:Herra/Nucleo_de_ovni").setCreativeTab(Herra);
    GameRegistry.registerItem(Nucleo_de_ovni, Nucleo_de_ovni.getUnlocalizedName().substring(5));
    
    Palos_de_blaze = new Palos_de_blaze().setUnlocalizedName("Palos_de_blaze").setTextureName("rc:Herra/Palos_de_blaze").setCreativeTab(Herra);
    GameRegistry.registerItem(Palos_de_blaze, Palos_de_blaze.getUnlocalizedName().substring(5));
    
    Plutonio = new Plutonio().setUnlocalizedName("Plutonio").setTextureName("rc:Herra/Plutonio").setCreativeTab(Herra);
    GameRegistry.registerItem(Plutonio, Plutonio.getUnlocalizedName().substring(5));
    
    Vapor_de_electrones = new Vapor_de_electrones().setUnlocalizedName("Vapor_de_electrones").setTextureName("rc:Herra/Vapor_de_electrones").setCreativeTab(Herra);
    GameRegistry.registerItem(Vapor_de_electrones, Vapor_de_electrones.getUnlocalizedName().substring(5));
    
    Fluido_de_suspension = new Fluido_de_suspension().setUnlocalizedName("Fluido_de_suspension").setTextureName("rc:Herra/Fluido_de_suspension").setCreativeTab(Herra);
    GameRegistry.registerItem(Fluido_de_suspension, Fluido_de_suspension.getUnlocalizedName().substring(5));
    
    Antimateria = new Antimateria().setUnlocalizedName("Antimateria").setTextureName("rc:Herra/Antimateria").setCreativeTab(Herra);
    GameRegistry.registerItem(Antimateria, Antimateria.getUnlocalizedName().substring(5));
    
    Tortilla = new ItemFood(10, 0.6F,true).setUnlocalizedName("Tortilla").setTextureName("rc:Herra/Tortilla").setCreativeTab(Herra);
    GameRegistry.registerItem(Tortilla, Tortilla.getUnlocalizedName().substring(5));
    
    Carne_de_Oveja = new ItemFood(2, 0.4F,true).setUnlocalizedName("Carne_de_Oveja").setTextureName("rc:Herra/Carne_de_Oveja").setCreativeTab(Herra);
    GameRegistry.registerItem(Carne_de_Oveja, Carne_de_Oveja.getUnlocalizedName().substring(5));
    
    Carne_de_Oveja_cocinada = new ItemFood(6, 1.0F, true).setUnlocalizedName("Carne_de_Oveja_cocinada").setTextureName("rc:Herra/Carne_de_Oveja_cocinada").setCreativeTab(Herra);
    GameRegistry.registerItem(Carne_de_Oveja_cocinada, Carne_de_Oveja_cocinada.getUnlocalizedName().substring(5));
    
    Metanfetamina = new Metanfetamina(6, 1.0F, false).setUnlocalizedName("Metanfetamina").setTextureName("rc:Herra/Metanfetamina").setCreativeTab(Herra);
	GameRegistry.registerItem(Metanfetamina, Metanfetamina.getUnlocalizedName().substring(5));
	
	Droga_Zombie = new Droga_Zombie(6, 1.0F, false).setUnlocalizedName("Droga_Zombie").setTextureName("rc:Herra/Droga_Zombie").setCreativeTab(Herra);
	GameRegistry.registerItem(Droga_Zombie, Droga_Zombie.getUnlocalizedName().substring(5));
	
    Narcoticos = new Narcoticos(10, 0.7F,false).setUnlocalizedName("Narcoticos").setTextureName("rc:Herra/Narcoticos").setCreativeTab(Herra);
    GameRegistry.registerItem(Narcoticos, Narcoticos.getUnlocalizedName().substring(5));	
    
    Pastilla_Z = new Pastilla_Z(6, 1.7F,false).setUnlocalizedName("Pastilla_Z").setTextureName("rc:Herra/Pastilla_Z").setCreativeTab(Herra);
    GameRegistry.registerItem(Pastilla_Z, Pastilla_Z.getUnlocalizedName().substring(5));
    
    Vozdca = new Vozdca(7, 1.8F,false).setUnlocalizedName("Vodzca").setTextureName("rc:Herra/Vozdca").setCreativeTab(Herra);
    GameRegistry.registerItem(Vozdca, Vozdca.getUnlocalizedName().substring(5));
    
    Manzana_W = new Manzana_W(7, 1.8F,false).setUnlocalizedName("Manzana_W").setTextureName("rc:Herra/Manzana_W").setCreativeTab(Herra);
    GameRegistry.registerItem(Manzana_W, Manzana_W.getUnlocalizedName().substring(5));
    
    Manzana_V = new Manzana_V(7, 1.8F,false).setUnlocalizedName("Manzana_V").setTextureName("rc:Herra/Manzana_V").setCreativeTab(Herra);
    GameRegistry.registerItem(Manzana_V, Manzana_V.getUnlocalizedName().substring(5));
    
    Manzana_R = new Manzana_R(7, 1.7F,false).setUnlocalizedName("Manzana_R").setTextureName("rc:Herra/Manzana_R").setCreativeTab(Herra);
    GameRegistry.registerItem(Manzana_R, Manzana_R.getUnlocalizedName().substring(5));
    
    Manzana_A = new Manzana_A(7, 1.7F,false).setUnlocalizedName("Manzana_A").setTextureName("rc:Herra/Manzana_A").setCreativeTab(Herra);
    GameRegistry.registerItem(Manzana_A, Manzana_A.getUnlocalizedName().substring(5));
    
    Manzana_D = new Manzana_D(7, 1.6F,false).setUnlocalizedName("Manzana_D").setTextureName("rc:Herra/Manzana_D").setCreativeTab(Herra);
    GameRegistry.registerItem(Manzana_D, Manzana_D.getUnlocalizedName().substring(5));
    
    Manzana_I = new Manzana_I(7, 1.5F,false).setUnlocalizedName("Manzana_I").setTextureName("rc:Herra/Manzana_I").setCreativeTab(Herra);
    GameRegistry.registerItem(Manzana_I, Manzana_I.getUnlocalizedName().substring(5));
    
    Infusion_de_Vida = new Infusion_de_Vida().setUnlocalizedName("Infusion_de_Vida").setTextureName("rc:Herra/Infusion_de_Vida").setCreativeTab(Herra);
    GameRegistry.registerItem(Infusion_de_Vida, Infusion_de_Vida.getUnlocalizedName().substring(5));
    
    Infusion_de_Wither = new Infusion_de_Wither().setUnlocalizedName("Infusion_de_Wither").setTextureName("rc:Herra/Infusion_de_Wither").setCreativeTab(Herra);
    GameRegistry.registerItem(Infusion_de_Wither, Infusion_de_Wither.getUnlocalizedName().substring(5));
    
    Infusion_de_Invisibilidad = new Infusion_de_Invisibilidad().setUnlocalizedName("Infusion_de_Invisibilidad").setTextureName("rc:Herra/Infusion_de_Invisibilidad").setCreativeTab(Herra);
    GameRegistry.registerItem(Infusion_de_Invisibilidad, Infusion_de_Invisibilidad.getUnlocalizedName().substring(5));
    
    Infusion_de_Veneno = new Infusion_de_Veneno().setUnlocalizedName("Infusion_de_Veneno").setTextureName("rc:Herra/Infusion_de_Veneno").setCreativeTab(Herra);
    GameRegistry.registerItem(Infusion_de_Veneno, Infusion_de_Veneno.getUnlocalizedName().substring(5));
    
    Pan_20 = new Pan_20(7, 1.9F,false).setUnlocalizedName("Pan_20").setTextureName("rc:Herra/Pan_20").setCreativeTab(Herra);
    GameRegistry.registerItem(Pan_20, Pan_20.getUnlocalizedName().substring(5));
    
    Cocaina = new Cocaina(10, 0.6F,false).setUnlocalizedName("Cocaina").setTextureName("rc:Herra/Cocaina").setCreativeTab(Herra);
    GameRegistry.registerItem(Cocaina, Cocaina.getUnlocalizedName().substring(5));
    
    Hachis = new ItemFood(10, 0.7F,true).setUnlocalizedName("Hachis").setTextureName("rc:Herra/Hachis").setCreativeTab(Herra);
    GameRegistry.registerItem(Hachis, Hachis.getUnlocalizedName().substring(5));
    
    Pildoras_analgesicas = new Pildoras_analgesicas(6, 1.0F, false).setUnlocalizedName("Pildoras_analgesicas").setTextureName("rc:Herra/Pildoras_analgesicas").setCreativeTab(Herra);
    GameRegistry.registerItem(Pildoras_analgesicas, Pildoras_analgesicas.getUnlocalizedName().substring(5));
    
    Pepita_de_Azula = new Pepita_de_Azula().setUnlocalizedName("Pepita_de_Azula").setTextureName("rc:Herra/Pepita_de_Azula").setCreativeTab(Herra);
    GameRegistry.registerItem(Pepita_de_Azula, Pepita_de_Azula.getUnlocalizedName().substring(5));
    
    Chip = new Chip().setUnlocalizedName("Chip").setTextureName("rc:Herra/Chip").setCreativeTab(Herra);
    GameRegistry.registerItem(Chip, Chip.getUnlocalizedName().substring(5));
    
    Petroleo = new Petroleo().setUnlocalizedName("Petroleo").setTextureName("rc:Herra/Petroleo").setCreativeTab(Herra);
    GameRegistry.registerItem(Petroleo, Petroleo.getUnlocalizedName().substring(5));
    
    Bateria = new Bateria().setUnlocalizedName("Bateria").setTextureName("rc:Herra/Bateria").setCreativeTab(Herra);
    GameRegistry.registerItem(Bateria, Bateria.getUnlocalizedName().substring(5));
    
    Bateria_recargada = new Bateria_recargada().setUnlocalizedName("Bateria_recargada").setTextureName("rc:Herra/Bateria_recargada").setCreativeTab(Herra);
    GameRegistry.registerItem(Bateria_recargada, Bateria_recargada.getUnlocalizedName().substring(5));
    
    Esencia_animal = new Esencia_animal().setUnlocalizedName("Esencia_animal").setTextureName("rc:Herra/Esencia_animal").setCreativeTab(Herra);
    GameRegistry.registerItem(Esencia_animal, Esencia_animal.getUnlocalizedName().substring(5));
    
    Esencia_monstruosa = new Esencia_monstruosa().setUnlocalizedName("Esencia_monstruosa").setTextureName("rc:Herra/Esencia_monstruosa").setCreativeTab(Herra);
    GameRegistry.registerItem(Esencia_monstruosa, Esencia_monstruosa.getUnlocalizedName().substring(5));
    
    Tabaco = new Tabaco().setUnlocalizedName("Tabaco").setTextureName("rc:Herra/Tabaco").setCreativeTab(Herra);
    GameRegistry.registerItem(Tabaco, Tabaco.getUnlocalizedName().substring(5));
    
    Azucarillos = new Azucarillos().setUnlocalizedName("Azucarillos").setTextureName("rc:Herra/Azucarillos").setCreativeTab(Herra);
    GameRegistry.registerItem(Azucarillos, Azucarillos.getUnlocalizedName().substring(5));
    
    Llave = new Llave().setUnlocalizedName("Llave").setTextureName("rc:Herra/Llave").setCreativeTab(Herra);
    GameRegistry.registerItem(Llave, Llave.getUnlocalizedName().substring(5));
    
    CSK = new CSK().setUnlocalizedName("CSK").setTextureName("rc:Herra/CSK").setCreativeTab(Herra);
    GameRegistry.registerItem(CSK, CSK.getUnlocalizedName().substring(5));
    
    Tela = new Tela().setUnlocalizedName("Tela").setTextureName("rc:Herra/Tela").setCreativeTab(Herra);
    GameRegistry.registerItem(Tela, Tela.getUnlocalizedName().substring(5));
    
    Lingote_de_Antimateria = new Lingote_de_Antimateria().setUnlocalizedName("Lingote_de_Antimateria").setTextureName("rc:Herra/Lingote_de_Antimateria").setCreativeTab(Herra);
    GameRegistry.registerItem(Lingote_de_Antimateria, Lingote_de_Antimateria.getUnlocalizedName().substring(5));
    
    Botella = new Botella().setUnlocalizedName("Botella").setTextureName("rc:Herra/Botella").setCreativeTab(Herra);
    GameRegistry.registerItem(Botella, Botella.getUnlocalizedName().substring(5));
    
    Alma_Roja = new Alma_Roja().setUnlocalizedName("Alma_Roja").setTextureName("rc:Herra/Alma_Roja").setCreativeTab(Herra);
    GameRegistry.registerItem(Alma_Roja, Alma_Roja.getUnlocalizedName().substring(5));
    
    Sangre_de_animal = new Sangre_de_animal().setUnlocalizedName("Sangre_de_animal").setTextureName("rc:Herra/Sangre_de_animal").setCreativeTab(Herra);
    GameRegistry.registerItem(Sangre_de_animal, Sangre_de_animal.getUnlocalizedName().substring(5));
    
    Sangre_de_monstruo = new Sangre_de_monstruo().setUnlocalizedName("Sangre_de_monstruo").setTextureName("rc:Herra/Sangre_de_monstruo").setCreativeTab(Herra);
    GameRegistry.registerItem(Sangre_de_monstruo, Sangre_de_monstruo.getUnlocalizedName().substring(5));
    
    Vino = new Vozdca(7, 1.8F,false).setUnlocalizedName("Vino").setTextureName("rc:Herra/Vino").setCreativeTab(Herra);
    GameRegistry.registerItem(Vino, Vino.getUnlocalizedName().substring(5));
    
    Pepita_de_Esmeralda = new Pepita_de_Esmeralda().setUnlocalizedName("Pepita_de_Esmeralda").setTextureName("rc:Herra/Pepita_de_Esmeralda").setCreativeTab(Herra);
    GameRegistry.registerItem(Pepita_de_Esmeralda, Pepita_de_Esmeralda.getUnlocalizedName().substring(5));
    
    Hueso_de_Wither = new Hueso_de_Wither().setUnlocalizedName("Hueso_de_Wither").setTextureName("rc:Herra/Hueso_de_Wither").setCreativeTab(Herra);
    GameRegistry.registerItem(Hueso_de_Wither, Hueso_de_Wither.getUnlocalizedName().substring(5));
    
    Infusion_de_Dano = new Infusion_de_Dano().setUnlocalizedName("Infusion_de_Dano").setTextureName("rc:Herra/Infusion_de_Dano").setCreativeTab(Herra);
    GameRegistry.registerItem(Infusion_de_Dano, Infusion_de_Dano.getUnlocalizedName().substring(5));
    
    Plata2 = new Plata2().setUnlocalizedName("Plata2").setTextureName("rc:Herra/Plata2").setCreativeTab(Herra);
    GameRegistry.registerItem(Plata2, Plata2.getUnlocalizedName().substring(5));
    
    Mango_de_Antimateria = new  Mango_de_Antimateria().setUnlocalizedName("Mango_de_Antimateria").setTextureName("rc:Herra/Mango_de_Antimateria").setCreativeTab(Herra);
    GameRegistry.registerItem(Mango_de_Antimateria, Mango_de_Antimateria.getUnlocalizedName().substring(5));
   
    Filo_de_Antimateria = new Filo_de_Antimateria().setUnlocalizedName("Filo_de_Antimateria").setTextureName("rc:Herra/Filo_de_Antimateria").setCreativeTab(Herra);
    GameRegistry.registerItem(Filo_de_Antimateria, Filo_de_Antimateria.getUnlocalizedName().substring(5));
    
    ElderWays = new ElderWays().setUnlocalizedName("ElderWays").setTextureName("rc:Herra/ElderWays").setCreativeTab(Herra);
    GameRegistry.registerItem(ElderWays, ElderWays.getUnlocalizedName().substring(5));
    
    }
	
	
    public static void init(){
		Eventos.Iniciar();
    	//Crafteos Con Forma Mesa de Azula
   
		Mesas.addRecipeAzula(new ItemStack(Casco_militar, 1), new Object[]{"#####"," hhh "," hch ","#####","#####",'h', Items.iron_ingot,'c', Items.iron_helmet});
		Mesas.addRecipeAzula(new ItemStack(Pechera_militar, 1), new Object[]{"     "," hph "," hhh ",'h', Items.iron_ingot,'p', Items.iron_chestplate});
		Mesas.addRecipeAzula(new ItemStack(Pantalones_de_militar, 1), new Object[]{"     "," hph "," hhh ",'h', Items.iron_ingot,'p', Items.iron_leggings});
		//Mesas.addRecipeAzula(new ItemStack(Botas_de_militar, 1), new Object[]{"     "," hph "," hhh ",'h', Items.iron_ingot,'p', Items.iron_boots});
		Mesas.addRecipeAzula(new ItemStack(Espada_jedi, 1), new Object[]{"#####","##a##","##a##","##o##","#####",'a', Azula,'o', Blocks.obsidian});
		Mesas.addRecipeAzula(new ItemStack(Espada_Siz, 1), new Object[]{"#####","##p##","##p##","##o##","#####",'p', Plutonio,'o', Blocks.obsidian});
		Mesas.addRecipeAzula(new ItemStack(Espada_de_Sangre, 1), new Object[]{"#####","##s##","##a##","##p##","#####",'s', Sangre_de_monstruo,'a', Alma_Roja,'p', Items.stick});
		Mesas.addRecipeAzula(new ItemStack(Espada_de_Sangre, 1), new Object[]{"#####","##s##","##a##","##p##","#####",'s', Sangre_de_animal,'a', Alma_Roja,'p', Items.stick});
		Mesas.addRecipeAzula(new ItemStack(Items.emerald, 1), new Object[]{"#####","#ppp#","#ppp#","#ppp#","#####",'p', Pepita_de_Esmeralda});
		Mesas.addRecipeAzula(new ItemStack(Espada_de_Antimateria, 1), new Object[]{"#####","##l##","##2##","##3##","#####",'l', Filo_de_Antimateria,'2', Lingote_de_Antimateria,'3', Mango_de_Antimateria});
		Mesas.addRecipeAzula(new ItemStack(Pico_de_Antimateria, 1), new Object[]{"aaaaa","##p##","##p##","##p##","##p##",'a', Lingote_de_Antimateria,'p', Items.stick});
		Mesas.addRecipeAzula(new ItemStack(Blocks.command_block, 1), new Object[]{"#####","#oro#","#ded#","#oro#","#####",'o', Blocks.obsidian,'r', Blocks.redstone_block,'e', Items.nether_star, 'd',Blocks.diamond_block});
		Mesas.addRecipeAzula(new ItemStack(Items.nether_star, 1), new Object[]{"#ccc#","#sss#","##s##","#####",'s', Blocks.soul_sand,'c', new ItemStack(Items.skull,397,1)});
		Mesas.addRecipeAzula(new ItemStack(Hueso_de_Wither, 8), new Object[]{"#####","#hhh#","#heh#","#hhh#","#####",'h', Items.bone,'e', Items.nether_star});
		Mesas.addRecipeAzula(new ItemStack(Hacha_de_Antimateria, 1), new Object[]{"#lll#","#lp##","#lp##","##p##","##p##",'l', Lingote_de_Antimateria, 'p', Items.stick});
		Mesas.addRecipeAzula(new ItemStack(Pala_de_Antimateria, 1), new Object[]{"##l##","##p##","##p##","##p##","##p##",'l', Lingote_de_Antimateria,'p', Items.stick});
		Mesas.addRecipeAzula(new ItemStack(Espada_Reforzada, 1), new Object[]{"##h##","##h##","##e##","##h##","##p##",'h', Items.iron_ingot,'e', Items.iron_sword,'p', Items.stick});
		
    	//Crafteos sin Forma Mesa de Azula
    	
    	
    //Crafteos con forma
	
    GameRegistry.addRecipe(new ItemStack(Nucleo_de_ovni, 2), new Object[]{" o ","odo"," o ",'o', Items.gold_ingot,'d', Items.diamond});	
    GameRegistry.addRecipe(new ItemStack(Plastico, 2), new Object[]{"rcr","crc","rcr",'c', Items.coal,'r', Blocks.cobblestone});	
    GameRegistry.addRecipe(new ItemStack(Espada_de_Azula, 1),new Object[]{" a "," a "," p ",'p', Palos_de_blaze,'a', Azula});
    GameRegistry.addRecipe(new ItemStack(Pico_de_Azula, 1), new Object[]{"aaa"," p "," p ",'p', Palos_de_blaze,'a', Azula});
    GameRegistry.addRecipe(new ItemStack(Bloque_de_comando, 2), new Object[]{"ono","nrn","ono",'o', Blocks.obsidian,'n', Items.nether_star,'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Corazon_de_Redstone, 1), new Object[]{" b ","brb"," b ",'b', Blocks.redstone_block,'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Almacen_de_energia, 1), new Object[]{"oro","rnr","oro",'o', Items.gold_ingot,'r', Items.redstone,'n', Nucleo_de_ovni});
    GameRegistry.addRecipe(new ItemStack(Crash, 1), new Object[]{"   "," tt"," tt",'t', Blocks.dirt});
    GameRegistry.addRecipe(new ItemStack(Plutonio, 1), new Object[]{" r ","rhr"," r ",'h', Items.iron_ingot,'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Vapor_de_electrones, 1), new Object[]{"ppp","pfp","ppp",'p', Plutonio,'f', Fluido_de_suspension});
    GameRegistry.addRecipe(new ItemStack(Bloque_de_ovni_camuflaje, 5), new Object[]{" p ","ptp"," p ",'p', Blocks.stone,'t', Items.dye});
    GameRegistry.addRecipe(new ItemStack(Chip, 3), new Object[]{"iri","iri","iri",'i', Items.iron_ingot,'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Antimateria, 2), new Object[]{"pep","pfp","pep",'p', Plutonio,'f', Vapor_de_electrones, 'e', Items.nether_star});
    GameRegistry.addRecipe(new ItemStack(Petroleo, 4), new Object[]{"wcw","cpc","wcw",'c', Items.coal,'p', Items.gunpowder,'w', Items.water_bucket});
    GameRegistry.addRecipe(new ItemStack(Caca, 2), new Object[]{"   "," t ","ttt",'t', Blocks.dirt});
    GameRegistry.addRecipe(new ItemStack(Bloque_de_metal, 1), new Object[]{"mmm","mmm","mmm",'m', Metal});
    GameRegistry.addRecipe(new ItemStack(Bateria, 1), new Object[]{"iii","iri","iii",'i', Items.iron_ingot,'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Bateria_recargada, 1), new Object[]{"ppp","pbp","ppp",'p', Petroleo,'b', Bateria});
    GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1), new Object[]{"eee","ehe","eee",'h', Items.egg,'e', Esencia_animal});
    GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1), new Object[]{"eee","ehe","eee",'e', Esencia_monstruosa,'h', Items.egg});
    GameRegistry.addRecipe(new ItemStack(Esencia_animal, 2), new Object[]{"ccc","cfc","ccc",'c', Items.porkchop,'f', Items.glass_bottle});
    GameRegistry.addRecipe(new ItemStack(Cristal_invisible, 4), new Object[]{"ccc","ccc","ccc",'c', Blocks.glass});
    GameRegistry.addRecipe(new ItemStack(Esencia_monstruosa, 2), new Object[]{"ccc","cfc","ccc",'f', Items.glass_bottle,'c', Items.rotten_flesh});
    GameRegistry.addRecipe(new ItemStack(Tabaco, 3), new Object[]{" a ","apa"," a ",'a', Items.sugar,'p', Items.gunpowder});
    GameRegistry.addRecipe(new ItemStack(Bloque_de_Slime, 1), new Object[]{"sss","s s","sss",'s', Items.slime_ball});
    GameRegistry.addRecipe(new ItemStack(Pastilla_Z, 4), new Object[]{"ppp","ttt","ppp",'p', Items.paper,'t', Tabaco});
    GameRegistry.addRecipe(new ItemStack(Metanfetamina, 4), new Object[]{"ppp","hth","ppp",'p', Items.paper,'t', Tabaco,'h', Pastilla_Z});
    GameRegistry.addRecipe(new ItemStack(Metal, 1), new Object[]{"   ","hhh","   ",'h', Items.iron_ingot});
    GameRegistry.addRecipe(new ItemStack(Espada_de_Wither, 1), new Object[]{" o "," e "," p ",'o', Blocks.obsidian,'e', Items.nether_star,'p', Items.stick});
    GameRegistry.addRecipe(new ItemStack(Hacha_de_Azula, 1), new Object[]{"aa ","ap "," p ",'a', Azula,'p', Items.stick});
    GameRegistry.addRecipe(new ItemStack(Azada_de_Azula, 1), new Object[]{"aa "," p "," p ",'a', Azula,'p', Items.stick});
    GameRegistry.addRecipe(new ItemStack(Pildoras_analgesicas, 2), new Object[]{"ppp","ptp","ppp",'p', Items.paper,'t', Tabaco});
    GameRegistry.addRecipe(new ItemStack(Narcoticos, 3), new Object[]{"sss"," c ","   ",'c', Items.water_bucket,'s', Items.wheat_seeds});
    GameRegistry.addRecipe(new ItemStack(Bloque_de_Enderpearl, 1), new Object[]{"eee","e#e","eee",'e', Items.ender_pearl});
    GameRegistry.addRecipe(new ItemStack(Ordenador, 2), new Object[]{"hhh","hch","bhi",'h', Items.iron_ingot,'c', Blocks.glass,'b', Blocks.stone_button,'i', Chip});
    GameRegistry.addRecipe(new ItemStack(CSK, 2), new Object[]{"aa","aa","aa",'a', Azula});
    GameRegistry.addRecipe(new ItemStack(Sable_Kiver, 1), new Object[]{" c "," c "," s ",'c', CSK,'s', Items.stick});
    GameRegistry.addRecipe(new ItemStack(Bloque_de_Azucar, 1), new Object[]{"aaa","aaa","aaa",'a', Azucarillos});
    GameRegistry.addRecipe(new ItemStack(Fluido_de_suspension, 2), new Object[]{"ili","lwl","ili",'l', Blocks.lapis_block, 'i', Blocks.gold_block, 'w', Items.water_bucket});
    GameRegistry.addRecipe(new ItemStack(Espada_de_Caca, 1), new Object[]{" c "," c "," s ",'s', Items.stick, 'c', Caca});
    GameRegistry.addRecipe(new ItemStack(Casco_de_Azula, 1), new Object[]{"aaa","a a","   ",'a', Azula});
    GameRegistry.addRecipe(new ItemStack(Pechera_de_Azula, 1), new Object[]{"a a","aaa","aaa",'a', Azula});
    GameRegistry.addRecipe(new ItemStack(Pantalones_de_Azula, 1), new Object[]{"aaa","a a","a a",'a', Azula});
    GameRegistry.addRecipe(new ItemStack(Botas_de_Azula, 1), new Object[]{"   ","a a","a a",'a', Azula});
    GameRegistry.addRecipe(new ItemStack(Casco_de_Redstoner, 1), new Object[]{"rrr","r r","   ",'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Pechera_de_Redstoner, 1), new Object[]{"r r","rrr","rrr",'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Pantalones_de_Redsoner, 1), new Object[]{"rrr","r r","r r",'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Botas_de_Redstoner, 1), new Object[]{"   ","r r","r r",'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Espada_de_Redstoner, 1), new Object[]{" r "," r "," s ",'r', Items.redstone, 's', Items.stick});
    GameRegistry.addRecipe(new ItemStack(Pico_de_Redstoner, 1), new Object[]{"rrr"," s "," s ",'s', Items.stick, 'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Pala_de_Redstoner, 1), new Object[]{" r "," s "," s ",'s', Items.stick, 'r', Items.redstone});
    GameRegistry.addRecipe(new ItemStack(Droga_Zombie, 2), new Object[]{"ppp","ctc","ppp",'p', Items.paper,'c', Items.rotten_flesh,'t', Tabaco});
    GameRegistry.addRecipe(new ItemStack(Vozdca, 1), new Object[]{" s "," b ","   ",'s', Items.wheat_seeds,'b', Botella});
    GameRegistry.addRecipe(new ItemStack(Botella, 1), new Object[]{"   "," c "," c ",'c', Blocks.glass_pane});
    GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1), new Object[]{"obo","bsb","obo",'o', Blocks.obsidian,'s', Items.spawn_egg,'b', Blocks.iron_bars});
    GameRegistry.addRecipe(new ItemStack(Moneda, 5), new Object[]{" o ","o o"," o ",'o', Items.gold_ingot});
    GameRegistry.addRecipe(new ItemStack(Espada_Siz, 1), new Object[]{" p "," p "," o ",'o', Blocks.obsidian,'p', Plutonio});
    GameRegistry.addRecipe(new ItemStack(Vino, 2), new Object[]{"sss"," c "," b ",'s', Items.wheat_seeds, 'c', Items.water_bucket, 'b', Botella});
    GameRegistry.addRecipe(new ItemStack(Mesa_de_Azula, 1), new Object[]{"aaa","ama","aaa",'a', Azula, 'm', Blocks.crafting_table});
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Bloque_de_Plastico, 1), new Object[]{"ppp","ppp","ppp",'p', "plastico"}));
    GameRegistry.addRecipe(new ItemStack(Pan_20, 1), new Object[]{"   ","ppp","   ",'p', Items.bread});
    GameRegistry.addRecipe(new ItemStack(Cristal_de_ovni, 1), new Object[]{"ccc","cpc","ccc",'c', Blocks.glass,'p', Plutonio});
    GameRegistry.addRecipe(new ItemStack(Cuchillo, 1), new Object[]{"  h"," h ","p  ",'h', Items.iron_ingot,'p', Items.stick});
    GameRegistry.addRecipe(new ItemStack(Espada_de_Plata, 1), new Object[]{" p "," p "," s ",'p', Plata2,'s', Items.stick});
    GameRegistry.addRecipe(new ItemStack(Espada_del_Eden, 1), new Object[]{" e ","prp"," s ",'e', Espada_de_Antimateria,'r', Espada_de_Wither,'p', Blocks.glowstone,'s', Hueso_de_Wither});
    GameRegistry.addRecipe(new ItemStack(Azula, 1), new Object[]{"ppp","ppp","ppp",'p', Pepita_de_Azula});
    GameRegistry.addRecipe(new ItemStack(Bloque_De_Estrella_Del_Wither, 1), new Object[]{"eee","eee","eee",'e', Items.nether_star});
    GameRegistry.addRecipe(new ItemStack(Mango_de_Antimateria, 1), new Object[]{"plp","vlv","#a#", 'p', Plutonio, 'l', Lingote_de_Antimateria, 'v',Vapor_de_electrones, 'a',Palos_de_blaze});
    GameRegistry.addRecipe(new ItemStack(Filo_de_Antimateria, 1), new Object[]{"plp","flf","vlv",'p', Plutonio, 'l', Lingote_de_Antimateria, 'f', Fluido_de_suspension, 'v', Vapor_de_electrones});
    
    
    
    
    //Crafteos de horno
    GameRegistry.addSmelting(Mena_de_Azula,new ItemStack(Azula, 1), 35.0F);
    GameRegistry.addSmelting(Blocks.dirt,new ItemStack(Caca, 1), 35.0F);
    GameRegistry.addSmelting(Items.sugar, new ItemStack(Tabaco, 2), 36.0F);
    GameRegistry.addSmelting(Items.apple, new ItemStack(Azucarillos, 3), 35.0F);
    GameRegistry.addSmelting(Antimateria, new ItemStack(Lingote_de_Antimateria, 3), 40.0F);
    GameRegistry.addSmelting(Carne_de_Oveja,new ItemStack(Carne_de_Oveja_cocinada, 1), 32.0F);
    
    
    
  
    
    //sin forma
    
    GameRegistry.addShapelessRecipe(new ItemStack(Palos_de_blaze, 1), new Object[]{Items.blaze_rod,Items.blaze_rod});
    GameRegistry.addShapelessRecipe(new ItemStack(Bloque_de_Losa, 1), new Object[]{Blocks.stone_slab,Blocks.stone_slab,Blocks.stone_slab,Blocks.stone_slab});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new Object[]{Metal});
    GameRegistry.addShapelessRecipe(new ItemStack(Metal, 9), new Object[]{Bloque_de_metal});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar, 3), new Object[]{Azucarillos});
    GameRegistry.addShapelessRecipe(new ItemStack(Piedra_base, 2), new Object[]{Blocks.obsidian});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball, 2), new Object[]{Fluido_de_suspension});
    GameRegistry.addShapelessRecipe(new ItemStack(Tela, 4), new Object[]{Blocks.wool, new ItemStack(Cuchillo,1,OreDictionary.WILDCARD_VALUE)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 2), new Object[]{Tela});
    GameRegistry.addShapelessRecipe(new ItemStack(Infusion_de_Vida, 1), new Object[]{Items.glass_bottle, Items.wheat_seeds});
    GameRegistry.addShapelessRecipe(new ItemStack(Manzana_R, 1), new Object[]{Infusion_de_Vida, Items.apple});
    GameRegistry.addShapelessRecipe(new ItemStack(Infusion_de_Veneno, 1), new Object[]{Items.glass_bottle, Caca});
    GameRegistry.addShapelessRecipe(new ItemStack(Manzana_V, 1), new Object[]{Infusion_de_Veneno, Items.apple});
    GameRegistry.addShapelessRecipe(new ItemStack(Infusion_de_Wither, 1), new Object[]{Items.glass_bottle, Hueso_de_Wither});
    GameRegistry.addShapelessRecipe(new ItemStack(Infusion_de_Invisibilidad, 1), new Object[]{Items.glass_bottle, Items.water_bucket});
    GameRegistry.addShapelessRecipe(new ItemStack(Manzana_W, 1), new Object[]{Infusion_de_Wither, Items.apple});
    GameRegistry.addShapelessRecipe(new ItemStack(Manzana_A, 4), new Object[]{Items.golden_apple, Items.golden_apple, Items.golden_apple, Items.golden_apple});
    GameRegistry.addShapelessRecipe(new ItemStack(Manzana_I, 1), new Object[]{Items.apple, Infusion_de_Invisibilidad});
    GameRegistry.addShapelessRecipe(new ItemStack(Plata2, 1), new Object[]{Items.iron_ingot, Blocks.glass});
    GameRegistry.addShapelessRecipe(new ItemStack(Pepita_de_Azula, 9), new Object[]{Azula});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.nether_star, 9), new Object[]{Bloque_De_Estrella_Del_Wither});
    
	
	

    }

}