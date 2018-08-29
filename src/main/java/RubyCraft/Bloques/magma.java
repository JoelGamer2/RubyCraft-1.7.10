package RubyCraft.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class magma extends Block {

	public magma(Material material) {
		super(material);
		
		this.setTickRandomly(true);
		this.setLightOpacity(-999999);
		
	}
	 
	 public boolean isOpaqueCube(){
			return false;
		}
		public boolean isRenderAsNormal(){
			return false;
		}
	
	    public void updateTick(World world, int x, int y, int z, Random rand){
	    	super.updateTick(world, x, y, z, rand);
	    	
	    	if (world.getBlock(x, y + 1, z).getMaterial() == Material.water)
	        {
	            world.setBlockToAir(x, y + 1, z);

	           
	        }
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
	    /**
	     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	     */
	    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	    {
	    	
	        entity.attackEntityFrom(RubyCraft.Magma, 1.0F);
	    }
	    
	    
	  
	    
	    /**
	     * How many world ticks before ticking
	     */
	    public int tickRate(World p_149738_1_)
	    {
	        return 10;
	    }
	    /**
	     * A randomly called display update to be able to add particles or other items for display
	     */
	    @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World world, int x, int y, int z, Random rand)
	    {
	        
	        
	            this.particulas(world, x, y, z);
	        
	    }
	    
	    /**
	     * A randomly called display update to be able to add particles or other items for display
	     */
	    private void particulas(World world, int x, int y, int z)
	    {
	        Random random = world.rand;
	        double d0 = 0.0625D;

	       for (int l = 0; l < 6; ++l)
	        {
	            double d1 = (double)((float)x + random.nextFloat());
	            double d2 = (double)((float)y + random.nextFloat());
	            double d3 = (double)((float)z + random.nextFloat());

	            if (l == 0 && !world.getBlock(x, y + 1, z).isOpaqueCube())
	            {
	                d2 = (double)(y + 1) + d0;
	            }

	            if (l == 1 && !world.getBlock(x, y - 1, z).isOpaqueCube())
	            {
	                d2 = (double)(y + 0) - d0;
	            }

	            if (l == 2 && !world.getBlock(x, y, z + 1).isOpaqueCube())
	            {
	                d3 = (double)(z + 1) + d0;
	            }

	            if (l == 3 && !world.getBlock(x, y, z - 1).isOpaqueCube())
	            {
	                d3 = (double)(z + 0) - d0;
	            }

	            if (l == 4 && !world.getBlock(x + 1, y, z).isOpaqueCube())
	            {
	                d1 = (double)(x + 1) + d0;
	            }

	            if (l == 5 && !world.getBlock(x - 1, y, z).isOpaqueCube())
	            {
	                d1 = (double)(x + 0) - d0;
	            }

	            if (d1 < (double)x || d1 > (double)(x + 1) || d2 < 0.0D || d2 > (double)(y + 1) || d3 < (double)z || d3 > (double)(z + 1))
	            {
	            	world.spawnParticle("bubble", d1, y +1, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +2, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +3, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +4, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +5, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +6, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +7, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +8, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +9, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +11, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +12, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +13, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +14, d3, 0.0D, 0.0D, 0.0D);
	            	
	            	
	            	world.spawnParticle("bubble", d1, y +15, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +16, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +17, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +18, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +19, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +20, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +21, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +22, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +23, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +24, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +25, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +26, d3, 0.0D, 0.0D, 0.0D);
	            	world.spawnParticle("bubble", d1, y +27, d3, 0.0D, 0.0D, 0.0D);
	    
	            	
	             }
	        }
	    }
	}