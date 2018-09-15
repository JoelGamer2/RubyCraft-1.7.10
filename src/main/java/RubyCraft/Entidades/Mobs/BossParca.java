package RubyCraft.Entidades.Mobs;

import java.util.Random;

import HerraCraft.Generator_Boss;
import HerraCraft.herracraft;
import RubyCraft.RubyCraft;
import RubyCraft.Bloques.Bloque_de_Diamante_Trol;
import RubyCraft.Eventos.Eventos_especiales;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BossParca extends EntityMob implements IBossDisplayData {

	
	public static int tick = 0;
	public static int multiplicar = 140;
	public static boolean Vivo = false;
	public static boolean Tps = false;
	
	public static int Fase = 1;
	
	 private static double xrandomtp = 0;
	 private static  double zrandomtp = 0;
	
	public BossParca(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2000.0D);
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(2.1D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
	 tick = 0;
	 Vivo = true;
	 Fase = 1;
	 xrandomtp = 0;
	 zrandomtp = 0;
	 	 
		 }
	
	
	@Override
	public void onDeath(DamageSource damage) {
		Vivo = false;
		Eventos_especiales.musica = false;
		Generator_Boss.NombreJugador = " ";
		worldObj.setWorldTime(Generator_Boss.TiempodelMundo);
		Generator_Boss.TiempodelMundo = 0;
		Bloque_de_Diamante_Trol.Dano = 20.0F;
		
		this.dropItem(herracraft.Lingote_Demoniaco, 2);
	}
	
	
	
	 protected String getLivingSound(){
		    
	        return "mob.villager.idle";
	        
	    }
	 
	 public boolean isAIEnabled(){
	    
	        return false;
	    }
	 
	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound(){
	    
	      return "mob.villager.hit";
	        
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound(){
	    
	        return "mob.villager.no";
	        
	    }	 
	    
	    
	    
	    public static String[] Mobs = { 
	               
	            "Tank",
	            "Skeleton",
	            "Herobrine",
	            "Alien",
	            "Zombie",
   
	    };
	    
	    public void onLivingUpdate(){
	    
	    System.out.println(xrandomtp + " " + zrandomtp + " " + Fase + " " + tick);	
	    	
	    	double x = this.posX;
	    	double y = this.posY;
	    	double z = this.posZ;
	    	World world = worldObj;
	        super.onLivingUpdate();
	       if(RubyCraft.cliente) {
	          BossStatus.setBossStatus(this, true);
	     }
	     
	    tick ++;
	     
	     /**FASE 1**/
	     if(Fase == 1) {
	       if(tick == multiplicar * 1 || tick == multiplicar * 2 || tick == multiplicar * 3 || tick == multiplicar * 4) {
	      double xrandomgenerado = 0;
	      double yrandomgenerado = 0;
	      double zrandomgenerado = 0;
	    
	     Random xrandom = new Random(); 
	     xrandomgenerado = xrandom.nextInt(6);
	     
	     Random yrandom = new Random(); 
	     yrandomgenerado = yrandom.nextInt(3);
	     
	     Random zrandom = new Random(); 
	     zrandomgenerado = zrandom.nextInt(6);
	    
	     System.out.println(xrandomgenerado);
	     System.out.println(yrandomgenerado);
	     System.out.println(zrandomgenerado);
	     
	     Random generator = new Random(); 
         int nSelection = generator.nextInt(Mobs.length); 
         String Mobrandom = Mobs[nSelection]; 
	     
	         Entity mob = EntityList.createEntityByName(Mobrandom, this.worldObj);
	         mob.setPosition(xrandomgenerado + x, yrandomgenerado + y, zrandomgenerado + z);
	         if(!world.isRemote) {
			 worldObj.spawnEntityInWorld(mob);
	         }
	       }else if(tick > 600 && Fase == 1) {
		    	 Fase = 2;
		    	 tick = 0;
		    	 
		     } 
	       
	      /**FASE 2**/
	        }else if(Fase == 2) {
	        	
	        	if(tick == 140 || tick == 280 || tick == 420 || tick == 560) {
		    	 Random xrandomt = new Random(); 
			     xrandomtp= xrandomt.nextInt(7);
			     
			     Random zrandomt = new Random(); 
			     zrandomtp = zrandomt.nextInt(7);
		    	 if(!world.isRemote) {
		    		
				 this.setPosition(x - xrandomtp , y, z - zrandomtp);
				 world.updateEntity(this);
		    	 }
		    	    } else if( tick > 700 && Fase == 2) {
		    		      Fase = 3;
		    		      tick = 0; 	
		    		
		    	 }
	        	/**FASE 3**/
	        }else if(Fase == 3) {
	        	
	        	if(tick==140) {
	        		  

	        	}
	        	
	        }
	     }
	    
	    
}

