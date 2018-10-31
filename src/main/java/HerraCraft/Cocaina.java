package HerraCraft;


	import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

	public class Cocaina extends ItemFood {

		public Cocaina(int heal, float saturation, boolean wolfmeat) {
			super(heal, saturation, wolfmeat);
			
		    }

	     protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
	    	                                                
	    	 //Pocion,Tiempo,Amplificador
	         player.addPotionEffect(new PotionEffect(Potion.invisibility.id,6000, 10));
	         player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,6000, 5));
	         player.addPotionEffect(new PotionEffect(Potion.heal.id,6000, 10));
	     
	  
	        
	         
	     }
}
