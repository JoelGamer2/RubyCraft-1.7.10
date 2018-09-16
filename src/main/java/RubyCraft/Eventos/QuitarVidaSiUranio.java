package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;

public class QuitarVidaSiUranio {

	
	 public static DamageSource RadioActividad = new DamageSource("RadioActividad").setMagicDamage();

	
	@SubscribeEvent
	 public void onPlayerTick(TickEvent.PlayerTickEvent event){
		
	/**	if(event.player.getCurrentArmor(0) != null && event.player.getCurrentArmor(1) != null && event.player.getCurrentArmor(2) != null && event.player.getCurrentArmor(3) != null){
			ItemStack botas = event.player.getCurrentArmor(0);
			ItemStack grebas = event.player.getCurrentArmor(1);
			ItemStack pechera = event.player.getCurrentArmor(2);
			ItemStack casco = event.player.getCurrentArmor(3);**/
			
			  if(event.player.inventory.hasItem(RubyCraft.uranio)) {
				  
				  event.player.attackEntityFrom(RadioActividad, 4.0F);
			  }
		      
		  }
		}
	//}
	

