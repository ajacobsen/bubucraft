package atze.mcmod.bubucraft.item;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBCAxe extends ItemAxe {
	
	private boolean isEmerald;

	public ItemBCAxe(String name, ToolMaterial material) {
		super(material, 8.0F, -3.0F);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.isEmerald = false;
		if (material.name().equals("EMERALD")) {
			this.isEmerald = true;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		if (this.isEmerald) {
			return true;
		} else {
			return super.hasEffect(stack);
		}
	}
}
