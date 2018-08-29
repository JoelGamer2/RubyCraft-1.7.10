package RubyCraft.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Manzana_de_diamante extends ItemFood {

	public Manzana_de_diamante(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);
		
	    }

     protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player){
    	 
    	 player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,6000, 10)); //Pocion,Tiempo,Amplificador
    	 player.addPotionEffect(new PotionEffect(Potion.invisibility.id,6000,1));
    	 player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,6000,1));
    	 player.addPotionEffect(new PotionEffect(Potion.nightVision.id,6000,255));
    	 player.addPotionEffect(new PotionEffect(Potion.regeneration.id,6000,255));
    	 player.addPotionEffect(new PotionEffect(5,6000,20)); //Fuerza
    	 player.addPotionEffect(new PotionEffect(3,6000,10)); //Prisa al Picar
    	 player.addPotionEffect(new PotionEffect(22,6000,255)); //Absorcion
    	 player.addPotionEffect(new PotionEffect(21,6000,255)); //Mas Corazones
    	 
     }
	
}
