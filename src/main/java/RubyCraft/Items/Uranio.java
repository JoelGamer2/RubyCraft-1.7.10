package RubyCraft.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class Uranio extends Item {
	
	
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean boo) {
		
		list.add(EnumChatFormatting.RED + "Este objeto quitara medio corazon por tick");
		list.add(EnumChatFormatting.RED + "Para evitarlo ponte la armadura de uranio completa");
		super.addInformation(itemstack, player, list, boo);
	}
	
}
