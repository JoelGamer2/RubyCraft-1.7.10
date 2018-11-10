package RubyCraft.Eventos;


import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class CrafteaPicoZafiro {

	@SubscribeEvent
	public void WhenICraftAItem(PlayerEvent.ItemCraftedEvent craftear){
		if(craftear.crafting.getItem().equals(RubyCraft.Picodezafiro)){
			craftear.player.addStat(Logros.CrafteaPicoZafiro, 1);
			
		}
		
	}
	
}
