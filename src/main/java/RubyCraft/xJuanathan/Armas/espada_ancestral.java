package RubyCraft.xJuanathan.Armas;

import java.util.List;

import RubyCraft.Bases.Encantamientos;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.AnvilUpdateEvent;

public class espada_ancestral extends ItemSword{

	public espada_ancestral(ToolMaterial material) {
		super(material);
	}

	
    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) 
    {
    	Encantamientos.encantar(stack, player, world, this, Enchantment.knockback, Principal.vial_de_sangre_glaciar);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.unbreaking, Principal.vial_de_sangre_cenagosa);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.looting, Principal.vial_de_sangre_rocosa);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.sharpness, Principal.vial_de_sangre_selvatica);
	    return super.onItemRightClick(stack, world, player);
    }
    
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) {
    	// TODO Auto-generated method stub
    	 lore.add(EnumChatFormatting.AQUA + "Item especial del evento de navidad");

    }
} 
