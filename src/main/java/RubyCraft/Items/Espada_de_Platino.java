package RubyCraft.Items;

import java.util.List;

import RubyCraft.RubyCraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

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
				if(!(Nivel == 5)) {
				Nivel ++;
				}
				player.inventory.consumeInventoryItem(RubyCraft.Platino);
				/**
				 * Este Switch lo que hace es testear porque numero va osea case: 1 = if(NivelNumerosEnteros==1){ } eso es lo que hace
				 * este switch
				 **/
				switch (Nivel) {
				case 1:
					System.out.println(Nivel);
				    player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
				    stack = new ItemStack(RubyCraft.Espada_de_Platino);
					stack.addEnchantment(Enchantment.sharpness, 3);
					player.inventory.addItemStackToInventory(stack);
					
					break;
				case 2:
				    player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
					stack = new ItemStack(RubyCraft.Espada_de_Platino);
					stack.addEnchantment(Enchantment.looting, 2);
					player.inventory.addItemStackToInventory(stack);
					
                    break;
				case 3:
					player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
					stack = new ItemStack(RubyCraft.Espada_de_Platino);
					stack.addEnchantment(Enchantment.fireAspect, 2);
					player.inventory.addItemStackToInventory(stack);
					
                    break;
				case 4:
					 if(player.inventory.hasItem(RubyCraft.Barita) && player.inventory.hasItem(RubyCraft.amuleto)){
					player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
					player.inventory.consumeInventoryItem(RubyCraft.Barita);
					player.inventory.consumeInventoryItem(RubyCraft.amuleto);
					stack = new ItemStack(RubyCraft.Espada_de_Platino);
					stack.addEnchantment(Enchantment.knockback, 2);
				    player.inventory.addItemStackToInventory(stack);
				  
				   }else{
					   player.inventory.addItemStackToInventory(new ItemStack(RubyCraft.Platino));
					   player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.RED + player.getDisplayName() + " Para subir a Nivel 4 Necesitas 1 " + EnumChatFormatting.RED + "Amuleto y 1 Varita"));
					  Nivel--;;
				   }
				break;
				case 5:
					player.inventory.addItemStackToInventory(new ItemStack(RubyCraft.Platino));
					player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.GOLD + " No Hay Mas Niveles este es el Nivel:" + Nivel + EnumChatFormatting.GOLD + " Para volver " + EnumChatFormatting.GOLD + "al 0 necesitas 1 de Ruby y 1 Plastico"));
			
				}
			}
			 if(Nivel == 5 && player.inventory.hasItem(RubyCraft.ruby) && player.inventory.hasItem(RubyCraft.Plastico)){
				
				player.inventory.consumeInventoryItem(RubyCraft.Espada_de_Platino);
				player.inventory.consumeInventoryItem(RubyCraft.ruby);
				player.inventory.consumeInventoryItem(RubyCraft.Plastico);
				stack = new ItemStack(RubyCraft.Espada_de_Platino);
			    player.inventory.addItemStackToInventory(stack);
				
				Nivel = 0;
				player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.GOLD + " El Item se a reseteado con el Nivel:" + Nivel));
			}		
		}
		return stack;
		}	
	/**
	 * Añade un Lore al Objetos segun el nivel en este no uso el switch si no if
	 */
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par){
		lore.add(EnumChatFormatting.BLUE + "Las verdes son cosas que se ponen y las rojas que se eliminan");
	lore.add(EnumChatFormatting.GOLD + "Nivel de la Espada:" + EnumChatFormatting.RED + " " + Nivel);
	if(Nivel == 1){
		lore.add(EnumChatFormatting.GREEN + "Esta espada hace mas ataque Tiene Afilado 3");
         	}else if(Nivel == 2){
         		lore.add(EnumChatFormatting.RED + "Esta espada no hace mas ataque porque no Tiene Afilado 3");
         		lore.add(EnumChatFormatting.GREEN + "Ahora esta Espada tiene Saqueo a nivel 2");
         	}else if(Nivel == 3){
         		lore.add(EnumChatFormatting.RED + "Esta Espada no tiene Saqueo");
         		lore.add(EnumChatFormatting.GREEN + "Ahora esta Espada tiene Aspecto Igneo 2");
         	}else if(Nivel == 4){
         		lore.add(EnumChatFormatting.RED + "Esta Espada no tiene Aspecto Igneo 2");
         		lore.add(EnumChatFormatting.GREEN + "Ahora esta Espada Tiene Retroceso 2");
         	}
	}
	
}
