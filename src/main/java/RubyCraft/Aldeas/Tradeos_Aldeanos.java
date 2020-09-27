package RubyCraft.Aldeas;

import java.util.Random;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class Tradeos_Aldeanos implements IVillageTradeHandler{

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random rand)
	{
		switch(villager.getProfession()) {
		
		case 3: // Armero
			
			recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 1 + rand.nextInt(7)), new ItemStack(RubyCraft.ruby, 1 + rand.nextInt(6))));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 3 + rand.nextInt(13)), new ItemStack(RubyCraft.zafiro, 1 + rand.nextInt(8))));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.diamond, 1 + rand.nextInt(5)), new ItemStack(RubyCraft.Cobre, 20 + rand.nextInt(44))));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.iron_ingot, 2 + rand.nextInt(4)), new ItemStack(RubyCraft.Aluminio, 20 + rand.nextInt(10))));
			recipeList.add(new MerchantRecipe(new ItemStack(RubyCraft.zafiro, 3 + rand.nextInt(13)), new ItemStack(RubyCraft.Platino, 1 + rand.nextInt(8))));
            recipeList.add(new MerchantRecipe(new ItemStack(RubyCraft.zafiro, 10 + rand.nextInt(20)), new ItemStack(RubyCraft.Bloque_de_Platino, 3 + rand.nextInt(13))));
            
            recipeList.add(new MerchantRecipe(new ItemStack(Items.emerald, 60 + rand.nextInt(4)), new ItemStack(posiblesitem[rand.nextInt(posiblesitem.length)], 1)));
           
            
            
			break;
       }
	}
	private static Item[] posiblesitem = {
			
			RubyCraft.Libro_de_recetas,
			RubyCraft.Aliento_del_Dragon,
			RubyCraft.alga_seca,
			RubyCraft.Espada_de_Platino,
			RubyCraft.cascodePlatino,
			
	};
	
	public static void Iniciar_Tradeos_Aldeanos(){
		
		 for (int i = 0; i < 5; ++i) {
			 
				VillagerRegistry.instance().registerVillageTradeHandler(i, new Tradeos_Aldeanos());
				
			}
		
	}
	
}