package RubyCraft.Eventos;

import HerraCraft.herracraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class MataParca {
	
	@SubscribeEvent
	public void whenIGetARubyOre(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(herracraft.Lingote_Demoniaco))){
			e.player.addStat(Logros.Matar_Parca, 1);
			
		       
			
		}
	}

}