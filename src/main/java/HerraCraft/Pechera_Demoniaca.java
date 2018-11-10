package HerraCraft;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Pechera_Demoniaca extends ItemArmor {

	public Pechera_Demoniaca(ArmorMaterial armormaterial, int renderIdex, int armorType) {
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
    
    	 player.addPotionEffect(new PotionEffect(Potion.resistance.id, 200, 1));
    }
     
     @Override
     public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) {
     	// TODO Auto-generated method stub
          lore.add(EnumChatFormatting.RED + "Item Especial del Evento de Halloween");

     }
     
}
