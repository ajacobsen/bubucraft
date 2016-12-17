package atze.mcmod.bubucraft.item;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBCPickaxe extends ItemPickaxe {
	
	private boolean isEmerald;

	protected ItemBCPickaxe(String name, ToolMaterial materialIn) {
		super(materialIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.isEmerald = false;
		if (materialIn.name().equals("EMERALD")) {
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
