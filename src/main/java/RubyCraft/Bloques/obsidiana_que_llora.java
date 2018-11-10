package RubyCraft.Bloques;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class obsidiana_que_llora extends Block {

	public obsidiana_que_llora(Material material) {
		super(material);
		
	}

	 /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
    	
      if(!player.isSneaking()){
	  
  
    }
        return false;
    }
	
}
