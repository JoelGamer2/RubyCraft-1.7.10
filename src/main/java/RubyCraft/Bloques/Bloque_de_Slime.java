package RubyCraft.Bloques;

import RubyCraft.RubyCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Bloque_de_Slime extends BlockBreakable{
	private boolean bounce=false;
	private double howHigh=0.0;
	
	public Bloque_de_Slime(){
		super(RubyCraft.modid + ":Bloque_de_Slime", Material.clay, false);
        this.setCreativeTab(RubyCraft.Rubycrafttab);
        this.slipperiness = 0.8F;
        this.stepSound=new SlimeSoundType("mob.slime.big", 1.0F, 1.0F);
	}
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_){
        return this.blockIcon; 
    }
    
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass(){
        return 1;
    }
    
    protected boolean canSilkHarvest(){
        return true;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world_, int x, int y, int z){
         return AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)z, (double)(x + 1), (double)((float)(y + 1) - 0.0625F), (double)(z + 1));
    }
    
    public void onFallenUpon(World world, int X, int Y, int Z, Entity entity, float entityFallDistance){
    	if(entity.isSneaking()){
    		super.onFallenUpon(world, X, Y, Z, entity, entityFallDistance);
    	}else{
    		entity.fallDistance=0.0F;
    		bounce=true;
    		howHigh=-entity.motionY;
    	}
    }
    
    public void onEntityCollidedWithBlock(World world, int X, int Y, int Z, Entity entity){
		if(!entity.isSneaking()){
			if(bounce){				
				entity.motionY=howHigh;
				bounce=false;
			}else if(Math.abs(entity.motionY) < 0.1D){
	            double d0 = 0.4D + Math.abs(entity.motionY) * 0.2D;
	            entity.motionX *= d0;
	            entity.motionZ *= d0;
	        }
		}
        super.onEntityCollidedWithBlock(world, X, Y, Z, entity);
    }
    
    public static class SlimeSoundType extends Block.SoundType{
		public final String soundName;
        public final float volume;
        public final float frequency;
        public SlimeSoundType(String soundName, float volume, float frequency) {
        	super(soundName, volume, frequency);
        	this.soundName = soundName;
        	this.volume = volume;
        	this.frequency = frequency;
		}

        public String getBreakSound(){
            return "mob.slime.big";
        }

        public String getStepResourcePath(){
        	return "mob.slime.big";
        }

        public String func_150496_b(){
            return this.getBreakSound();
        }
    }

}