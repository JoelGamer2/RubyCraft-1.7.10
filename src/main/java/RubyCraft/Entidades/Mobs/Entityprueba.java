package RubyCraft.Entidades.Mobs;

import java.util.Random;

import Eventos.Eventos_especiales;
import Eventos.Navidad.Entidades.Lich;
import RubyCraft.RubyCraft;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class Entityprueba extends EntityMob implements IBossDisplayData {

	
	public static int tick = 0;
	public static boolean Activo = false;
	public static int Fase = -1;
	
	
	
	public static int Ticks_Min_Fase1= 50;
	public static int Ticks_Max_Fase1= 1000;
	
	public static int Ticks_Min_Fase2= Ticks_Max_Fase1 + 1;
	public static int Ticks_Max_Fase2= 2000;
	
	public static int Ticks_Min_Fase3= Ticks_Max_Fase2 + 1;
	public static int Ticks_Max_Fase3= 6000;
	
	public static int Ticks_Min_Fase4= Ticks_Max_Fase3 + 1;
	public static int Ticks_Max_Fase4= 60000;

	public static boolean solo_1 = false;
	
	public Entityprueba(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		
	 super.applyEntityAttributes();
	 if(worldObj.difficultySetting == EnumDifficulty.EASY) {
			
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0D);

			
			}else if(worldObj.difficultySetting == EnumDifficulty.NORMAL) {
				
			     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0D);

				
			}else if(worldObj.difficultySetting == EnumDifficulty.HARD) {

			 this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0D);

				
			}
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(2.1D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
	 if(Fase==-1) {
	 tick = 0;
	 solo_1=false;
	 Activo = false;
		}
		 }
	
	/**Comunica cuando el mob muere**/
	@Override
	public void onDeath(DamageSource p_70645_1_) {
	    Activo = false;
	    Fase = -1;
		tick = 0;
	
	
		super.onDeath(p_70645_1_);

	 dropeos();
	 
}
	/**Comunica que item dropeara**/
	private void dropeos() {
		
			
		/** Random generator2 = new Random(); 
         int nSelection = generator2.nextInt(Mobs.length); 
         String droprandom = Posibleddrops[nSelection]; **/
         if(!solo_1) {
        	 solo_1= true;
		 if(Minecraft.getMinecraft().thePlayer instanceof EntityPlayer){
		        EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
		        player.addChatComponentMessage(new ChatComponentText("murio"));
			 
					player.inventory.addItemStackToInventory(new ItemStack(RubyCraft.Totem_de_la_no_muerte));
					   Activo = false;
					    Fase = -1;
						tick = 0;
					
			}
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
	    
	    
	    	
	    @Override
	    protected int getExperiencePoints(EntityPlayer player) {
	    	// TODO Auto-generated method stub
	    	return 20;
	    }
       
	    @Override
	    public IEntityLivingData onSpawnWithEgg(IEntityLivingData p_110161_1_) {
	    	 if(Minecraft.getMinecraft().thePlayer instanceof EntityPlayer){
                 EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
                 player.addChatComponentMessage(new ChatComponentText(Integer.toString(Fase) + Activo));
	    	 }
	    	if(Activo) {
	    		
		    	this.setDead();
		    	 if(Minecraft.getMinecraft().thePlayer instanceof EntityPlayer){
	                 EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
	                 player.addChatComponentMessage(new ChatComponentText("SOLO PUEDE HABER UN BOSS ACTIVO" + tick));
		    	 }
		    	 

		    }else {
		    	tick=0;
		    }
	    	return super.onSpawnWithEgg(p_110161_1_);
	    }
	    @Override
	    public boolean getCanSpawnHere() {
	    	if(Activo) {
	    	return false;
	    	}else {
	    		return true;
	    	}
	    }
	    /**Aqui ocurre todas las Fases del boss y Pone la boss bar en el Cliente**/
	    public void onLivingUpdate(){    	
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
		    	 Activo= true;

	            tick ++;
	            System.out.println(tick + "los putos ticks del puto boss joel");
	            if(tick == Ticks_Min_Fase1) {
	            	Fase = 1;
	            	 cambiar_De_fase(1, true, null);

	            }
	            
	            if(tick==Ticks_Min_Fase2) {
	            	Fase = 2;
	   	    	 cambiar_De_fase(2, true, null);

	            }
	       }
	     /**Fase 1 Spawnea bichos random 4 veces**/
	     if(Fase == 1) { 
	    	
	       if(!(tick >= Ticks_Max_Fase1) && !(tick <=Ticks_Min_Fase1)) {
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
	     
	        /** Entity mob = EntityList.createEntityByName(Mobrandom, this.worldObj);
	         mob.setPosition(xrandomgenerado + x, yrandomgenerado + y, zrandomgenerado + z);**/
	         if(!world.isRemote) {
			// worldObj.spawnEntityInWorld(mob);
	        	 if(Minecraft.getMinecraft().thePlayer instanceof EntityPlayer){
	                 EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
	                 player.playSound("random.fizz", 1.0F, 1.0F);
	        	 }
	        	
	        	
	                
	         
	 }
	        	
	               
	           }else if(!(tick >= Ticks_Max_Fase2) && !(tick <=Ticks_Min_Fase2)) {
	        	   
	           }
          }
	    }
	    
	    
	    public static void cambiar_De_fase(int fase, boolean sonido, String nombresonido_default) {
	    	if(nombresonido_default==null) {
	    		nombresonido_default = ":totem";
	    	}
	    	 if(Minecraft.getMinecraft().thePlayer instanceof EntityPlayer){
                 EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
                 player.addChatComponentMessage(new ChatComponentText("El Boss ha cambiado a la Fase:"+fase));
	    	
            
            	 if(sonido) {
             player.playSound(RubyCraft.modid + nombresonido_default, 1.0F, 1.0F);
            	 
             }
	    	}
	    }
	  }