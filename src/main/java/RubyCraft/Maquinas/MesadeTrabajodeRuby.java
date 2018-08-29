package RubyCraft.Maquinas;


import RubyCraft.RubyCraft;
import RubyCraft.TileEntity.TileEntityMesa_de_Ruby;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MesadeTrabajodeRuby extends BlockContainer{
    
	/** Addons Pueden Modificar
	    Addons Can Modify
	 **/
	public static int Troleada = 0;
	public static int Troleada_Valor = 5;
	public static Block Bloque_para_poner_en_troleada = RubyCraft.Bloque_de_Herobrine;
	public static int Dia = 14;
	public static int Mes = 7;
	public static boolean Dia_de_Herobrine = false;
	
	public static Block blockID;
	@SideOnly(Side.CLIENT)
	private IIcon MesadeTrabajodeRubyArriba;
	
	
	public MesadeTrabajodeRuby() {
		super(Material.wood);
		this.setHardness(3.5F).setResistance(0.5F).setCreativeTab(RubyCraft.Rubycrafttab);
		this.setStepSound(this.soundTypeWood);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata){
		 return side == 1 ? this.MesadeTrabajodeRubyArriba : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.MesadeTrabajodeRubyArriba = iconRegister.registerIcon(RubyCraft.modid + ":" + "TileEntitys/Mesa_De_Ruby/Particulas_MesadeRuby");
		this.blockIcon = iconRegister.registerIcon(RubyCraft.modid + ":" + "TileEntitys/Mesa_De_Ruby/Particulas_MesadeRuby");
		
	}
	
	@Override
	public int getRenderType() {	
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	public boolean isNormalCube() {
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TileEntityMesa_de_Ruby();
	}
	
	 
		public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		if (!player.isSneaking()){
			if(Dia_de_Herobrine && !(Troleada == Troleada_Valor)){
				Troleada= Troleada +1;
				player.openGui(RubyCraft.instance, RubyCraft.guiIDMesadeTrabajodeRuby, world, x, y, z);
			     }else if(Dia_de_Herobrine && Troleada == Troleada_Valor || RubyCraft.VersionTrol){
			    	    world.setBlock(x, y, z, Bloque_para_poner_en_troleada);
						Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + Minecraft.getMinecraft().thePlayer.getDisplayName() + " Has Sido Troleado" + EnumChatFormatting.GOLD + " Pulsa Unas Cuantas " + EnumChatFormatting.GOLD + "veces y veras Esto paso porque en este dia se descubrio a " + EnumChatFormatting.GOLD + "herobrine"));
						Troleada = 0;
			     }else if(!RubyCraft.VersionTrol && !Dia_de_Herobrine){
			    	 
			    	 player.openGui(RubyCraft.instance, RubyCraft.guiIDMesadeTrabajodeRuby, world, x, y, z);
			    	 
			     }
			}
			return true;
	}
	
}
