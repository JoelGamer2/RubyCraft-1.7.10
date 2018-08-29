package HerraCraft.RecipeSorters;

import java.util.Comparator;

import HerraCraft.Registrar.MesaAzulaShapedRecipes;
import HerraCraft.Registrar.Mesa_de_Azula_Manager;
import HerraCraft.Registrar.MesadeAzulaShapelessRecipes;
import net.minecraft.item.crafting.IRecipe;

public class MesadeAzulaRecipeSorter implements Comparator{

	final Mesa_de_Azula_Manager MesadeTrabajodeAzula;
	public MesadeAzulaRecipeSorter(Mesa_de_Azula_Manager mesaazulaManager){
		this.MesadeTrabajodeAzula = mesaazulaManager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
		return irecipe1 instanceof MesadeAzulaShapelessRecipes && irecipe2 instanceof MesaAzulaShapedRecipes ? 1: (irecipe2 instanceof MesadeAzulaShapelessRecipes && irecipe1 instanceof MesaAzulaShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
			
		}
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
