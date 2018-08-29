package RubyCraft.Actualizaciones;


import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class TestearActualizaciones {

	private boolean Iniciadosesion = false;
	public static String UltimaVersion = "";
	public static boolean Mensaje2a = true;
	public static boolean Mensaje3a = true;
	public static String Mensaje1 = "";
	public static String Mensaje2 = "";
	public static String Mensaje3 = "";

	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event){
		if(Control_de_Version.Version_de_desarrolador == false && Buscar_Actualizaciones.HayNuevaVersion() && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null){
			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Hay Una Nueva Version Disponible: " + EnumChatFormatting.RED + UltimaVersion));
			 Minecraft.getMinecraft().thePlayer.playSound(RubyCraft.modid + ":Logros_especiales", 1.0F, 1.0F);

			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje1));
			if(Mensaje2a == true){
			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje2));
			}if(Mensaje3a == true){
			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Mensaje3));
			}
			Iniciadosesion = true;
			
		}else if(Control_de_Version.Version_de_desarrolador == true && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null) {
			
			Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Cuidado esta es la DeveloperBuild " + EnumChatFormatting.GOLD + "puede ocurrir muchos bugs Version: " + EnumChatFormatting.RED + RubyCraft.version + EnumChatFormatting.RED + " INDEV"));

			Iniciadosesion = true;
		}
	}
	
}
