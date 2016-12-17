package atze.mcmod.bubucraft.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBCArmor extends ItemArmor {

	public ItemBCArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
        super(material, renderIndex, armorType);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	
	
}
