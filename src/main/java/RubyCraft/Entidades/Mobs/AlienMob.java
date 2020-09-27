package RubyCraft.Entidades.Mobs;

import java.util.Iterator;

import RubyCraft.RubyCraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class AlienMob extends EntityMob {

	public AlienMob(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
		    }
	
	 protected String getLivingSound(){
	    
	        return "mob.zombie.metal";
	        
	    }
	 
	 protected boolean isAIEnabled(){
	    
	        return false;
	    }
	 
	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound(){
	    
	      return "mob.enderdragon.hit";
	        
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound(){
	    
	        return "mob.irongolem.death";
	        
	    }
	    
	    protected void dropFewItems(boolean a, int Cantidad)
	    {
	        this.dropItem(RubyCraft.Pepita_de_Ruby, 2);
	        this.dropItem(RubyCraft.Totem_de_la_no_muerte, 1);

	        if (!this.worldObj.isRemote)
	        {
	            Iterator iterator = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(50.0D, 100.0D, 50.0D)).iterator();

	            
	        }
	    }
	    
	    
}
