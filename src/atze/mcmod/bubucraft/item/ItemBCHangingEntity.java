package atze.mcmod.bubucraft.item;

import javax.annotation.Nullable;

import atze.mcmod.bubucraft.entity.item.EntityChuckPoster;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHangingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBCHangingEntity extends ItemHangingEntity {
	private final Class <? extends EntityHanging > hangingEntityClass;
	
	public ItemBCHangingEntity(String name, Class<? extends EntityHanging> entityClass) {
		super(entityClass);
		this.hangingEntityClass = entityClass;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY) {
		 ItemStack itemstack = stack.getHeldItem(pos);
		 BlockPos blockpos = worldIn.offset(hand);

		 if (hand != EnumFacing.DOWN && hand != EnumFacing.UP && stack.canPlayerEdit(blockpos, hand, itemstack)) {
			 EntityHanging entityhanging = this.createEntity(playerIn, blockpos, hand);

			 if (entityhanging != null && entityhanging.onValidSurface()) {
				 if (!playerIn.isRemote) {
					 entityhanging.playPlaceSound();
					 playerIn.spawnEntityInWorld(entityhanging);
				 }

				 itemstack.func_190918_g(1);
			 }

			 return EnumActionResult.SUCCESS;
		 }
		 else {
			 return EnumActionResult.FAIL;
		 }
	}
	
	@Nullable
	private EntityHanging createEntity(World worldIn, BlockPos pos, EnumFacing clickedSide) {
        return (EntityHanging)(this.hangingEntityClass == EntityChuckPoster.class ? new EntityChuckPoster(worldIn, pos, clickedSide) : null);
    }

}
