package RubyCraft.Combustible_Iniciar;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class NoCombustibleMesaRuby implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		Block blockFuel = Block.getBlockFromItem(fuel.getItem());
		if(blockFuel == RubyCraft.RubyCraft.MesadeTrabajodeRuby) return 100;
		
		return 0;
	}

}
