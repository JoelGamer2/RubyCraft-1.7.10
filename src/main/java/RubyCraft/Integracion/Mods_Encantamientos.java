package RubyCraft.Integracion;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

public class Mods_Encantamientos {
	
	public Mods_Encantamientos(Minecraft minecraft) {
		
	}

	@SubscribeEvent
	public void onPlayerTickEvent(PlayerTickEvent event){
		if(event.player.getCurrentArmor(0)!= null){
		     ItemStack botas = event.player.getCurrentArmor(0);   
		     
		     
		}
	}
   }
