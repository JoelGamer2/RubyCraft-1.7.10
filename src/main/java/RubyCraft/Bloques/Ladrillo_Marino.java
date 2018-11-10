package RubyCraft.Bloques;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Ladrillo_Marino extends Block {

	public Ladrillo_Marino(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeStone);
		
	}

}
