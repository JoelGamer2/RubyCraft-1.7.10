package RubyCraft.Bloques;

import java.util.List;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class Mesa_de_Trabajo_de_Zafiro_Basica_item_block extends ItemBlock {

	public Mesa_de_Trabajo_de_Zafiro_Basica_item_block(Block p_i45328_1_) {
		super(p_i45328_1_);
		
	}

	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4)
	{
	      list.add(EnumChatFormatting.GREEN + "Esta mesa se Puede Transformar en ");
	      list.add(EnumChatFormatting.GREEN + "una mesa avanzada dandole click derecho con:");
	      list.add(EnumChatFormatting.RED + StatCollector.translateToLocal(RubyCraft.varita.getUnlocalizedName() + ".name"));
	}
	
}
