/*
	Project:	Mo' Glowstone Lamps 1.20
	File:		com.themastergeneral.moglowstonelamps.blocks.BlockRegistry
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
package com.themastergeneral.moglowstonelamps.blocks;

import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoGlowstoneLamps.MODID);
	
	//Mod Blocks
	public static final DeferredBlock<Block> BLACK_LAMP = BLOCKS.registerSimpleBlock(
			"black_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_BLACK)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> BLUE_LAMP = BLOCKS.registerSimpleBlock(
			"blue_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_BLUE)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> BROWN_LAMP = BLOCKS.registerSimpleBlock(
			"brown_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_BROWN)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> CYAN_LAMP = BLOCKS.registerSimpleBlock(
			"cyan_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_CYAN)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> GRAY_LAMP = BLOCKS.registerSimpleBlock(
			"gray_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_GRAY)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> GREEN_LAMP = BLOCKS.registerSimpleBlock(
			"green_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_GREEN)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> LIGHT_BLUE_LAMP = BLOCKS.registerSimpleBlock(
			"light_blue_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> LIGHT_GRAY_LAMP = BLOCKS.registerSimpleBlock(
			"light_gray_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_LIGHT_GRAY)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> LIME_LAMP = BLOCKS.registerSimpleBlock(
			"lime_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_LIGHT_GREEN)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> MAGENTA_LAMP = BLOCKS.registerSimpleBlock(
			"magenta_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_MAGENTA)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> ORANGE_LAMP = BLOCKS.registerSimpleBlock(
			"orange_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_ORANGE)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> PINK_LAMP = BLOCKS.registerSimpleBlock(
			"pink_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_PINK)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> PURPLE_LAMP = BLOCKS.registerSimpleBlock(
			"purple_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_PURPLE)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> RED_LAMP = BLOCKS.registerSimpleBlock(
			"red_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.COLOR_RED)
					.lightLevel(state -> 15)
	);
	public static final DeferredBlock<Block> WHITE_LAMP = BLOCKS.registerSimpleBlock(
			"white_lamp",
			BlockBehaviour.Properties.of()
					.mapColor(MapColor.TERRACOTTA_WHITE)
					.lightLevel(state -> 15)
	);
}
