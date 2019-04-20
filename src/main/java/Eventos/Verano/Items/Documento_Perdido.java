package Eventos.Verano.Items;

import java.util.List;

import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class Documento_Perdido extends Item{
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
		lore.add(EnumChatFormatting.AQUA + StatCollector.translateToLocal("lore.EventoVerano.name"));
    }

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) 
	{
		player.openGui(RubyCraft.RubyCraft.instance, Clase_Principal_Evento_Verano.guiIdDocumento, world, (int)player.posX, (int)player.posY, (int)player.posZ);
		return super.onItemRightClick(stack, world, player);
	}

}
