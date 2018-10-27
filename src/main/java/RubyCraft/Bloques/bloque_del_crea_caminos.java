package RubyCraft.Bloques;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class bloque_del_crea_caminos extends Block {

	public bloque_del_crea_caminos(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setTickRandomly(true);
			
	}

	
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		world.setBlock(x, y, z, Blocks.air);
		world.notifyBlockChange(x, y, z, this);
		

	}
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z,
			Entity p_149670_5_) {
		world.scheduleBlockUpdate(x, y, z, this, 2);
		
	}
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z,
			Entity p_149724_5_) {
		// TODO Auto-generated method stub
		world.scheduleBlockUpdate(x, y, z, this, 2);

	}
	@Override
	public int tickRate(World world) {
		// TODO Auto-generated method stub
		return 2;
	}
	
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z,
			Block p_149695_5_) {
		// TODO Auto-generated method stub
		world.scheduleBlockUpdate(x, y, z, this, 2);
	}
}
