package RubyCraft.Entidades.Mobs;

import java.util.Random;

import RubyCraft.RubyCraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class YetiLich extends EntityMob implements IBossDisplayData {

	public static int Fase = 0;
	private static int cantidad_a_generar1;
	private static int cantidad_a_generar2;
	private static int cantidad_a_generar3;
	private static int cantidad_a_generar4;
	private static int cantidad_ya_generada1 = 0;
	private static int cantidad_ya_generada2 = 0;
	private static int cantidad_ya_generada3 = 0;
	private static int cantidad_ya_generada4 = 0;
	public static long tiempoqueestaba;
	private static long noche = 15000;
	private static int xrandomv;
	private static int zrandomv;
	private static int xrandom;
	private static int zrandom;
	private static int tick;
	public static boolean Activo;
	public YetiLich(World world) {
		super(world);
		     
	 this.setSize(2.5F, 6.8F);
	 this.stepHeight = 1.0F; 
	 
	}
	public static void reiniciarsiespacifico() {
		 resetear();
		 Fase = 0;

	 }
	protected void applyEntityAttributes(){	
		Activo = true;
		if(this.worldObj.difficultySetting == EnumDifficulty.HARD) {
			 cantidad_a_generar1 = 6;
			 cantidad_a_generar2 = 6;
			 cantidad_a_generar3 = 12;
			 cantidad_a_generar4 = 6;
		}else if(this.worldObj.difficultySetting == EnumDifficulty.EASY) {
			 cantidad_a_generar1 = 2;
			 cantidad_a_generar2 = 2;
			 cantidad_a_generar3 = 4;
			 cantidad_a_generar4 = 2;
		}else if(this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
			 cantidad_a_generar1 = 3;
			 cantidad_a_generar2 = 3;
			 cantidad_a_generar3 = 6;
			 cantidad_a_generar4 = 3;
		}
		 Fase = 1;
		 tiempoqueestaba = this.worldObj.getWorldTime();
		 this.worldObj.setWorldTime(noche);
		 resetear();
		 super.applyEntityAttributes();
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20000.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1D);
		 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);	
		 
		 }
	/**Comunica cuando el mob muere**/
	@Override
	public void onDeath(DamageSource damage) {
		Fase = 0;
		Activo = false;
		this.worldObj.setWorldTime(tiempoqueestaba);
		resetear();
		dropeos();	
          if(!this.worldObj.isRemote && !(worldObj.getBlock((int)posX - 10, (int)posY, (int)posZ) == Blocks.air)) {
        	  Entity e = EntityList.createEntityByName("LichR", this.worldObj);
        	  e.setPosition(this.posX, this.posY, this.posZ);
        	  this.worldObj.spawnEntityInWorld(e);
          
		}else if(!this.worldObj.isRemote) {
			 Entity e = EntityList.createEntityByName("LichR", this.worldObj);
       	  e.setPosition(this.posX - 10, this.posY, this.posZ);
       	  this.worldObj.spawnEntityInWorld(e);
		}
	}
	
	private static void resetear() {
		 cantidad_ya_generada1 = 0;
		 cantidad_ya_generada2 = 0;
		 cantidad_ya_generada3 = 0;
		 cantidad_ya_generada4 = 0;
		 xrandomv = 0;
		 zrandomv = 0;
		 xrandom = 0;
		 zrandom = 0;
		 tick = 0;
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
	    //	Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(tick + ""));
	    	double x = this.posX;
	    	double y = this.posY;
	    	double z = this.posZ;
	    	World world = worldObj;	
	        super.onLivingUpdate();
	       if(RubyCraft.cliente) {
	          BossStatus.setBossStatus(this, true);
	          BossStatus.statusBarTime = 10;
          }
	       if(Fase == 1) {
	    		GenerarMobs("Zombie", world, x, y, z, 1, 300);
	       }if(this.getHealth() <= 15000F && this.getHealth() >= 10000F) {
	    	   Fase = 2;         
	    	   GenerarMobs("Skeleton", world, x, y, z, 2, 250);
	       }else if(this.getHealth() <= 10000F && this.getHealth() >= 5000F) {
	    	   Fase = 3;
	    	   GenerarMobs("Blaze", world, x, y, z, 3, 150);   
	       }else if(this.getHealth() <= 5000F && this.getHealth() >= 1F) {
	    	   Fase = 4;
	    	   GenerarMobs("Ghast", world, x, y, z, 4, 100);   
	       }
	    }
	    
	    private static void GenerarMobs(String nombre,World world, double x, double y, double z, int Fase, int cooldown) {
	    	Random e = new Random();
	    	
	    	xrandom = 1 + e.nextInt(10);
	    	zrandom = 1 + e.nextInt(10);
	    	
	    	if(world.getBlock((int)x + (int)xrandom, (int)y, (int)z + (int)zrandom) == Blocks.air) {
	    		xrandomv = xrandom;
	    		zrandomv = zrandom;
	    	}else {
	        	 xrandomv = 0; 
	        	 zrandomv = 0;
	         }
	    	tick ++;
	    	
	    	if(tick >= 1000) {
	    		 cantidad_ya_generada1 = 0;
	    		 cantidad_ya_generada2 = 0;
	    		 cantidad_ya_generada3 = 0;
	    		 cantidad_ya_generada4 = 0;
	    		tick = 0;
	    		xrandomv = 0;
	    		zrandomv = 0;
	    		xrandom = 0;
	    		zrandom = 0;
	    	}
	    	   if(!world.isRemote) {
	    	if(!(cantidad_ya_generada1 == cantidad_a_generar1) && Fase == 1) {

	    	 Entity mob = EntityList.createEntityByName(nombre, world);
	    	 Entity esqueleto = EntityList.createEntityByName("Skeleton", world);
	    		  if(tick >= cooldown) {
	    		   esqueleto.setPosition(x + xrandomv, y, z + zrandomv);
	    		   mob.setPosition(x + xrandomv - 1, y, z + zrandomv);
	    		   esqueleto.setCurrentItemOrArmor(0, new ItemStack(Items.bow, 1));
	    		  world.spawnEntityInWorld(mob);
	    		  world.spawnEntityInWorld(esqueleto);
	    		cantidad_ya_generada1 ++;
	    		tick = 0;
	    		xrandomv = 0;
	    		zrandomv = 0;
	    		xrandom = 0;
	    		zrandom = 0;
	    		  }
	    	}else if(!(cantidad_ya_generada2 == cantidad_a_generar2) && Fase == 2) {
		    		   Entity mob = EntityList.createEntityByName(nombre, world);
		    		   Entity creeper = EntityList.createEntityByName("Creeper", world);
		    		   if(tick >= cooldown) {
		    		   mob.setPosition(x + xrandomv - 1, y, z + zrandomv);
		    		   mob.setCurrentItemOrArmor(0, new ItemStack(Items.bow, 1));
		    		   creeper.setPosition(x + xrandomv, y, z + zrandomv);
		    		  world.spawnEntityInWorld(mob);
		    		  world.spawnEntityInWorld(creeper);
		    		  cantidad_ya_generada2++;
		    		  tick = 0;
		    		  xrandomv = 0;
			    	  zrandomv = 0;
			    	  xrandom = 0;
			    	  zrandom = 0;
		    		   }
	                      }else if(!(cantidad_ya_generada3 == cantidad_a_generar3) && Fase == 3) {
	                    	  
	                    	  Entity mob = EntityList.createEntityByName(nombre, world);
	                    	  if(tick >= cooldown) {
	   		    		      mob.setPosition(x + xrandomv, y, z + zrandomv);
	   		    		      world.spawnEntityInWorld(mob);
	                    	  cantidad_ya_generada3++;
	                    	  tick = 0;
	                    	  xrandomv = 0;
	          	    		  zrandomv = 0;
	          	    		  xrandom = 0;
	        	    		  zrandom = 0;
	                    	  }
	                             }else if(!(cantidad_ya_generada4 == cantidad_a_generar4) && Fase == 4) {
	                    	           Entity mob = EntityList.createEntityByName(nombre, world);
	                    	           Entity cerdo = EntityList.createEntityByName("HombreCerdo", world);
	                    	        if(tick >= cooldown) {
	                    	            cerdo.setCurrentItemOrArmor(0, new ItemStack(RubyCraft.Espadaderuby, 1));
	   		    		                mob.setPosition(x + xrandomv - 1, y, z + zrandomv);
	   		    		                cerdo.setPosition(x + xrandomv, y, z + zrandomv);
	   		    		                world.spawnEntityInWorld(mob);
	   		    		                world.spawnEntityInWorld(cerdo);
	   		    		                cantidad_ya_generada4++;
	   		    		                tick = 0;
	   		    		                xrandomv = 0;
	   		    		    		    zrandomv= 0;
	   		    		    		    xrandom = 0;
	   		    			    		zrandom = 0;
	                    	        }
	                    	  }
	                      }
	    	         
	           }
	    }    