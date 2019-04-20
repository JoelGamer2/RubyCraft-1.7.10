package Eventos.Verano.Armas;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class Espada_de_Aguamarina_Transparente extends ItemSword{

	public Espada_de_Aguamarina_Transparente(ToolMaterial material) 
	{
		super(material);
	}

	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
		lore.add(EnumChatFormatting.AQUA + StatCollector.translateToLocal("lore.EventoVerano.name"));
    }
}
