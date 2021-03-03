package RubyCraft.Escaleras;

import RubyCraft.Bloques.Bloque_de_Diamante_Trol;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Escalera_de_Bloque_de_diamante_trol extends BlockStairs{

	
	public Escalera_de_Bloque_de_diamante_trol(Block par2Block, int par3) {
		super(par2Block, par3);	
		
		this.setBlockUnbreakable();
        this.setLightOpacity(-999999);
        
		}
	
    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }	
    
    @Override
    public void onEntityWalking(World world, int x, int y, int z,Entity entity) {
  
			entity.attackEntityFrom(Bloque_de_Diamante_Trol.MensajedeMuerte, Float.MAX_VALUE);
	
    	super.onEntityWalking(world, x, y, z, entity);
    }
    
    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
    	
    		entity.attackEntityFrom(Bloque_de_Diamante_Trol.MensajedeMuerte, Float.MAX_VALUE);
    	
    	super.onEntityCollidedWithBlock(world, x, y, z, entity);
    }
    
}