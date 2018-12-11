package RubyCraft.xJuanathan.Armaduras;

import java.util.List;

import RubyCraft.Bases.Encantamientos;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class casco_ancestral extends ItemArmor{

	public casco_ancestral(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		// TODO Auto-generated constructor stub
	}

	
    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) 
    {
    	NBTTagCompound nbt;
        if (stack.hasTagCompound())
        {
            nbt = stack.getTagCompound();
        }
        else
        {
            nbt = new NBTTagCompound();
        }

        
        if (nbt.hasKey("Nivel") && player.inventory.hasItem(Principal.sangre_ancestral) && nbt.getInteger("Nivel")<10)
        {
            nbt.setInteger("Nivel", nbt.getInteger("Nivel") + 1);
            Principal.armaduraancestral.values();
            player.inventory.consumeInventoryItem(Principal.sangre_ancestral); 
        }
        else
        {
            nbt.setInteger("Nivel", nbt.getInteger("Nivel"));
        }
        
        stack.setTagCompound(nbt);
        
    	Encantamientos.encantar(stack, player, world, this, Enchantment.protection, Principal.vial_de_sangre_glaciar);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.thorns, Principal.vial_de_sangre_cenagosa);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.unbreaking, Principal.vial_de_sangre_rocosa);
    	Encantamientos.encantar(stack, player, world, this, Enchantment.respiration, Principal.vial_de_sangre_selvatica);
    	
	    return super.onItemRightClick(stack, world, player);
    }
    
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if(this.armorType == 2){
			return "rc:textures/models/armor/ancestral_layer_2.png";
		}
		return "rc:textures/models/armor/ancestral_layer_1.png";
		
	}
    
    
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) {
    	// TODO Auto-generated method stub
    	 lore.add(EnumChatFormatting.AQUA + "Item especial del evento de navidad");

         if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Nivel"))
         {
             lore.add(EnumChatFormatting.BLUE + "Nivel de armadura: " + Integer.toString(stack.getTagCompound().getInteger("Nivel")));
         }
         
         else
         {
        	 lore.add(EnumChatFormatting.BLUE + "Nivel de armadura: 0");
         }
    }
    
    @Override
    public ArmorMaterial getArmorMaterial() {
    	// TODO Auto-generated method stub
    	return Principal.armaduraancestral;
    }

}
