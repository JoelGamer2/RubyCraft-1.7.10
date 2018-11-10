package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class bloqueluminiscente extends Block {

	public bloqueluminiscente(Material material) {
		super(material);
		this.setStepSound(this.soundTypeGlass);
		
	}
public Item getItemDropped(int metadata, Random rand, int fortune){
	return RubyCraft.uranio;
}
   @Override
	public int quantityDropped(Random rand){
		return 3 + rand.nextInt(3);
	}
}