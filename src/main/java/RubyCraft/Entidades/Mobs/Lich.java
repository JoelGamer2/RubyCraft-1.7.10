package RubyCraft.Entidades.Mobs;

import RubyCraft.RubyCraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Lich extends EntityMob implements IBossDisplayData {

	
	public Lich(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		 resetear();
		 super.applyEntityAttributes();
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20000.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
	
		 }
	
	/**Comunica cuando el mob muere**/
	@Override
	public void onDeath(DamageSource damage) {
		resetear();
		dropeos();
	}
	
	private static void resetear() {
		
	}
	
	private static void dropeos() {
		
	}
	
	/**Returns the sounds of ambient for the mob**/
	 protected String getLivingSound(){
		    
	        return RubyCraft.modid + ":ambientebossparca1";
	        
	    }
	 
	 
	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound(){
	    
	      return RubyCraft.modid + ":golpebossparc1a";
	        
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound(){
	    
	        return RubyCraft.modid + ":muertebossparc1a";
	        
	    }	 
	    
	    /**Activa la AI personalalizada**/
	    public boolean isAIEnabled(){
		    
	        return false;
	    }
	    
	    /**Aqui ocurre todas las Fases del boss y Pone la boss bar en el Cliente**/
	    public void onLivingUpdate(){	
	    	//Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(tick + ""));
	    	double x = this.posX;
	    	double y = this.posY;
	    	double z = this.posZ;
	    	World world = worldObj;
	        super.onLivingUpdate();
	       if(RubyCraft.cliente) {
	          BossStatus.setBossStatus(this, true);
	          BossStatus.statusBarTime = 10;
          }
	      
	       
	       
	 }
	    	    
 }    