package HerraCraft;

import HerraCraft.ConectarWebs.Fechas_Proyectos;
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
	if(world.isRemote && !player.isSneaking()) {
		
     Fechas_Proyectos.VerDias();
     player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "Fecha de Los Nuevos Proyectos de Joel y Alejandro:"));
     player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "ElderWays" + EnumChatFormatting.GREEN + " saldra" + EnumChatFormatting.AQUA + " el" + EnumChatFormatting.GRAY + ": " + EnumChatFormatting.RED  + Fechas_Proyectos.Dias));
     player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "EnderGames Network " + EnumChatFormatting.GREEN + "saldra " + EnumChatFormatting.AQUA + "el" + EnumChatFormatting.GRAY + ": " + EnumChatFormatting.RED + Fechas_Proyectos.Salida_EnderGames));
	}else if(world.isRemote && player.isSneaking()){
	     player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "Esto son los proyectos activos de joel y alejandro para " + EnumChatFormatting.DARK_PURPLE + "verlo pulsa clicl derecho sin shift"));
	}
	return itemstack;
   }
	
}
