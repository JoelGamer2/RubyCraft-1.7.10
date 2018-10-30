package RubyCraft.Entidades.Mobs;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.Eventos.Eventos_especiales;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockJukebox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BossParca extends EntityMob implements IBossDisplayData {

	
	public static int tick = 0;
	public static int multiplicar = 120;
	public static boolean Vivo = false;
	public BossParca(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.60000001192092896D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
	 tick = 0;
	 Vivo = true;
	 	 
		 }
	
	
	@Override
	public void onDeath(DamageSource p_70645_1_) {
		Vivo = false;
		Eventos_especiales.musica = false;
	
	}
	
	
	
	 protected String getLivingSound(){
		    
	        return "mob.villager.idle";
	        
	    }
	 
	 public boolean isAIEnabled(){
	    
	        return true;
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
	            "Creeper",
	            "Alien",
	            "Herobrine",
	            
	            
	            
	    };
	    
	    @SideOnly(Side.CLIENT)
	    public void onLivingUpdate()
	    {
	    	double x = this.posX;
	    	double y = this.posY;
	    	double z = this.posZ;
	    	World world = worldObj;
	     super.onLivingUpdate();
	     BossStatus.setBossStatus(this, true);
	     
	     tick ++;
	     
	     /**FASE 1**/
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
	         mob.setPosition(xrandomgenerado + x, yrandomgenerado + y, zrandomgenerado + z); // put the location here that you want
			 worldObj.spawnEntityInWorld(mob);
	    	 
	        
	     }else if(tick == 240) {
	    	 
	    	 tick = 0;
	    	 
	     }
	     
	    }	
}
