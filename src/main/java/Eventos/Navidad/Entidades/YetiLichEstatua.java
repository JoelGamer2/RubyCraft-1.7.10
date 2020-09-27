
package Eventos.Navidad.Entidades;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class YetiLichEstatua extends EntityAnimal{
	public static boolean uno = true;
	public YetiLichEstatua(World world) {
		super(world);
		     
	 this.setSize(2.5F, 6.8F);
	 this.stepHeight = 1.0F; 
	 
	}
	protected void applyEntityAttributes(){	
		 super.applyEntityAttributes();
		 this.experienceValue = 0;
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0D);
		 uno = true;
		 }

	
	@Override
	public void onDeath(DamageSource p_70645_1_) {
		if(!this.worldObj.isRemote) {
		this.entityDropItem(new ItemStack(Items.spawn_egg,1 , Lich.idyetilich), 1);
		}
		super.onDeath(p_70645_1_);
	}
	    
	    /**Activa la AI personalalizada**/
	    public boolean isAIEnabled(){
		    
	        return true;
	    }
	    
	    /**Aqui ocurre todas las Fases del boss y Pone la boss bar en el Cliente**/
	    public void onLivingUpdate(){	
	    	int tick =0;
	    	if(worldObj.isRemote && uno && !(tick ==10)) {
	    		
	               List players = Minecraft.getMinecraft().theWorld.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox(this.posX - 1, this.posY - 1, this.posZ - 1, this.posX + 1, this.posY + 10, this.posZ + 1));
	    	 if(!(players.size()==0)) {
	               for (int i = 0; i <= players.size() - 1; i++) {
	           		EntityPlayer en_rago = (EntityPlayer) players.get(i);
	        	   
	        	   tick ++;
	        	    this.setRotationYawHead(en_rago.rotationYawHead);
           uno = false;
	               }
	    	 }
	    	 }
	    }
		@Override
		public EntityAgeable createChild(EntityAgeable p_90011_1_) {
			// TODO Auto-generated method stub
			return null;
		}    
	  
	    	         
	    }    