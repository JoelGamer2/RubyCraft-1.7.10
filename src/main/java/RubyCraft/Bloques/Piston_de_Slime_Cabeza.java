package RubyCraft.Bloques;

import RubyCraft.RubyCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class Piston_de_Slime_Cabeza extends BlockPistonExtension {

	@Override
    public void onBlockHarvested(World world, int x, int y, int z, int metadata, EntityPlayer player){
        if(player.capabilities.isCreativeMode){
            int direction = getDirectionMeta(metadata);
            Block baseBlock = world.getBlock(x - Facing.offsetsXForSide[direction], y - Facing.offsetsYForSide[direction], z - Facing.offsetsZForSide[direction]);
            if(baseBlock == RubyCraft.SlimePistonNormal || baseBlock == RubyCraft.SlimePistonPegajoso){
                world.setBlockToAir(x - Facing.offsetsXForSide[direction], y - Facing.offsetsYForSide[direction], z - Facing.offsetsZForSide[direction]);
            }
        }
        super.onBlockHarvested(world, x, y, z, metadata, player);
    }
	
	@Override
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata){
        super.breakBlock(world, x, y, z, block, metadata);
        int i1 = Facing.oppositeSide[getDirectionMeta(metadata)];
        x += Facing.offsetsXForSide[i1];
        y += Facing.offsetsYForSide[i1];
        z += Facing.offsetsZForSide[i1];
        Block baseBlock = world.getBlock(x, y, z);
        if(baseBlock == RubyCraft.SlimePistonNormal || baseBlock == RubyCraft.SlimePistonPegajoso){
            metadata = world.getBlockMetadata(x, y, z);
            if(PistonSlimeBase.isExtended(metadata)){
                baseBlock.dropBlockAsItem(world, x, y, z, metadata, 0);
                world.setBlockToAir(x, y, z);
            }
        }
    }
	
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block){
        int direction = getDirectionMeta(world.getBlockMetadata(x, y, z));
        Block baseBlock = world.getBlock(x - Facing.offsetsXForSide[direction], y - Facing.offsetsYForSide[direction], z - Facing.offsetsZForSide[direction]);
        if (baseBlock != RubyCraft.SlimePistonNormal && baseBlock != RubyCraft.SlimePistonPegajoso){
            world.setBlockToAir(x, y, z);
        }else{
            baseBlock.onNeighborBlockChange(world, x - Facing.offsetsXForSide[direction], y - Facing.offsetsYForSide[direction], z - Facing.offsetsZForSide[direction], block);
        }
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z){
        int metadata = world.getBlockMetadata(x, y, z);
        return (metadata & 8) != 0 ? Item.getItemFromBlock(RubyCraft.SlimePistonPegajoso) : Item.getItemFromBlock(RubyCraft.SlimePistonNormal);
    }
}