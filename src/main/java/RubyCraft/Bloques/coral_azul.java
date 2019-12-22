package RubyCraft.Bloques;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class coral_azul extends Block {

	public coral_azul(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setStepSound(soundTypeGrass);
	}

	
public static void MatarBloque(World world, Block block, int x, int y, int z) {
		
		block = RubyCraft.coral_azul_muerto;
		
		world.setBlock(x, y, z, block);
		
	}
	
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z,Block block) {
		
		Combrobar_Posicion_Bloque(world, x, y, z, block);
		
		
		
		super.onNeighborBlockChange(world, x, y, z, block);
	}
	
	
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
	    Combrobar_Posicion_Bloque(world, x, y, z, this);

		super.onBlockAdded(world, x, y, z);
	}
	
	
	public static void Combrobar_Posicion_Bloque(World world, int x, int y, int z, Block block) {
		
		if(!(world.getBlock(x+1, y, z).getMaterial().equals(Material.water))) {
			
			
			 if(!(world.getBlock(x, y, z+1).getMaterial().equals(Material.water))) {
				
				
				
			 if(!(world.getBlock(x-1, y, z).getMaterial().equals(Material.water))) {
				
				
				
	           if(!(world.getBlock(x, y, z-1).getMaterial().equals(Material.water))) {
				
				
				
		            if(!(world.getBlock(x, y-1, z).getMaterial().equals(Material.water))) {
				
				
				
			              if(!(world.getBlock(x, y+1, z).getMaterial().equals(Material.water))) {
				
				
				                    MatarBloque(world, block, x, y, z);
				
			               }
			
		                }
	                 }
	           
	           
			    }
			 
			 }
		}
		
	}
	
}
