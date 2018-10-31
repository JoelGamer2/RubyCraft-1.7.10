package HerraCraft;


import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;



public class Casco_de_ciborg extends ItemArmor {

	public Casco_de_ciborg(ArmorMaterial armormaterial, int renderIdex, int armorType) {
		super(armormaterial, renderIdex, armorType);
		
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if(this.armorType == 2){
			return "hr:textures/models/armor/Robot_layer_2.png";
		}
		return "hr:textures/models/armor/Robot_layer_1.png";
		
		
	}
}
