package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloque_de_tronco2 extends Block {

	protected Bloque_de_tronco2(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeWood);
	}

}
