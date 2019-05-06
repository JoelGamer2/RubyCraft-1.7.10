package Eventos.Verano.Entidades;

import RubyCraft.RubyCraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Elemental_de_Agua_Guardian extends EntityMob implements IBossDisplayData {

	public static int Fase = 0;
	private static int tick;
	public static boolean Activo;
	public Elemental_de_Agua_Guardian(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}
	public static void reiniciarsiespacifico() {
		 resetear();
		 Fase = 0;

	 }
	protected void applyEntityAttributes(){	
		Activo = true;
		 Fase = 1;
		 resetear();
		 super.applyEntityAttributes();
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1D);
		 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);	
		 
		 }
	/**Comunica cuando el mob muere**/
	@Override
	public void onDeath(DamageSource damage) {
		Fase = 0;
		Activo = false;
     	 this.experienceValue = 5000;
		resetear();
      
      
	}
	
	private static void resetear() {
		tick = 0;
	}
	
	/**Returns the sounds of ambient for the mob**/
	 protected String getLivingSound(){
		    
	        return RubyCraft.modid + ":elemental_ambiente";
	        
	    }
	 
	 
	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound(){
	    
	      return RubyCraft.modid + ":elemental_pegar";
	        
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound(){
	    
	        return RubyCraft.modid + ":elemental_morir";
	        
	    }	 
	    
	    /**Activa la AI personalalizada**/
	    public boolean isAIEnabled(){
		    
	        return false;
	    }
	    
	 
	   
	    /**Aqui ocurre todas las Fases del boss y Pone la boss bar en el Cliente**/
	    public void onLivingUpdate(){	
	    	tick ++;
	    //	Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(tick + ""));
	    	double x = this.posX;
	    	double y = this.posY;
	    	double z = this.posZ;
	    	World world = worldObj;

	    	
/**
	        super.onLivingUpdate();
	       if(RubyCraft.cliente) {
	          BossStatus.setBossStatus(this, true);
	          BossStatus.statusBarTime = 10;
          }**/
	     
	    }                          
	           
	    }    