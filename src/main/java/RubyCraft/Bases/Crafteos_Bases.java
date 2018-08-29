package RubyCraft.Bases;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Crafteos_Bases {

public static void Armaduras(Item objeto,Item casco, Item pechera, Item grebas, Item botas){
		
		GameRegistry.addRecipe(new ItemStack(casco, 1), new Object[]{"ooo","o o",'o',objeto});
		GameRegistry.addRecipe(new ItemStack(pechera, 1), new Object[]{"o o","ooo","ooo",'o',objeto});
		GameRegistry.addRecipe(new ItemStack(grebas, 1), new Object[]{"ooo","o o","o o",'o',objeto});
		GameRegistry.addRecipe(new ItemStack(botas, 1), new Object[]{"o o","o o",'o',objeto});
		
	}
	
	public static void Herramientas(Item objeto, Item palo, Item pico, Item espada, Item hacha, Item pala, Item azada, Item Tijeras){
		
		GameRegistry.addRecipe(new ItemStack(espada, 1), new Object[]{" r "," r "," p ",'r',objeto,'p',palo});
    	GameRegistry.addRecipe(new ItemStack(pico, 1), new Object[]{"rrr"," p "," p ",'r',objeto,'p',palo});
		GameRegistry.addRecipe(new ItemStack(hacha, 1), new Object[]{"rr ","rp "," p ",'r',objeto,'p',palo});
    	GameRegistry.addRecipe(new ItemStack(pala, 1), new Object[]{" r "," p "," p ",'r',objeto,'p',palo});
    	GameRegistry.addRecipe(new ItemStack(azada, 1), new Object[]{"rr "," p "," p ",'r',objeto,'p',palo});
		GameRegistry.addRecipe(new ItemStack(Tijeras, 1), new Object[]{"  o"," o ",'o', objeto});

		
	}
	
	public static void Bloques(Item objeto, Block resultado){
		
		GameRegistry.addRecipe(new ItemStack(resultado, 1), new Object[]{"ooo","ooo","ooo",'o',objeto});
		
	}
	
	 public static void Bloques_OreDictonary(String materialechos, Block BloqueaCrafterar){
	    	GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BloqueaCrafterar,1), new Object[]{"ccc","ccc","ccc",'c',materialechos}));
	    }
	
	 public static void Crafteo_Polvo_de_Cemento(Block Cementos_Bases, int SubIdTinte){
		
		 GameRegistry.addRecipe(new ItemStack(Cementos_Bases, 4), new Object[]{"gag","ata","gag",'a', Blocks.sand, 'g', Blocks.gravel, 't', new ItemStack(Items.dye, 1, SubIdTinte)});
		 
	 }
	 
}
