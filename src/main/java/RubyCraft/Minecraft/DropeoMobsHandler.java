package RubyCraft.Minecraft;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;;

public class DropeoMobsHandler{

   @SubscribeEvent
    public void DropeoDragon(LivingDropsEvent event){
    
        if (event.entity instanceof EntityDragon) {
 
            ItemStack stack = new ItemStack(RubyCraft.zafiro, 24);
            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
 
            event.drops.add(drop);
        }
    }
    
    @SubscribeEvent
    public void DropeoCerdo(LivingDropsEvent event){
    	
    	if(event.entity instanceof EntityPig){
    	 
    	ItemStack stack = new ItemStack(RubyCraft.Bloquedecaca, 1);
    	EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
    	
    	event.drops.add(drop);
    	
      }	
   }
    
    
}