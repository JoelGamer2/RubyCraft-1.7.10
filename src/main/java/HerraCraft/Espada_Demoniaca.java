package HerraCraft;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;

public class Espada_Demoniaca extends ItemSword {

	public Espada_Demoniaca(ToolMaterial material) {
		super(material);
		
	}
	
   @Override
public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List lore, boolean p_77624_4_) {
	// TODO Auto-generated method stub
       lore.add(EnumChatFormatting.RED + "Espada Especial del Evento de Halloween");
}

}
