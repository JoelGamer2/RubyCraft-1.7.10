package HerraCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HerraTab extends CreativeTabs {


	public HerraTab(int i, String modid, String string, int j) {
		super("hr");
		setBackgroundImageName("HerraCraft.png");
	}

	@Override
	public Item getTabIconItem() {
		
		   return herracraft.Azula;
		   
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

	
}