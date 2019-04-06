package Eventos.Verano.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Libro_Evento_Verano extends Item{

	public static NBTTagCompound paginas;
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) 
	{
		if (stack.hasTagCompound())
	    {
			paginas = stack.getTagCompound();
	    }
	    else
	    {
	    	paginas = new NBTTagCompound();
	    }
		
		
		if (paginas.hasKey("Paginas"))
        {
			paginas.setInteger("Paginas", paginas.getInteger("Paginas") + 1);
        }
        else
        {
        	paginas.setInteger("Paginas", 0);
        }
		
		
        stack.setTagCompound(paginas);
		
		super.onCreated(stack, world, player);
	}


	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
    	 lore.add(EnumChatFormatting.AQUA + "Item especial del evento de verano");
    	 
    	 if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Paginas"))
         {
             lore.add(EnumChatFormatting.GOLD + Integer.toString(stack.getTagCompound().getInteger("Paginas")));
         }
    }

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) 
	{
		player.openGui(RubyCraft.RubyCraft.instance, RubyCraft.RubyCraft.guiIdLibro, world, (int)player.posX, (int)player.posY, (int)player.posZ);
		return super.onItemRightClick(stack, world, player);
	}
}
