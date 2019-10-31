package Eventos.Verano.Generacion;

import java.util.Random;

import Eventos.Verano.Entidades.Elemental_de_Agua_Guardian;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class Generar_Enemigos_por_Mineo {
	
	@SubscribeEvent
	public void EnemigosAleatorios(HarvestDropsEvent event)
	{
		if (event.harvester != null)
		{
			if(event.block == Blocks.stone || event.block == Blocks.cobblestone)
			{
				int prob;
				Random rand = new Random();
				
				int x = event.x;
				int y = event.y;
				int z = event.z;
				
				prob = rand.nextInt(100);
				
				if (prob >= 70)
				{
					Entity mob = new Elemental_de_Agua_Guardian(event.harvester.worldObj);
					mob.setPosition(x, y, z);
					
					if (event.world.getBlock(x, y, z + 1) != Blocks.air ||
						event.world.getBlock(x, y, z - 1) != Blocks.air ||
						event.world.getBlock(x + 1, y, z) != Blocks.air ||
						event.world.getBlock(x - 1, y, z) != Blocks.air ||
						event.world.getBlock(x, y + 1, z) != Blocks.air ||
						event.world.getBlock(x, y - 1, z) != Blocks.air )
					{
						event.world.setBlockToAir(x, y, z + 1);
						event.world.setBlockToAir(x, y + 1, z + 1);
						event.world.setBlockToAir(x, y + 2, z + 1);
						
						event.world.setBlockToAir(x, y + 1, z + 2);
						
						event.world.setBlockToAir(x + 1, y, z + 1);
						event.world.setBlockToAir(x + 1, y + 1, z + 1);
						event.world.setBlockToAir(x + 1, y + 2, z + 1);
						
						event.world.setBlockToAir(x - 1, y, z + 1);
						event.world.setBlockToAir(x - 1, y + 1, z + 1);
						event.world.setBlockToAir(x - 1, y + 2, z + 1);
						
						event.world.setBlockToAir(x, y, z - 1);
						event.world.setBlockToAir(x, y + 1, z - 1);
						event.world.setBlockToAir(x, y + 2, z - 1);
						
						event.world.setBlockToAir(x, y + 1, z - 2);
						
						event.world.setBlockToAir(x + 1, y, z - 1);
						event.world.setBlockToAir(x + 1, y + 1, z - 1);
						event.world.setBlockToAir(x + 1, y + 2, z - 1);
						
						event.world.setBlockToAir(x - 1, y, z - 1);
						event.world.setBlockToAir(x - 1, y + 1, z - 1);
						event.world.setBlockToAir(x - 1, y + 2, z - 1);
						
						event.world.setBlockToAir(x + 1, y, z);
						event.world.setBlockToAir(x + 1, y + 1, z);
						event.world.setBlockToAir(x + 1, y + 2, z);
						
						event.world.setBlockToAir(x + 2, y + 1, z);
						
						event.world.setBlockToAir(x - 1, y, z);
						event.world.setBlockToAir(x - 1, y + 1, z);
						event.world.setBlockToAir(x - 1, y + 2, z);
						
						event.world.setBlockToAir(x - 2, y + 2, z);
						
						event.world.setBlockToAir(x, y + 1, z);
						event.world.setBlockToAir(x, y + 2, z);
					}
					
					event.harvester.worldObj.spawnEntityInWorld(mob);
				}
			}
		}
	}
}
