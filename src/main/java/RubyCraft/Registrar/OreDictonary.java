package RubyCraft.Registrar;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictonary {

	public static void Iniciar(){
		RegistrarItem("ingotcopper", RubyCraft.Cobre);
		RegistrarItem("plastico", RubyCraft.Plastico);
		RegistrarBloque("OreRuby", RubyCraft.Mena_de_Ruby);
		RegistrarBloque("OreZafiro", RubyCraft.Mena_de_Zafiro);
	}
	
	public static void RegistrarItem(String oredictonary, Item item){
		OreDictionary.registerOre(oredictonary, new ItemStack(item));	
	}
	public static void RegistrarBloque(String oredictonary, Block bloque){
		OreDictionary.registerOre(oredictonary, new ItemStack(bloque));
	}
}
