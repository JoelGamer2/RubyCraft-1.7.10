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
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class BossParca extends EntityMob implements IBossDisplayData {

	
	public static int tick = 0;
	public static int multiplicar = 140;
	public static boolean Vivo = false;
	public static int Tp_hechos = 0;
	public static boolean activarchupaalmas = false;
	
	
	public static boolean chat1 = false;
	public static boolean chat2 = false;
	public static boolean chat3 = false;
	public static boolean chat4 = false;

	
	public static int Fase = 1;
	
	 private static double xrandomtp = 0;
	 private static  double zrandomtp = 0;
	 private static int cantidadgenerado = 0;
	public BossParca(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0D);
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(2.1D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
	 tick = 0;
	 Vivo = true;
	 Fase = 1;
	 xrandomtp = 0;
	 zrandomtp = 0;
	 Tp_hechos = 0;
	 Bloque_de_Diamante_Trol.Dano = 0.0F;
	 activarchupaalmas = false;
	 cantidadgenerado = 0;
	 
	 
	 chat1 = false;
	 chat2 = false;
	 chat3 = false;
	 chat4 = false;	 
		 }
	
	/**Comunica cuando el mob muere**/
	@Override
	public void onDeath(DamageSource damage) {
		Vivo = false;
		Eventos_especiales.musica = false;
		Generator_Boss.NombreJugador = " ";
		worldObj.setWorldTime(Generator_Boss.TiempodelMundo);
		Generator_Boss.TiempodelMundo = 0;
		Bloque_de_Diamante_Trol.Dano = 20.0F;
	
		dropeos();
	}
	
	
	
	
	private void dropeos() {
		
		this.dropItem(herracraft.Lingote_Demoniaco, 2);
			
		 Random generator2 = new Random(); 
         int nSelection = generator2.nextInt(Mobs.length); 
         String droprandom = Posibleddrops[nSelection]; 
         
         
         if(!droprandom.equalsIgnoreCase("guadana")) {
        	 
        	 Random cantidad = new Random(); 
        	 cantidadgenerado = cantidad.nextInt(4);
        	 
        	 if(cantidadgenerado == 0) {
        	  cantidadgenerado ++;
        	 }
        	 
         }
         
         if(droprandom.equalsIgnoreCase("guadana")) {
        	 
        	 this.dropItem(herracraft.Guadaña_Tenebrosa, 1);
        	 
         }else if(droprandom.equalsIgnoreCase("lingote_demoniaco")) {
        	 
        	 this.dropItem(herracraft.Lingote_Demoniaco, cantidadgenerado);
        	 
         }else if(droprandom.equalsIgnoreCase("ruby")) {
        	 
        	 this.dropItem(RubyCraft.ruby, cantidadgenerado);
        	 
         } else if(droprandom.equalsIgnoreCase("zafiro")) {
        	 
        	 this.dropItem(RubyCraft.zafiro, cantidadgenerado);
        	 
         } else if(droprandom.equalsIgnoreCase("platino")) {
        	 
        	 this.dropItem(RubyCraft.Platino, cantidadgenerado);
        	 
         } else if(droprandom.equalsIgnoreCase("azula")) {
        	 
        	 this.dropItem(herracraft.Azula, cantidadgenerado);
        	 
         } 
	}
	
	/** Posibles drops con cantidad random**/
	public static String[] Posibleddrops = { 
            
            "guadana",
            "lingote_demoniaco",
            "ruby",
            "zafiro",
            "azula",
            "platino",
            
    };
	
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
	    
	    /**Lista de mobs random para la fase 1 del boss**/
	    public static String[] Mobs = { 
	               
	            "Tank",
	            "Skeleton",
	            "Herobrine",
	            "Alien",
	            "Zombie",
   
	    };
	    /**Aqui ocurre todas las fases del boss y Pone la boss bar en el Cliente**/
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
	     
	     /**FASE 1 Spawnea bichos random 4 veces**/
	     if(Fase == 1) {
	    	 
	    	 this.worldObj.spawnParticle("smoke", this.posX - 0.4D, this.posY + 0.4D, this.posZ, 0.0D, 0.2D, 0.0D);
	    	 
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
	       
	      /**FASE 2 se tepea random 4 veces**/
	        }else if(Fase == 2) {
	        	
	        	if(tick > 400 && !(Tp_hechos == 4)) {
					 
					 Tp_hechos ++;
					 tick = 0; 
				    }
	        	
	        	
	        	if(tick == 140 || tick == 300 && Tp_hechos < 5) {
		    	 Random xrandomt = new Random(); 
			     xrandomtp= xrandomt.nextInt(10);
			     
			     Random zrandomt = new Random(); 
			     zrandomtp = zrandomt.nextInt(10);
		    	 if(!world.isRemote) {
		    		
				 this.setPosition(x - xrandomtp , y, z - zrandomtp);
				 world.updateEntity(this);
				 
				 
		    	 }
		    	    } else if( tick > 700 && Fase == 2) {
		    		      Fase = 3;
		    		      tick = 0; 	
		    		
		    	 }
	        	/**FASE 3 Quita vida al jugador y se cura el**/
	        }else if(Fase == 3) {
	        	
	        	if(!(tick < 500)) {
	        		this.heal(1.0F);
                    activarchupaalmas = true;
                    
	        	}else if(tick == 800) {
	        		
	        		Fase = 4;
	        		tick = 0;
	        		activarchupaalmas = false;
	        	}
	        	/**FASE 4 MODO DIFICIL**/
	        }else if(Fase == 4) {
	        	
	        	if(this.worldObj.difficultySetting == EnumDifficulty.NORMAL || this.worldObj.difficultySetting == EnumDifficulty.EASY) {
	        		
	        		
	        	}else if(this.worldObj.difficultySetting == EnumDifficulty.HARD && tick == 140 || tick == 300 || tick == 400 || tick == 500) {
	        		
	            }
	       }    
	  }
}

