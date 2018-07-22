package com.natura.minestuckarsenal.tileentity;

import com.mraof.minestuck.item.MinestuckItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.ItemStackHandler;

public class StackMaster extends ItemStackHandler {
	
	public StackMaster(int size) {
		this.setSize(size);
	}
	
	@Override
	public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {
		 if (stack.isEmpty())
	            return ItemStack.EMPTY;

	        validateSlotIndex(slot);

	        ItemStack existing = this.stacks.get(slot);

	        int limit = getStackLimit(slot, stack);

	        if (!existing.isEmpty())
	        {
	            if (!ItemHandlerHelper.canItemStacksStack(stack, existing))
	                return stack;

	            limit -= existing.getCount();
	        }

	        if (limit <= 0)
	            return stack;

	        boolean reachedLimit = stack.getCount() > limit;

	        if (!simulate)
	        {
	            if (existing.isEmpty() && stack.getItem() == MinestuckItems.rawUranium)
	            {
	                this.stacks.set(slot, reachedLimit ? ItemHandlerHelper.copyStackWithSize(stack, limit) : stack);
	            }
	            else if(stack.getItem() == MinestuckItems.rawUranium)
	            {
	                existing.grow(reachedLimit ? limit : stack.getCount());
	            }
	            onContentsChanged(slot);
	        }

	        return reachedLimit ? ItemHandlerHelper.copyStackWithSize(stack, stack.getCount()- limit) : ItemStack.EMPTY;
	}

}
