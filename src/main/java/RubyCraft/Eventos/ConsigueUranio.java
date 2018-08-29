package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class ConsigueUranio{
	
	@SubscribeEvent
	 public void whenICraftABlock(PlayerEvent.ItemCraftedEvent Craftear){
	  if(Craftear.crafting.getItem().equals(RubyCraft.uranio)){
		  Craftear.player.addStat(Logros.ConsigueUranio, 1);
	  }
   }
}