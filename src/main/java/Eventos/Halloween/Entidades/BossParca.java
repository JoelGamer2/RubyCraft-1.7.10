package Eventos.Halloween.Entidades;

import java.util.Random;

import Eventos.Eventos_especiales;
import RubyCraft.RubyCraft;
import RubyCraft.Bloques.Bloque_de_Diamante_Trol;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class BossParca extends EntityMob implements IBossDisplayData {

	
	public static int tick = 0;
	public static int tickparticulas = 0;
	public static boolean Activo = false;
	public static int Tp_hechos = 0;
	public static boolean activarchupaalmas = false;
	public static int Fase = 0;
	
	public static boolean chat1 = false;
	public static boolean chat2 = false;
	public static boolean chat3 = false;
	
	 public static double xrandomtp = 0;
	 public static  double zrandomtp = 0;
	 public static int cantidadgenerado = 0;
	public BossParca(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
	 if(worldObj.difficultySetting == EnumDifficulty.EASY) {
			
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000.0D);

			
			}else if(worldObj.difficultySetting == EnumDifficulty.NORMAL) {
				
			     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2000.0D);

				
			}else if(worldObj.difficultySetting == EnumDifficulty.HARD) {

			 this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4000.0D);

				
			}
	 
	 if( RubyCraft.cliente) {
		 if(!Activo){
		          
		        
		          Minecraft.getMinecraft().thePlayer.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE,1.0F);
		 	 }
	 }
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(2.1D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
	 tick = 0;
	
	 
	 Activo = true;
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
	}
	
	/**Comunica cuando el mob muere**/
	@Override
	public void onDeath(DamageSource damage) {
		Activo = false;
		Eventos_especiales.musica = false;
		//Generator_Boss.NombreJugador = " ";
		//worldObj.setWorldTime(Generator_Boss.TiempodelMundo);
		//Generator_Boss.TiempodelMundo = 0;
		Bloque_de_Diamante_Trol.Dano = 20.0F;
		Fase = 0;
		dropeos();
	}
	
	
	
	/**Comunica que item dropeara**/
	private void dropeos() {
		
		if(worldObj.difficultySetting == EnumDifficulty.EASY) {
		
	//	this.dropItem(herracraft.Lingote_Demoniaco, 2);
		this.dropItem(RubyCraft.bossparca, 1);
		
		}else if(worldObj.difficultySetting == EnumDifficulty.NORMAL) {
			
		//	this.dropItem(herracraft.Lingote_Demoniaco, 4);
			this.dropItem(RubyCraft.bossparca, 1);
			
	   }else if(worldObj.difficultySetting == EnumDifficulty.HARD) {
			
			//this.dropItem(herracraft.Lingote_Demoniaco, 6);
			this.dropItem(RubyCraft.bossparca, 1);
			
		}
			
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
        	         	 
        //	 this.dropItem(herracraft.guadana_Tenebrosa, 1);
        	 
         }else if(droprandom.equalsIgnoreCase("lingote_demoniaco")) {
        	 
      //  	 this.dropItem(herracraft.Lingote_Demoniaco, cantidadgenerado);
        	 
         }else if(droprandom.equalsIgnoreCase("ruby")) {
        	 
        	 this.dropItem(RubyCraft.ruby, cantidadgenerado);
        	 
         } else if(droprandom.equalsIgnoreCase("zafiro")) {
        	 
        	 this.dropItem(RubyCraft.zafiro, cantidadgenerado);
        	 
         } else if(droprandom.equalsIgnoreCase("platino")) {
        	 
        	 this.dropItem(RubyCraft.Platino, cantidadgenerado);
        	 
         } else if(droprandom.equalsIgnoreCase("azula")) {
        	 
       // 	 this.dropItem(herracraft.Azula, cantidadgenerado);
        	 
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
	    
	    /**Lista de mobs random para la Fase 1 del boss**/
	    public static String[] Mobs = { 
	               
	            "Skeleton",
	            "AlienR",
	            "Zombie",
   
	    };
	    
	    public void Particulas(double x, double y, double z) {
	    	tickparticulas++;
	    	if(tickparticulas == 30) {
	        this.worldObj.spawnParticle("smoke", x, y, z, 2.0F, 1.0F, 6.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 3.0F, 1.0F, 5.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, -1.0F, 1.0F, 4.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, -2.0F, 1.0F, 3.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 4.0F, 1.0F, 2.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 5.0F, 1.0F, 1.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 6.0F, 1.0F, -2.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 7.0F, 1.0F, -1.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 8.0F, 1.0F, 1.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 9.0F, 1.0F, 2.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 10.0F, 1.0F, 3.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 2.0F, -1.0F, 6.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 3.0F, -2.0F, 5.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 1.0F, -3.0F, 4.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 4.0F, -4.0F, 3.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 5.0F, -5.0F, 2.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 6.0F, -6.0F, 1.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 1.0F, -1.0F, 1.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 2.0F, -2.0F, 2.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 3.0F, -3.0F, 3.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 4.0F, -4.0F, 4.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 5.0F, -5.0F, 5.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 6.0F, -6.0F, 6.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 7.0F, -1.0F, 7.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 8.0F, -2.0F, 8.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 9.0F, -3.0F, 9.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 10.0F, -4.0F, 10.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 11.0F, -5.0F, 11.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 11.0F, -1.0F, 13.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 15.0F, -3.0F, 14.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 17.0F, -4.0F, 15.0F);
			this.worldObj.spawnParticle("smoke", x, y, z, 18.0F, -5.0F, 16.0F);

	    	}else if(tickparticulas > 35) {
	    		tickparticulas = 0;
	    	}
	    	
	    }
	    @Override
	    protected int getExperiencePoints(EntityPlayer player) {
	    	// TODO Auto-generated method stub
	    	return 20;
	    }
	    
	    /**Aqui ocurre todas las Fases del boss y Pone la boss bar en el Cliente**/
	    public void onLivingUpdate(){
	    	Eventos_especiales.chupa_almas = activarchupaalmas;
	    	 // System.out.println(xrandomtp + " " + zrandomtp + " " + Fase + " " + tick);	    	
	    		    	double x = this.posX;
	    		    	double y = this.posY;
	    		    	double z = this.posZ;
	    		    	World world = worldObj;
	    		        super.onLivingUpdate();
	    		       if(RubyCraft.cliente) {
	    		          BossStatus.setBossStatus(this, true);
	    		        //  Particulas(x, y, z);
	    		     } 
	    		       if(!(Fase == 0)) {
	    		    	  RubyCraft.logger.info(tick);
	    		    	  
	    		            tick ++;
	    		            
	    		    	   
	    		          //  Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(tick + " "));
	    		       }
	    		     /**Fase 1 Spawnea bichos random 4 veces**/
	    		     if(Fase == 1) { 
	    	 if(RubyCraft.cliente && !chat1){
	    		             
	    		             
	    		 Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Eventos_especiales.ParcaFase1));
	    						chat1=true;

	    		    	 }

	    		       if(tick == 140 || tick == 280 || tick ==  420 || tick == 560 ) {
	    		      double xrandomgenerado = 0;
	    		      double yrandomgenerado = 0;
	    		      double zrandomgenerado = 0;
	    		    
	    		     Random xrandom = new Random(); 
	    		     xrandomgenerado = xrandom.nextInt(6);
	    		     
	    		     Random yrandom = new Random(); 
	    		     yrandomgenerado = yrandom.nextInt(3);
	    		     
	    		     Random zrandom = new Random(); 
	    		     zrandomgenerado = zrandom.nextInt(6);
	    		
	    		     //System.out.println(xrandomgenerado);
	    		     //System.out.println(yrandomgenerado);
	    		     //System.out.println(zrandomgenerado);
	    		     
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
	    		       
	    		      /**Fase 2 se tepea random 4 veces**/
	    		        }else if(Fase == 2) {
	    		        	
	    		        	 if(RubyCraft.cliente && !this.chat2){
	    			             
	    			            
	    		        		 Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Eventos_especiales.ParcaFase2));
	    							chat2=true;

	    			    	 }
	    		        	
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
	    			    	    }else if( tick > 700 && Fase == 2) {
	    			    		      Fase = 3;
	    			    		      tick = 0; 	
	    			    	 }
	    		        	/**Fase 3 Quita vida al jugador y se cura el**/
	    		        }else if(Fase == 3) {   	
	    		        	
	    		        	if( RubyCraft.cliente && !this.chat3){
	    			             
	    			             
	    		        		Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(Eventos_especiales.ParcaFase3));
	    							chat3=true;

	    			    	 }
	    		        	
	    		        	if(tick == 200) {
	    		        		this.heal(0.1F);
	    	                    activarchupaalmas = true;    
	    		        	
	    	   						
	    	   		    	 /**DESACTIVA EL CONTADOR PORQUE YA NO HAY MAS FASES**/
	    	        	}  else if(tick > 600) {
	    	        		
	    	        		Fase = 0;
	    	        		tick = 0;
	    	        		activarchupaalmas = false;
	    	        	

	    	               }
	    		        }           
	  }
}