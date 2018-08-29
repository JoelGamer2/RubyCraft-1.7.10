package RubyCraft.Eventos;

import com.mojang.realmsclient.gui.ChatFormatting;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.BuscarVersionTrol;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class trol {

	private boolean Iniciadosesion = false;
	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event){
		if(BuscarVersionTrol.HayVersionTrol() && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null){
		     Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ChatFormatting.GRAY + "[" + ChatFormatting.GREEN + "RubyCraft" + ChatFormatting.GRAY + "] " + ChatFormatting.GOLD + "La Version Trol esta Activada."));
			Iniciadosesion = true;
			RubyCraft.VersionTrol = true;
			
		}else if(RubyCraft.VersionTrol && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null) {
			
		     Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ChatFormatting.GRAY + "[" + ChatFormatting.GREEN + "RubyCraft" + ChatFormatting.GRAY + "] " + ChatFormatting.GOLD + "La Version Trol esta Activada."));
				Iniciadosesion = true;
				RubyCraft.VersionTrol = true;
			
		}
	}
	
}
