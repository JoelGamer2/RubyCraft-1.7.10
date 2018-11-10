package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Esponja extends Block {

	protected Esponja(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeGrass);
	}

}
