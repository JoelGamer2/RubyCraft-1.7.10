package RubyCraft.Bases;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Encantamientos {

	
	public static void encantar(ItemStack stack, EntityPlayer player, World world, Item espada, Enchantment encantamiento, Item vial) {
		if(player.inventory.hasItem(vial) && !world.isRemote) {
			
			int j = EnchantmentHelper.getEnchantmentLevel(encantamiento.effectId, stack);
			if(j < 10) {
			player.inventory.consumeInventoryItem(espada);
			player.inventory.consumeInventoryItem(vial);
			if(!(j == 0)) {
			stack.stackTagCompound.removeTag("ench");
			}
			stack.addEnchantment(encantamiento, j + 1);
			player.inventory.addItemStackToInventory(stack);
			}
		}
		
	}
	
}
