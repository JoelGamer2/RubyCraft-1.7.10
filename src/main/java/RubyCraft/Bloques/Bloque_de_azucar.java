package RubyCraft.Bloques;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloque_de_azucar extends Block {

	public Bloque_de_azucar(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeCloth);
		
	}

}
