package RubyCraft;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class Errores {

	
	public static void errores(Minecraft minecraft, String clase, String error, boolean decirenminecraft) {
		clase = clase.replaceFirst("class", "");
		if(!(minecraft==null) && decirenminecraft) {
		
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + EnumChatFormatting.LIGHT_PURPLE  + " Error en la clase:"));
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED +  clase.toString() + " "));
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED  + EnumChatFormatting.BOLD + "Para mas informacion mire el log de la " + EnumChatFormatting.RED  + EnumChatFormatting.BOLD + "consola"));

		}
		RubyCraft.logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@ ERROR @@@@@@@@@@@@@@@@@@@@@@@@@@");
		RubyCraft.logger.info(clase);
		RubyCraft.logger.error(error);
		RubyCraft.logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@ ERROR @@@@@@@@@@@@@@@@@@@@@@@@@@");
		
	}
	
}
