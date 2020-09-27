package RubyCraft.Teclas;

import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import RubyCraft.Actualizaciones.Buscar_Actualizaciones;
import RubyCraft.Bloques.Bloque_de_Actualizaciones;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class Evento_Teclas {

	
	
	@SubscribeEvent
	public void TeclaPrueba(KeyInputEvent event){
	
			if(Teclas_Principal.Ver_updates.getIsKeyPressed() && RubyCraft.cliente){
				EntityPlayer player = Minecraft.getMinecraft().thePlayer;
				if(!RubyCraft.version.equals(Bloque_de_Actualizaciones.UltimaVersion) && !Control_de_Version.Version_de_desarrolador){
					
					Buscar_Actualizaciones.MirarActualizaciones();
					
					Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Hay Una Nueva Version Disponible: " + EnumChatFormatting.RED + Bloque_de_Actualizaciones.UltimaVersion));
					Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD +Bloque_de_Actualizaciones.Mensaje1));
					if(Bloque_de_Actualizaciones.Mensaje2a == true){
					Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Bloque_de_Actualizaciones.Mensaje2));
					}if(Bloque_de_Actualizaciones.Mensaje3a == true){
					Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Bloque_de_Actualizaciones.Mensaje3));
					
					}
					IChatComponent url = new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + "Click para ver el ChangeLog");
					url.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, Bloque_de_Actualizaciones.changeLog));
					Minecraft.getMinecraft().thePlayer.addChatMessage(url);
				}else if(Control_de_Version.Version_de_desarrolador) {
					
					Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Cuidado esta es la DeveloperBuild " + EnumChatFormatting.GOLD + "puede ocurrir muchos bugs Version: " + EnumChatFormatting.RED + RubyCraft.version + EnumChatFormatting.RED + " INDEV"));
				
				  }else if(RubyCraft.version.equals(Bloque_de_Actualizaciones.UltimaVersion) && !Control_de_Version.Version_de_desarrolador){
					
					Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Estas en la Version:" + EnumChatFormatting.GREEN + RubyCraft.version + EnumChatFormatting.GOLD + " La Ultima " + EnumChatFormatting.GOLD + "Version es la:" + EnumChatFormatting.RED + Bloque_de_Actualizaciones.UltimaVersion));
					Buscar_Actualizaciones.MirarActualizaciones();
				}
				
			}
	}
	
}
