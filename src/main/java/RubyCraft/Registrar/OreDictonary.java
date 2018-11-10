package RubyCraft.Registrar;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictonary {

	public static void Iniciar(){
		RegistrarItem("ingotCopper", RubyCraft.Cobre);
		RegistrarItem("plastico", RubyCraft.Plastico);
		RegistrarBloque("OreRuby", RubyCraft.Mena_de_Ruby);
		RegistrarBloque("OreZafiro", RubyCraft.Mena_de_Zafiro);
		RegistarMesa(Blocks.crafting_table);
		RegistarMesa(RubyCraft.Mesa_de_trabajo_de_abedul);
		RegistarMesa(RubyCraft.Mesa_de_trabajo_de_abeto);
		RegistarMesa(RubyCraft.Mesa_de_trabajo_de_acacia);
		RegistarMesa(RubyCraft.Mesa_de_trabajo_de_jungla);
		RegistarMesa(RubyCraft.Mesa_de_trabajo_de_roble_oscuro);
		
	}
	
	public static void RegistrarItem(String oredictonary, Item item){
		OreDictionary.registerOre(oredictonary, new ItemStack(item));	
	}
	public static void RegistrarBloque(String oredictonary, Block bloque){
		OreDictionary.registerOre(oredictonary, new ItemStack(bloque));
	}
	
	public static void RegistarMesa(Block mesa) {
		OreDictionary.registerOre("craftingTableWood", new ItemStack(mesa));
		OreDictionary.registerOre("crafterWood", new ItemStack(mesa));	
	}
	
}
