package RubyCraft.Bloques;

import RubyCraft.Estructuras.Arbol;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Bloque_de_verruga extends Block {

	public Bloque_de_verruga(Material material) {
		super(material);
		
		
		this.setStepSound(this.soundTypeWood);
		
	}


	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		
		Arbol arbol = new Arbol();
		
		arbol.generate_r0(world, x, y, z);
		
		return true;
	}
}



