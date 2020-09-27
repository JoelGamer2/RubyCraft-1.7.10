package RubyCraft.Items;

import java.util.List;

import RubyCraft.RubyCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Libro_de_recetas extends Item{

	public static NBTTagCompound paginas;
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) 
	{
		NBTTagCompound nbt = paginas;
		
		 if (stack.hasTagCompound())
	        {
	            nbt = stack.getTagCompound();
	        }
	        else
	        {
	            nbt = new NBTTagCompound();
	            nbt.setInteger("Paginas", 0);
	          

	        } 
		 stack.setTagCompound(nbt);	
		if(world.isRemote) {
		player.openGui(RubyCraft.instance, RubyCraft.guiId_Libro_de_recetas, world, (int)player.posX, (int)player.posY, (int)player.posZ);
		}
		return super.onItemRightClick(stack, world, player);
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
    	 
    	 if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Paginas"))
         {
             lore.add(EnumChatFormatting.GOLD + "Pagina: "+ EnumChatFormatting.RED +  Integer.toString(stack.getTagCompound().getInteger("Paginas")));
         }else if(!stack.hasTagCompound()) {
             lore.add(EnumChatFormatting.GOLD + "Pagina: "+ EnumChatFormatting.RED + "0");

        	 
         }
    }
}
