package RubyCraft.Maquinas;


import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Mesa_De_Conjuraciones extends Block {
	
	public ItemStack stack;
	
	public Mesa_De_Conjuraciones(Material material) {
		super(material);
	
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){	
		if(player.isSneaking() && RubyCraft.Dia_de_Los_Inocentes && world.isRemote){
			player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + player.getDisplayName() + EnumChatFormatting.RED + " Ten cuidado Hoy es el dia de los Santos inocentes Hoy es el dia donde cosas de este mod cambiaran para hacerte inocentadas y esto ya estaba previsto xD espero que te lo pases muy bien el dia de hoy"));

			
		  }else if(!player.isSneaking()){
		
			
			if(player.getCurrentEquippedItem() != null &&  player.getCurrentEquippedItem().getItem() == RubyCraft.botasdeRuby && player.inventory.hasItem(Items.sugar)) {
				player.inventory.consumeInventoryItem(Items.sugar);
		        player.inventory.consumeInventoryItem(RubyCraft.botasdeRuby);
				stack = new ItemStack(RubyCraft.botasdeRuby);
				stack.addEnchantment(RubyCraft.BotasdeVelocidad, 3);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
		   }else if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == RubyCraft.botasdeZafiro && player.inventory.hasItem(Items.sugar)){
				player.inventory.consumeInventoryItem(Items.sugar);
				player.inventory.consumeInventoryItem(RubyCraft.botasdeZafiro);
				stack = new ItemStack(RubyCraft.botasdeZafiro);
				stack.addEnchantment(RubyCraft.BotasdeVelocidad, 5);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if(player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.botasdeUranio && player.inventory.hasItem(Items.sugar)){
				player.inventory.consumeInventoryItem(Items.sugar);
				player.inventory.consumeInventoryItem(RubyCraft.botasdeUranio);
				stack = new ItemStack(RubyCraft.botasdeUranio);
				stack.addEnchantment(RubyCraft.BotasdeVelocidad, 1);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if(player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.PantacasdeRuby && player.inventory.hasItem(Items.golden_apple)){
				player.inventory.consumeInventoryItem(Items.golden_apple);
				player.inventory.consumeInventoryItem(RubyCraft.PantacasdeRuby);
				stack = new ItemStack(RubyCraft.PantacasdeRuby);
				stack.addEnchantment(RubyCraft.Grebas_de_Regeneracion, 2);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if(player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.PantacasdeZafiro && player.inventory.hasItem(Items.golden_apple)){
				player.inventory.consumeInventoryItem(Items.golden_apple);
				player.inventory.consumeInventoryItem(RubyCraft.PantacasdeZafiro);
				stack = new ItemStack(RubyCraft.PantacasdeZafiro);
				stack.addEnchantment(RubyCraft.Grebas_de_Regeneracion, 2);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if(player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.PantacasdeUranio && player.inventory.hasItem(Items.golden_apple)){
				player.inventory.consumeInventoryItem(Items.golden_apple);
				player.inventory.consumeInventoryItem(RubyCraft.PantacasdeUranio);
				stack = new ItemStack(RubyCraft.PantacasdeUranio);
				stack.addEnchantment(RubyCraft.Grebas_de_Regeneracion, 1);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);	
				
			}else if(player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.CascodeZafiro && player.inventory.hasItem(Items.fish)){
				player.inventory.consumeInventoryItem(Items.fish);
				player.inventory.consumeInventoryItem(RubyCraft.CascodeZafiro);
				stack = new ItemStack(RubyCraft.CascodeZafiro);
				stack.addEnchantment(Enchantment.respiration, 3);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if(player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.CascodeRuby && player.inventory.hasItem(Items.fish)){
				player.inventory.consumeInventoryItem(Items.fish);
				player.inventory.consumeInventoryItem(RubyCraft.CascodeRuby);
				stack = new ItemStack(RubyCraft.CascodeRuby);
				stack.addEnchantment(Enchantment.respiration, 2);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if(player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.cascodeUranio && player.inventory.hasItem(Items.fish)){
				player.inventory.consumeInventoryItem(Items.fish);
				player.inventory.consumeInventoryItem(RubyCraft.cascodeUranio);
				stack = new ItemStack(RubyCraft.cascodeUranio);
				stack.addEnchantment(Enchantment.respiration, 1);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if(!RubyCraft.Dia_de_Los_Inocentes && player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.Espadaderuby && player.inventory.hasItem(RubyCraft.Totem_de_la_no_muerte)){
				player.inventory.consumeInventoryItem(RubyCraft.Totem_de_la_no_muerte);
				player.inventory.consumeInventoryItem(RubyCraft.Espadaderuby);
				stack = new ItemStack(RubyCraft.Espadaderuby);
				stack.addEnchantment(Enchantment.sharpness, 3);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if(!RubyCraft.Dia_de_Los_Inocentes && player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == RubyCraft.Espadadezafiro && player.inventory.hasItem(RubyCraft.Totem_de_la_no_muerte)){
				player.inventory.consumeInventoryItem(RubyCraft.Totem_de_la_no_muerte);
				player.inventory.consumeInventoryItem(RubyCraft.Espadadezafiro);
				stack = new ItemStack(RubyCraft.Espadadezafiro);
				stack.addEnchantment(Enchantment.sharpness, 5);
				player.inventory.addItemStackToInventory(stack);
				HechizoSonido(player);
				
			}else if (!RubyCraft.Dia_de_Los_Inocentes && player.getCurrentEquippedItem() !=null && player.getCurrentEquippedItem().getItem() == Items.diamond_sword && player.inventory.hasItem(RubyCraft.Totem_de_la_no_muerte)){
			    player.inventory.consumeInventoryItem(RubyCraft.Totem_de_la_no_muerte);
			    player.inventory.consumeInventoryItem(Items.diamond_sword);
			    stack = new ItemStack(Items.diamond_sword);
			    stack.addEnchantment(Enchantment.sharpness, 5);
			    player.inventory.addItemStackToInventory(stack);
			    HechizoSonido(player);
				
			}else{
				ErrorSonido(player, world);
			}
		}
		return true;
	}
	
	
	public void HechizoSonido(EntityPlayer player){
		player.playSound(RubyCraft.modid + ":Hechizo", 5.0F, 1.0F);
		player.addStat(Logros.Encantador_Magico, 1);
		
	}
	public void ErrorSonido(EntityPlayer player, World world){
		if(world.isRemote) {
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "[" + EnumChatFormatting.GREEN + "RubyCraft" + EnumChatFormatting.GRAY + "] " + EnumChatFormatting.GOLD + player.getDisplayName() + " No tienes Ningun Item Para Encantar"));
		}
        player.playSound(RubyCraft.modid + ":Error", 1.0F, 1.0F);		
		
	}
	
	
}