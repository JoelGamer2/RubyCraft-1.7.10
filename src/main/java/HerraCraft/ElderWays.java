package HerraCraft;

import HerraCraft.ConectarWebs.Ver_Dias_de_salida_Elder_ways;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ElderWays extends Item {

	
	public ElderWays () {
		
		setMaxStackSize(1);
		
	}
	
@Override
public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
	
     
     player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "ElderWays" + EnumChatFormatting.GREEN + " saldra" + EnumChatFormatting.AQUA + " el" + EnumChatFormatting.GRAY + ": " + EnumChatFormatting.RED  + Ver_Dias_de_salida_Elder_ways.Dias_));
	
	return itemstack;
   }
	
}
