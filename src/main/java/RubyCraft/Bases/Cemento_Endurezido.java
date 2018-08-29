package RubyCraft.Bases;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cemento_Endurezido  extends Block  {

	protected Cemento_Endurezido() {
		super(Material.rock);
		
		setHardness(1.5F).setCreativeTab(RubyCraft.Rubycrafttab);
		
	}

}
