package Eventos.Verano.Herramientas;

import java.util.List;
import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.Bases.Encantamientos;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class Pico_de_silex extends ItemPickaxe{

	public Pico_de_silex(ToolMaterial p_i45347_1_) 
	{
		super(p_i45347_1_);
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
		lore.add(EnumChatFormatting.AQUA + StatCollector.translateToLocal("lore.EventoVerano.name"));
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
