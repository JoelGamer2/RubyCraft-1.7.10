package RubyCraft.Items;

import RubyCraft.RubyCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Plastico extends Item {
    
	
	public ItemStack onItemRightClick(ItemStack itemstack,World world,EntityPlayer player){
		
		if(player.inventory.hasItem(RubyCraft.paloverde)){
		
			player.inventory.consumeInventoryItem(RubyCraft.paloverde);
			player.playSound(RubyCraft.modid + ":records.sans", 10.0F, 1.0F);
			              // Cancion           Volumen       alteracion de la música
			Particula(world, player);
	
		}else if(player.inventory.hasItem(RubyCraft.BoladeResina)){
			player.inventory.consumeInventoryItem(RubyCraft.BoladeResina);
			player.playSound(RubyCraft.modid + ":records.sans", 10.0F, 2.0F);
			Particula(world, player);
		}
		return itemstack;	
		
	}
	
	
	private static void Particula(World world, EntityPlayer player){
		
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 2.0F, 1.0F, 6.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 3.0F, 1.0F, 5.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, -1.0F, 1.0F, 4.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, -2.0F, 1.0F, 3.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 4.0F, 1.0F, 2.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 5.0F, 1.0F, 1.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 6.0F, 1.0F, -2.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 7.0F, 1.0F, -1.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 8.0F, 1.0F, 1.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 9.0F, 1.0F, 2.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 10.0F, 1.0F, 3.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 2.0F, -1.0F, 6.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 3.0F, -2.0F, 5.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 1.0F, -3.0F, 4.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 4.0F, -4.0F, 3.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 5.0F, -5.0F, 2.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 6.0F, -6.0F, 1.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 1.0F, -1.0F, 1.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 2.0F, -2.0F, 2.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 3.0F, -3.0F, 3.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 4.0F, -4.0F, 4.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 5.0F, -5.0F, 5.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 6.0F, -6.0F, 6.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 7.0F, -1.0F, 7.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 8.0F, -2.0F, 8.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 9.0F, -3.0F, 9.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 10.0F, -4.0F, 10.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 11.0F, -5.0F, 11.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 11.0F, -1.0F, 13.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 15.0F, -3.0F, 14.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 17.0F, -4.0F, 15.0F);
		world.spawnParticle("flame", player.posX, player.posY, player.posZ, 18.0F, -5.0F, 16.0F);

	
	}
	
}
