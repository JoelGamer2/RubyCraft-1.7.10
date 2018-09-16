package HerraCraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Guadañan_Tenebrosa extends ItemSword {

	public Guadañan_Tenebrosa(ToolMaterial material) {
		super(material);
		
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int x, boolean e) {
	
		super.onUpdate(stack, world, entity, x, e);
		
		EntityPlayer player = (EntityPlayer) entity;
		ItemStack equipped = player.getCurrentEquippedItem();
		if(equipped == stack) {
			if(!world.isRemote) {
			   player.addPotionEffect(new PotionEffect(22, 100, 2));
			}
		}
	}
	
}
