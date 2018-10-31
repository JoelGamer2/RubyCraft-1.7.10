package RubyCraft.Entidades.Granadas;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntidadGranda_de_Uranio extends EntityThrowable {

	public static float RadiodeExplosion = 5.0F;
	
	public EntidadGranda_de_Uranio(World Entidad) {
		super(Entidad);
		
	}

	public EntidadGranda_de_Uranio(World world, EntityLivingBase entity){
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
