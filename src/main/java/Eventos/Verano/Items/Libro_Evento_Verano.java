package Eventos.Verano.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Libro_Evento_Verano extends Item{

	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
    	 lore.add(EnumChatFormatting.AQUA + "Item especial del evento de verano");
    }

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

		player.openGui(RubyCraft.RubyCraft.instance, RubyCraft.RubyCraft.guiIdLibro, world, (int)player.posX, (int)player.posY, (int)player.posZ);
		return super.onItemRightClick(stack, world, player);
	}
	
}
