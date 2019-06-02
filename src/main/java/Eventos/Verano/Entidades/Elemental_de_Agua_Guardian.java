package Eventos.Verano.Entidades;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class Elemental_de_Agua_Guardian extends EntityMob {

	public Elemental_de_Agua_Guardian(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 2.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
		    }
	
	 protected String getLivingSound(){
	    
	        return "mob.endermen.iddle";
	        
	    }
	 
	 protected boolean isAIEnabled(){
	    
	        return false;
	    }
	 
	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound(){
	    
	      return "mob.endermen.hidt";
	        
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound(){
	    
	        return "mob.endermen.deatdh";
	        
	    }
	    
	   
}
