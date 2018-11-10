package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.Item;

public class CrafteaMesadeConjuraciones{
	
	@SubscribeEvent
	 public void whenICraftABlock(PlayerEvent.ItemCraftedEvent Craftear){
	  if(Craftear.crafting.getItem().equals(Item.getItemFromBlock(RubyCraft.Mesa_De_Conjuraciones))){
		  Craftear.player.addStat(Logros.CrafteaMesadeConjuraciones, 1);
	  }
   }
}