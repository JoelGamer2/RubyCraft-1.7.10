package RubyCraft.Bloques;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Bloque_de_Regeneracion extends Block {

	public Bloque_de_Regeneracion(Material material) {
		super(material);
		
	}
	
	public void onEntityWalking(World world, int par2, int par3, int par4, Entity entity) {
		if(entity instanceof EntityLivingBase){
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 200, 10));
		}
	}

}
