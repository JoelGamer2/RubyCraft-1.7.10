package HerraCraft;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Guadana_Tenebrosa extends ItemSword {

	public Guadana_Tenebrosa(ToolMaterial material) {
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
	
	
	@Override
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List lore, boolean p_77624_4_) {
		// TODO Auto-generated method stub
        lore.add(EnumChatFormatting.RED + "Espada Especial del Evento de Halloween");
	}
}
