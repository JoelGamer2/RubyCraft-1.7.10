package HerraCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Vino extends ItemFood {

	public Vino(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);
		
	    }

     protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
    	                                                
    	 //Pocion,Tiempo,Amplificador
         player.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 10));
         
         
         //Los narcoticos me estan tocando la MORAL!!!!!!!!!!!!!!!!!!!!
         player.inventory.addItemStackToInventory(new ItemStack(herracraft.Botella, 1));
     }
	
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return EnumAction.drink;
	}
}

