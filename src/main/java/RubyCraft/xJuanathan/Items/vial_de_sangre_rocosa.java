package RubyCraft.xJuanathan.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class vial_de_sangre_rocosa extends Item{

	public vial_de_sangre_rocosa() {
		this.setMaxStackSize(16);
		
	}
	
	  public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player)
	    {
	        if (!player.capabilities.isCreativeMode)
	        {
	            --stack.stackSize;
	        }

	        if (!world.isRemote)
	        {
	        	player.addPotionEffect(new PotionEffect(5, ( (600 - 200) * 30) / 1 , 1));
	        }
                 if(!(stack.stackSize == 0)) {
                     return stack.stackSize <= 0 ? new ItemStack(this) : stack;
                       }else if(!player.capabilities.isCreativeMode){
                	      return null;
                 }else {
                     return stack.stackSize <= 0 ? new ItemStack(this) : stack;
                 }
           
	    }

	    /**
	     * How long it takes to use or consume an item
	     */
	    public int getMaxItemUseDuration(ItemStack stack)
	    {
	        return 32;
	    }

	    /**
	     * returns the action that specifies what animation to play when the items is being used
	     */
	    public EnumAction getItemUseAction(ItemStack stack)
	    {
	        return EnumAction.drink;
	    }

	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	    {
	        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
	        return stack;
	    }
	
}
