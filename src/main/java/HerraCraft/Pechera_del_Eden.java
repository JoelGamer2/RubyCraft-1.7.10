package HerraCraft;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;



public class Pechera_del_Eden extends ItemArmor {

	public Pechera_del_Eden(ArmorMaterial armormaterial, int renderIdex, int armorType) {
		super(armormaterial, renderIdex, armorType);
		
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if(this.armorType == 2){
			return "rc:textures/models/armor/Eden_layer_2.png";
		}
		return "rc:textures/models/armor/Eden_layer_1.png";
		
		
	}
}
