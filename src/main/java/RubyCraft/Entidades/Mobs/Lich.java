package RubyCraft.Entidades.Mobs;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
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

public class Lich extends EntityMob implements IBossDisplayData {

	public static int Fase = 0;
	private static int cantidad_a_generar1;
	private static int cantidad_a_generar2;
	private static int cantidad_a_generar3;
	private static int cantidad_a_generar4;
	private static int cantidad_ya_generada1 = 0;
	private static int cantidad_ya_generada2 = 0;
	private static int cantidad_ya_generada3 = 0;
	private static int cantidad_ya_generada4 = 0;
	private static long tiempoqueestaba = YetiLich.tiempoqueestaba;
	private static long noche = 15000;
	private static int xrandomv;
	private static int zrandomv;
	private static int xrandom;
	private static int zrandom;
	private static int tick;
	public static boolean Activo;
	public static int idyetilich = 0;
	public Lich(World world) {
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
		if(this.worldObj.difficultySetting == EnumDifficulty.HARD) {
			 cantidad_a_generar1 = 12;
			 cantidad_a_generar2 = 12;
			 cantidad_a_generar3 = 24;
			 cantidad_a_generar4 = 12;
		}else if(this.worldObj.difficultySetting == EnumDifficulty.EASY) {
			 cantidad_a_generar1 = 4;
			 cantidad_a_generar2 = 4;
			 cantidad_a_generar3 = 8;
			 cantidad_a_generar4 = 4;
		}else if(this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
			 cantidad_a_generar1 = 6;
			 cantidad_a_generar2 = 6;
			 cantidad_a_generar3 = 12;
			 cantidad_a_generar4 = 6;
		}
		 Fase = 1;
		 this.worldObj.setWorldTime(noche);
		 resetear();
		 super.applyEntityAttributes();
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40000.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(40.0D);	
		 
		 }
	/**Comunica cuando el mob muere**/
	@Override
	public void onDeath(DamageSource damage) {
		Fase = 0;
		this.worldObj.setWorldTime(tiempoqueestaba);
    	 this.experienceValue = 12000;
		resetear();
		dropeos();	
		this.attackingPlayer.setHealth(1);
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
	/**Esta funcion hace que el mob dropee cosas**/
	private void dropeos() {
		this.entityDropItem(new ItemStack(Items.spawn_egg,1 , idyetilich), 1);
		if(this.worldObj.difficultySetting == EnumDifficulty.EASY) {
			this.dropItem(Items.diamond, 15);
			this.entityDropItem(new ItemStack(Items.golden_apple, 1, 1), 1);
		}else if(this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
			this.dropItem(Items.diamond, 30);
			this.entityDropItem(new ItemStack(Items.golden_apple, 1, 1), 5);
		}else if(this.worldObj.difficultySetting == EnumDifficulty.HARD) {
			this.dropItem(Items.diamond, 64);
			this.entityDropItem(new ItemStack(Items.golden_apple, 1, 1), 16);
		}
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
	    		GenerarMobs("Zombie", world, x, y, z, 1, 150);
	       }if(this.getHealth() <= 30000F && this.getHealth() >= 20000F) {
	    	   Fase = 2;         
	    	   GenerarMobs("Skeleton", world, x, y, z, 2, 125);
	       }else if(this.getHealth() <= 20000F && this.getHealth() >= 10000F) {
	    	   Fase = 3;
	    	   GenerarMobs("Blaze", world, x, y, z, 3, 75);   
	       }else if(this.getHealth() <= 10000F && this.getHealth() >= 1F) {
	    	   Fase = 4;
	    	   GenerarMobs("Ghast", world, x, y, z, 4, 50);   
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
	    	if(tick >= 500) {
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
	    		   mob.setCurrentItemOrArmor(0, new ItemStack(Principal.espada_ancestral, 1));
	    		   mob.setCurrentItemOrArmor(1, new ItemStack(RubyCraft.CascodeZafiro, 1));
	    		   mob.setCurrentItemOrArmor(2, new ItemStack(RubyCraft.PetodeZafiro, 1));
	    		   mob.setCurrentItemOrArmor(3, new ItemStack(RubyCraft.PantacasdeZafiro, 1));
	    		   mob.setCurrentItemOrArmor(4, new ItemStack(RubyCraft.botasdeZafiro, 1));
	    		   mob.captureDrops = false;
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
		    		   mob.setCurrentItemOrArmor(0, new ItemStack(Principal.espada_ancestral, 1));
		    		   mob.setCurrentItemOrArmor(1, new ItemStack(RubyCraft.CascodeZafiro, 1));
		    		   mob.setCurrentItemOrArmor(2, new ItemStack(RubyCraft.PetodeZafiro, 1));
		    		   mob.setCurrentItemOrArmor(3, new ItemStack(RubyCraft.PantacasdeZafiro, 1));
		    		   mob.setCurrentItemOrArmor(4, new ItemStack(RubyCraft.botasdeZafiro, 1));
		    		   mob.captureDrops = false;
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
	                    	            cerdo.setCurrentItemOrArmor(0, new ItemStack(Principal.espada_ancestral, 1));
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