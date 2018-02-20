package com.natura.minestuckarsenal.item;

import java.util.Random;

import com.mraof.minestuck.entity.item.EntityGrist;
import com.mraof.minestuck.util.GristAmount;
import com.mraof.minestuck.util.GristRegistry;
import com.mraof.minestuck.util.GristSet;
import com.mraof.minestuck.util.GristType;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMineNGrist extends ItemPickaxe {

	public ItemMineNGrist() {
		super(ToolMaterial.DIAMOND);
		this.setMaxDamage(420);
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos,
			EntityLivingBase entityLiving) {
		GristSet grist = GristRegistry.getGristConversion(new ItemStack(state.getBlock()));
		Random rand = new Random();
		double randX = entityLiving.posX + rand.nextDouble() * entityLiving.width - entityLiving.width / 2;
		double randZ = entityLiving.posZ + rand.nextDouble() * entityLiving.width - entityLiving.width / 2;
		
		if (!worldIn.isRemote && (double)state.getBlockHardness(worldIn, pos) != 0.0D)
        {
            stack.damageItem(1, entityLiving);
        }
		if(grist != null) {
			for(GristAmount gristType : grist.getArray())
				worldIn.spawnEntity(new EntityGrist(worldIn, randX, entityLiving.posY, randZ, gristType));
		}
		
		else if(grist == null) {
			worldIn.spawnEntity(new EntityGrist(worldIn, randX, entityLiving.posY, randZ, new GristAmount(GristType.Build, 1)));
		}
        return true;
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState blockIn) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
