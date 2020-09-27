package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class QuitarVidaSiUranio {

	
	 public static DamageSource RadioActividad = new DamageSource("RadioActividad").setMagicDamage();

	
	@SubscribeEvent
	 public void onPlayerTick(TickEvent.PlayerTickEvent event){
		if(event.player.getCurrentArmor(0)!= null && event.player.getCurrentArmor(1)!= null && event.player.getCurrentArmor(2)!= null && event.player.getCurrentArmor(3)!= null){
			ItemStack cascos = event.player.getCurrentArmor(3);
			ItemStack pechera = event.player.getCurrentArmor(2);
			ItemStack grebas = event.player.getCurrentArmor(1);
			ItemStack botas = event.player.getCurrentArmor(0);
			
			if(!(botas.getItem() == RubyCraft.botasdeUranio) || !(grebas.getItem() == RubyCraft.PantacasdeUranio) || !(pechera.getItem() == RubyCraft.PetodeUranio) || !(cascos.getItem() == RubyCraft.cascodeUranio)){
				if(event.player.inventory.hasItem(RubyCraft.uranio)) {
				event.player.attackEntityFrom(RadioActividad, 1.0f);
				}
				
			}
	     }else if(event.player.inventory.hasItem(RubyCraft.uranio)){
	    	 
	    	 event.player.attackEntityFrom(RadioActividad, 1.0f);
	     }
		
	     
		 
		}
	}
	

