package RubyCraft.Eventos;


import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class CrafteaEspadaRuby {

	@SubscribeEvent
	public void WhenICraftAItem(PlayerEvent.ItemCraftedEvent craftear){
		if(craftear.crafting.getItem().equals(RubyCraft.Espadaderuby)){
			craftear.player.addStat(Logros.CrafteaEspadaRuby, 1);
			
		}
		
	}
	
}
