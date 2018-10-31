package RubyCraft.Bloques;

import RubyCraft.Bases.Bloque_con_faro;
import net.minecraft.block.material.Material;

public class Bloque_de_Blaze extends Bloque_con_faro {

	private boolean field_150047_a;
	public Bloque_de_Blaze(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeGlass);
	
	}
	        
}
