package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

public class CrafteaMesadeRuby {
	
	@SubscribeEvent
	 public void whenICraftABlock(PlayerEvent.ItemCraftedEvent Craftear){
	  if(Craftear.crafting.getItem().equals(Item.getItemFromBlock(RubyCraft.MesadeTrabajodeRuby))){
		  Craftear.player.addStat(Logros.CrafteaMesadeRuby, 1);

	  }
   }
	
}
