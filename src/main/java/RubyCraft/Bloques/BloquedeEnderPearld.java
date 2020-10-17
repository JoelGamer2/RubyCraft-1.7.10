package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.Bases.Bloque_con_faro;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class BloquedeEnderPearld extends Bloque_con_faro{

	public BloquedeEnderPearld(Material material){
		super(material);
	
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int a, float b, float c, float d) {
		
		Random rand = new Random();
		
		int x_Rand = x + rand.nextInt(100);
		int y_Rand = y + rand.nextInt(2);
		int z_Rand = z + rand.nextInt(100);
		
		player.setPosition(x_Rand, y_Rand, z_Rand);
		
		if(!world.isRemote) {
			
			player.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Has sido teleportado aleatoriamente")));
			world.playSoundAtEntity(player, "mob.endermen.portal", Float.MAX_VALUE, 1.0F);
		
		}
		
		return super.onBlockActivated(world, x, y, z, player, a, b, c, d);
	}
	
}
