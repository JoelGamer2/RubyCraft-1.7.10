package RubyCraft.Bloques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import RubyCraft.RubyCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockSnow;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class PistonSlimeBase extends BlockPistonBase{	
	private boolean isSticky;
	private List<Block> pushedBlockList = new ArrayList<Block>();
	private List<int[]> pushedBlockData = new ArrayList<int[]>();
	
	public PistonSlimeBase(boolean isSticky) {
		super(isSticky);
		this.isSticky=isSticky;
	}
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack){
        world.setBlockMetadataWithNotify(x, y, z, determineOrientation(world, x, y, z, entity), 2);
        if(!world.isRemote){
            this.updatePistonState(world, x, y, z);
        }
    }

	@Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block){
        if(!world.isRemote){
            this.updatePistonState(world, x, y, z);
        }
    }
    
	private boolean isIndirectlyPowered(World world, int x, int y, int z, int metadata){
		return metadata != 0 && world.getIndirectPowerOutput(x, y - 1, z, 0) ? true : (metadata != 1 && world.getIndirectPowerOutput(x, y + 1, z, 1) ? true : (metadata != 2 && world.getIndirectPowerOutput(x, y, z - 1, 2) ? true : (metadata != 3 && world.getIndirectPowerOutput(x, y, z + 1, 3) ? true : (metadata != 5 && world.getIndirectPowerOutput(x + 1, y, z, 5) ? true : (metadata != 4 && world.getIndirectPowerOutput(x - 1, y, z, 4) ? true : (world.getIndirectPowerOutput(x, y, z, 0) ? true : (world.getIndirectPowerOutput(x, y + 2, z, 1) ? true : (world.getIndirectPowerOutput(x, y + 1, z - 1, 2) ? true : (world.getIndirectPowerOutput(x, y + 1, z + 1, 3) ? true : (world.getIndirectPowerOutput(x - 1, y + 1, z, 4) ? true : world.getIndirectPowerOutput(x + 1, y + 1, z, 5)))))))))));
	}
	

    /**
     * Called during changes to see if an update block event needs to go to the server.
     * Actual update is handled in onBlockEventReceived.
     * @param world
     * @param x
     * @param y
     * @param z
     */
    private void updatePistonState(World world, int x, int y, int z){
        int pistonMetadata = world.getBlockMetadata(x, y, z);
        int side = getPistonOrientation(pistonMetadata);
        boolean isPowered = this.isIndirectlyPowered(world, x, y, z, side);
        if(isPowered && !isExtended(pistonMetadata)){
        	clearBlockLists();
            if(getPushableBlocks(world, x+Facing.offsetsXForSide[side], y+Facing.offsetsYForSide[side], z+Facing.offsetsZForSide[side], Facing.oppositeSide[side], side, x, y, z)<=12){
                world.addBlockEvent(x, y, z, this, 1, side); //push piston
            }
        }else if(!isPowered && isExtended(pistonMetadata)){
        	if(this.isSticky){
        		clearBlockLists();
        		if(getPushableBlocks(world, x+Facing.offsetsXForSide[side]*2, y+Facing.offsetsYForSide[side]*2, z+Facing.offsetsZForSide[side]*2, Facing.oppositeSide[side], Facing.oppositeSide[side], x+Facing.offsetsXForSide[side], y+Facing.offsetsYForSide[side], z+Facing.offsetsZForSide[side])>12){
        			return;
        		}
        	}
        	world.addBlockEvent(x, y, z, this, 0, side); //pull piston
        }
    }
	

	
	@Override
	public boolean onBlockEventReceived(World world, int x, int y, int z, int extend, int side){
        if(!world.isRemote){
            boolean hasPower = this.isIndirectlyPowered(world, x, y, z, side);
            if(hasPower && extend == 0){
                world.setBlockMetadataWithNotify(x, y, z, side | 8, 2);
                return false;
            }
            if(!hasPower && extend == 1){
                return false;
            }
        }
        
        if(extend == 0){
        	TileEntity tileentity = world.getTileEntity(x + Facing.offsetsXForSide[side], y + Facing.offsetsYForSide[side], z + Facing.offsetsZForSide[side]);
            if(tileentity instanceof TileEntityPiston){
                ((TileEntityPiston)tileentity).clearPistonTileEntity();
            }
            world.setBlock(x, y, z, Blocks.piston_extension, side, 3);
            world.setTileEntity(x, y, z, BlockPistonMoving.getTileEntity(this, side, side, false, true));
        	if(this.isSticky){
        		clearBlockLists();
        		if(getPushableBlocks(world, x+Facing.offsetsXForSide[side]*2, y+Facing.offsetsYForSide[side]*2, z+Facing.offsetsZForSide[side]*2, Facing.oppositeSide[side], Facing.oppositeSide[side], x+Facing.offsetsXForSide[side], y+Facing.offsetsYForSide[side], z+Facing.offsetsZForSide[side]) == 0){
        			world.setBlockToAir(x + Facing.offsetsXForSide[side], y + Facing.offsetsYForSide[side], z + Facing.offsetsZForSide[side]);
        		}else{
                   pushBlocks(world, Facing.oppositeSide[side], false);
        		}
        	}
            world.playSoundEffect((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, "tile.piston.in", 0.5F, world.rand.nextFloat() * 0.15F + 0.6F);
            
        }else if(extend == 1){
        	clearBlockLists();
        	getPushableBlocks(world, x+Facing.offsetsXForSide[side], y+Facing.offsetsYForSide[side], z+Facing.offsetsZForSide[side], Facing.oppositeSide[side], side, x, y, z);
    		pushBlocks(world, side, true);
			world.setBlock(x + Facing.offsetsXForSide[side], y + Facing.offsetsYForSide[side], z + Facing.offsetsZForSide[side], Blocks.piston_extension, side | (this.isSticky ? 8 : 0), 4);
            world.setTileEntity(x + Facing.offsetsXForSide[side], y + Facing.offsetsYForSide[side], z + Facing.offsetsZForSide[side], BlockPistonMoving.getTileEntity(RubyCraft.SlimePistonCabeza, side | (this.isSticky ? 8 : 0), side, true, false));
            //world.notifyBlocksOfNeighborChange(x + Facing.offsetsXForSide[side], y + Facing.offsetsYForSide[side], z + Facing.offsetsZForSide[side], RubyCraft.slimePistonHead);
            world.setBlockMetadataWithNotify(x, y, z, side | 8, 2);
            world.playSoundEffect((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, "tile.piston.out", 0.5F, world.rand.nextFloat() * 0.25F + 0.6F);
        }
        return true;
    }  

    /**
     * Recursive, internal method to calculate the blocks that constitute a piston system.
     * This includes all attached slime blocks.  It populates the pushedBlockCoordinate list and pushingBlockCoordinate list,
     * so use those to determine what blocks need pushing/ are pushers. 
     * @param world The current world
     * @param x X-coordinate of push chain
     * @param y Y-coordinate of push chain
     * @param z Z-coordinate of push chain
     * @param ignoreSide Side to ignore looking for blocks.  Used when encountering a slimeblock.
     * @param side Direction piston or block is facing, determines extension direction
     * @return The number of blocks that will be pushed by this piston system.
     */
    private int getPushableBlocks(World world, int x, int y, int z, int ignoreSide, final int side, final int pistonX, final int pistonY, final int pistonZ){    	
    	Block pushedBlock=world.getBlock(x, y, z);
    	int pushedBlockX=x;
        int pushedBlockY=y;
        int pushedBlockZ=z;
        int pushedBlockMeta=world.getBlockMetadata(pushedBlockX, pushedBlockY, pushedBlockZ);
        int blocksPushed = 0;
        
        while(blocksPushed < 13){   
        	if(pushedBlock.isAir(world, pushedBlockX, pushedBlockY, pushedBlockZ)){
            	return blocksPushed;
            }else if((pushedBlockY == 0 && side == 0) || (pushedBlockY >= world.getHeight() - 1 && side == 1)){
                return 13;
            }else if(!canPushBlock(pushedBlock, world, pushedBlockX, pushedBlockY, pushedBlockZ, side, side)){
            	if(pushedBlockX==pistonX && pushedBlockY==pistonY && pushedBlockZ==pistonZ){
            		return blocksPushed;
            	}else{
            		return 13;
            	}
            }
        	
        	int[] pushedBlockCoords = new int[] {pushedBlockX, pushedBlockY, pushedBlockZ, pushedBlockMeta};
        	for(int i=0; i<pushedBlockData.size(); ++i){
        		if(Arrays.equals(pushedBlockData.get(i), pushedBlockCoords)){
        			return blocksPushed;
        		}
        	}
        	
            ++blocksPushed;
            pushedBlockList.add(pushedBlock);
            pushedBlockData.add(pushedBlockCoords);
            
            if(pushedBlock.equals(RubyCraft.Bloque_de_Slime)){
        		for(int i=0; i<6; ++i){
        			if(i != side && i != ignoreSide){
	        			int attachedX=pushedBlockX+Facing.offsetsXForSide[i];
	    				int attachedY=pushedBlockY+Facing.offsetsYForSide[i];
	    				int attachedZ=pushedBlockZ+Facing.offsetsZForSide[i];
	    				int attachedMeta=world.getBlockMetadata(attachedX, attachedY, attachedZ);
	    				Block attachedBlock=world.getBlock(attachedX, attachedY, attachedZ);
	    				
	    				if(!(attachedX==pistonX && attachedY==pistonY && attachedZ==pistonZ)){
	    					if(canPushBlock(attachedBlock, world, attachedX, attachedY, attachedZ, i, side)){
	    						if(attachedBlock.getMobilityFlag() != 1){
	    							blocksPushed += getPushableBlocks(world, attachedX, attachedY, attachedZ, Facing.oppositeSide[i], side, pistonX, pistonY, pistonZ);
	    						}
	    					}
	    				}
        			}
        		}
            }
            
        	pushedBlockX += Facing.offsetsXForSide[side];
            pushedBlockY += Facing.offsetsYForSide[side];
            pushedBlockZ += Facing.offsetsZForSide[side];
            pushedBlockMeta=world.getBlockMetadata(pushedBlockX, pushedBlockY, pushedBlockZ);
            pushedBlock = world.getBlock(pushedBlockX, pushedBlockY, pushedBlockZ);
        }
        return blocksPushed;
    }

    /**
     * Pushes all blocks in the pushedBlocks list and pushingBlocks list.
     * Also launches entities if needed
     * @param world World
     * @param side Side the block is moving towards.
     * @param extending Whether the piston is extending or retracting
     */
    private void pushBlocks(World world, int side, boolean extending){
    	int oldBlockX;
    	int oldBlockY;
    	int oldBlockZ;
    	
    	boolean needsPusher;
    	int blockX;
    	int blockY;
    	int blockZ;
    	int blockMeta;
    	int[] rearCoords;
    	Block block;
    	List<int[]> removedBlockCoords = new ArrayList<int[]>();
    	List<Entity> launchedEntityList = new ArrayList<Entity>();
  
    	for(int i=0; i<pushedBlockList.size(); ++i){
    		needsPusher = true;
    		block = pushedBlockList.get(i);  
    		blockX = pushedBlockData.get(i)[0];
    		blockY = pushedBlockData.get(i)[1];
    		blockZ = pushedBlockData.get(i)[2];
    		blockMeta = pushedBlockData.get(i)[3];
    		rearCoords = new int[] {blockX - Facing.offsetsXForSide[side], blockY - Facing.offsetsYForSide[side], blockZ - Facing.offsetsZForSide[side]};
    		
    		for(int j=0; j<pushedBlockData.size(); ++j){
    			if(rearCoords[0] == pushedBlockData.get(j)[0] && rearCoords[1] == pushedBlockData.get(j)[1] && rearCoords[2] == pushedBlockData.get(j)[2]){
        			needsPusher=false;
        		}
    		}
    		if(needsPusher){
	    		removedBlockCoords.add(pushedBlockData.get(i));
	    	}
    		
    		blockX += Facing.offsetsXForSide[side];
    		blockY += Facing.offsetsYForSide[side];
    		blockZ += Facing.offsetsZForSide[side];
    		if(block.getMobilityFlag() == 1){
    			float chance = block instanceof BlockSnow ? -1.0f : 1.0f;
    			block.dropBlockAsItemWithChance(world, blockX, blockY, blockZ, blockMeta, chance, 0);
    			world.setBlockToAir(blockX, blockY, blockZ);
    		}else{
	    		world.setBlock(blockX, blockY, blockZ, Blocks.piston_extension, blockMeta, 4);
	            world.setTileEntity(blockX, blockY, blockZ, BlockPistonMoving.getTileEntity(block, blockMeta, side, true, false));
	            world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, block);
    		}

            if(extending && block.equals(RubyCraft.Bloque_de_Slime)){
            	Iterator entityIterator=world.getEntitiesWithinAABBExcludingEntity(null, this.getCollisionBoundingBoxFromPool(world, blockX, blockY, blockZ)).iterator();
            	while(entityIterator.hasNext()){
            		Entity entity = (Entity) entityIterator.next();
            		if(!launchedEntityList.contains(entity)){
            			launchedEntityList.add(entity);
            		}
            	}
            }
    	}
    	
    	for(Entity entity : launchedEntityList){
    		entity.motionX += Facing.offsetsXForSide[side]*1.1F;
    		entity.motionY += Facing.offsetsYForSide[side]*1.1F;
    		entity.motionZ += Facing.offsetsZForSide[side]*1.1F;
    	}
    	
    	for(int[] blockCoords : removedBlockCoords){
    		world.setBlockToAir(blockCoords[0], blockCoords[1], blockCoords[2]);
    		world.notifyBlocksOfNeighborChange(blockCoords[0], blockCoords[1], blockCoords[2], Blocks.air);
    	}
    }
    
    private boolean canPushBlock(Block block, World world, int x, int y, int z, int pushedSide, int sideToPushTo){
        if(block == Blocks.obsidian){
            return false;
        }else{
            if(block != RubyCraft.SlimePistonNormal && block != RubyCraft.SlimePistonPegajoso){
                if(block.getBlockHardness(world, x, y, z) == -1.0F){
                    return false;
                }else if(block.getMobilityFlag() == 2){
                    return false;
                }else if(block.getMobilityFlag() == 1){
                    return pushedSide == sideToPushTo || pushedSide == Facing.oppositeSide[sideToPushTo];
                }
            }else{
            	return !isExtended(world.getBlockMetadata(x, y, z));
            }            
            return !(world.getBlock(x, y, z).hasTileEntity(world.getBlockMetadata(x, y, z)));
        }
    }
    
    private void clearBlockLists(){
    	pushedBlockList.clear();
    	pushedBlockData.clear();
    }
}
