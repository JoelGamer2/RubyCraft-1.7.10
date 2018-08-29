package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Esponja_Mojada extends Block {

	protected Esponja_Mojada(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeGrass);
	}

}
