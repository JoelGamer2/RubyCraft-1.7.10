package RubyCraft.Bloques;

import RubyCraft.Bases.Bloque_con_faro;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;

public class BloquedeOjodeEnder extends Bloque_con_faro {

	public BloquedeOjodeEnder(Material material) {
		super(material);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int a, float v, float c, float d) {
	
		if (!world.isRemote) {
            ChunkPosition chunkposition = world.findClosestStructure("Stronghold", (int)player.posX, (int)player.posY, (int)player.posZ);
             if (chunkposition != null)
             {
            	 world.setBlock(x, y, z, Blocks.air);
     			player.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.GREEN + " Las coordenadas de la entrada stronghold son:   " + EnumChatFormatting.GOLD + " X:" + chunkposition.chunkPosX + " Yd:" + chunkposition.chunkPosY)));
             }else {
      			player.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "]" + EnumChatFormatting.RED + " No se ha encontrado ninguna stronghold")));

             }
         }
		return true;
	}
	
}
