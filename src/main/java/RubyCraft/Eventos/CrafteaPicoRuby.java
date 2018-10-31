package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class CrafteaPicoRuby {

	@SubscribeEvent
	 public void whenICraftAItem(PlayerEvent.ItemCraftedEvent Craftear){
	  if(Craftear.crafting.getItem().equals(RubyCraft.Picoderuby)){
		  Craftear.player.addStat(Logros.CrafteaPicoRuby, 1);
	  }
  }
	
}
