package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCompressedPowered;
import net.minecraft.block.material.MapColor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BloqueObservador extends BlockCompressedPowered {

	int energia = 0;
	
	   private static final String name = "BloqueObservador" + "";
	   
	    private IIcon[] icons = new IIcon[6];
	
	public BloqueObservador(MapColor color) {
		super(color);
		
	}

	
	 public void updateTick(World world, int x, int y, int z, Random rand){
		    
	    
	    }
	    

	    /**
	     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	     * cleared to be reused)
	     */
	    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	    {
	        float f = 0.0625F;
	        return AxisAlignedBB.getBoundingBox((double)((float)x + f), (double)y, (double)((float)z + f), (double)((float)(x + 1) - f), (double)((float)(y + 1) - f), (double)((float)(z + 1) - f));
	    }
	
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
    	if(!world.isRemote) {
    	energia = 15;
    	} 	
    }
	
    @Override
    public void registerBlockIcons(IIconRegister reg){
    
        for (int i = 0; i < 6; i++) {
        
            icons[i] = reg.registerIcon(RubyCraft.modid + ":" + name + "_" + (i + 1));
         
        }
    }
 
    @Override
    public IIcon getIcon(int side, int meta)
    {
        return icons[side];
    }
    

    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }

    public int isProvidingWeakPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_)
    {
    	
        return energia;
    }
    
}
