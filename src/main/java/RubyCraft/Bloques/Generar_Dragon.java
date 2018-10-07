package RubyCraft.Bloques;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Generar_Dragon extends Block {

	public Generar_Dragon(Material material) {
		super(material);
		
	}
	
	public boolean onBlockActivated(World world, int x ,int y , int z, EntityPlayer player, int q, float a, float b ,float c){
		if(!player.isSneaking()){
		  if(world.getBlock(x, y + 1, z) == Blocks.dragon_egg){
			  world.setBlock(x, y + 1, z, Blocks.air);
			    world.setBlock(x, y, z, Blocks.air);
			    player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "El " + EnumChatFormatting.RED + "Dragon " + EnumChatFormatting.GREEN + "Generado con Exito"));
			    	  EntityDragon Dragon = new EntityDragon(world);
	                   Dragon.setPosition(x, y + 10, z);
	                   if(!world.isRemote) {
	                   world.spawnEntityInWorld(Dragon);
	                   }
			    }else if(!world.isRemote){
					   player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.RED + player.getDisplayName() + " Necesitas poner un huevo de Dragon " + EnumChatFormatting.RED + "arriba"));
			    }
		  }
		
		return true;
		
	}

}
