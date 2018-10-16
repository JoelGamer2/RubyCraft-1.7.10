package RubyCraft.Integracion;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class Crafteos_InteGracion {

	public static void CrafteosInteGracionIniciar(){
		
		Crafteos_InteGracion.IntegracionMesadeRuby();
		Crafteos_InteGracion.IntegracionMesadeZafiro();
		Crafteos_InteGracion.IntegracionTransformadordeLosasaBloques();
		Crafteos_InteGracion.CrafteoMesaNormal();
		
		}
		public static void CrafteoMesaNormal(){
			
		if(RubyCraft.modChecker.isOriginsLoaded) {
				
				Block OriginsBlock = GameRegistry.findBlock("or", "origins_block");
				
				GameRegistry.addRecipe(new ItemStack(RubyCraft.Bloquederuby, 1), new Object[] {"ooo","ooo","ooo",'o',OriginsBlock});
			}
				
				
		  }	
	
	public static void IntegracionMesadeRuby(){
			
		
		
		
	}
	
	public static void IntegracionMesadeZafiro(){
		
		
		
	}
	
public static void IntegracionTransformadordeLosasaBloques(){
		
	
   }
}