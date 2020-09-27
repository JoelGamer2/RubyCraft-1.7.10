package RubyCraft.Integracion;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.Entidades.Mobs.AlejandroMob;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class DropeoMobsIntegracionHandler {


	
	 @SubscribeEvent
	    public void DropeoAlejandroMobSinHerraCraft(LivingDropsEvent event){
	    
		
	        if (event.entity instanceof AlejandroMob) {
	 
	            ItemStack stack = new ItemStack(RubyCraft.PPAP_Long_Version ,1);
	            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	 
	            Random rand = new Random();
	            if(rand.nextInt(2)==1) {
	            event.drops.add(drop);
	            }
	            
	            
	    }
	 }
	 
	 
}
