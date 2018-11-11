package RubyCraft.xJuanathan;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Bloques.Barro;
import RubyCraft.xJuanathan.Bloques.Barro_Congelado;
import RubyCraft.xJuanathan.Bloques.Barro_Congelado_Adn;
import RubyCraft.xJuanathan.Bloques.Barro_Congelado_Ambar;
import RubyCraft.xJuanathan.Bloques.Barro_Congelado_Hueso;
import RubyCraft.xJuanathan.Bloques.Hielo_Glaciar;
import RubyCraft.xJuanathan.Bloques.Hielo_Glaciar_Adn;
import RubyCraft.xJuanathan.Bloques.Hielo_Glaciar_Ambar;
import RubyCraft.xJuanathan.Bloques.Hielo_Glaciar_Hueso;
import RubyCraft.xJuanathan.Bloques.Madera_Fosil;
import RubyCraft.xJuanathan.Bloques.Madera_Fosil_Adn;
import RubyCraft.xJuanathan.Bloques.Madera_Fosil_Ambar;
import RubyCraft.xJuanathan.Bloques.Madera_Fosil_Hueso;
import RubyCraft.xJuanathan.Bloques.Monton_de_fosiles;
import RubyCraft.xJuanathan.Bloques.Roca_Fosil;
import RubyCraft.xJuanathan.Bloques.Roca_Fosil_Adn;
import RubyCraft.xJuanathan.Bloques.Roca_Fosil_Ambar;
import RubyCraft.xJuanathan.Bloques.Roca_Fosil_Hueso;
import RubyCraft.xJuanathan.Items.Fragmento_de_fosil;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Principal {
	
	//Bloques

	public static Block Monton_de_fosiles;
	
	// Bloques Evento Navidad
	
	public static Block Hielo_Glaciar;
	public static Block Hielo_Glaciar_Hueso;
	public static Block Hielo_Glaciar_Adn;
	public static Block Hielo_Glaciar_Ambar;
	
	public static Block Barro;
	public static Block Barro_Congelado;
	public static Block Barro_Congelado_Hueso;
	public static Block Barro_Congelado_Adn;
	public static Block Barro_Congelado_Ambar;
	
	public static Block Roca_Fosil;
	public static Block Roca_Fosil_Hueso;
	public static Block Roca_Fosil_Adn;
	public static Block Roca_Fosil_Ambar;
	
	public static Block Madera_Fosil;
	public static Block Madera_Fosil_Hueso;
	public static Block Madera_Fosil_Adn;
	public static Block Madera_Fosil_Ambar;
	
	//Items
	
	public static Item Fragmento_de_fosil;
	
	
	public static void preinit() 
	{
		//Bloques
		
		Monton_de_fosiles = new Monton_de_fosiles(Material.rock).setBlockName("Monton_de_fosiles").setBlockTextureName(RubyCraft.modid+":Monton_de_fosiles").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Monton_de_fosiles, Monton_de_fosiles.getUnlocalizedName().substring(5));
		Monton_de_fosiles.setHarvestLevel("pickaxe", 1);
		
		//Bloques evento Navidad
		
		Hielo_Glaciar = new Hielo_Glaciar(Material.ice).setBlockName("Hielo_Glaciar").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar, Hielo_Glaciar.getUnlocalizedName().substring(5));
		Hielo_Glaciar.setHarvestLevel("pickaxe", 7);
		
		Hielo_Glaciar_Hueso = new Hielo_Glaciar_Hueso(Material.ice).setBlockName("Hielo_Glaciar_Hueso").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Hueso").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Hueso, Hielo_Glaciar_Hueso.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Hueso.setHarvestLevel("pickaxe", 7);
		
		Hielo_Glaciar_Adn = new Hielo_Glaciar_Adn(Material.ice).setBlockName("Hielo_Glaciar_Adn").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Adn").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Adn, Hielo_Glaciar_Adn.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Adn.setHarvestLevel("pickaxe", 7);
		
		Hielo_Glaciar_Ambar = new Hielo_Glaciar_Ambar(Material.ice).setBlockName("Hielo_Glaciar_Ambar").setBlockTextureName(RubyCraft.modid+":Hielo_Glaciar_Ambar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Hielo_Glaciar_Ambar, Hielo_Glaciar_Ambar.getUnlocalizedName().substring(5));
		Hielo_Glaciar_Ambar.setHarvestLevel("pickaxe", 7);
		
		Barro = new Barro(Material.sand).setBlockName("Barro").setBlockTextureName(RubyCraft.modid+":Barro").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro, Barro.getUnlocalizedName().substring(5));
		Barro.setHarvestLevel("shovel", 7);
		
		Barro_Congelado = new Barro_Congelado(Material.rock).setBlockName("Barro_Congelado").setBlockTextureName(RubyCraft.modid+":Barro_Congelado").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado, Barro_Congelado.getUnlocalizedName().substring(5));
		Barro_Congelado.setHarvestLevel("pickaxe", 7);
		
		Barro_Congelado_Hueso = new Barro_Congelado_Hueso(Material.rock).setBlockName("Barro_Congelado_Hueso").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Hueso").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Hueso, Barro_Congelado_Hueso.getUnlocalizedName().substring(5));
		Barro_Congelado_Hueso.setHarvestLevel("pickaxe", 7);
		
		Barro_Congelado_Adn = new Barro_Congelado_Adn(Material.rock).setBlockName("Barro_Congelado_Adn").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Adn").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Adn, Barro_Congelado_Adn.getUnlocalizedName().substring(5));
		Barro_Congelado_Adn.setHarvestLevel("pickaxe", 7);
		
		Barro_Congelado_Ambar = new Barro_Congelado_Ambar(Material.rock).setBlockName("Barro_Congelado_Ambar").setBlockTextureName(RubyCraft.modid+":Barro_Congelado_Ambar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Barro_Congelado_Ambar, Barro_Congelado_Ambar.getUnlocalizedName().substring(5));
		Barro_Congelado_Ambar.setHarvestLevel("pickaxe", 7);
		
		Roca_Fosil = new Roca_Fosil(Material.rock).setBlockName("Roca_Fosil").setBlockTextureName(RubyCraft.modid+":Roca_Fosil").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil, Roca_Fosil.getUnlocalizedName().substring(5));
		Roca_Fosil.setHarvestLevel("pickaxe", 7);
		
		Roca_Fosil_Hueso = new Roca_Fosil_Hueso(Material.rock).setBlockName("Roca_Fosil_Hueso").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Hueso").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Hueso, Roca_Fosil_Hueso.getUnlocalizedName().substring(5));
		Roca_Fosil_Hueso.setHarvestLevel("pickaxe", 7);
		
		Roca_Fosil_Adn = new Roca_Fosil_Adn(Material.rock).setBlockName("Roca_Fosil_Adn").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Adn").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Adn, Roca_Fosil_Adn.getUnlocalizedName().substring(5));
		Roca_Fosil_Adn.setHarvestLevel("pickaxe", 7);
		
		Roca_Fosil_Ambar = new Roca_Fosil_Ambar(Material.rock).setBlockName("Roca_Fosil_Ambar").setBlockTextureName(RubyCraft.modid+":Roca_Fosil_Ambar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Roca_Fosil_Ambar, Roca_Fosil_Ambar.getUnlocalizedName().substring(5));
		Roca_Fosil_Ambar.setHarvestLevel("pickaxe", 7);
		
		Madera_Fosil = new Madera_Fosil(Material.wood).setBlockName("Madera_Fosil").setBlockTextureName(RubyCraft.modid+":Madera_Fosil").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil, Madera_Fosil.getUnlocalizedName().substring(5));
		Madera_Fosil.setHarvestLevel("axe", 7);
		
		Madera_Fosil_Hueso = new Madera_Fosil_Hueso(Material.wood).setBlockName("Madera_Fosil_Hueso").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Hueso").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Hueso, Madera_Fosil_Hueso.getUnlocalizedName().substring(5));
		Madera_Fosil_Hueso.setHarvestLevel("axe", 7);
		
		Madera_Fosil_Adn = new Madera_Fosil_Adn(Material.wood).setBlockName("Madera_Fosil_Adn").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Adn").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Adn, Madera_Fosil_Adn.getUnlocalizedName().substring(5));
		Madera_Fosil_Adn.setHarvestLevel("axe", 7);
		
		Madera_Fosil_Ambar = new Madera_Fosil_Ambar(Material.wood).setBlockName("Madera_Fosil_Ambar").setBlockTextureName(RubyCraft.modid+":Madera_Fosil_Ambar").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Madera_Fosil_Ambar, Madera_Fosil_Ambar.getUnlocalizedName().substring(5));
		Madera_Fosil_Ambar.setHarvestLevel("axe", 7);
		
		
		//Items
		
		Fragmento_de_fosil = new Fragmento_de_fosil().setUnlocalizedName("Fragmento_de_fosil").setTextureName(RubyCraft.modid+":Fragmento_de_fosil").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(Fragmento_de_fosil, Fragmento_de_fosil.getUnlocalizedName().substring(5));
		
		
	}
	
	
	
	public static void init() 
	{
		//Crafteos Items
		
		
		
		
	}
	
	
	public static void postinit() 
	{
		
	}
	
	
	
}
