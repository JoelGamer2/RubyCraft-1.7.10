package RubyCraft.Items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Elytra extends ItemArmor {

	 public Elytra(ArmorMaterial armormaterial, int renderIdex, int armorType) {
		super(armormaterial, renderIdex, armorType);
		this.setMaxStackSize(1);
	}
	 @Override
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
			
			if(this.armorType == 2){
				
			}
			return "rc:textures/models/armor/elytra.png";
			
		}
	 
	/** @Override
		public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
			if(player.getCurrentArmor(2) !=null){
				ItemStack chestplate = player.getCurrentArmor(2);
				
				
				if(chestplate.getItem() == RubyCraft.elytra){
				
					player.capabilities.allowFlying = true;
					
				
				 }
				
			}
	 }**/
}
