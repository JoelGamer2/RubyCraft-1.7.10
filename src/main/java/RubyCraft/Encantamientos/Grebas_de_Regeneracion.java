package RubyCraft.Encantamientos;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class Grebas_de_Regeneracion extends Enchantment {

	public Grebas_de_Regeneracion(int id, int rarity) {
		super(id, rarity, EnumEnchantmentType.armor_legs);
	this.setName("Grebas_de_Regeneracion");
	}

	public int getMinEnchantability(int n){
		return 30 + (n -1) * 10;
	}
	
	public int getMaxEnchantability(int n){
		return this.getMinEnchantability(n) + 20;
	}
	
	public int getMaxLevel(){
		return 3;
	}
	
}
