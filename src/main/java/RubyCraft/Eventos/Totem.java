package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Totem {

	 @SubscribeEvent
	 public void onPlayerTick(TickEvent.PlayerTickEvent event) {
			 if(event.player.inventory.hasItem(RubyCraft.Totem_de_la_no_muerte) && event.player.getHealth() < 6.0F){
				 event.player.worldObj.playSoundAtEntity(event.player, RubyCraft.modid + ":totem", Float.MAX_VALUE, 1.0F);
				 event.player.heal(event.player.getMaxHealth());
				    event.player.inventory.consumeInventoryItem(RubyCraft.Totem_de_la_no_muerte); 
	            		event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + event.player.getDisplayName() + EnumChatFormatting.BLUE + " " + "Te e Salvado la Vida Amigo : - )"));
				         
				              event.player.addStat(Logros.Amigos_Para_Siempre, 1);
	     	 }			 
			
	}
	 
	 
	 
}
