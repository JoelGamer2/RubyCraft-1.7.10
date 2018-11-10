package RubyCraft.TileEntity.Render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import RubyCraft.RubyCraft;
import RubyCraft.TileEntity.Cofre_de_Ruby;
import RubyCraft.TileEntity.TileEntityCofredeRuby;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelLargeChest;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class CofredeRubyRender extends TileEntitySpecialRenderer
{
    private static final ResourceLocation CofreLargo = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Cofre_De_Ruby/Cofre_de_Ruby_Largo.png");
    private static final ResourceLocation CofreLargoNavidad = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Cofre_De_Ruby/CofreLargoNavidad.png");
    private static final ResourceLocation CofreNormal = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Cofre_De_Ruby/Cofre_de_Ruby.png");
    private static final ResourceLocation CofreNormalNavidad = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Cofre_De_Ruby/CofreNormalNavidad.png");
    private ModelChest ModeloNormal = new ModelChest();
    private ModelChest ModeloLargo = new ModelLargeChest();
   
    public CofredeRubyRender()
    {
    	
	 
   }
    
    public void renderTileEntityAt(TileEntityCofredeRuby p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_)
    {
        int i;

        if (!p_147500_1_.hasWorldObj())
        {
            i = 0;
        }
        else
        {
            Block block = p_147500_1_.getBlockType();
            i = p_147500_1_.getBlockMetadata();

            if (block instanceof Cofre_de_Ruby && i == 0)
            {
                try
                {
                ((Cofre_de_Ruby)block).func_149954_e(p_147500_1_.getWorldObj(), p_147500_1_.xCoord, p_147500_1_.yCoord, p_147500_1_.zCoord);
                }
                catch (ClassCastException e)
                {
                    FMLLog.severe("Attempted to render a chest at %d,  %d, %d that was not a chest", p_147500_1_.xCoord, p_147500_1_.yCoord, p_147500_1_.zCoord);
                }
                i = p_147500_1_.getBlockMetadata();
            }

            p_147500_1_.checkForAdjacentChests();
        }

        if (p_147500_1_.adjacentChestZNeg == null && p_147500_1_.adjacentChestXNeg == null)
        {
            ModelChest modelchest;

            if (p_147500_1_.adjacentChestXPos == null && p_147500_1_.adjacentChestZPos == null)
            {
                modelchest = this.ModeloNormal;          
                if(!RubyCraft.Navidad){
                    this.bindTexture(CofreNormal);
                }else if(RubyCraft.Navidad){
                	this.bindTexture(CofreNormalNavidad);
                }
            }
            else
            {
                modelchest = this.ModeloLargo;                  
                if(!RubyCraft.Navidad){
                    this.bindTexture(CofreLargo);
                }else if(RubyCraft.Navidad){
                	this.bindTexture(CofreLargoNavidad);
                }
                
            }

            GL11.glPushMatrix();
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslatef((float)p_147500_2_, (float)p_147500_4_ + 1.0F, (float)p_147500_6_ + 1.0F);
            GL11.glScalef(1.0F, -1.0F, -1.0F);
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            short short1 = 0;

            if (i == 2)
            {
                short1 = 180;
            }

            if (i == 3)
            {
                short1 = 0;
            }

            if (i == 4)
            {
                short1 = 90;
            }

            if (i == 5)
            {
                short1 = -90;
            }

            if (i == 2 && p_147500_1_.adjacentChestXPos != null)
            {
                GL11.glTranslatef(1.0F, 0.0F, 0.0F);
            }

            if (i == 5 && p_147500_1_.adjacentChestZPos != null)
            {
                GL11.glTranslatef(0.0F, 0.0F, -1.0F);
            }

            GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            float f1 = p_147500_1_.prevLidAngle + (p_147500_1_.lidAngle - p_147500_1_.prevLidAngle) * p_147500_8_;
            float f2;

            if (p_147500_1_.adjacentChestZNeg != null)
            {
                f2 = p_147500_1_.adjacentChestZNeg.prevLidAngle + (p_147500_1_.adjacentChestZNeg.lidAngle - p_147500_1_.adjacentChestZNeg.prevLidAngle) * p_147500_8_;

                if (f2 > f1)
                {
                    f1 = f2;
                }
            }

            if (p_147500_1_.adjacentChestXNeg != null)
            {
                f2 = p_147500_1_.adjacentChestXNeg.prevLidAngle + (p_147500_1_.adjacentChestXNeg.lidAngle - p_147500_1_.adjacentChestXNeg.prevLidAngle) * p_147500_8_;

                if (f2 > f1)
                {
                    f1 = f2;
                }
            }

            f1 = 1.0F - f1;
            f1 = 1.0F - f1 * f1 * f1;
            modelchest.chestLid.rotateAngleX = -(f1 * (float)Math.PI / 2.0F);
            modelchest.renderAll();
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_)
    {
        this.renderTileEntityAt((TileEntityCofredeRuby)p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
    }
}