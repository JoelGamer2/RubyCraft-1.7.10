package RubyCraft.xJuanathan.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class polvo_de_diamante extends Item{
    
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) {
    	// TODO Auto-generated method stub
    	 lore.add(EnumChatFormatting.AQUA + "Item especial del evento de navidad");

    }

}
