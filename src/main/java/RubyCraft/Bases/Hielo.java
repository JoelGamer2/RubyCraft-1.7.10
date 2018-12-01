package RubyCraft.Bases;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Hielo extends Block {

	protected Hielo(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.slipperiness = 1.1F;
		this.setStepSound(this.soundTypeGlass);
	}
}
