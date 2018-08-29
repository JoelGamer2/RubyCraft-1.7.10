package HerraCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Manzana_I extends ItemFood {

	public Manzana_I(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);
		
	    }

     protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
    	                                                
    	 //Pocion,Tiempo,Amplificador
         player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 10000, 3));
         
         
         
     }
	

	}


