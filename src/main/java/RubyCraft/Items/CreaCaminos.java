package RubyCraft.Items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class CreaCaminos extends Item {

	
	public CreaCaminos() {
		
		this.setMaxStackSize(1);
		
	}
	
	@Override
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List lore, boolean p_77624_4_) {
	
		lore.add(EnumChatFormatting.RED + "Item solo de Creativo");
		
	}

}
