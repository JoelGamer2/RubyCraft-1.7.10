package RubyCraft.Bases;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;

public class Palos extends Item {

	
	 @SideOnly(Side.CLIENT)
	    public boolean isFull3D()
	    {
	        return true;
	    }

	    /**
	     * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
	     * hands.
	     */
	    @SideOnly(Side.CLIENT)
	    public boolean shouldRotateAroundWhenRendering()
	    {
	        return true;
	    }
	
}
