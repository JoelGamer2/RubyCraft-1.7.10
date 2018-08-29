package RubyCraft.Bases;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.command.server.CommandBlockLogic;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.world.World;

public class Interfaz_Bloque_de_comandos extends BlockContainer
{
    private static final String __OBFID = "CL_00000219";

    public Interfaz_Bloque_de_comandos()
    {
        super(Material.iron);
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World world, int x)
    {
        return new TileEntityCommandBlock();
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        if (!world.isRemote)
        {
            boolean flag = world.isBlockIndirectlyGettingPowered(x, y, z);
            int l = world.getBlockMetadata(x, y, z);
            boolean flag1 = (l & 1) != 0;

            if (flag && !flag1)
            {
                world.setBlockMetadataWithNotify(x, y, z, l | 1, 4);
                world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
            }
            else if (!flag && flag1)
            {
                world.setBlockMetadataWithNotify(x, y, z, l & -2, 4);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        TileEntity tileentity = world.getTileEntity(x, y, z);

        if (tileentity != null && tileentity instanceof TileEntityCommandBlock)
        {
            CommandBlockLogic commandblocklogic = ((TileEntityCommandBlock)tileentity).func_145993_a();
            commandblocklogic.func_145755_a(world);
            world.func_147453_f(x, y, z, this);
        }
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate(World p_149738_1_)
    {
        return 1;
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int a, float b, float c, float d)
    {
        TileEntityCommandBlock tileentitycommandblock = (TileEntityCommandBlock)world.getTileEntity(x, y, z);

        if (tileentitycommandblock != null)
        {
            player.func_146100_a(tileentitycommandblock);
        }

        return true;
    }

    /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(World world, int x, int y, int z, int a)
    {
        TileEntity tileentity = world.getTileEntity(x, y, z);
        return tileentity != null && tileentity instanceof TileEntityCommandBlock ? ((TileEntityCommandBlock)tileentity).func_145993_a().func_145760_g() : 0;
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack itemstack)
    {
        TileEntityCommandBlock tileentitycommandblock = (TileEntityCommandBlock)world.getTileEntity(x, y, z);

        if (itemstack.hasDisplayName())
        {
            tileentitycommandblock.func_145993_a().func_145754_b(itemstack.getDisplayName());
        }
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }
}