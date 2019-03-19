package Eventos;

import RubyCraft.RubyCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class EventosTab extends CreativeTabs {


	public EventosTab(int i, String modid, String string, int j) {
		super("EventosTab");
		setBackgroundImageName("RubyCraft.png");
	}

	@Override
	public Item getTabIconItem() {
		if(RubyCraft.HalloWen) {
	 		   return Item.getItemFromBlock(Blocks.pumpkin);
	 		}else if(RubyCraft.Navidad) {
	 			return Item.getItemFromBlock(Blocks.snow);
	 		}else if(RubyCraft.Verano){
	 			return Items.water_bucket;
	 		}else {
	 			return Items.diamond;
	 		}
		   
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
}