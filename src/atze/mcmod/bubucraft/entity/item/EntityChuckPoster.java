/**
 * 
 */
package atze.mcmod.bubucraft.entity.item;

import net.minecraft.entity.item.EntityPainting;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author atze
 *
 */
public class EntityChuckPoster extends EntityPainting {

	/**
	 * @param worldIn
	 */
	public EntityChuckPoster(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param worldIn
	 * @param pos
	 * @param facing
	 */
	public EntityChuckPoster(World worldIn, BlockPos pos, EnumFacing facing) {
		super(worldIn, pos, facing);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param worldIn
	 * @param pos
	 * @param facing
	 * @param title
	 */
	public EntityChuckPoster(World worldIn, BlockPos pos, EnumFacing facing, String title) {
		super(worldIn, pos, facing, title);
		// TODO Auto-generated constructor stub
	}

}
