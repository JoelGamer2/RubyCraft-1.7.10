package Eventos.Verano.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class Tapa_Libro extends Item{
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
    	 lore.add(EnumChatFormatting.AQUA + "Item especial del evento de verano");
    }

}
