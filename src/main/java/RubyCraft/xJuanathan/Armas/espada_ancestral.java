package RubyCraft.xJuanathan.Armas;

import RubyCraft.RubyCraft;
import RubyCraft.Bases.Encantamientos;
import RubyCraft.Encantamientos.Encantamiento_MineCraft_Objetos;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class espada_ancestral extends ItemSword{

	public espada_ancestral(ToolMaterial material) {
		super(material);
	}

	
@Override
public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
	
	Encantamientos.encantar(stack, player, world, this, Enchantment.blastProtection, Principal.vial_de_sangre_glaciar);
	Encantamientos.encantar(stack, player, world, this, Enchantment.sharpness, Principal.vial_de_sangre_selvatica);
	return super.onItemRightClick(stack, world, player);
}
	
	
}
