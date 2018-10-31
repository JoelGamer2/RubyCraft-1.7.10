package HerraCraft.Registrar;

import HerraCraft.herracraft;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class Gravedad extends BlockFalling{

	public Gravedad(Material material){
		super(material);
		this.setCreativeTab(herracraft.Herra);
		
	}

}