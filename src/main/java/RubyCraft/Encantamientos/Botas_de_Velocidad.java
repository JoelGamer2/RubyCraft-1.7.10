package RubyCraft.Encantamientos;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class Botas_de_Velocidad extends Enchantment {

	public Botas_de_Velocidad(int id, int rarity) {
		super(id, rarity, EnumEnchantmentType.armor_feet);
	this.setName("Botas_de_Velocidad");
	}

	public int getMinEnchantability(int n){
		return 20 + (n -1) * 10;
	}
	
	public int getMaxEnchantability(int n){
		return this.getMinEnchantability(n) + 20;
	}
	
	public int getMaxLevel(){
		return 5;
	}
	
}
