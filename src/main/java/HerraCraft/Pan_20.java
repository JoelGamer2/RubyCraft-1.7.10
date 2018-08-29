package HerraCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Pan_20 extends ItemFood {

	public Pan_20(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);
		
	    }

     protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
    	                                                
    	 //Pocion,Tiempo,Amplificador
         player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 2000, 10));
     }
	
	{
		
	}
}