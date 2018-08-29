package HerraCraft;


	import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

	public class Narcoticos extends ItemFood {

		public Narcoticos(int heal, float saturation, boolean wolfmeat) {
			super(heal, saturation, wolfmeat);
			
		    }

	     protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
	    	                                                
	    	 //Pocion,Tiempo,Amplificador
	         player.addPotionEffect(new PotionEffect(Potion.confusion.id,6000, 10));
	         
	         
	         //Los narcoticos me estan tocando la MORAL!!!!!!!!!!!!!!!!!!!!
	         player.inventory.addItemStackToInventory(new ItemStack(Items.bucket, 1));
	     }
		
		public EnumAction getItemUseAction(ItemStack stack)
		{
			return EnumAction.drink;
		}
}
