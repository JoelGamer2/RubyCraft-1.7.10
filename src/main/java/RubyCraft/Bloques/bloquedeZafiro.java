package RubyCraft.Bloques;

import RubyCraft.Bases.Bloque_con_faro;
import net.minecraft.block.material.Material;


public class bloquedeZafiro extends Bloque_con_faro {
	
	public bloquedeZafiro(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeMetal);
	}
	
}
