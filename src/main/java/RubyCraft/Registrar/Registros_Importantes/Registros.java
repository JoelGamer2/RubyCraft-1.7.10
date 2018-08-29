package RubyCraft.Registrar.Registros_Importantes;

import RubyCraft.Manager.ManagerTransformador_de_Losas_a_Bloques;
import RubyCraft.Manager.MesaZafiroManager;
import RubyCraft.Manager.MesarubyManager;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class Registros {
     //Mesa Ruby
    public static void addRecipeRuby(ItemStack output, Object... params)
    {
        addShapedRecipeRuby(output, params);
    }

    public static void addShapelessRecipeRuby(ItemStack output, Object... params)
    {
        MesarubyManager.getInstance().addShapelessRecipe(output, params);
    }
    
    public static IRecipe addShapedRecipeRuby(ItemStack output, Object... params)
    {
        return MesarubyManager.getInstance().addRecipe(output, params);
    }
    //Mesa Zafiro
    public static void addRecipeZafiro(ItemStack output, Object... params)
    {
        addShapedRecipeZafiro(output, params);
    }

    public static void addShapelessRecipeZafiro(ItemStack output, Object... params)
    {
        MesaZafiroManager.getInstance().addShapelessRecipe(output, params);
    }
    
    public static IRecipe addShapedRecipeZafiro(ItemStack output, Object... params)
    {
        return MesaZafiroManager.getInstance().addRecipe(output, params);
    }
    //Transforador de Losas a Bloques
    public static void addRecipeTransformador(ItemStack output, Object... params)
    {
    	addShapedRecipeTransformador(output, params);
    }
    public static void addShapelessRecipeTransformador(ItemStack output, Object... params)
    {
        ManagerTransformador_de_Losas_a_Bloques.getInstance().addShapelessRecipe(output, params);
    }
    
    public static IRecipe addShapedRecipeTransformador(ItemStack output, Object... params)
    {
        return ManagerTransformador_de_Losas_a_Bloques.getInstance().addRecipe(output, params);
    }
	
}
