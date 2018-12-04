package RubyCraft.Entidades.Mobs;

import RubyCraft.RubyCraft;
import RubyCraft.Bases.BaseMobs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class YetiLich extends BaseMobs implements IBossDisplayData {

	
	
	public YetiLich(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		 super.applyEntityAttributes();
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
		 this.isEntityInvulnerable();
	
		 }
	
	/**Comunica cuando el mob muere**/
	@Override
	public void onDeath(DamageSource damage) {
	
		
		dropeos();
	}
	
	private static void dropeos() {
		
	}
	
	/**Returns the sounds of ambient for the mob**/
	 protected String getLivingSound(){
		    
	        return RubyCraft.modid + ":ambientebossparca";
	        
	    }
	 
	 
	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound(){
	    
	      return RubyCraft.modid + ":golpebossparca";
	        
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound(){
	    
	        return RubyCraft.modid + ":muertebossparca";
	        
	    }	 
	    
	    /**Activa la AI personalalizada**/
	    public boolean isAIEnabled(){
		    
	        return false;
	    }
	    
	    /**Aqui ocurre todas las Fases del boss y Pone la boss bar en el Cliente**/
	    public void onLivingUpdate(){	
	    	   float dano = 0;
	    	   dano = this.lastDamage;  
	    	   System.out.println(dano);
	    	World world = worldObj;
	        super.onLivingUpdate();
	       if(RubyCraft.cliente) {
	          BossStatus.setBossStatus(this, true);
          }
	       
	       
	    }
}