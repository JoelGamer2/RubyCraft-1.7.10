package RubyCraft.NoCombustible_Iniciar;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class NoCombustibleBloquedeAzucar implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		Block blockFuel = Block.getBlockFromItem(fuel.getItem());
		if(blockFuel == RubyCraft.RubyCraft.Bloque_de_azucar) return 100;
		
		return 0;
	}

}
