package RubyCraft.Maquinas;


import RubyCraft.Escaleras_Principal;
import RubyCraft.RubyCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Transformador_de_Losas_a_Bloques extends Block {
	
	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon Transformador_de_Losas_a_BloquesArriba;
	
	public Transformador_de_Losas_a_Bloques() {
		super(Material.wood);
		this.setHardness(3.5F).setResistance(0.5F).setCreativeTab(RubyCraft.Rubycrafttab);
		this.setStepSound(this.soundTypeWood);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		return side == 1 ? this.Transformador_de_Losas_a_BloquesArriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		if(RubyCraft.Navidad == false){
		this.Transformador_de_Losas_a_BloquesArriba = iconRegister.registerIcon(RubyCraft.modid + ":" + "Transformador_de_Losas_a_Bloques_arriba");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "Transformador_de_Losas_a_Bloques");
		}else if(RubyCraft.Navidad == true){
			this.Transformador_de_Losas_a_BloquesArriba = iconRegister.registerIcon(RubyCraft.modid + ":" + "Navidad/Transformador_de_Losas_a_Bloques_arriba");
			this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "Navidad/Transformador_de_Losas_a_Bloques");
		}
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if (!player.isSneaking()){
			//Capa 0
			if(world.getBlock(x , y, z + 1) == RubyCraft.Andesita_Pulida){
            	  if(world.getBlock(x - 1, y, z + 1) == Blocks.furnace){
            		  if(world.getBlock(x - 2, y, z + 1) == RubyCraft.Andesita_Pulida){
            			  if(world.getBlock(x - 2, y, z) == Blocks.crafting_table){
            				  if(world.getBlock(x - 2, y, z - 1) == RubyCraft.Andesita_Pulida){
            					  if(world.getBlock(x - 1, y, z - 1) == Blocks.crafting_table){
            						  if(world.getBlock(x, y, z - 1) == RubyCraft.Andesita_Pulida){
            							  if(world.getBlock(x - 1, y, z) == Blocks.torch){
            								  //Capa 1
            								 if(world.getBlock(x, y + 1, z) == Blocks.stone_slab){
            									 if(world.getBlock(x, y + 1, z + 1) == RubyCraft.Andesita_Pulida){
            										 if(world.getBlock(x - 1, y + 1, z + 1) == Blocks.stone_slab){
            											 if(world.getBlock(x - 2, y + 1, z - 1) == RubyCraft.Andesita_Pulida){
            												 if(world.getBlock(x - 2, y + 1, z) == Blocks.stone_slab){
            													 if(world.getBlock(x - 2, y + 1, z - 1) == RubyCraft.Andesita_Pulida){
            														 if(world.getBlock(x - 1, y + 1, z - 1) == Blocks.stone_slab){
            															 if(world.getBlock(x, y + 1, z - 1) == RubyCraft.Andesita_Pulida){
            																 //Capa 2
            																if(world.getBlock(x, y + 2, z) == RubyCraft.Diorita_Pulida){
            																	if(world.getBlock(x, y + 2, z + 1) == RubyCraft.Andesita_Pulida){
            																		if(world.getBlock(x - 1, y + 2, z + 1) == RubyCraft.Diorita_Pulida){
            																			if(world.getBlock(x - 2, y + 2, z - 1) == RubyCraft.Andesita_Pulida){
            																				if(world.getBlock(x - 2, y + 2, z) == RubyCraft.Diorita_Pulida){
            																					if(world.getBlock(x - 2, y + 2, z - 1) == RubyCraft.Andesita_Pulida){
            																						if(world.getBlock(x - 1, y + 2, z - 1) == RubyCraft.Diorita_Pulida){
            																							if(world.getBlock(x, y + 2, z - 1) == RubyCraft.Andesita_Pulida){
            																								//Capa 3
            																								if(world.getBlock(x, y + 3, z) == Escaleras_Principal.Escalera_de_Granito_Pulido){
            																									if(world.getBlock(x, y + 3, z + 1) == Blocks.stone_slab){
            																										if(world.getBlock(x - 1, y + 3, z + 1) == Escaleras_Principal.Escalera_de_Granito_Pulido){
            																											if(world.getBlock(x - 2, y + 3, z + 1) == Blocks.stone_slab){
            																												if(world.getBlock(x - 2, y + 3, z) == Escaleras_Principal.Escalera_de_Granito_Pulido){
            																													if(world.getBlock(x - 2, y + 3, z - 1) == Blocks.stone_slab){
            																														if(world.getBlock(x - 1, y + 3, z + 1) == Escaleras_Principal.Escalera_de_Granito_Pulido){
            																															if(world.getBlock(x, y + 3, z - 1) == Blocks.stone_slab){
            																																//Capa 4
            																																if(world.getBlock(x - 1, y + 4, z) == Blocks.stone_slab){
            																																	Abrir_Gui(player, world, x, y, z);
            																															}else{
            																																Estructura_error(player, world);
            																															}
            																														}else{
            																															Estructura_error(player, world);
            																														}
            																													}else{
            																														Estructura_error(player, world);
            																													}
            																												}else{
            																													Estructura_error(player, world);
            																												}
            																											}else{
            																												Estructura_error(player, world);
            																											}
            																										}else{
            																											Estructura_error(player, world);
            																										}
            																									}else{
            																										Estructura_error(player, world);
            																									}
            																								}else{
            																									Estructura_error(player, world);
            																								}
            																							}else{
            																								Estructura_error(player, world);
            																							}
            																						}else{
            																							Estructura_error(player, world);
            																						}
            																					}else{
            																						Estructura_error(player, world);	
            																					}
            																				}else{
            																					Estructura_error(player, world);
            																				}
            																			}else{
            																				Estructura_error(player, world);
            																			}
            																		}else{
            																			Estructura_error(player, world);
            																		}
            																	}else{
            																		Estructura_error(player, world);
            																	}
            																}else{
            																	Estructura_error(player, world);
            																}
            															 }else{
            																 Estructura_error(player, world); 
            															 }
            														 }else{
            															 Estructura_error(player, world);
            														 }
            													 }else{
            														 Estructura_error(player, world);
            													 }
            												 }else{
            													 Estructura_error(player, world);
            												 }
            											 }else{
            												 Estructura_error(player, world);
            											 }
            												 
            											 }else{
            												 Estructura_error(player, world);
            											 }
            										 }else{
            											 Estructura_error(player, world);
            										 }
            									 }else{
            										 Estructura_error(player, world); 
            									 }
            								 }else{
            									 Estructura_error(player, world);
            								 }
            							  }else{
            								  Estructura_error(player, world); 
            							  }
            						  }else{
            							  Estructura_error(player, world);
            						  }
            					  }else{
            						  Estructura_error(player, world);
            					  }
            				  }else{
            					  Estructura_error(player, world); 
            				  }
            			  }else{
            				  Estructura_error(player, world); 
            			  }
            		  }else{
            			  Estructura_error(player, world); 
            		  }
            	  }else{
            		  Estructura_error(player, world);
            	  }
               }else{
            	   Estructura_error(player, world); 
               }
		}else if(world.isRemote && player.isSneaking()){
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Info La Estructura esta en la Wiki"));
		}
		return true;
	}
	
	public static void Abrir_Gui(EntityPlayer player, World world, int x ,int y, int z){
		player.openGui(RubyCraft.instance, RubyCraft.guiIDTransformadorLosisl, world, x, y, z);

	}
	
	public static void Estructura_error(EntityPlayer player, World world){
		if(world.isRemote) {
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Estructura Incorrecta"));
		}
	}
	
}
