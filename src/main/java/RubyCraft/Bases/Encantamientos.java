package RubyCraft.Bases;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;

public class Encantamientos {

	
	public static void Borrar_Encantamientos(Enchantment enchantment, ItemStack itemStack) {
		NBTTagList enchantmentTagList = itemStack.getEnchantmentTagList();
		if (enchantmentTagList != null) // If the ItemStack has an enchantment tag list
		{ 
			for (int i = 0; i < enchantmentTagList.tagCount(); i++) // Iterate through the list
			{ 
				NBTTagCompound enchantmentTag = enchantmentTagList.getCompoundTagAt(i); // Get the individual enchantment tag
				if (enchantmentTag.getShort("id") == enchantment.effectId)  // If the enchantment tag is the Enchantment to remove,
				{
					enchantmentTagList.removeTag(i); // Remove it
					break;
				}
			}

			if (enchantmentTagList.tagCount() == 0) { // If there are no more enchantments on the ItemStack,
				itemStack.getTagCompound().removeTag("ench"); // Remove the enchantment tag list
			}
		}
	}
	
	public static void encantar(ItemStack stack, EntityPlayer player, World world, Item espada, Enchantment encantamiento, Item vial) {

        if(player.inventory.hasItem(vial)) {

            int j = EnchantmentHelper.getEnchantmentLevel(encantamiento.effectId, stack);
            if(j < 10) 
            {
            	if(!(j == 0)) 
            	{
            		Borrar_Encantamientos(encantamiento, stack);
            	}
            	
            	stack.addEnchantment(encantamiento, j + 1);
            	player.inventory.consumeInventoryItem(vial); 
            }
        }

    }
	
}
