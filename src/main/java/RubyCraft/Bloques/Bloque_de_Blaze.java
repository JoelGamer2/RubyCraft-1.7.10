package RubyCraft.Bloques;

import RubyCraft.Bases.Bloque_con_faro;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class Bloque_de_Blaze extends Bloque_con_faro {

	private boolean field_150047_a;
	public Bloque_de_Blaze(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeGlass);
	
	}
}
