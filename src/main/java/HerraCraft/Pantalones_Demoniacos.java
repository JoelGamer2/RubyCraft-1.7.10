package HerraCraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Pantalones_Demoniacos extends ItemArmor {

	public Pantalones_Demoniacos(ArmorMaterial armormaterial, int renderIdex, int armorType) {
		super(armormaterial, renderIdex, armorType);
		
	}
     public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if(this.armorType == 2){
			return "rc:textures/models/armor/Demonic_layer_2.png";
		}
		return "rc:textures/models/armor/Demonic_layer_1.png";

}
     
     @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
    	
    	 
    	 player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 0));
    }
}
