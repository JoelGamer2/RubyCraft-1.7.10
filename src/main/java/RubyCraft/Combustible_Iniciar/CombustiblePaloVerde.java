package RubyCraft.Combustible_Iniciar;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class CombustiblePaloVerde implements IFuelHandler {
	
	@Override
	public int getBurnTime(ItemStack fuel){
		
		if(fuel.getItem() == RubyCraft.RubyCraft.paloverde) return 105;
		
		return 0;
		
	}

}
