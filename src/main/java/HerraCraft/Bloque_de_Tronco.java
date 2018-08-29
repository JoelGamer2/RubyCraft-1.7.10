package HerraCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloque_de_Tronco extends Block{

	protected Bloque_de_Tronco(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeWood);
	}

}
