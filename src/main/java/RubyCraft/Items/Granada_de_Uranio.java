package RubyCraft.Items;


import RubyCraft.Entidades.Granadas.EntidadGranda_de_Uranio;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Granada_de_Uranio extends Item {

	public ItemStack onItemRightClick(ItemStack itemstack,World world,EntityPlayer player){
		if(!player.capabilities.isCreativeMode){
			--itemstack.stackSize;
		}
		
		world.playSoundAtEntity(player, "random.fizz", 0.7F, 0.8F);
		
		if(!world.isRemote){
			
			world.spawnEntityInWorld(new EntidadGranda_de_Uranio(world, player));
		}
		return itemstack;
	}
}
