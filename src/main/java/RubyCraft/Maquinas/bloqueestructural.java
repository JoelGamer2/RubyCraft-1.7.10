package RubyCraft.Maquinas;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class bloqueestructural extends Block {

	public bloqueestructural() {
		super(Material.iron);
	
	}
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if (world.isRemote && !player.isSneaking()){
			player.openGui(RubyCraft.instance, RubyCraft.guiIDBloqueEStructural, world, x, y, z);
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "El Bloque Estructural Esta en Desarrollo ten Paciencia" + EnumChatFormatting.GREEN + " Por " + EnumChatFormatting.GREEN + "Favor"));
		}
			return true;

	}
}