package atze.mcmod.bubucraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBCFood extends ItemFood {
	
	private PotionEffect[] effects;
	private EnumAction useAction;

	public ItemBCFood(String name, int amount, float saturation, boolean isWolfFood, boolean isDrink, PotionEffect... effects) {
		super(amount, saturation, isWolfFood);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setAlwaysEdible();
		this.effects = effects;
		this.useAction = EnumAction.EAT;
		if (isDrink) {
			this.useAction = EnumAction.DRINK;
		}
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);

	    for (int i = 0; i < effects.length; i++) {
	        if (!world.isRemote && effects[i] != null)
	            player.addPotionEffect(new PotionEffect(effects[i]));
	    }
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return this.useAction;
	}
	
	
	
}
