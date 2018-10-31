package RubyCraft.Generacion;

import RubyCraft.RubyCraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class Loot_Cofres {

	public static void Iniciar(){
		
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RubyCraft.ruby), 1  ,5 , 5));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RubyCraft.Platino), 1, 10, 4));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RubyCraft.zafiro), 1, 3, 2));
		//ChestGenHooks.getInfo(ChestGenHooks.CATEGORY).addItem(new WeightedRandomChestContent(new ItemStack(YourItem), Min, Max, Rarity))		
	}

	
}
