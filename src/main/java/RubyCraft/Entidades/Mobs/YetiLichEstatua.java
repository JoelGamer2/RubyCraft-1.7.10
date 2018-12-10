package RubyCraft.Entidades.Mobs;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class YetiLichEstatua extends EntityMob{

	public YetiLichEstatua(World world) {
		super(world);
		     
	 this.setSize(2.5F, 6.8F);
	 this.stepHeight = 1.0F; 
	 
	}
	protected void applyEntityAttributes(){	
		 super.applyEntityAttributes();
		 this.experienceValue = 0;
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		 
		 }

	    
	    /**Activa la AI personalalizada**/
	    public boolean isAIEnabled(){
		    
	        return true;
	    }
	    
	    /**Aqui ocurre todas las Fases del boss y Pone la boss bar en el Cliente**/
	    public void onLivingUpdate(){	
	    
	    }    
	  
	    	         
	    }    