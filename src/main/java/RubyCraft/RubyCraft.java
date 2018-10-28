package RubyCraft;

import org.apache.logging.log4j.LogManager;

import Eventos.EventosTab;
import Eventos.IniciarItemsEventos;
import Eventos.Ver_fecha_calendario_usuario;
import Eventos.Verificar_Fecha;
import HerraCraft.herracraft;
import RubyCraft.Actualizaciones.Buscar_Actualizaciones;
import RubyCraft.Actualizaciones.TestearActualizaciones;
import RubyCraft.Aldeas.Tradeos_Aldeanos;
import RubyCraft.Armaduras.CascodeRuby;
import RubyCraft.Armaduras.CascodeZafiro;
import RubyCraft.Armaduras.Paloverde;
import RubyCraft.Armaduras.PantacasdeRuby;
import RubyCraft.Armaduras.PantacasdeUranio;
import RubyCraft.Armaduras.PantacasdeZafiro;
import RubyCraft.Armaduras.PetodePlatino;
import RubyCraft.Armaduras.PetodeRuby;
import RubyCraft.Armaduras.PetodeUranio;
import RubyCraft.Armaduras.PetodeZafiro;
import RubyCraft.Armaduras.botasdePlatino;
import RubyCraft.Armaduras.botasdeRuby;
import RubyCraft.Armaduras.botasdeUranio;
import RubyCraft.Armaduras.botasdeZafiro;
import RubyCraft.Armaduras.cascodePlatino;
import RubyCraft.Armaduras.cascodeUranio;
import RubyCraft.Armaduras.pantacasdePlatino;
import RubyCraft.Bases.Bloque_Reforzado_Base;
import RubyCraft.Bases.CancionesBase;
import RubyCraft.Bases.Cementos_Bases;
import RubyCraft.Biomas.Registrar_Biomas;
import RubyCraft.Biomas.WorldTypeRuby;
import RubyCraft.Bloques.Andesita;
import RubyCraft.Bloques.Andesita_Pulida;
import RubyCraft.Bloques.BloqueObservador;
import RubyCraft.Bloques.Bloque_Galactico;
import RubyCraft.Bloques.Bloque_de_Actualizaciones;
import RubyCraft.Bloques.Bloque_de_Aluminio;
import RubyCraft.Bloques.Bloque_de_Blaze;
import RubyCraft.Bloques.Bloque_de_Diamante_Trol;
import RubyCraft.Bloques.Bloque_de_Herobrine;
import RubyCraft.Bloques.Bloque_de_Pasto;
import RubyCraft.Bloques.Bloque_de_Pedernal;
import RubyCraft.Bloques.Bloque_de_Platino;
import RubyCraft.Bloques.Bloque_de_Regeneracion;
import RubyCraft.Bloques.Bloque_de_Slime;
import RubyCraft.Bloques.Bloque_de_azucar;
import RubyCraft.Bloques.Bloque_de_comandos;
import RubyCraft.Bloques.Bloque_de_hueso;
import RubyCraft.Bloques.Bloque_de_veneno;
import RubyCraft.Bloques.Bloque_de_verruga;
import RubyCraft.Bloques.Bloque_del_nether_rojo;
import RubyCraft.Bloques.BloquedeEnderPearld;
import RubyCraft.Bloques.BloquedeOjodeEnder;
import RubyCraft.Bloques.Calabaza_Espectral;
import RubyCraft.Bloques.Cristal_Verde_Lima;
import RubyCraft.Bloques.Cristal_azul_claro;
import RubyCraft.Bloques.Cuarzo_azul;
import RubyCraft.Bloques.Cuarzo_rojo;
import RubyCraft.Bloques.Cuarzo_verde;
import RubyCraft.Bloques.Diorita;
import RubyCraft.Bloques.Diorita_Pulida;
import RubyCraft.Bloques.Generar_Dragon;
import RubyCraft.Bloques.Granito;
import RubyCraft.Bloques.Granito_Pulido;
import RubyCraft.Bloques.Ladrillo_Marino;
import RubyCraft.Bloques.Ladrillo_de_Andesita;
import RubyCraft.Bloques.Ladrillo_de_Diorita;
import RubyCraft.Bloques.Ladrillo_de_Granito;
import RubyCraft.Bloques.Ladrillo_de_Infrapiedra;
import RubyCraft.Bloques.Ladrillo_de_obsidiana;
import RubyCraft.Bloques.Ladrillo_de_piedra_del_end;
import RubyCraft.Bloques.Ladrillo_del_Bosque;
import RubyCraft.Bloques.Ladrillos_de_prismarina;
import RubyCraft.Bloques.Madera_Azul;
import RubyCraft.Bloques.Mena_de_Aluminio;
import RubyCraft.Bloques.Mena_de_Cobre;
import RubyCraft.Bloques.Mena_de_Platino;
import RubyCraft.Bloques.Mena_de_Ruby;
import RubyCraft.Bloques.Mena_de_Ruby_end;
import RubyCraft.Bloques.Mena_de_Zafiro;
import RubyCraft.Bloques.Mena_de_Zafiroend;
import RubyCraft.Bloques.Mesa_de_Trabajo_de_Zafiro_Basica;
import RubyCraft.Bloques.PilarPurpur;
import RubyCraft.Bloques.PistonSlimeBase;
import RubyCraft.Bloques.Piston_de_Slime_Cabeza;
import RubyCraft.Bloques.Prismarina_oscura;
import RubyCraft.Bloques.bloquedeZafiro;
import RubyCraft.Bloques.bloquedecaca;
import RubyCraft.Bloques.bloquederuby;
import RubyCraft.Bloques.bloquedeuranio;
import RubyCraft.Bloques.bloqueluminiscente;
import RubyCraft.Bloques.bloquepurpur;
import RubyCraft.Bloques.linterna_de_mar;
import RubyCraft.Bloques.maderaverde;
import RubyCraft.Bloques.magma;
import RubyCraft.Bloques.obsidiana_que_llora;
import RubyCraft.Bloques.prismarina;
import RubyCraft.Bloques.tronco_Azul;
import RubyCraft.Bloques.troncoverde;
import RubyCraft.Combustible_Iniciar.Combustible_Principal;
import RubyCraft.Encantamientos.Botas_de_Velocidad;
import RubyCraft.Encantamientos.Grebas_de_Regeneracion;
import RubyCraft.Entidades.Entidades_Principal;
import RubyCraft.Eventos.Eventos_Principal;
import RubyCraft.Eventos.trol;
import RubyCraft.Generacion.Generacion_Principal;
import RubyCraft.Generacion.Loot_Cofres;
import RubyCraft.Gui.GuiHandler;
import RubyCraft.Integracion.BuscadordeMods;
import RubyCraft.Integracion.DropeoMobsIntegracionHandler;
import RubyCraft.Items.Aliento_del_Dragon;
import RubyCraft.Items.Aluminio;
import RubyCraft.Items.Amuleto;
import RubyCraft.Items.Anillo;
import RubyCraft.Items.Arco_de_Ruby;
import RubyCraft.Items.Arco_de_Zafiro;
import RubyCraft.Items.Azada_de_Platino;
import RubyCraft.Items.Azada_de_cobre;
import RubyCraft.Items.Azadaderuby;
import RubyCraft.Items.Barita;
import RubyCraft.Items.Barras_de_Aluminio;
import RubyCraft.Items.Bloque_de_Cobre;
import RubyCraft.Items.BoladeResina;
import RubyCraft.Items.Caparazon_Shulker;
import RubyCraft.Items.Cobre;
import RubyCraft.Items.Colores;
import RubyCraft.Items.Elytra;
import RubyCraft.Items.Espada_de_Platino;
import RubyCraft.Items.Espadaderuby;
import RubyCraft.Items.Granada_de_Ruby;
import RubyCraft.Items.Granada_de_Uranio;
import RubyCraft.Items.Granada_de_Zafiro;
import RubyCraft.Items.Hacha_de_Platino;
import RubyCraft.Items.Hacha_de_cobre;
import RubyCraft.Items.Hachadezafiro;
import RubyCraft.Items.Lingote_Galactico;
import RubyCraft.Items.Manzana_de_diamante;
import RubyCraft.Items.Moldes_para_cofres;
import RubyCraft.Items.Pala_de_Platino;
import RubyCraft.Items.Pala_de_cobre;
import RubyCraft.Items.Paladeruby;
import RubyCraft.Items.Paladezafiro;
import RubyCraft.Items.Palo_Morado;
import RubyCraft.Items.Pepita_de_Hierro;
import RubyCraft.Items.Pepita_de_Ruby;
import RubyCraft.Items.Pepita_de_Zafiro;
import RubyCraft.Items.Pico_de_Platino;
import RubyCraft.Items.Pico_de_cobre;
import RubyCraft.Items.Plastico;
import RubyCraft.Items.Platino;
import RubyCraft.Items.Ruby;
import RubyCraft.Items.Tijera_de_ruby;
import RubyCraft.Items.Tijeras_de_Platino;
import RubyCraft.Items.Tijeras_de_cobre;
import RubyCraft.Items.Tijeras_de_zafiro;
import RubyCraft.Items.Totem_de_la_no_muerte;
import RubyCraft.Items.Uranio;
import RubyCraft.Items.Zafiro;
import RubyCraft.Items.azadadezafiro;
import RubyCraft.Items.cristal_de_prismarina;
import RubyCraft.Items.espada_de_cobre;
import RubyCraft.Items.espadadezafiro;
import RubyCraft.Items.fragmento_de_prismarina;
import RubyCraft.Items.frutapurpurcocinada;
import RubyCraft.Items.hachaderuby;
import RubyCraft.Items.marcodelamuleto;
import RubyCraft.Items.picoderuby;
import RubyCraft.Items.picodezafiro;
import RubyCraft.Lamparas.Lampara_de_Ruby;
import RubyCraft.Lamparas.Lampara_de_Zafiro;
import RubyCraft.Maquinas.Mesa_De_Conjuraciones;
import RubyCraft.Maquinas.Mesa_de_trabajo_de_abedul;
import RubyCraft.Maquinas.Mesa_de_trabajo_de_abeto;
import RubyCraft.Maquinas.Mesa_de_trabajo_de_acacia;
import RubyCraft.Maquinas.Mesa_de_trabajo_de_jungla;
import RubyCraft.Maquinas.Mesa_de_trabajo_de_roble_oscuro;
import RubyCraft.Maquinas.MesadeTrabajodeRuby;
import RubyCraft.Maquinas.MesadeTrabajodeZafiro;
import RubyCraft.Maquinas.Transformador_de_Losas_a_Bloques;
import RubyCraft.Maquinas.bloqueestructural;
import RubyCraft.Minecraft.DropeoMobsHandler;
import RubyCraft.Minecraft.Modificacion_Principal;
import RubyCraft.Proxy.ServerProxy;
import RubyCraft.Registrar.BuscarVersionTrol;
import RubyCraft.Registrar.Crafteos;
import RubyCraft.Registrar.Eliminar_Crafteos;
import RubyCraft.Registrar.Logros;
import RubyCraft.Registrar.OreDictonary;
import RubyCraft.Teclas.Teclas_Principal;
import RubyCraft.TileEntity.Cofre_de_Ruby;
import RubyCraft.TileEntity.TileEntitys_Principal;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.util.DamageSource;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = RubyCraft.modid, version = RubyCraft.version)
public class RubyCraft {
	
	//Variado
	public static final org.apache.logging.log4j.Logger logger = LogManager.getFormatterLogger("RubyCraft");
	
	 public static final String modid = "rc";
	 public static final String version = "1.12";
	 
	@Instance(modid)
	public static RubyCraft instance;
	
    public static BuscadordeMods modChecker;
	 
	@SidedProxy(clientSide = "RubyCraft.Proxy.ClientProxy", serverSide = "RubyCraft.Proxy.ServerProxy")
	public static ServerProxy proxy;


	//Items 
 public static Item ruby; 
 public static Item colores;
 public static Item Marcodelamuleto;
 public static Item amuleto;
 public static Item anillo;
 public static Item uranio;
 public static Item zafiro;
 public static Item elytra;
 public static Item Pandecalabaza;
 public static Item paloverde;
 public static Item fragmento_de_prismarina;
 public static Item cristal_de_prismarina;
 public static Item BoladeResina;
 public static Item Plastico;
 public static Item frutapurpurcocinada;
 public static Item Frutapurpur;
 public static Item Huevo_frito;
 public static Item Granada_de_Ruby;
 public static Item Arco_de_Ruby;
 public static Item Manzana_de_diamante;
 public static Item Granada_de_Zafiro;
 public static Item Arco_de_Zafiro;
 public static Item Totem_de_la_no_muerte;
 public static Item Granada_de_Uranio;
 public static Item Barita;
 public static Item Pepita_de_Ruby;
 public static Item Pepita_de_Hierro;
 public static Item Pepita_de_Zafiro;
 public static Item Aliento_del_Dragon;
 public static Item Aluminio;
 public static Item Barras_de_Aluminio;
 public static Item Cobre;
 public static Item Platino;
 public static Item Lingote_Galactico;
 public static Item Caparazon_Shulker;
 public static Item Moldes_para_cofres;
 public static Item Palo_Morado;
 
 //Discos

 public static Item CanciondeSansDisco;
 public static Item PPAP_Long_Version;
 public static Item TrapAdvenureMusicLevel1;
 public static Item moviemientonaranja;
 public static Item bossparca;
 
 //Herramientas 
 public static Item Hachaderuby;
 public static Item Picoderuby;
 public static Item Paladeruby;
 public static Item Azadaderuby;
 public static Item Espadaderuby;
 public static Item Tijera_de_ruby;
				
 public static Item Hachadezafiro;
 public static Item Picodezafiro;
 public static Item Paladezafiro;
 public static Item Azadadezafiro;
 public static Item Espadadezafiro;
 public static Item Tijeras_de_zafiro;
 
 public static Item Espada_de_Platino;
 public static Item Pico_de_Platino;
 public static Item Hacha_de_Platino;
 public static Item Pala_de_Platino;
 public static Item Azada_de_Platino;
 public static Item Tijeras_de_Platino;
 
 public static Item Pico_de_cobre;
 public static Item Hacha_de_cobre;
 public static Item espada_de_cobre;
 public static Item Pala_de_cobre;
 public static Item Azada_de_cobre;
 public static Item Tijeras_de_cobre;
		
//Armaduras
public static Item CascodeRuby; 
public static Item PetodeRuby;
public static Item PantacasdeRuby;
public static Item botasdeRuby;
				
public static Item CascodeZafiro;
public static Item PetodeZafiro;
public static Item PantacasdeZafiro;
public static Item botasdeZafiro;


public static Item cascodeUranio;
public static Item PetodeUranio;
public static Item PantacasdeUranio;
public static Item botasdeUranio;

public static Item cascodePlatino;
public static Item PetodePlatino;
public static Item pantacasdePlatino;
public static Item botasdePlatino;

//Bloques 
public static Block Bloquederuby;
public static Block Bloqueluminiscente;
public static Block Bloquedeuranio;
public static Block Bloquedecaca;
public static Block BloquedeZafiro;
public static Block Bloquepurpur;
public static Block Bloque_de_hueso;
public static Block Mena_de_Ruby;
public static Block maderaverde;	
public static Block troncoverde;
public static Block Bloque_del_nether_rojo;
public static Block magma;
public static Block prismarina;
public static Block Prismarina_oscura;
public static Block Ladrillos_de_prismarina;
public static Block linterna_de_mar;
public static Block Bloque_de_verruga;
public static Block Bloque_de_Blaze;
public static Block Ladrillo_de_piedra_del_end;
public static Block Bloque_de_azucar;
public static Block Cuarzo_azul;
public static Block Cuarzo_verde;
public static Block Cuarzo_rojo;
public static Block Ladrillo_de_obsidiana;
public static Block tronco_Azul;
public static Block Madera_Azul;
public static Block PilarPurpur;
public static Block Ladrillo_Marino;
public static Block Ladrillo_del_Bosque;
public static Block Cristal_azul_claro;
public static Block Bloque_de_veneno;
public static Block Bloque_de_Regeneracion;
public static Block Mena_de_Zafiro;
public static Block Cristal_Verde_Lima;	
public static Block Bloque_de_Diamante_Trol;
public static Block Bloque_de_comandos;
public static Block Mena_de_Ruby_end;
public static Block Bloque_de_Pedernal;
public static Block Diorita;
public static Block Diorita_Pulida;
public static Block Granito;
public static Block Granito_Pulido;
public static Block Andesita;
public static Block Andesita_Pulida;
public static Block BloquedeOjodeEnder;
public static Block BloquedeEnderPearld;
public static Block Mena_de_Zafiroend;
public static Block Bloque_de_Slime;
public static Block Bloque_de_Pasto;
public static Block Mesa_de_Trabajo_de_Zafiro_Basica;
public static Block Mesa_De_Conjuraciones;
public static Block Ladrillo_de_Infrapiedra;
public static Block Bloque_de_Cobre;
public static Block Bloque_de_Aluminio;
public static Block Bloque_de_Platino;
public static Block Mena_de_Cobre;
public static Block Mena_de_Aluminio;
public static Block Mena_de_Platino;
public static Block Bloque_Galactico;
public static Block Ladrillo_de_Granito;
public static Block Ladrillo_de_Andesita;
public static Block Ladrillo_de_Diorita;
public static Block Generar_Dragon;
public static Block BloqueObservador;
public static Block Calabaza_Espectral;
public static Block Bloque_de_Herobrine;
public static Block obsidiana_que_llora;
public static Block Bloque_de_Actualizaciones;
public static Block Bloque_Reforzado_Tier_1;
public static Block Bloque_Reforzado_Tier_2;
public static Block Bloque_Reforzado_Tier_3;
	

//mesa de Crafteo
public static Block Mesa_de_trabajo_de_acacia;
public static final int guiIDMesadetrabajodeacacia = 5;

public static Block Mesa_de_trabajo_de_abedul;
public static final int guiIDMesadetrabajodeabedul = 6;

public static Block Mesa_de_trabajo_de_roble_oscuro;
public static final int guiIDMesadetrabajoderobleoscuro = 7;

public static Block Mesa_de_trabajo_de_abeto;
public static final int guiIDMesadetrabajodeabeto = 8;

public static Block Mesa_de_trabajo_de_jungla;
public static final int guiIDMesadetrabajodejungla = 9;

//Losas
		
//Lamparas
		
public static Block Lampara_de_Ruby_Encendida;
public static Block Lampara_de_Ruby_Apagada;
public static Block Lampara_de_Zafiro_Encendida;
public static Block Lampara_de_Zafiro_Apagada;
	
//Maquinas
	
public static Block MesadeTrabajodeRuby;
public static final int guiIDMesadeTrabajodeRuby = 0;
		
public static Block MesadeTrabajodeZafiro;
public static final int guiIDMesadeTrabajodeZafiro = 1;
		
public static final int guiIDBloqueEStructural = 2;
public static Block Bloqueestructural;

public static final int guiIDTransformadorLosisl = 3;
public static Block Transformador_de_Losas_a_Bloques;

public static final int guiIdMesaEscaleraZafiro = 4;

//TileEntitys

public static Block Cofre_de_Ruby;

//Variado

public static Block SlimePistonNormal;
public static Block SlimePistonPegajoso;
public static Block SlimePistonCabeza;
		
//DamageSource
public static DamageSource Magma = new DamageSource("Magma");
public static DamageSource Troleo = new DamageSource("Troleo").setDamageAllowedInCreativeMode();

 //Tabs
public static CreativeTabs Rubycrafttab = new TabdeCreativoAvanzada(CreativeTabs.getNextID(), RubyCraft.modid, RubyCraft.modid + "." + "Rubycrafttab", 0);
public static CreativeTabs EventosTab = new EventosTab(CreativeTabs.getNextID(), RubyCraft.modid, "EventosTab", 0);

//Materiales
		  
public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial", 4, 3000, 10.0F, 5.0F, 45);		 
public static final Item.ToolMaterial zafiromaterial = EnumHelper.addToolMaterial("zafiromaterial", 5, 2000, 35.0F, 8.0F, 45);
public static final Item.ToolMaterial NadaMaterial = EnumHelper.addToolMaterial("NadaMaterial", 1, 100, 1, 1, 1);
public static final Item.ToolMaterial PlatinoMaterial = EnumHelper.addToolMaterial("PlatinoMaterial", 6, 4000, 45.0F, 10.0F, 45);
public static final Item.ToolMaterial CobreMaterial = EnumHelper.addToolMaterial("CobreMaterial", 2, 500, 15.0F, 2.0F, 45);

public static final ItemArmor.ArmorMaterial RubyArmorMaterial = EnumHelper.addArmorMaterial("RubyArmorMaterial", 3000, new int[]{4,5,4,4}, 45);	   
public static final ItemArmor.ArmorMaterial ZafiroArmorMaterial = EnumHelper.addArmorMaterial("ZafiroArmorMaterial", 2000, new int[]{5,6,7,2}, 45);	
public static final ItemArmor.ArmorMaterial UranioArmorMaterial = EnumHelper.addArmorMaterial("UranioArmorMaterial", 1000, new int[]{3,5,3,1}, 45);
public static final ItemArmor.ArmorMaterial ElytraArmor = EnumHelper.addArmorMaterial("ElytraArmor", 320, new int[]{1,1,1,1}, 45);
public static final ItemArmor.ArmorMaterial PlatinoArmor = EnumHelper.addArmorMaterial("PlatinoArmor", 4000, new int[]{5,5,5,5}, 45);

//EncantaMientos

public static final Enchantment BotasdeVelocidad = new Botas_de_Velocidad(84, 5);
public static final Enchantment Grebas_de_Regeneracion = new Grebas_de_Regeneracion(85, 6);

public static boolean VersionTrol = false;
public static boolean Navidad = false;
public static boolean HalloWen = false;
public static boolean Dia_de_Los_Inocentes = false;
public static boolean cliente = false;
@EventHandler
public void Preinit(FMLPreInitializationEvent event){
	if(event.getSide()==Side.CLIENT) {
		cliente = true;
	}
	
	if(!cliente) {
		Ver_fecha_calendario_usuario.iniciar();
	}
	  	   
	herracraft.preinit();
	if(RubyCraft.VersionTrol && !Navidad) {
		VersionTrolActivar();
	}
Control_de_Version.Iniciar_todo();

if(Control_de_Version.Version_de_desarrolador == false) {
Buscar_Actualizaciones.MirarActualizaciones();
}
BuscarVersionTrol.MirarVersionTrol();
Eliminar_Crafteos.IniciarEliminarCrafteos();

TileEntitys_Principal.Registrar();
Entidades_Principal.mainRegistry();

Cementos_Bases.Iniciar();

modChecker = new BuscadordeMods();
modChecker.Mensaje();

Generacion_Principal.InicicializarGeneraciones();
		
NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

MinecraftForge.EVENT_BUS.register(new DropeoMobsHandler());
MinecraftForge.EVENT_BUS.register(new DropeoMobsIntegracionHandler());
Teclas_Principal.Iniciar();	


//Herramientas
Picoderuby = new picoderuby(rubyToolMaterial).setUnlocalizedName("Picoderuby").setTextureName(modid + ":Picoderuby").setCreativeTab(Rubycrafttab);
Hachaderuby = new hachaderuby(rubyToolMaterial).setUnlocalizedName("Hachaderuby").setTextureName(modid + ":hacha_de_ruby").setCreativeTab(Rubycrafttab);
Paladeruby = new Paladeruby(rubyToolMaterial).setUnlocalizedName("Paladeruby").setTextureName(modid + ":pala_de_ruby").setCreativeTab(Rubycrafttab);
Espadaderuby = new Espadaderuby(rubyToolMaterial).setUnlocalizedName("Espadaderuby").setTextureName(modid + ":espada_de_ruby").setCreativeTab(Rubycrafttab);
Azadaderuby = new Azadaderuby(rubyToolMaterial).setUnlocalizedName("Azadaderuby").setTextureName(modid + ":azada_de_ruby").setCreativeTab(Rubycrafttab);
Tijera_de_ruby = new Tijera_de_ruby(rubyToolMaterial).setUnlocalizedName("Tijera_de_ruby").setTextureName(modid + ":Tijera_de_ruby").setCreativeTab(Rubycrafttab);

Picodezafiro = new picodezafiro(zafiromaterial).setUnlocalizedName("Picodezafiro").setTextureName(modid + ":picodezafiro").setCreativeTab(Rubycrafttab);
Hachadezafiro = new Hachadezafiro(zafiromaterial).setUnlocalizedName("HachadeZafiro").setTextureName(modid + ":hachadezafiro").setCreativeTab(Rubycrafttab);	
Paladezafiro = new Paladezafiro(zafiromaterial).setUnlocalizedName("Paladezafiro").setTextureName(modid + ":paladezafiro").setCreativeTab(Rubycrafttab);
Espadadezafiro = new espadadezafiro(zafiromaterial).setUnlocalizedName("Espadadezafiro").setTextureName(modid + ":espadadezafiro").setCreativeTab(Rubycrafttab);
Azadadezafiro = new azadadezafiro(zafiromaterial).setUnlocalizedName("Azadadezafiro").setTextureName(modid + ":azadadezafiro").setCreativeTab(Rubycrafttab);
Tijeras_de_zafiro = new Tijeras_de_zafiro(zafiromaterial).setUnlocalizedName("Tijeras_de_zafiro").setTextureName(modid + ":Tijeras_de_zafiro").setCreativeTab(Rubycrafttab);

Pico_de_Platino = new Pico_de_Platino(PlatinoMaterial).setUnlocalizedName("Pico_de_Platino").setTextureName(modid + ":Pico_de_Platino").setCreativeTab(Rubycrafttab);
Hacha_de_Platino = new Hacha_de_Platino(PlatinoMaterial).setUnlocalizedName("Hacha_de_Platino").setTextureName(modid + ":Hacha_de_Platino").setCreativeTab(Rubycrafttab);
Pala_de_Platino = new Pala_de_Platino(PlatinoMaterial).setUnlocalizedName("Pala_de_Platino").setTextureName(modid + ":Pala_de_Platino").setCreativeTab(Rubycrafttab);
Espada_de_Platino = new Espada_de_Platino(PlatinoMaterial).setUnlocalizedName("Espada_de_Platino").setTextureName(modid + ":Espada_de_Platino").setCreativeTab(Rubycrafttab);
Azada_de_Platino = new Azada_de_Platino(PlatinoMaterial).setUnlocalizedName("Azada_de_Platino").setTextureName(modid + ":Azada_de_Platino").setCreativeTab(Rubycrafttab);
Tijeras_de_Platino = new Tijeras_de_Platino(PlatinoMaterial).setUnlocalizedName("Tijeras_de_Platino").setTextureName(modid + ":Tijeras_de_Platino").setCreativeTab(Rubycrafttab);

Pico_de_cobre = new Pico_de_cobre(CobreMaterial).setUnlocalizedName("Pico_de_cobre").setTextureName(modid + ":Pico_de_cobre").setCreativeTab(Rubycrafttab);
Hacha_de_cobre = new Hacha_de_cobre(CobreMaterial).setUnlocalizedName("Hacha_de_cobre").setTextureName(modid + ":Hacha_de_cobre").setCreativeTab(Rubycrafttab);
espada_de_cobre = new espada_de_cobre(CobreMaterial).setUnlocalizedName("espada_de_cobre").setTextureName(modid + ":espada_de_cobre").setCreativeTab(Rubycrafttab);
Pala_de_cobre = new Pala_de_cobre(CobreMaterial).setUnlocalizedName("Pala_de_cobre").setTextureName(modid + ":Pala_de_cobre").setCreativeTab(Rubycrafttab);
Azada_de_cobre = new Azada_de_cobre(CobreMaterial).setUnlocalizedName("Azada_de_cobre").setTextureName(modid + ":Azada_de_cobre").setCreativeTab(Rubycrafttab);
Tijeras_de_cobre = new Tijeras_de_cobre(CobreMaterial).setUnlocalizedName("Tijeras_de_cobre").setTextureName(modid + ":Tijeras_de_cobre").setCreativeTab(Rubycrafttab);

GameRegistry.registerItem(Picoderuby,Picoderuby.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Hachaderuby,Hachaderuby.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Paladeruby,Paladeruby.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Espadaderuby,Espadaderuby.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Azadaderuby,Azadaderuby.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Tijera_de_ruby, Tijera_de_ruby.getUnlocalizedName().substring(5));
		
GameRegistry.registerItem(Picodezafiro,Picodezafiro.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Hachadezafiro,Hachadezafiro.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Paladezafiro,Paladezafiro.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Espadadezafiro,Espadadezafiro.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Azadadezafiro,Azadadezafiro.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Tijeras_de_zafiro, Tijeras_de_zafiro.getUnlocalizedName().substring(5));

GameRegistry.registerItem(Pico_de_Platino, Pico_de_Platino.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Hacha_de_Platino, Hacha_de_Platino.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Pala_de_Platino, Pala_de_Platino.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Espada_de_Platino, Espada_de_Platino.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Azada_de_Platino, Azada_de_Platino.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Tijeras_de_Platino, Tijeras_de_Platino.getUnlocalizedName().substring(5));

GameRegistry.registerItem(Pico_de_cobre, Pico_de_cobre.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Hacha_de_cobre, Hacha_de_cobre.getUnlocalizedName().substring(5));
GameRegistry.registerItem(espada_de_cobre, espada_de_cobre.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Pala_de_cobre, Pala_de_cobre.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Azada_de_cobre, Azada_de_cobre.getUnlocalizedName().substring(5));
GameRegistry.registerItem(Tijeras_de_cobre, Tijeras_de_cobre.getUnlocalizedName().substring(5));

//Armadura
		
CascodeRuby = new CascodeRuby(RubyArmorMaterial, 0, 0).setUnlocalizedName("CascodeRuby").setTextureName(modid + ":CascodeRuby").setCreativeTab(Rubycrafttab);
PetodeRuby = new PetodeRuby(RubyArmorMaterial, 0, 1).setUnlocalizedName("PetodeRuby").setTextureName(modid + ":PetodeRuby").setCreativeTab(Rubycrafttab);
PantacasdeRuby = new PantacasdeRuby(RubyArmorMaterial, 0, 2).setUnlocalizedName("PantacasdeRuby").setTextureName(modid + ":PantacasdeRuby").setCreativeTab(Rubycrafttab);
botasdeRuby = new botasdeRuby(RubyArmorMaterial, 0, 3).setUnlocalizedName("botasdeRuby").setTextureName(modid + ":botasdeRuby").setCreativeTab(Rubycrafttab);
		
GameRegistry.registerItem(CascodeRuby, CascodeRuby.getUnlocalizedName().substring(5));
GameRegistry.registerItem(PetodeRuby, PetodeRuby.getUnlocalizedName().substring(5));
GameRegistry.registerItem(PantacasdeRuby, PantacasdeRuby.getUnlocalizedName().substring(5));
GameRegistry.registerItem(botasdeRuby, botasdeRuby.getUnlocalizedName().substring(5));


CascodeZafiro = new CascodeZafiro(ZafiroArmorMaterial, 0, 0).setUnlocalizedName("CascodeZafiro").setTextureName(modid + ":CascodeZafiro").setCreativeTab(Rubycrafttab);
PetodeZafiro = new PetodeZafiro(ZafiroArmorMaterial, 0, 1).setUnlocalizedName("PetodeZafiro").setTextureName(modid + ":PetodeZafiro").setCreativeTab(Rubycrafttab);
PantacasdeZafiro = new PantacasdeZafiro(ZafiroArmorMaterial, 0, 2).setUnlocalizedName("PantacasdeZafiro").setTextureName(modid + ":PantacasdeZafiro").setCreativeTab(Rubycrafttab);
botasdeZafiro = new botasdeZafiro(ZafiroArmorMaterial, 0, 3).setUnlocalizedName("botasdeZafiro").setTextureName(modid + ":botasdeZafiro").setCreativeTab(Rubycrafttab);
		
GameRegistry.registerItem(CascodeZafiro, CascodeZafiro.getUnlocalizedName().substring(5));
GameRegistry.registerItem(PetodeZafiro, PetodeZafiro.getUnlocalizedName().substring(5));
GameRegistry.registerItem(PantacasdeZafiro, PantacasdeZafiro.getUnlocalizedName().substring(5));
GameRegistry.registerItem(botasdeZafiro, botasdeZafiro.getUnlocalizedName().substring(5));

cascodeUranio = new cascodeUranio(UranioArmorMaterial, 0, 0).setUnlocalizedName("cascodeUranio").setTextureName(modid + ":cascodeUranio").setCreativeTab(Rubycrafttab);
PetodeUranio = new PetodeUranio(UranioArmorMaterial, 0 , 1).setUnlocalizedName("PetodeUranio").setTextureName(modid + ":PetodeUranio").setCreativeTab(Rubycrafttab);
PantacasdeUranio = new PantacasdeUranio(UranioArmorMaterial, 0, 2).setUnlocalizedName("PantacasdeUranio").setTextureName(modid + ":PantacasdeUranio").setCreativeTab(Rubycrafttab);
botasdeUranio = new botasdeUranio(UranioArmorMaterial, 0, 3).setUnlocalizedName("botasdeUranio").setTextureName(modid + ":botasdeUranio").setCreativeTab(Rubycrafttab);

GameRegistry.registerItem(cascodeUranio, cascodeUranio.getUnlocalizedName().substring(5));
GameRegistry.registerItem(PetodeUranio, PetodeUranio.getUnlocalizedName().substring(5));	
GameRegistry.registerItem(PantacasdeUranio, PantacasdeUranio.getUnlocalizedName().substring(5));
GameRegistry.registerItem(botasdeUranio, botasdeUranio.getUnlocalizedName().substring(5));

cascodePlatino = new cascodePlatino(PlatinoArmor, 0, 0).setUnlocalizedName("cascodePlatino").setTextureName(modid + ":cascodePlatino").setCreativeTab(Rubycrafttab);
PetodePlatino = new PetodePlatino(PlatinoArmor, 0, 1).setUnlocalizedName("PetodePlatino").setTextureName(modid + ":PetodePlatino").setCreativeTab(Rubycrafttab);
pantacasdePlatino = new pantacasdePlatino(PlatinoArmor, 0, 2).setUnlocalizedName("pantacasdePlatino").setTextureName(modid + ":pantacasdePlatino").setCreativeTab(Rubycrafttab);
botasdePlatino = new botasdePlatino(PlatinoArmor, 0, 3).setUnlocalizedName("botasdePlatino").setTextureName(modid + ":botasdePlatino").setCreativeTab(Rubycrafttab);

GameRegistry.registerItem(cascodePlatino, cascodePlatino.getUnlocalizedName().substring(5));
GameRegistry.registerItem(PetodePlatino, PetodePlatino.getUnlocalizedName().substring(5));
GameRegistry.registerItem(pantacasdePlatino, pantacasdePlatino.getUnlocalizedName().substring(5));
GameRegistry.registerItem(botasdePlatino, botasdePlatino.getUnlocalizedName().substring(5));

//Items
ruby = new Ruby().setUnlocalizedName("Ruby").setTextureName(modid + ":Ruby").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(ruby,ruby.getUnlocalizedName().substring(5));
	
colores = new Colores().setUnlocalizedName("colores").setTextureName(modid + ":colores").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(colores, colores.getUnlocalizedName().substring(5));
	
Marcodelamuleto = new marcodelamuleto().setUnlocalizedName("marcodelamuleto").setTextureName(modid + ":marcodelamuleto").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Marcodelamuleto, Marcodelamuleto.getUnlocalizedName().substring(5));
	
amuleto = new Amuleto().setUnlocalizedName("amuleto").setTextureName(modid + ":amuleto").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(amuleto, amuleto.getUnlocalizedName().substring(5));
	
anillo = new Anillo().setUnlocalizedName("anillo").setTextureName(modid + ":anillo").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(anillo, anillo.getUnlocalizedName().substring(5));
	
uranio = new Uranio().setUnlocalizedName("uranio").setTextureName(modid + ":uranio").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(uranio, uranio.getUnlocalizedName().substring(5));
	
zafiro = new Zafiro().setUnlocalizedName("zafiro").setTextureName(modid + ":zafiro").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(zafiro, zafiro.getUnlocalizedName().substring(5));
	
elytra = new Elytra(ElytraArmor, 0, 1).setUnlocalizedName("elytra").setTextureName(modid + ":elytra").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(elytra, elytra.getUnlocalizedName().substring(5));	

Pandecalabaza = new ItemFood(10, 1.0F, false).setUnlocalizedName("Pandecalabaza").setCreativeTab(Rubycrafttab).setTextureName(modid + ":Pandecalabaza");
GameRegistry.registerItem(Pandecalabaza, Pandecalabaza.getUnlocalizedName().substring(5));
	
paloverde = new Paloverde().setUnlocalizedName("paloverde").setCreativeTab(Rubycrafttab).setTextureName(modid + ":paloverde");
GameRegistry.registerItem(paloverde, paloverde.getUnlocalizedName().substring(5));
	
fragmento_de_prismarina = new fragmento_de_prismarina().setUnlocalizedName("fragmento_de_prismarina").setCreativeTab(Rubycrafttab).setTextureName(modid + ":fragmento_de_prismarina");
GameRegistry.registerItem(fragmento_de_prismarina, fragmento_de_prismarina.getUnlocalizedName().substring(5));	
	
cristal_de_prismarina = new cristal_de_prismarina().setUnlocalizedName("cristal_de_prismarina").setCreativeTab(Rubycrafttab).setTextureName(modid + ":cristal_de_prismarina");
GameRegistry.registerItem(cristal_de_prismarina, cristal_de_prismarina.getUnlocalizedName().substring(5));

BoladeResina = new BoladeResina().setUnlocalizedName("BoladeResina").setCreativeTab(Rubycrafttab).setTextureName(modid + ":BoladeResina");
GameRegistry.registerItem(BoladeResina, BoladeResina.getUnlocalizedName().substring(5));

Plastico = new Plastico().setUnlocalizedName("Plastico").setCreativeTab(Rubycrafttab).setTextureName(modid + ":Plastico");
GameRegistry.registerItem(Plastico, Plastico.getUnlocalizedName().substring(5));

frutapurpurcocinada = new frutapurpurcocinada().setUnlocalizedName("frutapurpurcocinada").setCreativeTab(Rubycrafttab).setTextureName(modid + ":frutapurpurcocinada");
GameRegistry.registerItem(frutapurpurcocinada, frutapurpurcocinada.getUnlocalizedName().substring(5));

Frutapurpur = new ItemFood(5, 0.5F, false).setUnlocalizedName("Frutapurpur").setCreativeTab(Rubycrafttab).setTextureName(modid + ":Frutapurpur");
GameRegistry.registerItem( Frutapurpur,  Frutapurpur.getUnlocalizedName().substring(5));

Huevo_frito = new ItemFood(5, 0.6F, true).setUnlocalizedName("Huevo_frito").setCreativeTab(Rubycrafttab).setTextureName(modid + ":Huevo_frito");
GameRegistry.registerItem(Huevo_frito, Huevo_frito.getUnlocalizedName().substring(5));
	
Granada_de_Ruby = new Granada_de_Ruby().setUnlocalizedName("Granada_de_Ruby").setTextureName(modid + ":Granada_de_Ruby").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Granada_de_Ruby, Granada_de_Ruby.getUnlocalizedName().substring(5));
	
Arco_de_Ruby = new Arco_de_Ruby().setUnlocalizedName("Arco_de_Ruby").setTextureName("arco_de_ruby").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Arco_de_Ruby, Arco_de_Ruby.getUnlocalizedName().substring(5));
	
Manzana_de_diamante = new Manzana_de_diamante(6, 1.0F, false).setUnlocalizedName("Manzana_de_diamante").setTextureName(modid + ":Manzana_de_diamante").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Manzana_de_diamante, Manzana_de_diamante.getUnlocalizedName().substring(5));
	
Granada_de_Zafiro = new Granada_de_Zafiro().setUnlocalizedName("Granada_de_Zafiro").setTextureName(modid + ":Granada_de_Zafiro").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Granada_de_Zafiro, Granada_de_Zafiro.getUnlocalizedName().substring(5));
	
Arco_de_Zafiro = new Arco_de_Zafiro().setUnlocalizedName("Arco_de_Zafiro").setTextureName(modid + ":Arco_de_Zafiro").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Arco_de_Zafiro, Arco_de_Zafiro.getUnlocalizedName().substring(5));
	
Totem_de_la_no_muerte = new Totem_de_la_no_muerte().setUnlocalizedName("Totem_de_la_no_muerte").setTextureName(modid + ":Totem_de_la_no_muerte").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Totem_de_la_no_muerte, Totem_de_la_no_muerte.getUnlocalizedName().substring(5));

Granada_de_Uranio = new Granada_de_Uranio().setUnlocalizedName("Granada_de_Uranio").setTextureName(modid + ":Granada_de_Uranio").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Granada_de_Uranio, Granada_de_Uranio.getUnlocalizedName().substring(5));

Barita = new Barita(NadaMaterial).setUnlocalizedName("Barita").setTextureName(modid + ":Barita").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Barita, Barita.getUnlocalizedName().substring(5));

Pepita_de_Ruby = new Pepita_de_Ruby().setUnlocalizedName("Pepita_de_Ruby").setTextureName(modid + ":Pepita_de_Ruby").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Pepita_de_Ruby, Pepita_de_Ruby.getUnlocalizedName().substring(5));

Pepita_de_Zafiro = new Pepita_de_Zafiro().setUnlocalizedName("Pepita_de_Zafiro").setTextureName(modid + ":Pepita_de_Zafiro").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Pepita_de_Zafiro, Pepita_de_Zafiro.getUnlocalizedName().substring(5));

Aliento_del_Dragon = new Aliento_del_Dragon().setUnlocalizedName("Aliento_del_Dragon").setTextureName(modid + ":Aliento_del_Dragon").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Aliento_del_Dragon, Aliento_del_Dragon.getUnlocalizedName().substring(5));

Aluminio = new Aluminio().setUnlocalizedName("Aluminio").setTextureName(modid + ":Aluminio").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Aluminio, Aluminio.getUnlocalizedName().substring(5));

Barras_de_Aluminio = new Barras_de_Aluminio().setUnlocalizedName("Barras_de_Aluminio").setTextureName(modid + ":Barras_de_Aluminio").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Barras_de_Aluminio, Barras_de_Aluminio.getUnlocalizedName().substring(5));

Cobre = new Cobre().setUnlocalizedName("Cobre").setTextureName(modid + ":Cobre").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Cobre, Cobre.getUnlocalizedName().substring(5));

Platino = new Platino().setUnlocalizedName("Platino").setTextureName(modid + ":Platino").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Platino, Platino.getUnlocalizedName().substring(5));

Lingote_Galactico = new Lingote_Galactico().setUnlocalizedName("Lingote_Galactico").setTextureName(modid + ":Lingote_Galactico").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Lingote_Galactico, Lingote_Galactico.getUnlocalizedName().substring(5));

Caparazon_Shulker = new Caparazon_Shulker().setUnlocalizedName("Caparazon_Shulker").setTextureName(modid + ":Caparazon_Shulker").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Caparazon_Shulker, Caparazon_Shulker.getUnlocalizedName().substring(5));

Pepita_de_Hierro = new Pepita_de_Hierro().setUnlocalizedName("Pepita_de_Hierro").setTextureName(modid + ":Pepita_de_Hierro").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Pepita_de_Hierro, Pepita_de_Hierro.getUnlocalizedName().substring(5));

Moldes_para_cofres = new Moldes_para_cofres().setUnlocalizedName("Moldes_para_cofres").setTextureName(modid + ":Moldes_para_cofres").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Moldes_para_cofres, Moldes_para_cofres.getUnlocalizedName().substring(5));

Palo_Morado = new Palo_Morado().setUnlocalizedName("Palo_Morado").setTextureName(modid + ":Palo_Morado").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(Palo_Morado, Palo_Morado.getUnlocalizedName().substring(5));

//Discos

CanciondeSansDisco = new CancionesBase("sans").setUnlocalizedName("CanciondeSansDisco").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(CanciondeSansDisco, CanciondeSansDisco.getUnlocalizedName().substring(5));

PPAP_Long_Version = new CancionesBase("PpapLong").setUnlocalizedName("PPAP_Long_Version").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(PPAP_Long_Version, PPAP_Long_Version.getUnlocalizedName().substring(5));

TrapAdvenureMusicLevel1 = new CancionesBase("trap1").setUnlocalizedName("TrapAdvenureMusicLevel1").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(TrapAdvenureMusicLevel1, TrapAdvenureMusicLevel1.getUnlocalizedName().substring(5));

moviemientonaranja = new CancionesBase("moviemientonaranja").setUnlocalizedName("moviemientonaranja").setCreativeTab(Rubycrafttab);
GameRegistry.registerItem(moviemientonaranja, moviemientonaranja.getUnlocalizedName().substring(5));

bossparca = new CancionesBase("bossparca").setUnlocalizedName("bossparca");
GameRegistry.registerItem(bossparca, bossparca.getUnlocalizedName().substring(5));

//Bloques
	
Bloquederuby = new bloquederuby(Material.iron).setBlockName("Bloquederuby").setBlockTextureName(modid + ":Bloquederuby").setCreativeTab(Rubycrafttab).setHardness(3.0F);
GameRegistry.registerBlock(Bloquederuby, Bloquederuby.getUnlocalizedName().substring(5));
Bloquederuby.setHarvestLevel("pickaxe", 2);
	
Bloqueluminiscente = new bloqueluminiscente(Material.glass).setBlockName("Bloqueluminiscente").setCreativeTab(Rubycrafttab).setHardness(0.3F);
GameRegistry.registerBlock(Bloqueluminiscente,Bloqueluminiscente.getUnlocalizedName().substring(5));
Bloqueluminiscente.setHarvestLevel("pickaxe", 0);
Bloqueluminiscente.setLightLevel(Float.MAX_VALUE).setLightOpacity(0);

Bloquedeuranio = new bloquedeuranio(Material.iron).setBlockName("Bloquedeuranio").setBlockTextureName(modid + ":Bloque_de_uranio").setCreativeTab(Rubycrafttab).setHardness(5.0F).setLightLevel(10.0F);
GameRegistry.registerBlock(Bloquedeuranio, Bloquedeuranio.getUnlocalizedName().substring(5));	
Bloquedeuranio.setHarvestLevel("pickaxe", 2);
	
Bloquedecaca = new bloquedecaca(Material.grass).setBlockName("Bloquedecaca").setBlockTextureName(modid + ":Bloquedecaca").setCreativeTab(Rubycrafttab).setHardness(0.3F);
GameRegistry.registerBlock(Bloquedecaca, Bloquedecaca.getUnlocalizedName().substring(5));
Bloquedecaca.setHarvestLevel("sholve", 0);
	
BloquedeZafiro = new bloquedeZafiro(Material.iron).setBlockName("BloquedeZafiro").setBlockTextureName(modid + ":Bloque_de_Zafiro").setCreativeTab(Rubycrafttab).setHardness(6.0F);
GameRegistry.registerBlock(BloquedeZafiro, BloquedeZafiro.getUnlocalizedName().substring(5));
BloquedeZafiro.setHarvestLevel("pickaxe", 4);

Bloquepurpur = new bloquepurpur(Material.rock).setBlockName("Bloquepurpur").setCreativeTab(Rubycrafttab).setHardness(6.0F);
GameRegistry.registerBlock(Bloquepurpur, Bloquepurpur.getUnlocalizedName().substring(5));
Bloquepurpur.setHarvestLevel("pickaxe", 1);

Bloque_de_hueso = new Bloque_de_hueso(Material.rock).setBlockName("Bloque_de_hueso").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Bloque_de_hueso, Bloque_de_hueso.getUnlocalizedName().substring(5));
Bloque_de_hueso.setHarvestLevel("pickaxe", 1);
	
Mena_de_Ruby = new Mena_de_Ruby(Material.rock).setBlockName("Mena_de_Ruby").setBlockTextureName(modid + ":Mena_de_Ruby").setCreativeTab(Rubycrafttab).setHardness(4.0F);
GameRegistry.registerBlock(Mena_de_Ruby, Mena_de_Ruby.getUnlocalizedName().substring(5));
Mena_de_Ruby.setHarvestLevel("pickaxe", 2);
	
maderaverde = new maderaverde(Material.wood).setBlockName("maderaverde").setBlockTextureName(modid + ":maderaverde").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(maderaverde,maderaverde.getUnlocalizedName().substring(5));
maderaverde.isToolEffective("axe", 0);
	
troncoverde = new troncoverde(Material.wood).setBlockName("troncoverde").setBlockTextureName(modid + ":troncoverde").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(troncoverde, troncoverde.getUnlocalizedName().substring(5));
troncoverde.isToolEffective("axe", 0);
	
Bloque_del_nether_rojo = new Bloque_del_nether_rojo(Material.rock).setBlockName("Bloque_del_nether_rojo").setBlockTextureName(modid + ":Bloque_del_nether_rojo").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Bloque_del_nether_rojo, Bloque_del_nether_rojo.getUnlocalizedName().substring(5));
Bloque_del_nether_rojo.setHarvestLevel("pickaxe", 1);
	
magma = new magma(Material.rock).setBlockName("magma").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(magma, magma.getUnlocalizedName().substring(5));
magma.setHarvestLevel("pickaxe", 0);
magma.setLightLevel(29999999999999999.0F).setLightOpacity(0);
	
prismarina = new prismarina(Material.rock).setBlockName("prismarina").setCreativeTab(Rubycrafttab).setHardness(2.0F);
GameRegistry.registerBlock(prismarina, prismarina.getUnlocalizedName().substring(5));
prismarina.setHarvestLevel("pickaxe", 1);
	
Prismarina_oscura = new Prismarina_oscura(Material.rock).setBlockName("Prismarina_oscura").setCreativeTab(Rubycrafttab).setHardness(2.0F);
GameRegistry.registerBlock(Prismarina_oscura, Prismarina_oscura.getUnlocalizedName().substring(5));	
Prismarina_oscura.setHarvestLevel("pickaxe", 1);
	
Ladrillos_de_prismarina = new Ladrillos_de_prismarina(Material.rock).setBlockName("Ladrillos_de_prismarina").setCreativeTab(Rubycrafttab).setHardness(2.0F);
GameRegistry.registerBlock(Ladrillos_de_prismarina, Ladrillos_de_prismarina.getUnlocalizedName().substring(5));
Ladrillos_de_prismarina.setHarvestLevel("pickaxe", 1);
	
linterna_de_mar = new linterna_de_mar(Material.glass).setBlockName("linterna_de_mar").setCreativeTab(Rubycrafttab).setHardness(0.5F);
GameRegistry.registerBlock(linterna_de_mar, linterna_de_mar.getUnlocalizedName().substring(5));
linterna_de_mar.setHarvestLevel("pickaxe", 1);
linterna_de_mar.setLightLevel(299999999999999999999999999999999999999.0F).setLightOpacity(0);
	
Bloque_de_verruga = new Bloque_de_verruga(Material.rock).setBlockName("Bloque_de_verruga").setBlockTextureName(modid + ":Bloque_de_verruga").setCreativeTab(Rubycrafttab).setHardness(0.5F);
GameRegistry.registerBlock(Bloque_de_verruga, Bloque_de_verruga.getUnlocalizedName().substring(5));
Bloque_de_verruga.setHarvestLevel("pickaxe", 0);
	
Bloque_de_Blaze = new Bloque_de_Blaze(Material.iron).setBlockName("Bloque_de_Blaze").setBlockTextureName(modid + ":Bloque_de_Blaze").setCreativeTab(Rubycrafttab).setHardness(0.7F);
GameRegistry.registerBlock(Bloque_de_Blaze, Bloque_de_Blaze.getUnlocalizedName().substring(5));
Bloque_de_Blaze.setHarvestLevel("pickaxe", 2);
Bloque_de_Blaze.setLightLevel(299999999999999.0F);
	
Ladrillo_de_piedra_del_end = new Ladrillo_de_piedra_del_end(Material.rock).setBlockName("Ladrillo_de_piedra_del_end").setBlockTextureName(modid + ":Ladrillo_de_piedra_del_end").setCreativeTab(Rubycrafttab).setHardness(0.6F);
GameRegistry.registerBlock(Ladrillo_de_piedra_del_end, Ladrillo_de_piedra_del_end.getUnlocalizedName().substring(5));

Bloque_de_azucar = new Bloque_de_azucar(Material.wood).setBlockName("Bloque_de_azucar").setBlockTextureName(modid + ":Bloque_de_azucar").setCreativeTab(Rubycrafttab).setHardness(0.8F);
GameRegistry.registerBlock(Bloque_de_azucar, Bloque_de_azucar.getUnlocalizedName().substring(5));
  
Cuarzo_azul = new Cuarzo_azul(Material.rock).setBlockName("Cuarzo_azul").setBlockTextureName(modid + ":Cuarzo_azul").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Cuarzo_azul, Cuarzo_azul.getUnlocalizedName().substring(5));
Cuarzo_azul.setHarvestLevel("pickaxe", 1);

Cuarzo_verde = new Cuarzo_verde(Material.rock).setBlockName("Cuarzo_verde").setBlockTextureName(modid + ":Cuarzo_verde").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Cuarzo_verde, Cuarzo_verde.getUnlocalizedName().substring(5));
Cuarzo_verde.setHarvestLevel("pickaxe", 1);

Cuarzo_rojo = new Cuarzo_rojo(Material.rock).setBlockName("Cuarzo_rojo").setBlockTextureName(modid + ":Cuarzo_rojo").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Cuarzo_rojo, Cuarzo_rojo.getUnlocalizedName().substring(5));
Cuarzo_rojo.setHarvestLevel("pickaxe", 1);

Ladrillo_de_obsidiana = new Ladrillo_de_obsidiana(Material.rock).setBlockName("Ladrillo_de_obsidiana").setBlockTextureName(modid + ":Ladrillo_de_obsidiana").setCreativeTab(Rubycrafttab).setHardness(30.0F);
GameRegistry.registerBlock(Ladrillo_de_obsidiana, Ladrillo_de_obsidiana.getUnlocalizedName().substring(5));
Ladrillo_de_obsidiana.setHarvestLevel("pickaxe", 3);

tronco_Azul = new tronco_Azul(Material.wood).setBlockName("tronco_Azul").setBlockTextureName(modid + ":tronco_Azul").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(tronco_Azul, tronco_Azul.getUnlocalizedName().substring(5));
tronco_Azul.setHarvestLevel("axe", 0);

Madera_Azul = new Madera_Azul(Material.wood).setBlockName("Madera_Azul").setBlockTextureName(modid + ":Madera_Azul").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(Madera_Azul, Madera_Azul.getUnlocalizedName().substring(5));
Madera_Azul.setHarvestLevel("axe", 0);

PilarPurpur = new PilarPurpur(Material.rock).setBlockName("PilarPurpur").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(PilarPurpur, PilarPurpur.getUnlocalizedName().substring(5));
PilarPurpur.setHarvestLevel("pickaxe", 0);
  
Ladrillo_Marino = new Ladrillo_Marino(Material.rock).setBlockName("Ladrillo_Marino").setBlockTextureName(modid + ":Ladrillo_Marino").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Ladrillo_Marino, Ladrillo_Marino.getUnlocalizedName().substring(5));
Ladrillo_Marino.setHarvestLevel("pickaxe", 0); 
   	
Ladrillo_del_Bosque = new Ladrillo_del_Bosque(Material.rock).setBlockName("Ladrillo_del_Bosque").setBlockTextureName(modid + ":Ladrillo_del_Bosque").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Ladrillo_del_Bosque, Ladrillo_del_Bosque.getUnlocalizedName().substring(5));
Ladrillo_del_Bosque.setHarvestLevel("pickaxe", 0);

Cristal_azul_claro = new Cristal_azul_claro(Material.glass).setBlockName("Cristal_azul_claro").setBlockTextureName(modid + ":Cristal_azul_claro").setCreativeTab(Rubycrafttab).setHardness(0.3F);
GameRegistry.registerBlock(Cristal_azul_claro, Cristal_azul_claro.getUnlocalizedName().substring(5));

Bloque_de_veneno = new Bloque_de_veneno(Material.rock).setBlockName("Bloque_de_veneno").setBlockTextureName(modid + ":Bloque_de_veneno").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Bloque_de_veneno, Bloque_de_veneno.getUnlocalizedName().substring(5));
Bloque_de_veneno.setHarvestLevel("pickaxe", 0);

Bloque_de_Regeneracion = new Bloque_de_Regeneracion(Material.rock).setBlockName("Bloque_de_Regeneracion").setBlockTextureName(modid + ":Bloque_de_Regeneracion").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Bloque_de_Regeneracion, Bloque_de_Regeneracion.getUnlocalizedName().substring(5));
Bloque_de_Regeneracion.setHarvestLevel("pickaxe", 0);
   
Mena_de_Zafiro = new Mena_de_Zafiro(Material.rock).setBlockName("Mena_de_Zafiro").setBlockTextureName(modid + ":Mena_de_Zafiro").setCreativeTab(Rubycrafttab).setHardness(4.0F);
GameRegistry.registerBlock(Mena_de_Zafiro, Mena_de_Zafiro.getUnlocalizedName().substring(5));
Mena_de_Zafiro.setHarvestLevel("pickaxe", 4);

Cristal_Verde_Lima = new Cristal_Verde_Lima(Material.glass).setBlockName("Cristal_Verde_Lima").setBlockTextureName(modid + ":Cristal_Verde_Lima").setCreativeTab(Rubycrafttab).setHardness(0.3F);
GameRegistry.registerBlock(Cristal_Verde_Lima, Cristal_Verde_Lima.getUnlocalizedName().substring(5));

Bloque_de_Diamante_Trol = new Bloque_de_Diamante_Trol(MapColor.cyanColor).setBlockName("Bloque_de_Diamante_Trol").setBlockTextureName(modid + ":Bloque_de_Diamante_Trol").setCreativeTab(Rubycrafttab).setBlockUnbreakable().setResistance(Float.MAX_VALUE);
GameRegistry.registerBlock(Bloque_de_Diamante_Trol, Bloque_de_Diamante_Trol.getUnlocalizedName().substring(5));
   
Bloque_de_comandos = new Bloque_de_comandos(Material.iron).setBlockName("Bloque_de_comandos").setCreativeTab(Rubycrafttab).setBlockUnbreakable().setResistance(Float.MAX_VALUE);
GameRegistry.registerBlock(Bloque_de_comandos, Bloque_de_comandos.getUnlocalizedName().substring(5));

Mena_de_Ruby_end = new Mena_de_Ruby_end(Material.rock).setBlockName("Mena_de_Ruby_end").setBlockTextureName(modid + ":Mena_de_Ruby_end").setCreativeTab(Rubycrafttab).setHardness(4.0F);
GameRegistry.registerBlock(Mena_de_Ruby_end, Mena_de_Ruby_end.getUnlocalizedName().substring(5));
Mena_de_Ruby_end.setHarvestLevel("pickaxe", 2);
Mena_de_Ruby_end.setLightLevel(Float.MAX_VALUE);

Bloque_de_Pedernal = new Bloque_de_Pedernal(Material.rock).setBlockName("Bloque_de_Pedernal").setBlockTextureName(modid + ":Bloque_de_Pedernal").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Bloque_de_Pedernal, Bloque_de_Pedernal.getUnlocalizedName().substring(5));
Bloque_de_Pedernal.setHarvestLevel("pickaxe", 1);

Diorita = new  Diorita(Material.rock).setBlockName("Diorita").setBlockTextureName(modid + ":Diorita").setCreativeTab(Rubycrafttab).setHardness(1.0F); 
GameRegistry.registerBlock(Diorita, Diorita.getUnlocalizedName().substring(5));
Diorita.setHarvestLevel("pickaxe", 0);

Diorita_Pulida = new Diorita_Pulida(Material.rock).setBlockName("Diorita_Pulida").setBlockTextureName(modid + ":Diorita_Pulida").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Diorita_Pulida, Diorita_Pulida.getUnlocalizedName().substring(5));
Diorita_Pulida.setHarvestLevel("pickaxe", 0);

Granito = new Granito(Material.rock).setBlockName("Granito").setBlockTextureName(modid + ":Granito").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Granito, Granito.getUnlocalizedName().substring(5));
Granito.setHarvestLevel("pickaxe", 0);

Granito_Pulido = new Granito_Pulido(Material.rock).setBlockName("Granito_Pulido").setBlockTextureName(modid + ":Granito_Pulido").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Granito_Pulido, Granito_Pulido.getUnlocalizedName().substring(5));
Granito_Pulido.setHarvestLevel("pickaxe", 0);

Andesita = new Andesita(Material.rock).setBlockName("Andesita").setBlockTextureName(modid + ":Andesita").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Andesita, Andesita.getUnlocalizedName().substring(5));
Andesita.setHarvestLevel("pickaxe", 0);

Andesita_Pulida = new Andesita_Pulida(Material.rock).setBlockName("Andesita_Pulida").setBlockTextureName(modid + ":Andesita_Pulida").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Andesita_Pulida, Andesita_Pulida.getUnlocalizedName().substring(5));
Andesita_Pulida.setHarvestLevel("pickaxe", 0);
 
BloquedeEnderPearld = new BloquedeEnderPearld(Material.rock).setBlockName("BloquedeEnderPearld").setBlockTextureName(modid + ":BloquedeEnderPearld").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(BloquedeEnderPearld, BloquedeEnderPearld.getUnlocalizedName().substring(5));
BloquedeEnderPearld.setHarvestLevel("pickaxe", 0);

BloquedeOjodeEnder= new BloquedeOjodeEnder(Material.rock).setBlockName("BloquedeOjodeEnder").setBlockTextureName(modid + ":BloquedeOjodeEnder").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(BloquedeOjodeEnder, BloquedeOjodeEnder.getUnlocalizedName().substring(5));
BloquedeOjodeEnder.setHarvestLevel("pickaxe", 0);

Mena_de_Zafiroend = new Mena_de_Zafiroend(Material.rock).setBlockName("Mena_de_Zafiroend").setBlockTextureName(modid + ":Mena_de_Zafiroend").setCreativeTab(Rubycrafttab).setHardness(4.0F);
GameRegistry.registerBlock(Mena_de_Zafiroend, Mena_de_Zafiroend.getUnlocalizedName().substring(5));
Mena_de_Zafiroend.setLightLevel(Float.MAX_VALUE);
Mena_de_Zafiroend.setHarvestLevel("pickaxe", 4);

Bloque_de_Slime = new Bloque_de_Slime().setBlockName("Bloque_de_Slime").setBlockTextureName(modid + "Bloque_de_Slime").setCreativeTab(Rubycrafttab);
GameRegistry.registerBlock(Bloque_de_Slime, Bloque_de_Slime.getUnlocalizedName().substring(5));

Bloque_de_Pasto = new Bloque_de_Pasto(Material.grass).setBlockName("Bloque_de_Pasto").setCreativeTab(Rubycrafttab).setHardness(0.1F);
GameRegistry.registerBlock(Bloque_de_Pasto, Bloque_de_Pasto.getUnlocalizedName().substring(5));
Bloque_de_Pasto.setHarvestLevel("sholve", 1);

Mesa_de_Trabajo_de_Zafiro_Basica = new Mesa_de_Trabajo_de_Zafiro_Basica(Material.wood).setBlockName("Mesa_de_Trabajo_de_Zafiro_Basica").setBlockTextureName(modid + ":Mesa_de_Trabajo_de_Zafiro_Basica").setCreativeTab(Rubycrafttab).setHardness(0.3F);
GameRegistry.registerBlock(Mesa_de_Trabajo_de_Zafiro_Basica, Mesa_de_Trabajo_de_Zafiro_Basica.getUnlocalizedName().substring(5));

Ladrillo_de_Infrapiedra = new Ladrillo_de_Infrapiedra(Material.rock).setBlockName("Ladrillo_de_Infrapiedra").setBlockTextureName(modid + ":Ladrillo_de_Infrapiedra").setCreativeTab(Rubycrafttab).setHardness(0.5F);
GameRegistry.registerBlock(Ladrillo_de_Infrapiedra, Ladrillo_de_Infrapiedra.getUnlocalizedName().substring(5));

Bloque_de_Cobre = new Bloque_de_Cobre(Material.iron).setBlockName("Bloque_de_Cobre").setBlockTextureName(modid + ":Bloque_de_Cobre").setCreativeTab(Rubycrafttab).setHardness(3.0F);
GameRegistry.registerBlock(Bloque_de_Cobre, Bloque_de_Cobre.getUnlocalizedName().substring(5));
Bloque_de_Cobre.setHarvestLevel("pickaxe", 1);

Bloque_de_Aluminio = new Bloque_de_Aluminio(Material.iron).setBlockName("Bloque_de_Aluminio").setBlockTextureName(modid + ":Bloque_de_Aluminio").setCreativeTab(Rubycrafttab).setHardness(3.0F);
GameRegistry.registerBlock(Bloque_de_Aluminio, Bloque_de_Aluminio.getUnlocalizedName().substring(5));
Bloque_de_Aluminio.setHarvestLevel("pickaxe", 1);

Bloque_de_Platino = new Bloque_de_Platino(Material.iron).setBlockName("Bloque_de_Platino").setBlockTextureName(modid + ":Bloque_de_Platino").setCreativeTab(Rubycrafttab).setHardness(3.0F);
GameRegistry.registerBlock(Bloque_de_Platino, Bloque_de_Platino.getUnlocalizedName().substring(5));
Bloque_de_Platino.setHarvestLevel("pickaxe", 2);

Mena_de_Cobre = new Mena_de_Cobre(Material.rock).setBlockName("Mena_de_Cobre").setBlockTextureName(modid + ":Mena_de_Cobre").setCreativeTab(Rubycrafttab).setHardness(3.0F);
GameRegistry.registerBlock(Mena_de_Cobre, Mena_de_Cobre.getUnlocalizedName().substring(5));
Mena_de_Cobre.setHarvestLevel("pickaxe", 2);

Mena_de_Aluminio = new Mena_de_Aluminio(Material.rock).setBlockName("Mena_de_Aluminio").setBlockTextureName(modid + ":Mena_de_Aluminio").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Mena_de_Aluminio, Mena_de_Aluminio.getUnlocalizedName().substring(5));
Mena_de_Aluminio.setHarvestLevel("pickaxe", 1);

Mena_de_Platino = new Mena_de_Platino(Material.rock).setBlockName("Mena_de_Platino").setBlockTextureName(modid + ":Mena_de_Platino").setCreativeTab(Rubycrafttab).setHardness(5.0F);
GameRegistry.registerBlock(Mena_de_Platino, Mena_de_Platino.getUnlocalizedName().substring(5));
Mena_de_Platino.setHarvestLevel("pickaxe", 3);

Bloque_Galactico = new Bloque_Galactico(Material.rock).setBlockName("Bloque_Galactico").setBlockTextureName(modid + ":Bloque_Galactico").setCreativeTab(Rubycrafttab).setHardness(3.0F);
GameRegistry.registerBlock(Bloque_Galactico, Bloque_Galactico.getUnlocalizedName().substring(5));
Bloque_Galactico.setHarvestLevel("pickaxe", 1);

Ladrillo_de_Granito = new Ladrillo_de_Granito(Material.rock).setBlockName("Ladrillo_de_Granito").setBlockTextureName(modid + ":Ladrillo_de_Granito").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(Ladrillo_de_Granito, Ladrillo_de_Granito.getUnlocalizedName().substring(5));

Ladrillo_de_Andesita = new Ladrillo_de_Andesita(Material.rock).setBlockName("Ladrillo_de_Andesita").setBlockTextureName(modid + ":Ladrillo_de_Andesita").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(Ladrillo_de_Andesita, Ladrillo_de_Andesita.getUnlocalizedName().substring(5));

Ladrillo_de_Diorita = new Ladrillo_de_Diorita(Material.rock).setBlockName("Ladrillo_de_Diorita").setBlockTextureName(modid + ":Ladrillo_de_Diorita").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(Ladrillo_de_Diorita, Ladrillo_de_Diorita.getUnlocalizedName().substring(5));

Generar_Dragon = new Generar_Dragon(Material.rock).setBlockName("Generar_Dragon").setBlockTextureName(modid + ":Generar_Dragon").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(Generar_Dragon, Generar_Dragon.getUnlocalizedName().substring(5));

BloqueObservador = new BloqueObservador(MapColor.grayColor).setBlockName("BloqueObservador").setBlockTextureName(modid + ":BloqueObservador").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(BloqueObservador, BloqueObservador.getUnlocalizedName().substring(5));

Calabaza_Espectral = new Calabaza_Espectral(Material.plants).setBlockName("Calabaza_Espectral").setBlockTextureName(modid + ":Calabaza_Espectral").setCreativeTab(Rubycrafttab).setHardness(1.0F);
GameRegistry.registerBlock(Calabaza_Espectral, Calabaza_Espectral.getUnlocalizedName().substring(5));

Bloque_de_Herobrine = new Bloque_de_Herobrine(Material.rock).setBlockName("Bloque_de_Herobrine").setBlockTextureName(modid + ":Bloque_de_Herobrine").setBlockUnbreakable();
GameRegistry.registerBlock(Bloque_de_Herobrine, Bloque_de_Herobrine.getUnlocalizedName().substring(5));

obsidiana_que_llora = new obsidiana_que_llora(Material.rock).setBlockName("obsidiana_que_llora").setBlockTextureName(modid + ":obsidiana_que_llora").setCreativeTab(Rubycrafttab).setHardness(50.0F).setResistance(2000.0F);
GameRegistry.registerBlock(obsidiana_que_llora, obsidiana_que_llora.getUnlocalizedName().substring(5));
obsidiana_que_llora.setHarvestLevel("pickaxe", 3);

Bloque_de_Actualizaciones = new Bloque_de_Actualizaciones(Material.iron).setBlockName("Bloque_de_Actualizaciones").setBlockTextureName(modid + ":Bloque_de_Actualizaciones").setCreativeTab(Rubycrafttab).setHardness(2.0F).setResistance(200.0F);
GameRegistry.registerBlock(Bloque_de_Actualizaciones, Bloque_de_Actualizaciones.getUnlocalizedName().substring(5));

Bloque_Reforzado_Tier_1 = new Bloque_Reforzado_Base(Material.iron).setBlockName("Bloque_Reforzado_Tier_1").setBlockTextureName(modid + ":Bloque_Reforzado_Tier_1").setCreativeTab(Rubycrafttab).setHardness(70.0F).setResistance(30.0F);
GameRegistry.registerBlock(Bloque_Reforzado_Tier_1, Bloque_Reforzado_Tier_1.getUnlocalizedName().substring(5));
Bloque_Reforzado_Tier_1.setHarvestLevel("pickaxe", 3);

Bloque_Reforzado_Tier_2 = new Bloque_Reforzado_Base(Material.iron).setBlockName("Bloque_Reforzado_Tier_2").setBlockTextureName(modid + ":Bloque_Reforzado_Tier_2").setCreativeTab(Rubycrafttab).setHardness(90.0F).setResistance(50.0F);
GameRegistry.registerBlock(Bloque_Reforzado_Tier_2, Bloque_Reforzado_Tier_2.getUnlocalizedName().substring(5));
Bloque_Reforzado_Tier_1.setHarvestLevel("pickaxe", 3);

Bloque_Reforzado_Tier_3 = new Bloque_Reforzado_Base(Material.iron).setBlockName("Bloque_Reforzado_Tier_3").setBlockTextureName(modid + ":Bloque_Reforzado_Tier_3").setCreativeTab(Rubycrafttab).setHardness(100.0F).setResistance(60.0F);
GameRegistry.registerBlock(Bloque_Reforzado_Tier_3, Bloque_Reforzado_Tier_3.getUnlocalizedName().substring(5));
Bloque_Reforzado_Tier_3.setHarvestLevel("pickaxe", 3);

//Maquinas

MesadeTrabajodeRuby = new MesadeTrabajodeRuby().setBlockName("MesadeTrabajodeRuby");
GameRegistry.registerBlock(MesadeTrabajodeRuby, "MesadeTrabajodeRuby");

MesadeTrabajodeZafiro = new MesadeTrabajodeZafiro().setBlockName("MesadeTrabajodeZafiro");
GameRegistry.registerBlock(MesadeTrabajodeZafiro, "MesadeTrabajodeZafiro");

Bloqueestructural = new bloqueestructural().setBlockName("Bloqueestructural").setCreativeTab(Rubycrafttab).setBlockUnbreakable().setResistance(Float.MAX_VALUE);
GameRegistry.registerBlock(Bloqueestructural, Bloqueestructural.getUnlocalizedName().substring(5));
	
Transformador_de_Losas_a_Bloques = new Transformador_de_Losas_a_Bloques().setBlockName("Transformador_de_Losas_a_Bloques");
GameRegistry.registerBlock(Transformador_de_Losas_a_Bloques, Transformador_de_Losas_a_Bloques.getUnlocalizedName().substring(5));
Transformador_de_Losas_a_Bloques.setHarvestLevel("spade", 1);

Mesa_De_Conjuraciones = new Mesa_De_Conjuraciones(Material.dragonEgg).setBlockName("Mesa_De_Conjuraciones").setCreativeTab(Rubycrafttab).setHardness(1.5F);
GameRegistry.registerBlock(Mesa_De_Conjuraciones, Mesa_De_Conjuraciones.getUnlocalizedName().substring(5));

//Mesas de Crafteo Vanilla
Mesa_de_trabajo_de_acacia = new Mesa_de_trabajo_de_acacia(Material.wood).setBlockName("Mesa_de_trabajo_de_acacia").setCreativeTab(Rubycrafttab).setHardness(2.5F);
GameRegistry.registerBlock(Mesa_de_trabajo_de_acacia, Mesa_de_trabajo_de_acacia.getUnlocalizedName().substring(5));

Mesa_de_trabajo_de_abedul = new Mesa_de_trabajo_de_abedul(Material.wood).setBlockName("Mesa_de_trabajo_de_abedul").setCreativeTab(Rubycrafttab).setHardness(2.5F);
GameRegistry.registerBlock(Mesa_de_trabajo_de_abedul, Mesa_de_trabajo_de_abedul.getUnlocalizedName().substring(5));

Mesa_de_trabajo_de_roble_oscuro = new Mesa_de_trabajo_de_roble_oscuro(Material.wood).setBlockName("Mesa_de_trabajo_de_roble_oscuro").setCreativeTab(Rubycrafttab).setHardness(2.5F);
GameRegistry.registerBlock(Mesa_de_trabajo_de_roble_oscuro, Mesa_de_trabajo_de_roble_oscuro.getUnlocalizedName().substring(5)); 

Mesa_de_trabajo_de_abeto = new Mesa_de_trabajo_de_abeto(Material.wood).setBlockName("Mesa_de_trabajo_de_abeto").setCreativeTab(Rubycrafttab).setHardness(2.5F);
GameRegistry.registerBlock(Mesa_de_trabajo_de_abeto, Mesa_de_trabajo_de_abeto.getUnlocalizedName().substring(5)); 

Mesa_de_trabajo_de_jungla = new Mesa_de_trabajo_de_jungla(Material.wood).setBlockName("Mesa_de_trabajo_de_jungla").setCreativeTab(Rubycrafttab).setHardness(2.5F);
GameRegistry.registerBlock(Mesa_de_trabajo_de_jungla, Mesa_de_trabajo_de_jungla.getUnlocalizedName().substring(5)); 

//Lamparas

Lampara_de_Ruby_Encendida = new Lampara_de_Ruby(true).setBlockName("Lampara_de_Ruby_Encendida");
Lampara_de_Ruby_Apagada = new Lampara_de_Ruby(false).setBlockName("Lampara_de_Ruby_Apagada").setCreativeTab(Rubycrafttab);
GameRegistry.registerBlock(Lampara_de_Ruby_Encendida, "Lampara_de_Ruby_Encendida");
GameRegistry.registerBlock(Lampara_de_Ruby_Apagada, "Lampara_de_Ruby_Apagada");

Lampara_de_Zafiro_Encendida = new Lampara_de_Zafiro(true).setBlockName("Lampara_de_Zafiro_Encendida");
Lampara_de_Zafiro_Apagada = new Lampara_de_Zafiro(false).setBlockName("Lampara_de_Zafiro_Apagada").setCreativeTab(Rubycrafttab);
GameRegistry.registerBlock(Lampara_de_Zafiro_Encendida, "Lampara_de_Zafiro_Encendida");
GameRegistry.registerBlock(Lampara_de_Zafiro_Apagada, "Lampara_de_Zafiro_Apagada");

//Pistones
SlimePistonNormal = new PistonSlimeBase(false).setBlockName("SlimePistonNormal").setCreativeTab(Rubycrafttab);
GameRegistry.registerBlock(SlimePistonNormal, "SlimePistonNormal").getUnlocalizedName().substring(5);

SlimePistonPegajoso = new PistonSlimeBase(true).setBlockName("SlimePistonPegajoso").setCreativeTab(Rubycrafttab);
GameRegistry.registerBlock(SlimePistonPegajoso, "SlimePistonPegajoso").getUnlocalizedName().substring(5);

SlimePistonCabeza = new Piston_de_Slime_Cabeza().setBlockName("SlimePistonCabeza");
GameRegistry.registerBlock(SlimePistonCabeza, "SlimePistonCabeza").getUnlocalizedName().substring(5);

//TileEntitys

Cofre_de_Ruby = new Cofre_de_Ruby(0).setBlockName("Cofre_de_Ruby").setBlockTextureName(modid + ":Cofre_de_Ruby");
GameRegistry.registerBlock(Cofre_de_Ruby, "Cofre_de_Ruby").getUnlocalizedName().substring(5);

//Variado
OreDictonary.Iniciar();
Tradeos_Aldeanos.Iniciar_Tradeos_Aldeanos();
Combustible_Principal.IniciarCombstibles();
Modificacion_Principal.Preinit();
Escaleras_Principal.Variado();
Registrar_Biomas.Registrar();

BiomeManager.addSpawnBiome(Registrar_Biomas.RubyBioma);
}

@EventHandler
public void init(FMLInitializationEvent event){
	
	
	if(Navidad || HalloWen && !RubyCraft.cliente) {
		
		IniciarItemsEventos.Crafteos();
		
	}
	
	herracraft.init();
//Variado
proxy.registerRenderThings();	  

FMLCommonHandler.instance().bus().register(new TestearActualizaciones());
FMLCommonHandler.instance().bus().register(new trol());

 Logros.Iniciar();
if(VersionTrol == false){
	Crafteos.IniciarPrincipal();
	Eventos_Principal.IniciarEventos();
    Loot_Cofres.Iniciar();
    Modificacion_Principal.Init();
     }else if(RubyCraft.VersionTrol) {
    	 VersionTrolActivar();
     }

 }
	
@EventHandler
public void PostLoad(FMLPostInitializationEvent Posevent){
		
	WorldType RUBYWORLDTYPE = new WorldTypeRuby(3, "Ruby"); 
		
	//Variado
	Modificacion_Principal.PostInit();
	
	
	
	}

public static void VersionTrolActivar(){
	if(!Navidad){
	VersionTrol = true;
	Crafteos.IniciarCrafteosVersionTrol();
    Eliminar_Crafteos.CrafteosTrol();
	  }else if(Navidad){
		  VersionTrol = false;
	  }
   } 
}