package RubyCraft.Bases;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class Flores extends Block{

	public Flores(Material material) {
		super(material);
		
		this.setStepSound(this.soundTypeGrass);
	}
	/**Pone la caja de colisiones visual en su sitio**/
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
	
		return AxisAlignedBB.getBoundingBox(x+0.25, y, z+0.25, x+0.7, y+0.85, z+0.7);
	}
	
	/**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }
    
    
    /**Detecta donde se puede colocar el bloque solo se podra colocar en material tipo hierba y tierra**/
    @Override
 public boolean canBlockStay(World world, int x, int y, int z) {
 	
 	   if(world.getBlock(x, y - 1, z).getMaterial() == Material.grass || world.getBlock(x, y - 1, z).getMaterial() == Material.ground) {
 		   return true;
 	   }else {
 	   return false;
 	   }
 }
    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
     {
         return !super.canPlaceBlockAt(world, x, y, z) ? false : this.canBlockStay(world, x, y, z);
     }
    
     @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        if (!this.canBlockStay(world, x, y, z))
        {
            world.func_147480_a(x, y, z, true);
        }
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }   
}
