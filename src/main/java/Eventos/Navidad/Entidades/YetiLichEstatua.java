
package Eventos.Navidad.Entidades;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class YetiLichEstatua extends EntityAnimal{

	public YetiLichEstatua(World world) {
		super(world);
		     
	 this.setSize(2.5F, 6.8F);
	 this.stepHeight = 1.0F; 
	 
	}
	protected void applyEntityAttributes(){	
		 super.applyEntityAttributes();
		 this.experienceValue = 0;
	     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
		 
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
	    
	    }
		@Override
		public EntityAgeable createChild(EntityAgeable p_90011_1_) {
			// TODO Auto-generated method stub
			return null;
		}    
	  
	    	         
	    }    