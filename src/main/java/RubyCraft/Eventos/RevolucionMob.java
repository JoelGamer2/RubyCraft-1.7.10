package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class RevolucionMob {
	
	@SubscribeEvent
	public void whenIGetARubyOre(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(RubyCraft.Totem_de_la_no_muerte))){
			e.player.addStat(Logros.RevolucionMob, 1);
			
		       
			
		}
	}

}