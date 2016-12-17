package atze.mcmod.bubucraft.client.render.items;

import atze.mcmod.bubucraft.item.BCItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public final class ItemRenderRegister {

	public static void registerItemRenderer() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemEmeraldSword, 0, new ModelResourceLocation("bubucraft:emerald_sword", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemEmeraldPickaxe, 0, new ModelResourceLocation("bubucraft:emerald_pickaxe", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemEmeraldAxe, 0, new ModelResourceLocation("bubucraft:emerald_axe", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemEmeraldHelmet, 0, new ModelResourceLocation("bubucraft:emerald_helmet", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemEmeraldChestplate, 0, new ModelResourceLocation("bubucraft:emerald_chestplate", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemEmeraldLeggings, 0, new ModelResourceLocation("bubucraft:emerald_leggings", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemEmeraldBoots, 0, new ModelResourceLocation("bubucraft:emerald_boots", "inventory"));

		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemCottoncandy, 0, new ModelResourceLocation("bubucraft:cotton_candy", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemBigmac, 0, new ModelResourceLocation("bubucraft:big_mac", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemCoalBread, 0, new ModelResourceLocation("bubucraft:coal_bread", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemDiamondBread, 0, new ModelResourceLocation("bubucraft:diamond_bread", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemGoldBread, 0, new ModelResourceLocation("bubucraft:gold_bread", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemChuckPoster, 0, new ModelResourceLocation("bubucraft:chuck_poster", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemChupaChups, 0, new ModelResourceLocation("bubucraft:chupa_chups", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemDoritos, 0, new ModelResourceLocation("bubucraft:doritos", "inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemObsidian, 0, new ModelResourceLocation("bubucraft:obsidian_ingot", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemObsidianPickaxe, 0, new ModelResourceLocation("bubucraft:obsidian_pickaxe", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemObsidianSword, 0, new ModelResourceLocation("bubucraft:obsidian_sword", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemObsidianAxe, 0, new ModelResourceLocation("bubucraft:obsidian_axe", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BCItems.itemCrowbar, 0, new ModelResourceLocation("bubucraft:crowbar", "inventory"));

	}
}
