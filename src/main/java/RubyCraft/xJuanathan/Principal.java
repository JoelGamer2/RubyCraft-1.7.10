package RubyCraft.xJuanathan;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Principal {
	
	//Bloques

	public static Block Monton_de_fosiles;
	
	//Items
	
	public static Item fosil;
	public static Item Fragmento_de_fosil;
	
	
	public static void preinit() 
	{
		//Bloques
		
		Monton_de_fosiles = new Monton_de_fosiles(Material.rock).setBlockName("Monton_de_fosiles").setBlockTextureName(RubyCraft.modid+":Monton_de_fosiles").setCreativeTab(RubyCraft.Rubycrafttab).setHardness(4.0F).setResistance(3.0F);
		GameRegistry.registerBlock(Monton_de_fosiles, Monton_de_fosiles.getUnlocalizedName().substring(5));
		Monton_de_fosiles.setHarvestLevel("pickaxe", 1);
		
		//Items
		
		fosil = new fosil().setUnlocalizedName("fosil").setTextureName(RubyCraft.modid+":fosil").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(fosil, fosil.getUnlocalizedName().substring(5));
		
		Fragmento_de_fosil = new Fragmento_de_fosil().setUnlocalizedName("Fragmento_de_fosil").setTextureName(RubyCraft.modid+":Fragmento_de_fosil").setCreativeTab(RubyCraft.Rubycrafttab);
		GameRegistry.registerItem(Fragmento_de_fosil, Fragmento_de_fosil.getUnlocalizedName().substring(5));
	}
	
	
	
	public static void init() 
	{
		//Crafteos
		
		GameRegistry.addRecipe(new ItemStack(fosil, 1),new Object[] {"a a","aaa","a a",'a',Fragmento_de_fosil});
		
	}
	
	
	public static void postinit() 
	{
		
	}
	
	
	
}
