package RubyCraft.Bloques;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Bloque_de_Herobrine extends Block {

	public static int Tocado = 0;
	
	public Bloque_de_Herobrine(Material material) {
		super(material);
	}
	

	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
	if (!player.isSneaking()){
		
		Tocado = Tocado + 1;
		if(Tocado == 5){
			Tocado = 0;
			world.setBlock(x, y, z, RubyCraft.MesadeTrabajodeRuby);
		}
	}
	
	return true;
}
	
}
