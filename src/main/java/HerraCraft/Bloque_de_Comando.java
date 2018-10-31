package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Bloque_de_Comando extends Block {

	
	public static int Altura = 300;
	
	protected Bloque_de_Comando(Material material) {
		super(material);
		
	}

	public boolean onBlockActivated(World world, int x ,int y , int z, EntityPlayer player, int q, float a, float b ,float c){
		if(!player.isSneaking()){
			player.setPosition(x, y + Altura, z);
		}
		return true;
	}
}


