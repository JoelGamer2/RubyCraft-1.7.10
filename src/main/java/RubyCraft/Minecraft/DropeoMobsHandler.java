package RubyCraft.Minecraft;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import scala.util.Random;;

public class DropeoMobsHandler{

   @SubscribeEvent
    public void DropeoDragon(LivingDropsEvent event){
    
        if (event.entity instanceof EntityDragon) {
            Random rand = new Random();

            ItemStack stack = new ItemStack(RubyCraft.zafiro, 10 + rand.nextInt(14));
            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
 
            event.drops.add(drop);
        }
    }
    
    @SubscribeEvent
    public void DropeoCerdo(LivingDropsEvent event){
    	
    	if(event.entity instanceof EntityPig){
    		int probabilidad =0;                           //ESTO LO QUE HACE ES QUE EL BLOQUE DE CACA SOLO SE DROPEE CON UN 25% DE PROBABILIDADES
    		Random rand = new Random();
             probabilidad = rand.nextInt(100);
    		if(probabilidad <=25) {
    	ItemStack stack = new ItemStack(RubyCraft.Bloquedecaca, 1);
    	EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
    	event.drops.add(drop);
    		}
      }	
   }
}