package RubyCraft.Combustible_Iniciar;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class CombustibleTroncoAzul implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		Block blockFuel = Block.getBlockFromItem(fuel.getItem());
		if(blockFuel == RubyCraft.RubyCraft.tronco_Azul) return 320;
		
		return 0;
	}

}
