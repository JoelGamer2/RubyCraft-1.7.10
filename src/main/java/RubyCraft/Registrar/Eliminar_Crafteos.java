package RubyCraft.Registrar;

import java.util.Iterator;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class Eliminar_Crafteos {

	public static void IniciarEliminarCrafteos(){
			
		Iterator<IRecipe> remover = CraftingManager.getInstance().getRecipeList().iterator();
		while(remover.hasNext()){
			ItemStack itemstack = remover.next().getRecipeOutput();
			if(itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.crafting_table)){
				remover.remove();
		}
			
      }	
    }	
	
	
	public static void CrafteosTrol(){
		
		
		Iterator<IRecipe> remover = CraftingManager.getInstance().getRecipeList().iterator();
		while(remover.hasNext()){
			ItemStack itemstack = remover.next().getRecipeOutput();
			if(itemstack != null && itemstack.getItem() == Item.getItemFromBlock(Blocks.furnace)){
				remover.remove();
		}
			
      }	
	}
		
	}
