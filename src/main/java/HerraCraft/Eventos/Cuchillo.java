package HerraCraft.Eventos;

import HerraCraft.herracraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class Cuchillo {
	@SubscribeEvent
	public void onCrafting(PlayerEvent.ItemCraftedEvent e) {
		
		for(int i=0; i < e.craftMatrix.getSizeInventory(); i++)
		  {         
		      if(e.craftMatrix.getStackInSlot(i) != null)
		      {
		       ItemStack j = e.craftMatrix.getStackInSlot(i);
		       if(j.getItem() != null && j.getItem() == herracraft.Cuchillo)
		       {
		        ItemStack k = new ItemStack(herracraft.Cuchillo, 2, (j.getItemDamage() + 1));
		        e.craftMatrix.setInventorySlotContents(i, k);
		       }
		      }  
		  }
	}
	

	}
