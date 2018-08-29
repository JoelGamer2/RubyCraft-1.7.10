package RubyCraft.Armaduras;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CascodeZafiro extends ItemArmor {
	
	public CascodeZafiro(ArmorMaterial armormaterial, int renderIdex, int armorType) {
		super(armormaterial, renderIdex, armorType);
		
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if(this.armorType == 2){
			return "rc:textures/models/armor/Zafiro_layer_2.png";
		}
		return "rc:textures/models/armor/Zafiro_layer_1.png";
		
	   }	
	}
