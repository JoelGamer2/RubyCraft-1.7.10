package HerraCraft.Entidades_Principal;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class Miguelperez extends EntityMob {

	

	public Miguelperez(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(15.0D);
		    }
	
	 protected String getLivingSound(){
	    
	        return "mob.Zombi.idle";
	        
	    }
	 
	 protected boolean isAIEnabled(){
	    
	        return false;
	    }
	 
	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound(){
	    
	      return "mob.Zombi.hit";
	        
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound(){
	    
	        return "mob.Zombi.death";
	        
	    }

}
