package HerraCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Pildoras_analgesicas extends ItemFood {

	public Pildoras_analgesicas(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);
		
	    }

     protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
    	                                                
    	 //Pocion,Tiempo,Amplificador
         player.addPotionEffect(new PotionEffect(Potion.resistance.id,5000, 5));
         player.addPotionEffect(new PotionEffect(Potion.regeneration.id,5000, 5));
         player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,5000, 5));
     
     }
     
     
}   