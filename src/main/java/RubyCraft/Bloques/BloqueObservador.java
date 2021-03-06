package RubyCraft.Bloques;

import RubyCraft.Errores;
import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BloqueObservador extends Block {
	   private static final String name = "BloqueObservador" + "";
	   public static int alejado = 2;	   
	    private IIcon[] icons = new IIcon[6];
	
	public BloqueObservador(Material material) {
		super(material);	
	}
	
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z,Block block) {
		super.onNeighborBlockChange(world, x, y, z + 1, block);

		try {
       if(world.getBlock(x, y, z + 1) == Blocks.air) {
	    	  
			
			if(world.getBlock(x, y, z - alejado) == Blocks.air) {
			      world.setBlock(x, y, z - alejado, Blocks.redstone_block);
			       world.setBlock(x, y, z - alejado, Blocks.air);
			}  	   	
      	          }else if(!(world.getBlock(x, y, z + 1) == Blocks.air)) {
        	        	if(world.getBlock(x, y, z - alejado) == Blocks.air) {
         	  			     world.setBlock(x, y, z - alejado, Blocks.redstone_block);
         	  			       world.setBlock(x, y, z - alejado, Blocks.air);
         	  			}  	 
         	 
         	          
         	          
         	          }
		
		}catch (Exception e) {
			Errores.errores(Minecraft.getMinecraft(), this.getClass().toString(),e.toString(), true);


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
    
  
 @Override
public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side) {
	return true;
}
    
 
}
