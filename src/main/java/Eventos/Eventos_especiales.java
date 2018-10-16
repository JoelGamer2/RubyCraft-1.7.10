package Eventos;

import HerraCraft.Generator_Boss;
import RubyCraft.RubyCraft;
import RubyCraft.Entidades.Mobs.BossParca;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;

public class Eventos_especiales {

	private boolean Iniciadosesion = false;
	public static boolean musica = false;

	public static String ParcaFase1 = "La parca llama a su ejercito en la 1 fase";
	public static String ParcaFase2 = "La parca huye de los humanos en la fase 2";
	public static String ParcaFase3 = "La parca 3";
	public static String ParcaFase4 = "La parca Hace todo lo anterior en la fase 4 Solo en modo dificil";

	public static DamageSource Laparcasellevotualma = new DamageSource("Laparcasellevotualma").setMagicDamage();

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		
		
		//Navidad evento
		if (RubyCraft.Navidad == true && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null) {

			event.player.addStat(Logros.Es_Navidad, 1);
			Iniciadosesion = true;
		}

		
		
		//Halloween evento 
		
		if(RubyCraft.HalloWen == true && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null) {
			
			event.player.addStat(Logros.Es_Hallowen, 1);
			
		}
		
		if(BossParca.Activo) {
			if (BossParca.Fase == 3 && BossParca.Activo) {

				event.player.attackEntityFrom(Laparcasellevotualma, 1.0F);

			}
			if (!RubyCraft.cliente) {

				if (!BossParca.chat1 && BossParca.Fase == 1 && BossParca.Activo) {
					BossParca.chat1 = true;
					event.player.addChatComponentMessage(new ChatComponentText(ParcaFase1));

				}

				if (!BossParca.chat2 && BossParca.Fase == 2 && BossParca.Activo) {
					BossParca.chat2 = true;
					event.player.addChatComponentMessage(new ChatComponentText(ParcaFase2));

				}

				if (!BossParca.chat3 && BossParca.Fase == 3 && BossParca.Activo) {
					BossParca.chat3 = true;
					event.player.addChatComponentMessage(new ChatComponentText(ParcaFase3));

				}

			}

			if (!RubyCraft.cliente && BossParca.Activo && !musica && BossParca.Fase == 1) {

				event.player.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE, 1.0F);

				musica = true;
			}
		
	}
}

	@SubscribeEvent
	public void onworldtick(WorldTickEvent event) {
		
		//Navidad evento
		
		
		//Halloween evento 
		
		if(BossParca.Activo) {
		if (RubyCraft.cliente == true && Minecraft.getMinecraft().currentScreen == null) {

			if (!BossParca.chat1 && BossParca.Fase == 1 && BossParca.Activo) {
				BossParca.chat1 = true;
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ParcaFase1));

			}

			if (!BossParca.chat2 && BossParca.Fase == 2 && BossParca.Activo) {
				BossParca.chat2 = true;
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ParcaFase2));

			}

			if (!BossParca.chat3 && BossParca.Fase == 3 && BossParca.Activo) {
				BossParca.chat3 = true;
				Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ParcaFase3));

			}

			if (BossParca.Activo && !musica && !(Generator_Boss.NombreJugador == Minecraft.getMinecraft().thePlayer.getDisplayName())) {

				Minecraft.getMinecraft().thePlayer.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE,1.0F);

				musica = true;
			          }
		         }
	        }
          
	}
	
}
