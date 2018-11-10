package RubyCraft.Eventos;


import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class CrafteaEspadaZafiro {

	@SubscribeEvent
	public void WhenICraftAItem(PlayerEvent.ItemCraftedEvent craftear){
		if(craftear.crafting.getItem().equals(RubyCraft.Espadadezafiro)){
			craftear.player.addStat(Logros.CrafteaEspadaZafiro, 1);
			
		}
		
	}
	
}
