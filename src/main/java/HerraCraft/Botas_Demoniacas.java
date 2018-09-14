package HerraCraft;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Botas_Demoniacas extends ItemArmor {

	public Botas_Demoniacas(ArmorMaterial armormaterial, int renderIdex, int armorType) {
		super(armormaterial, renderIdex, armorType);
		
	}
     public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if(this.armorType == 2){
			return "rc:textures/models/armor/Demonic_layer_2.png";
		}
		return "rc:textures/models/armor/Demonic_layer_1.png";

}
}
