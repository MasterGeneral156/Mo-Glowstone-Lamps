package com.themastergeneral.moglowstonelamps;

import com.themastergeneral.moglowstonelamps.blocks.ModBlocks;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class LampItemGroup extends ItemGroup
{
	public LampItemGroup() 
	{
		super("moglowstonelamps");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ModBlocks.red_lamp);
	}

}
