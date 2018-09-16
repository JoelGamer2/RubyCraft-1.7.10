package RubyCraft.Eventos;

import HerraCraft.Generator_Boss;
import RubyCraft.RubyCraft;
import RubyCraft.Entidades.Mobs.BossParca;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;

public class Eventos_especiales {
		
	private boolean Iniciadosesion = false;
	public static boolean musica = false;

	
	 public static DamageSource Laparcasellevotualma = new DamageSource("Laparcasellevotualma").setMagicDamage();

	
	@SubscribeEvent
	 public void onPlayerTick(TickEvent.PlayerTickEvent event){
		 
		if(BossParca.Fase == 3 && BossParca.Vivo) {
			
			event.player.attackEntityFrom(Laparcasellevotualma, 1.0F);
			
		}
		
		
		if(RubyCraft.Navidad == true && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null){
       	 
       event.player.addStat(Logros.Es_Navidad, 1);
       Iniciadosesion = true;
        }

		
		if(!RubyCraft.cliente) {
			
			
			
			 if(!BossParca.chat1 && BossParca.Fase == 1 && BossParca.Vivo) {
      		   BossParca.chat1 = true;
      		   event.player.addChatComponentMessage(new ChatComponentText("La parca llama a su ejercito en la 1 fase"));
 
      	   }
      	   
      	   if(!BossParca.chat2 && BossParca.Fase == 2 && BossParca.Vivo) {
      		   BossParca.chat2 = true;
      		   event.player.addChatComponentMessage(new ChatComponentText("La parca huye de los humanos en la fase 2"));
 
      	   }
      	   
      	   if(!BossParca.chat3 && BossParca.Fase == 3 && BossParca.Vivo) {
      		   BossParca.chat3 = true;
      		   event.player.addChatComponentMessage(new ChatComponentText("La parca 3"));
 
      	   }
      	   
      	   if(!BossParca.chat4 && BossParca.Fase == 4 && BossParca.Vivo) {
      		   BossParca.chat4 = true;
      		   event.player.addChatComponentMessage(new ChatComponentText("La parca Hace todo lo anterior en la fase 4 Solo en modo dificil"));
 
      	   }
      	   
			
		}
		
		
		if(!RubyCraft.cliente && BossParca.Vivo && !musica) {
			
			 event.player.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE, 1.0F);

			musica = true;
		}
		
		
	}
	 
	
	@SubscribeEvent
	public void onworldtick(WorldTickEvent event){
           if(RubyCraft.cliente == true && Minecraft.getMinecraft().currentScreen == null) {
        	   
        	   
        	   if(!BossParca.chat1 && BossParca.Fase == 1 && BossParca.Vivo) {
        		   BossParca.chat1 = true;
        		   Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText("La parca llama a su ejercito en la 1 fase"));
   
        	   }
        	   
        	   if(!BossParca.chat2 && BossParca.Fase == 2 && BossParca.Vivo) {
        		   BossParca.chat2 = true;
        		   Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText("La parca huye de los humanos en la fase 2"));
   
        	   }
        	   
        	   if(!BossParca.chat3 && BossParca.Fase == 3 && BossParca.Vivo) {
        		   BossParca.chat3 = true;
        		   Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText("La parca 3"));
   
        	   }
        	   
        	   if(!BossParca.chat4 && BossParca.Fase == 4 && BossParca.Vivo) {
        		   BossParca.chat4 = true;
        		   Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText("La parca Hace todo lo anterior en la fase 4 Solo en modo dificil"));
   
        	   }
        	   
     
		if(BossParca.Vivo && !musica && !(Generator_Boss.NombreJugador == Minecraft.getMinecraft().thePlayer.getDisplayName())){
			

			 Minecraft.getMinecraft().thePlayer.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE, 1.0F);
		

      musica = true;
	    }
      }
	}
	
	
	
}
