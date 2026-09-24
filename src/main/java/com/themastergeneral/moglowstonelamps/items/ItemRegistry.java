/*
	Project:	Mo' Glowstone Lamps 1.20
	File:		com.themastergeneral.moglowstonelamps.items.ItemRegistry
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/Mo-Glowstone-Lamps
	License:	MIT License

				Copyright (c) 2024 MasterGeneral156
				
				Permission is hereby granted, free of charge, to any person obtaining a copy
				of this software and associated documentation files (the "Software"), to deal
				in the Software without restriction, including without limitation the rights
				to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
				copies of the Software, and to permit persons to whom the Software is
				furnished to do so, subject to the following conditions:
				
				The above copyright notice and this permission notice shall be included in all
				copies or substantial portions of the Software.
				
				THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
				IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
				FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
				AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
				LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
				OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
				SOFTWARE.
*/
package com.themastergeneral.moglowstonelamps.items;

import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import com.themastergeneral.moglowstonelamps.blocks.BlockRegistry;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Items;

public class ItemRegistry {
	public static final Items ITEMS = DeferredRegister.createItems(MoGlowstoneLamps.MODID);
	
	//Block items
	public static final DeferredItem<BlockItem> black_lamp = ITEMS.registerSimpleBlockItem("black_lamp", BlockRegistry.BLACK_LAMP);
	public static final DeferredItem<BlockItem> blue_lamp = ITEMS.registerSimpleBlockItem("blue_lamp", BlockRegistry.BLUE_LAMP);
	public static final DeferredItem<BlockItem> brown_lamp = ITEMS.registerSimpleBlockItem("brown_lamp", BlockRegistry.BROWN_LAMP);
	public static final DeferredItem<BlockItem> cyan_lamp = ITEMS.registerSimpleBlockItem("cyan_lamp",  BlockRegistry.CYAN_LAMP);
	public static final DeferredItem<BlockItem> gray_lamp = ITEMS.registerSimpleBlockItem("gray_lamp", BlockRegistry.GRAY_LAMP);
	public static final DeferredItem<BlockItem> green_lamp = ITEMS.registerSimpleBlockItem("green_lamp", BlockRegistry.GREEN_LAMP);
	public static final DeferredItem<BlockItem> light_blue_lamp = ITEMS.registerSimpleBlockItem("light_blue_lamp", BlockRegistry.LIGHT_BLUE_LAMP);
	public static final DeferredItem<BlockItem> light_gray_lamp = ITEMS.registerSimpleBlockItem("light_gray_lamp", BlockRegistry.LIGHT_GRAY_LAMP);
	public static final DeferredItem<BlockItem> lime_lamp = ITEMS.registerSimpleBlockItem("lime_lamp", BlockRegistry.LIME_LAMP);
	public static final DeferredItem<BlockItem> magenta_lamp = ITEMS.registerSimpleBlockItem("magenta_lamp", BlockRegistry.MAGENTA_LAMP);
	public static final DeferredItem<BlockItem> orange_lamp = ITEMS.registerSimpleBlockItem("orange_lamp",  BlockRegistry.ORANGE_LAMP);
	public static final DeferredItem<BlockItem> purple_lamp = ITEMS.registerSimpleBlockItem("purple_lamp", BlockRegistry.PURPLE_LAMP);
	public static final DeferredItem<BlockItem> pink_lamp = ITEMS.registerSimpleBlockItem("pink_lamp", BlockRegistry.PINK_LAMP);
	public static final DeferredItem<BlockItem> red_lamp = ITEMS.registerSimpleBlockItem("red_lamp", BlockRegistry.RED_LAMP);
	public static final DeferredItem<BlockItem> white_lamp = ITEMS.registerSimpleBlockItem("white_lamp",  BlockRegistry.WHITE_LAMP);
	public static final DeferredItem<BlockItem> yellow_lamp = ITEMS.registerSimpleBlockItem("yellow_lamp",  BlockRegistry.YELLOW_LAMP);

}
