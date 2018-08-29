package RubyCraft.Bases;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class Pala_Pasto_Base extends ItemSpade {

	public Pala_Pasto_Base(ToolMaterial material) {
		super(material);
		
	}

	   /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float a, float b, float c)
    {
        if (!player.canPlayerEdit(x, y, z, p_77648_7_, itemstack))
        {
            return false;
        }
        else
        {
            UseHoeEvent event = new UseHoeEvent(player, itemstack, world, x, y, z);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Result.ALLOW)
            {
                itemstack.damageItem(1, player);
                return true;
            }

            Block block = world.getBlock(x, y, z);

            if (p_77648_7_ != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z) && (block == Blocks.grass))
            {
                Block block1 = RubyCraft.Bloque_de_Pasto;
                world.playSoundAtEntity(player, RubyCraft.modid + ":sonido_Pasto", 3.0F, 1.0F);

                if (world.isRemote)
                {
                    return true;
                }
                else
                {
                    world.setBlock(x, y, z, block1);
                    itemstack.damageItem(1, player);
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Returns the name of the material this tool is made from as it is declared in Item.ToolMaterial (meaning diamond
     * would return "EMERALD")
     */
    public String getToolMaterialName()
    {
        return this.toolMaterial.toString();
    }
	
}
