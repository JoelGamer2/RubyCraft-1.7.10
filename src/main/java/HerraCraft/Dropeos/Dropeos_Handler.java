package HerraCraft.Dropeos;

import java.util.Random;

import com.sun.xml.internal.stream.Entity;

import HerraCraft.herracraft;
import HerraCraft.Entidades_Principal.Invisiteibol;
import HerraCraft.Entidades_Principal.JoelGamer2;
import HerraCraft.Entidades_Principal.DoctorNok;
import HerraCraft.Entidades_Principal.Tank;
import HerraCraft.Entidades_Principal.Wither_Storm;
import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class Dropeos_Handler {

	public Random rand;
	
	@SubscribeEvent
    public void DropeoDragon(LivingDropsEvent event){
    
        if (event.entity instanceof Tank) {
 
            ItemStack stack = new ItemStack(herracraft.Plata2, 2);
            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
            
            event.drops.add(drop);
        }
		    
	       /** if (event.entity instanceof Slenderman) {
	 
	            ItemStack stack = new ItemStack(Items.ender_eye, 2);
	            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	            
	              
	            event.drops.add(drop);
	        }    **/
	            
	        if (event.entity instanceof Tank) {
	 
	            ItemStack stack = new ItemStack(Items.ender_eye, 2);
	            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	            
	         
	            event.drops.add(drop);
	                
	            
		      
			            
		        } if (event.entity instanceof Invisiteibol) {
			           	 
				            ItemStack stack = new ItemStack(herracraft.Cristal_invisible  ,9 );
				            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
				            
		        			event.drops.add(drop);
	}             if (event.entity instanceof Invisiteibol) {
      	 
                            ItemStack stack = new ItemStack(Items.rotten_flesh, 2);
                            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
           
                            event.drops.add(drop);
	
	                      }
	                              
                                   
	              if (event.entity instanceof JoelGamer2) {
     	 
           ItemStack stack = new ItemStack(herracraft.Espada_de_Redstoner, 1);
           EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
           
           }
	              if (event.entity instanceof Wither_Storm) {
	           	   
	           	   ItemStack stack = new ItemStack(Items.nether_star, 1);
	           	   EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
                   
	           	   event.drops.add(drop);
	               
	              }	            
   
	              if (event.entity instanceof DoctorNok) {
	                  
	            	  ItemStack stack = new ItemStack(RubyCraft.fragmento_de_prismarina, 6);
	            	  EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	            	  
	            	event.drops.add(drop);       	
	            	
	              }
	              
	              if (event.entity instanceof DoctorNok) {
	               	 
                      ItemStack stack = new ItemStack(RubyCraft.cristal_de_prismarina, 2);
                      EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
     
                      event.drops.add(drop);

                    }
	              if (event.entity instanceof EntitySheep) {
	            	  
	            	  ItemStack stack = new ItemStack(herracraft.Carne_de_Oveja, 3);
	            	  EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	            	  
	            	  event.drops.add(drop);
	              }
	              if (event.entity instanceof EntitySheep) {
	            	  
	            	  ItemStack stack = new ItemStack(herracraft.Sangre_de_animal, 1);
	            	  EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	              
	            	  event.drops.add(drop);
	              }
	              //Desactivado por Joel es una mierda Alejandro
	            /**  if (event.entity instanceof EntityPlayer) {
	            	  
	            	  ItemStack stack = new ItemStack(herracraft.Alma_Roja, 1);
	            	  EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	            	  
	            	  event.drops.add(drop);
	              
	              
	              
	            	  
	}**/
	              if (event.entity instanceof JoelGamer2) {
	            	  
	            	  ItemStack stack = new ItemStack(Items.redstone, 4);
	            	  EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	              
	              event.drops.add(drop);
	              }
	              if (event.entity instanceof EntityZombie) {
	            	  
	            	  ItemStack stack = new ItemStack(herracraft.Sangre_de_monstruo, 1);
	            	  EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
	              
	              event.drops.add(drop);
	              
	              
	}
	
	              
                   if (event.entity instanceof JoelGamer2) {
 	            	  
 	            	  ItemStack stack = new ItemStack(herracraft.Altar_de_JoelGamer2, 1);
 	            	  EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
 	              
 	              event.drops.add(drop);
	}

	  if (event.entity instanceof EntitySkeleton) {
   
		  //int dropaleatorio = 0;
		  //dropaleatorio =  1 + rand.nextInt(2);
		  
		  //if(!(dropaleatorio == 1)) {
     	  ItemStack stack = new ItemStack(herracraft.Hueso_de_Wither, 1);
     	   EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
       
       event.drops.add(drop);
		  //}
}

	

	  if (event.entity instanceof Wither_Storm) {
   	  
   	  ItemStack stack = new ItemStack(herracraft.Hueso_de_Wither, 2);
   	  EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
     
     event.drops.add(drop);
     
     
     
}
}
}
	







