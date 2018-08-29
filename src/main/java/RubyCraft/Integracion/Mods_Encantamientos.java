package RubyCraft.Integracion;

import HerraCraft.herracraft;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Mods_Encantamientos {
	
	public Mods_Encantamientos(Minecraft minecraft) {
		
	}

	@SubscribeEvent
	public void onPlayerTickEvent(PlayerTickEvent event){
		if(event.player.getCurrentArmor(0)!= null){
		     ItemStack botas = event.player.getCurrentArmor(0);   
		     
		     if(botas.getItem() == herracraft.Botas_de_Azula || botas.getItem() == herracraft.Botas_de_militar || botas.getItem() == herracraft.Botas_de_Redstoner){
		    	 int j = EnchantmentHelper.getEnchantmentLevel(RubyCraft.BotasdeVelocidad.effectId, botas);
		    	 if(j > 0){
		    		 event.player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
		    	 }
		     }
		     
		}if(event.player.getCurrentArmor(1)!= null){
			ItemStack grebas = event.player.getCurrentArmor(1);
	
	
			if(grebas.getItem() == herracraft.Pantalones_de_Azula || grebas.getItem() == herracraft.Pantalones_de_militar || grebas.getItem() == herracraft.Pantalones_de_Redsoner){
				int j = EnchantmentHelper.getEnchantmentLevel(RubyCraft.Grebas_de_Regeneracion.effectId, grebas);
				if(j > 0){
					event.player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 50, j - 1));
			   	}
			 }
	      }
	  }
   }
