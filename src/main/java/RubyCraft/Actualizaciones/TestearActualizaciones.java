package RubyCraft.Actualizaciones;


import java.util.UUID;

import RubyCraft.Control_de_Version;
import RubyCraft.Errores;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class TestearActualizaciones {

	private boolean Iniciadosesion = false;
	public static String UltimaVersion = "";
	public static boolean Mensaje2a = true;
	public static boolean Mensaje3a = true;
	public static String Mensaje1 = "";
	public static String Mensaje2 = "";
	public static String Mensaje3 = "";
	public static String ChangeLog = "";
    public static boolean activo = false;
	public static String nombre = "";
	public static UUID uuid;
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event){
		if(Buscar_Actualizaciones.HayNuevaVersion() && Buscar_Actualizaciones.mysql && !activo) {
			Mensaje1 = mysql.mensajes[0];
			Mensaje2 = mysql.mensajes[1];
			Mensaje3 = mysql.mensajes[2];
			UltimaVersion = mysql.mensajes[3];
			ChangeLog = mysql.mensajes[4];
			
			
		}
		if(Control_de_Version.Version_de_desarrolador == false && Buscar_Actualizaciones.HayNuevaVersion() && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null){
			nombre = Minecraft.getMinecraft().thePlayer.getDisplayName();
			uuid = Minecraft.getMinecraft().thePlayer.getUniqueID();
			mysql_registro(uuid, nombre);
		    
		
			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Hay Una Nueva Version Disponible: " + EnumChatFormatting.RED + UltimaVersion));
			 Minecraft.getMinecraft().thePlayer.playSound(RubyCraft.modid + ":Logros_especiales", 1.0F, 1.0F);

			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje1));
			if(Mensaje2a == true){
			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje2));
			}if(Mensaje3a == true){
			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje3));
			}
			IChatComponent url = new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + "Click para ver el ChangeLog");
			url.getChatStyle().setChatClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, ChangeLog));
			Minecraft.getMinecraft().thePlayer.addChatMessage(url);
			Iniciadosesion = true;
			activo = true;
		}else if(Control_de_Version.Version_de_desarrolador == true && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null) {
		
			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Cuidado esta es la DeveloperBuild " + EnumChatFormatting.GOLD + "puede ocurrir muchos bugs Version: " + EnumChatFormatting.RED + RubyCraft.version + EnumChatFormatting.RED + " INDEV"));
			nombre = Minecraft.getMinecraft().thePlayer.getDisplayName();
			uuid = Minecraft.getMinecraft().thePlayer.getUniqueID();
			mysql_registro(uuid, nombre);
			Iniciadosesion = true;
			activo = true;
		}else if(!Iniciadosesion && Minecraft.getMinecraft().currentScreen == null && Buscar_Actualizaciones.mysql) {
			
			nombre = Minecraft.getMinecraft().thePlayer.getDisplayName();
			uuid = Minecraft.getMinecraft().thePlayer.getUniqueID();
			mysql_registro(uuid, nombre);
			Iniciadosesion = true;
			activo = true;
		}
	}
	
	public static void mysql_registro(UUID uuid, String nombre) {
		try {
			new otro_mysql().iniciar(nombre,uuid);
		} catch (Exception e) {
			e.printStackTrace();
			Errores.errores(Minecraft.getMinecraft(), TestearActualizaciones.class.toString(), e.toString(), false);
		}
	}
	
}
