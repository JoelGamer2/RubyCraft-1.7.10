package RubyCraft.Bloques;

import RubyCraft.Bases.Bloque_con_faro;
import net.minecraft.block.material.Material;

public class Bloque_de_Platino extends Bloque_con_faro {

	public Bloque_de_Platino(Material material) {
		super(material);
		
		setStepSound(this.soundTypeMetal);
		 
	}

}
