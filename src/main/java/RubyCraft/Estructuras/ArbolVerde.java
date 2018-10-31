package RubyCraft.Estructuras;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ArbolVerde extends WorldGenerator
{
	public boolean generate(World world, Random rand, int x, int y, int z) {
		world.setBlock(x + 3, y + 0, z + 3, RubyCraft.troncoverde, 0, 3);
		world.setBlock(x + 3, y + 1, z + 3, RubyCraft.troncoverde, 0, 3);
		world.setBlock(x + 3, y + 2, z + 3, RubyCraft.troncoverde, 0, 3);
		world.setBlock(x + 0, y + 3, z + 0, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 3, z + 0, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 3, z + 0, Blocks.leaves, 12, 3);
		world.setBlock(x + 3, y + 3, z + 0, Blocks.leaves, 12, 3);
		world.setBlock(x + 4, y + 3, z + 0, Blocks.leaves, 12, 3);
		world.setBlock(x + 5, y + 3, z + 0, Blocks.leaves, 12, 3);
		world.setBlock(x + 6, y + 3, z + 0, Blocks.leaves, 4, 3);
		world.setBlock(x + 0, y + 3, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 3, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 3, z + 1, Blocks.leaves, 12, 3);
		world.setBlock(x + 3, y + 3, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 3, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 5, y + 3, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 6, y + 3, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 0, y + 3, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 3, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 3, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 3, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 3, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 5, y + 3, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 6, y + 3, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 0, y + 3, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 3, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 3, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 3, z + 3, RubyCraft.troncoverde, 0, 3);
		world.setBlock(x + 4, y + 3, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 5, y + 3, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 6, y + 3, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 0, y + 3, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 3, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 3, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 3, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 3, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 5, y + 3, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 6, y + 3, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 0, y + 3, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 3, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 3, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 3, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 3, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 5, y + 3, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 6, y + 3, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 0, y + 3, z + 6, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 3, z + 6, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 3, z + 6, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 3, z + 6, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 3, z + 6, Blocks.leaves, 4, 3);
		world.setBlock(x + 5, y + 3, z + 6, Blocks.leaves, 4, 3);
		world.setBlock(x + 6, y + 3, z + 6, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 4, z + 1, Blocks.leaves, 12, 3);
		world.setBlock(x + 2, y + 4, z + 1, Blocks.leaves, 12, 3);
		world.setBlock(x + 3, y + 4, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 4, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 5, y + 4, z + 1, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 4, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 4, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 4, z + 2, Blocks.leaves, 12, 3);
		world.setBlock(x + 4, y + 4, z + 2, Blocks.leaves, 12, 3);
		world.setBlock(x + 5, y + 4, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 4, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 4, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 4, z + 3, RubyCraft.troncoverde, 0, 3);
		world.setBlock(x + 4, y + 4, z + 3, Blocks.leaves, 12, 3);
		world.setBlock(x + 5, y + 4, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 1, y + 4, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 4, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 4, z + 4, Blocks.leaves, 12, 3);
		world.setBlock(x + 4, y + 4, z + 4, Blocks.leaves, 12, 3);
		world.setBlock(x + 5, y + 4, z + 4, Blocks.leaves, 12, 3);
		world.setBlock(x + 1, y + 4, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 4, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 4, z + 5, Blocks.leaves, 12, 3);
		world.setBlock(x + 4, y + 4, z + 5, Blocks.leaves, 12, 3);
		world.setBlock(x + 5, y + 4, z + 5, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 5, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 5, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 5, z + 2, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 5, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 5, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 5, z + 3, Blocks.leaves, 4, 3);
		world.setBlock(x + 2, y + 5, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 5, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 4, y + 5, z + 4, Blocks.leaves, 4, 3);
		world.setBlock(x + 3, y + 6, z + 3, Blocks.leaves, 4, 3);
		return true;

	}

}