package RubyCraft.Items;

import java.util.List;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants.NBT;

public class Espada_de_Platino extends ItemSword {


	private static int Nivel = 0;			

	public Espada_de_Platino(ToolMaterial material) {
		
		
		
	super(material);
	
	}
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
	public ItemStack onItemRightClick(ItemStack stack,World world, EntityPlayer player){
		if(!world.isRemote && player.isSneaking()){
			if(player.inventory.hasItem(RubyCraft.Platino)){
				NBTTagCompound nbt;
				
				 if (stack.hasTagCompound())
			        {
			            nbt = stack.getTagCompound();
			        }
			        else
			        {
			            nbt = new NBTTagCompound();
			            nbt.setInteger("NivelPlatino", 0);

			        }
			        
			        
			        stack.setTagCompound(nbt);
			        
				if((nbt.getInteger("NivelPlatino") < 4)) {
		
					
					 nbt.setInteger("NivelPlatino", nbt.getInteger("NivelPlatino")+1);
					 player.inventory.consumeInventoryItem(RubyCraft.Platino);
				}
				/**
				 * Este Switch lo que hace es testear porque numero va osea case: 1 = if(NivelNumerosEnteros==1){ } eso es lo que hace
				 * este switch
				 **/
				switch (nbt.getInteger("NivelPlatino")) {
				case 1:
					System.out.println(Nivel);
				  //  player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
				   // stack = new ItemStack(RubyCraft.Espada_de_Platino);
					stack.addEnchantment(Enchantment.sharpness, 3);
					//player.inventory.addItemStackToInventory(stack);
					
					break;
				case 2:
				  //  player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
					//stack = new ItemStack(RubyCraft.Espada_de_Platino);
					stack.addEnchantment(Enchantment.looting, 2);
				//	player.inventory.addItemStackToInventory(stack);
					
                    break;
				case 3:
					//player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
					//stack = new ItemStack(RubyCraft.Espada_de_Platino);
					stack.addEnchantment(Enchantment.fireAspect, 2);
				//	player.inventory.addItemStackToInventory(stack);
					
                    break;
				case 4:
					 if(player.inventory.hasItem(RubyCraft.varita) && player.inventory.hasItem(RubyCraft.amuleto)){
					//player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
					player.inventory.consumeInventoryItem(RubyCraft.varita);
					player.inventory.consumeInventoryItem(RubyCraft.amuleto);
					//stack = new ItemStack(RubyCraft.Espada_de_Platino);
					stack.addEnchantment(Enchantment.knockback, 2);
				//    player.inventory.addItemStackToInventory(stack);
					player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.GOLD + " No Hay Mas Niveles. Este es el Nivel:" + nbt.getInteger("NivelPlatino") + EnumChatFormatting.GOLD + " Para volver " + EnumChatFormatting.GOLD + "al 0 necesitas 1 de Ruby y 1 Plastico"));
				  
				   }else{
					 //  player.inventory.addItemStackToInventory(new ItemStack(RubyCraft.Platino));
					   player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED + player.getDisplayName() + " Para subir a Nivel 4 Necesitas 1 " + EnumChatFormatting.RED + "Amuleto y 1 Varita"));
					   nbt.setInteger("NivelPlatino", nbt.getInteger("NivelPlatino")-1);
				   }
				//break;
				//case 5:
					//player.inventory.addItemStackToInventory(new ItemStack(RubyCraft.Platino));
					//player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.GOLD + " No Hay Mas Niveles. Este es el Nivel:" + nbt.getInteger("NivelPlatino") + EnumChatFormatting.GOLD + " Para volver " + EnumChatFormatting.GOLD + "al 0 necesitas 1 de Ruby y 1 Plastico"));
			
				}
			}
			 if(stack.hasTagCompound() && stack.getTagCompound().getInteger("NivelPlatino") == 5 && player.inventory.hasItem(RubyCraft.ruby) && player.inventory.hasItem(RubyCraft.Plastico)){
				
				player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
				player.inventory.consumeInventoryItem(RubyCraft.ruby);
				player.inventory.consumeInventoryItem(RubyCraft.Plastico);
				stack = new ItemStack(RubyCraft.Espada_de_Platino);
			    player.inventory.addItemStackToInventory(stack);
				
				stack.getTagCompound().setInteger("NivelPlatino", stack.getTagCompound().getInteger("NivelPlatino")+1);
				player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.GOLD + " El Item se a reseteado con el Nivel:" + stack.getTagCompound().getInteger("NivelPlatino")));
			 }
		}
		return stack;
		}	
	
	
	/**
	 * Añade un Lore al Objetos segun el nivel en este no uso el switch si no if
	 */
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par){
		if(stack.hasTagCompound() && stack.getTagCompound().hasKey("NivelPlatino")) {
		lore.add(EnumChatFormatting.BLUE + "Las verdes son cosas que se ponen y las rojas que se eliminan");
	lore.add(EnumChatFormatting.GOLD + "Nivel de la Espada:" + EnumChatFormatting.RED + " " + stack.getTagCompound().getInteger("NivelPlatino"));
	if(stack.getTagCompound().getInteger("NivelPlatino") == 1){
		lore.add(EnumChatFormatting.GREEN + "Esta espada hace mas ataque Tiene Afilado 3");
         	}else if(stack.getTagCompound().getInteger("NivelPlatino") == 2){
         		lore.add(EnumChatFormatting.RED + "Esta espada no hace mas ataque porque no Tiene Afilado 3");
         		lore.add(EnumChatFormatting.GREEN + "Ahora esta Espada tiene Saqueo a nivel 2");
         	}else if(stack.getTagCompound().getInteger("NivelPlatino") == 3){
         		lore.add(EnumChatFormatting.RED + "Esta Espada no tiene Saqueo");
         		lore.add(EnumChatFormatting.GREEN + "Ahora esta Espada tiene Aspecto Igneo 2");
         	}else if(stack.getTagCompound().getInteger("NivelPlatino") == 4){
         		lore.add(EnumChatFormatting.RED + "Esta Espada no tiene Aspecto Igneo 2");
         		lore.add(EnumChatFormatting.GREEN + "Ahora esta Espada Tiene Retroceso 2");
         	}
		}
	}
	
}
