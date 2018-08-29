package RubyCraft.Entidades.Mobs;

import java.util.Iterator;

import RubyCraft.RubyCraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Shulker extends EntityMob {

	public Shulker(World world) {
		super(world);
		     
	 this.setSize(0.6F, 0.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
		    }
	 protected void dropFewItems(boolean a, int Cantidad)
	    {
	        this.dropItem(RubyCraft.Caparazon_Shulker, 1);

	        if (!this.worldObj.isRemote)
	        {
	            Iterator iterator = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(50.0D, 100.0D, 50.0D)).iterator();

	            
	        }
	    }

}
