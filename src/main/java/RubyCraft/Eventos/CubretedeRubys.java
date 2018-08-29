package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.item.ItemStack;

public class CubretedeRubys {
	

	@SubscribeEvent
	public void onPlayerTickEvent(PlayerTickEvent event){
	if(event.player.getCurrentArmor(0) != null && event.player.getCurrentArmor(1) != null && event.player.getCurrentArmor(2) != null && event.player.getCurrentArmor(3) != null){
		ItemStack botas = event.player.getCurrentArmor(0);
		ItemStack grebas = event.player.getCurrentArmor(1);
		ItemStack pechera = event.player.getCurrentArmor(2);
		ItemStack casco = event.player.getCurrentArmor(3);
	if(botas.getItem() == RubyCraft.botasdeRuby && grebas.getItem() == RubyCraft.PantacasdeRuby && pechera.getItem() == RubyCraft.PetodeRuby && casco.getItem() == RubyCraft.CascodeRuby){
		event.player.addStat(Logros.CubretedeRubys, 1);
		
	      }
       } 
	}
}