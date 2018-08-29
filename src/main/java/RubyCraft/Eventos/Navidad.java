package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;

public class Navidad {
		
	private boolean Iniciadosesion = false;

	
	@SubscribeEvent
	 public void onPlayerTick(TickEvent.PlayerTickEvent event){
		 
		if(RubyCraft.Navidad == true && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null){
       	 
       event.player.addStat(Logros.Es_Navidad, 1);
       Iniciadosesion = true;
        }

	}
	 
}
