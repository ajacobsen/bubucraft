package atze.mcmod.bubucraft.item;

import atze.mcmod.bubucraft.entity.item.EntityChuckPoster;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BCItems {

	public static ItemBCSword itemEmeraldSword;
	public static ItemBCSword itemObsidianSword;
	public static ItemBCSword itemCrowbar;
	public static ItemBCPickaxe itemEmeraldPickaxe;
	public static ItemBCPickaxe itemObsidianPickaxe;
	public static ItemBCAxe itemEmeraldAxe;
	public static ItemBCAxe itemObsidianAxe;
	public static ItemBCArmor itemEmeraldHelmet;
	public static ItemBCArmor itemEmeraldChestplate;
	public static ItemBCArmor itemEmeraldLeggings;
	public static ItemBCArmor itemEmeraldBoots;
	public static ItemBCFood itemCoalBread;
	public static ItemBCFood itemDiamondBread;
	public static ItemBCFood itemGoldBread;
	public static ItemBCFood itemCottoncandy;
	public static ItemBCFood itemBigmac;
	public static ItemBCFood itemChupaChups;
	public static ItemBCFood itemDoritos;
	public static ItemBC itemObsidian;
	public static ItemBCHangingEntity itemChuckPoster;

	public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 2561, 15.0F, 5.0F, 10);
	public static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3, 4561, 10.0F, 5.0F, 35);
//	public static ArmorMaterial EMERALDA = EnumHelper.addArmorMaterial("EMERALDA", "bubucraft:emeraldarmor", 70, new int[]{3, 6, 8, 3}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);

	public static void init() {
		itemCrowbar = new ItemBCSword("crowbar", ToolMaterial.IRON);
		GameRegistry.register(itemCrowbar);

		itemEmeraldSword = new ItemBCSword("emerald_sword", EMERALD);
		GameRegistry.register(itemEmeraldSword);

		itemEmeraldPickaxe = new ItemBCPickaxe("emerald_pickaxe", EMERALD);
		GameRegistry.register(itemEmeraldPickaxe);

		itemEmeraldAxe = new ItemBCAxe("emerald_axe", EMERALD);
		GameRegistry.register(itemEmeraldAxe);

		itemEmeraldHelmet = new ItemBCArmor("emerald_helmet", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.HEAD);
		GameRegistry.register(itemEmeraldHelmet);

		itemEmeraldChestplate = new ItemBCArmor("emerald_chestplate", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.CHEST);
		GameRegistry.register(itemEmeraldChestplate);

		itemEmeraldLeggings = new ItemBCArmor("emerald_leggings", ArmorMaterial.DIAMOND, 2, EntityEquipmentSlot.LEGS);
		GameRegistry.register(itemEmeraldLeggings);

		itemEmeraldBoots = new ItemBCArmor("emerald_boots", ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.FEET);
		GameRegistry.register(itemEmeraldBoots);

		itemCoalBread = new ItemBCFood("coal_bread", 5, 0.6F, false, false, new PotionEffect(MobEffects.NIGHT_VISION, 3600), new PotionEffect(MobEffects.HASTE, 3600));
		GameRegistry.register(itemCoalBread);

		itemDiamondBread = new ItemBCFood("diamond_bread", 5, 0.6F, false, false, new PotionEffect(MobEffects.REGENERATION, 1200), new PotionEffect(MobEffects.STRENGTH, 1200), new PotionEffect(MobEffects.HEALTH_BOOST, 1200));
		GameRegistry.register(itemDiamondBread);

		itemGoldBread = new ItemBCFood("gold_bread", 5, 0.6F, false, false, new PotionEffect(MobEffects.SPEED, 3600), new PotionEffect(MobEffects.JUMP_BOOST, 3600));
		GameRegistry.register(itemGoldBread);

		itemCottoncandy = new ItemBCFood("cotton_candy", 5, 0.6F, false, false);
		GameRegistry.register(itemCottoncandy);

		itemBigmac = new ItemBCFood("big_mac", 5, 0.6F, false, false);
		GameRegistry.register(itemBigmac);

		itemChupaChups = new ItemBCFood("chupa_chups", 5, 0.6F, false, false);
		GameRegistry.register(itemChupaChups);
		
		itemDoritos = new ItemBCFood("doritos", 5, 0.6F, false, false);
		GameRegistry.register(itemDoritos);
		
		itemObsidian = new ItemBC("obsidian_ingot");
		itemObsidian.setCreativeTab(CreativeTabs.MATERIALS);
		GameRegistry.register(itemObsidian);
		
		itemChuckPoster = new ItemBCHangingEntity("chuck_poster", EntityChuckPoster.class);
		itemChuckPoster.setCreativeTab(CreativeTabs.DECORATIONS);
		GameRegistry.register(itemChuckPoster);

		itemObsidianPickaxe = new ItemBCPickaxe("obsidian_pickaxe", OBSIDIAN);
		GameRegistry.register(itemObsidianPickaxe);

		itemObsidianSword = new ItemBCSword("obsidian_sword", OBSIDIAN);
		GameRegistry.register(itemObsidianSword);

		itemObsidianAxe = new ItemBCAxe("obsidian_axe", OBSIDIAN);
		GameRegistry.register(itemObsidianAxe);
		
	}
}
