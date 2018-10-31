package RubyCraft.Items;


import RubyCraft.Entidades.Granadas.EntidadGranada_de_Ruby;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Granada_de_Ruby extends Item {

	public ItemStack onItemRightClick(ItemStack itemstack,World world,EntityPlayer player){
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		
		world.playSoundAtEntity(player, "random.fizz", 0.7F, 0.8F);
		
		if(!world.isRemote){
			
			world.spawnEntityInWorld(new EntidadGranada_de_Ruby(world, player));
		}
		return itemstack;
	}
}
