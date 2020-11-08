package com.themastergeneral.moglowstonelamps.blocks;

import com.themastergeneral.moglowstone.MoGlowstone;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class LampBlockItem extends BlockItem
{
    public LampBlockItem(Block blockIn)
    {
        super(blockIn, new Item.Properties().group(MoGlowstone.ITEMGROUP));
        this.setRegistryName(blockIn.getRegistryName());
    }
}