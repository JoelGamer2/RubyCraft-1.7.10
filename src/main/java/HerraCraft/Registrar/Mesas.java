package HerraCraft.Registrar;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class Mesas {
     //Mesa de Azula
    public static void addRecipeAzula(ItemStack output, Object... params)
    {
        addShapedRecipeAzula(output, params);
    }

    public static void addShapelessRecipeAzula(ItemStack output, Object... params)
    {
        Mesa_de_Azula_Manager.getInstance().addShapelessRecipe(output, params);
    }
    
    public static IRecipe addShapedRecipeAzula(ItemStack output, Object... params)
    {
        return Mesa_de_Azula_Manager.getInstance().addRecipe(output, params);
    }
}
