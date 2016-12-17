package atze.mcmod.bubucraft.item.crafting;

import atze.mcmod.bubucraft.item.BCItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BCRecipes {
		
	public static void init() {
		// Shaped Crafting //
		
		// Chain mail armor
		GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_HELMET, 1), "XXX", "X#X", "###", 'X', Blocks.IRON_BARS);
		GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_HELMET, 1), "###", "XXX", "X#X", 'X', Blocks.IRON_BARS);
		GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1), "X#X", "XXX", "XXX", 'X', Blocks.IRON_BARS);
		GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_LEGGINGS, 1), "XXX", "X#X", "X#X", 'X', Blocks.IRON_BARS);
		GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_BOOTS, 1), "X#X", "X#X", "###", 'X', Blocks.IRON_BARS);
		GameRegistry.addRecipe(new ItemStack(Items.CHAINMAIL_BOOTS, 1), "###", "X#X", "X#X", 'X', Blocks.IRON_BARS);
		
		// Elytra
		GameRegistry.addRecipe(new ItemStack(Items.ELYTRA, 1), "LSL", "#F#", "#F#", 'L', Items.LEATHER, 'S', Items.STICK, 'F', Items.STRING);
		
		// Emerald Sword
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldSword, 1), "#E#", "#E#", "#S#", 'E', Items.EMERALD, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldSword, 1), "E##", "E##", "S##", 'E', Items.EMERALD, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldSword, 1), "##E", "##E", "##S", 'E', Items.EMERALD, 'S', Items.STICK);
		
		// Emerald Pickaxe
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldPickaxe, 1), "EEE", "#S#", "#S#", 'E', Items.EMERALD, 'S', Items.STICK);
		
		// Emerald Axe
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldAxe, 1), "EE#", "ES#", "#S#",  'E', Items.EMERALD, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldAxe, 1), "#EE", "#SE", "#S#",  'E', Items.EMERALD, 'S', Items.STICK);
		
		// Emerald Armor
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldHelmet, 1), "EEE", "E#E", "###", 'E', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldHelmet, 1), "###", "EEE", "E#E", 'E', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldChestplate, 1), "E#E", "EEE", "EEE", 'E', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldLeggings, 1), "EEE", "E#E", "E#E", 'E', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldBoots, 1), "###", "E#E", "E#E", 'E', Items.EMERALD);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemEmeraldBoots, 1), "E#E", "E#E", "###", 'E', Items.EMERALD);
		
		// Ore Beads
		GameRegistry.addRecipe(new ItemStack(BCItems.itemCoalBread, 1), "CCC", "CBC", "CCC", 'C', Items.COAL, 'B', Items.BREAD);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemDiamondBread, 1), "DDD", "DBD", "DDD", 'D', Items.DIAMOND, 'B', Items.BREAD);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemGoldBread, 1), "GGG", "GBG", "GGG", 'G', Items.GOLD_INGOT, 'B', Items.BREAD);
		
		// Obsidian Stuff
		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN, 1), "OOO", "OOO", "OOO", 'O', BCItems.itemObsidian);
		
		GameRegistry.addRecipe(new ItemStack(BCItems.itemObsidianPickaxe, 1), "OOO", "#S#", "#S#", 'O', BCItems.itemObsidian, 'S', Items.STICK);
		
		GameRegistry.addRecipe(new ItemStack(BCItems.itemObsidianSword, 1), "O##", "O##", "S##", 'O', BCItems.itemObsidian, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemObsidianSword, 1), "#O#", "#O#", "#S#", 'O', BCItems.itemObsidian, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemObsidianSword, 1), "##O", "##O", "##S", 'O', BCItems.itemObsidian, 'S', Items.STICK);
		
		GameRegistry.addRecipe(new ItemStack(BCItems.itemObsidianAxe, 1), "OO#", "OS#", "#S#", 'O', BCItems.itemObsidian, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(BCItems.itemObsidianAxe, 1), "#OO", "#SO", "#S#", 'O', BCItems.itemObsidian, 'S', Items.STICK);
		
		// Shapless //
		GameRegistry.addShapelessRecipe(new ItemStack(BCItems.itemObsidian, 9), new ItemStack(Blocks.OBSIDIAN, 1));
		
		// Smelting //
		GameRegistry.addSmelting(Blocks.COAL_BLOCK, new ItemStack(Items.DIAMOND, 1), 0f);
		
	}
}
