package RubyCraft.Entidades.Granadas;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntidadGranada_de_Ruby extends EntityThrowable {

	public static float RadiodeExplosion = 10.0F;
	
	public EntidadGranada_de_Ruby(World Entidad) {
		super(Entidad);
		
	}

	public EntidadGranada_de_Ruby(World world, EntityLivingBase entity){
		super(world,entity);
	}

	@Override
	protected void onImpact(MovingObjectPosition var1) {
		for(int i = 0; i < 10; i++){
			
			this.worldObj.spawnParticle("flame",this.posX,this.posY,this.posZ,10.0F,10.0F,10.0F);
		}
		if(!this.worldObj.isRemote){
			this.setDead();
			if(!this.worldObj.isRemote){
				this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, RadiodeExplosion, true);
			}
		}
		
	}
	
}
