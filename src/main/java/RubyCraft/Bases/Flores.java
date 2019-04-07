package RubyCraft.Bases;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class Flores extends Block{

	public Flores(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeGrass); //Pone el sonido a la flor 
	}
	/**Pone la caja de colisiones visual en su sitio, este es solo en lo visual**/
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
	
		return AxisAlignedBB.getBoundingBox(x+0.25, y, z+0.25, x+0.7, y+0.85, z+0.7);
	}
	
	/**
     *Define la caja de colisiones con la que el jugador colisionara
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }
    
    
    /**Detecta donde puede estar la flor puesta**/
    @Override
 public boolean canBlockStay(World world, int x, int y, int z) {
 	
 	   if(world.getBlock(x, y - 1, z).getMaterial() == Material.grass || world.getBlock(x, y - 1, z).getMaterial() == Material.ground) {
 		   return true;
 	   }else {
 	   return false;
 	   }
 }
    /**Define donde podra poner el jugador la flor**/
    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
     {
         return !super.canPlaceBlockAt(world, x, y, z) ? false : this.canBlockStay(world, x, y, z);
     }
    /**Detecta cuando el bloque vecino se actualiza para actualizar esta flor**/
     @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        if (!this.canBlockStay(world, x, y, z))
        {
            world.func_147480_a(x, y, z, true);
        }
    }
    /**Define la flor como un bloque no opaco**/
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * Define que el bloque no se renderiza de la manera normal que lo hacen los demas
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Determina el tipo de render que usara la flor
     */
    public int getRenderType()
    {
        return 1;
    }   
}
