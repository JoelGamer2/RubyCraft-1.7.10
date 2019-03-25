package RubyCraft.Bases;

import org.lwjgl.opengl.GL11;

import RubyCraft.RubyCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;

public class texturabotones extends GuiButton
{
	public ResourceLocation buttonTexture;

	public texturabotones(int id, int width, int height, String displayString, String textureName, int ancho, int alto) 
	{
		super(id, width, height, displayString);
		buttonTexture = new ResourceLocation(RubyCraft.modid + ":textures/gui/" + textureName);
		this.width=ancho;
		this.height=alto;
	}

	
	
	@Override
	public void drawButton(Minecraft minecraft, int xCoord, int yCoord)
	{
        if (this.visible)
        {
            FontRenderer fontrenderer = minecraft.fontRenderer;
            minecraft.getTextureManager().bindTexture(buttonTexture);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            
            this.field_146123_n = xCoord >= this.xPosition && yCoord >= this.yPosition && xCoord < this.xPosition + this.width && yCoord < this.yPosition + this.height;
            //Ésta linea verifica la posición del ratón para hacer el cambio de textura del botón, creando un recuadro donde, si el ratón se encuentra dentro, el botón cambia de textura.
            //Funciona con 4 parámetros int (int && int && int && int). La función es (punto inicial X && punto inicial Y && punto final X && punto final Y)
            
            int k = this.getHoverState(this.field_146123_n);
            
            GL11.glEnable(GL11.GL_BLEND);
            OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            
            this.drawTexturedModalRect(this.xPosition,     //Posición en X de la textura
            						   this.yPosition,     //Posición en Y de la textura
            /**Esta linea renderiza**/ 0,                  //Determina el punto en X a la que coge la textura.
            /**la parte izquierda**/   46 + k * 20,        //Determina la altura a la que coge la textura. Cuando el ratón activa el botón se inicia la variable k para cambiar la textura del botón.
            /**del botón**/			   this.width / 2,     //Tamaño en X de la textura
            						   this.height);       //Tamaño en Y de la textura
            
            this.drawTexturedModalRect(this.xPosition + this.width / 2,    //Posición en X de la textura
            						   this.yPosition,                     //Posición en Y de la textura
            /**Esta linea renderiza**/ 200 - this.width / 2,               //Determina el punto en X a la que coge la textura.
            /**la parte derecha**/     46 + k * 20,                        //Determina la altura a la que coge la textura. Cuando el ratón activa el botón se inicia la variable k para cambiar la textura del botón.
            /**del botón**/			   this.width / 2,                     //Tamaño en X de la textura
            						   this.height);                       //Tamaño en Y de la textura
            
            this.mouseDragged(minecraft, xCoord, yCoord);
            
            int l = 14737632;

            if (packedFGColour != 0)
            {
                l = packedFGColour;
            }
            else if (!this.enabled)
            {
            	l = 10526880;
            }
            else if (this.field_146123_n)
            {
            	l = 16777120;  //Color de las letras al activar el botón
            }

            this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.width / 2, (this.yPosition + (this.height / 2))-4, l);
        }
    }
}
