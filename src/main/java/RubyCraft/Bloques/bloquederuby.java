package RubyCraft.Bloques;

import RubyCraft.Bases.Bloque_con_faro;
import net.minecraft.block.material.Material;

public class bloquederuby extends Bloque_con_faro {

	public bloquederuby(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeMetal);
		
	}
		
}
