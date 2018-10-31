package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MinaZafiro {

	@SubscribeEvent
	public void whenIGetARubyOre(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Item.getItemFromBlock(RubyCraft.Mena_de_Zafiro)))){
			e.player.addStat(Logros.MinaZafiro, 1);
		}
	}
	
}
