package Eventos.Verano.Herramientas;

import java.util.List;

import Eventos.Verano.Principal.Clase_Principal_Evento_Verano;
import RubyCraft.Bases.Encantamientos;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class Pico_de_acero extends ItemPickaxe{

	public Pico_de_acero(ToolMaterial p_i45347_1_) 
	{
		super(p_i45347_1_);
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
		lore.add(EnumChatFormatting.AQUA + StatCollector.translateToLocal("lore.EventoVerano.name"));
    }
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
	return Clase_Principal_Evento_Verano.Lingote_de_Acero == par2ItemStack.getItem()? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) 
    {
	    Encantamientos.encantar(stack, player, world, this, Enchantment.efficiency, Principal.vial_de_sangre_glaciar);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.silkTouch, Principal.vial_de_sangre_cenagosa);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.unbreaking, Principal.vial_de_sangre_rocosa);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.fortune, Principal.vial_de_sangre_selvatica);
	    return super.onItemRightClick(stack, world, player); 
    }
}
