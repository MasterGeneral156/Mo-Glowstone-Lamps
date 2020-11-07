package com.themastergeneral.moglowstonelamps.blocks;

import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class LampBlockItem extends BlockItem
{
    public LampBlockItem(Block blockIn)
    {
        super(blockIn, new Item.Properties().group(MoGlowstoneLamps.ITEMGROUP));
        this.setRegistryName(blockIn.getRegistryName());
    }
}