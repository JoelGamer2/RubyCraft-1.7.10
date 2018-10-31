package RubyCraft.Entidades.Mobs;

import java.util.Iterator;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Patxis extends EntityMob {

	public Patxis(World world) {
		super(world);
		     
	 this.setSize(0.6F, 1.9F);
	 this.stepHeight = 1.0F; 
	 
	}

	protected void applyEntityAttributes(){
		    
	 super.applyEntityAttributes();
     this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
	 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(3.00000001192092896D);
	 this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);
		    }
	
	 protected String getLivingSound(){
		    
	        return "mob.endermen.idle";
	        
	    }
	 
	 protected boolean isAIEnabled(){
	    
	        return false;
	    }
	 
	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound(){
	    
	      return "mob.endermen.hit";
	        
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound(){
	    
	        return "mob.endermen.death";
	        
	    }
	    
	    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
	       
	    	if(RubyCraft.RubyCraft.cliente) {
	    	
	    	Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Doname o te mato yo a ti " + EnumChatFormatting.AQUA + "https://www.twitch.tv/patxisgamer"));
	    	
	    	}
	        this.dropItem(Items.rotten_flesh, 64);

	        if (!this.worldObj.isRemote)
	        {
	            Iterator iterator = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(50.0D, 100.0D, 50.0D)).iterator();

	            while (iterator.hasNext())
	            {
	                EntityPlayer entityplayer = (EntityPlayer)iterator.next();
	           
	            }
	        }
	    }

}
