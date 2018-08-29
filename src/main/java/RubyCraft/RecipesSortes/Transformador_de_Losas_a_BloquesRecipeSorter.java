package RubyCraft.RecipesSortes;

import java.util.Comparator;

import RubyCraft.Manager.ManagerTransformador_de_Losas_a_Bloques;
import net.minecraft.item.crafting.IRecipe;

public class Transformador_de_Losas_a_BloquesRecipeSorter implements Comparator{

	final ManagerTransformador_de_Losas_a_Bloques Transformador;
	public Transformador_de_Losas_a_BloquesRecipeSorter(ManagerTransformador_de_Losas_a_Bloques transformador2){
		this.Transformador = transformador2;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
		return irecipe1 instanceof transformador_de_Losas_a_BloquesShapelessRecipes && irecipe2 instanceof Transformador_de_Losas_a_BloquesShapedRecipes ? 1: (irecipe2 instanceof transformador_de_Losas_a_BloquesShapelessRecipes && irecipe1 instanceof Transformador_de_Losas_a_BloquesShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
			
		}
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
