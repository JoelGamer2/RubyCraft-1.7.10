package RubyCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabdeCreativoAvanzada extends CreativeTabs {


	public TabdeCreativoAvanzada(int i, String modid, String string, int j) {
		super(RubyCraft.modid);
		setBackgroundImageName("RubyCraft.png");
	}

	@Override
	public Item getTabIconItem() {
		
		   return Item.getItemFromBlock(RubyCraft.MesadeTrabajodeRuby);
		   
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

}