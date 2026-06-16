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

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoGlowstoneLamps.MODID);
	
	//Mod Blocks
	public static final DeferredBlock<Block> BLACK_LAMP = BLOCKS.register(
			"black_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
						.mapColor(MapColor.COLOR_BLACK)
						.sound(SoundType.GLASS)
						.setId(ResourceKey.create(Registries.BLOCK, registryName))
						.lightLevel(state -> 15)));

	public static final DeferredBlock<Block> BLUE_LAMP = BLOCKS.register(
			"bluek_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_BLUE)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> BROWN_LAMP = BLOCKS.register(
			"brown_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_BROWN)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> CYAN_LAMP = BLOCKS.register(
			"cyan_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_CYAN)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> GRAY_LAMP = BLOCKS.register(
			"gray_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_GRAY)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> GREEN_LAMP = BLOCKS.register(
			"green_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_GREEN)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> LIGHT_BLUE_LAMP = BLOCKS.register(
			"light_blue_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_LIGHT_BLUE)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> LIGHT_GRAY_LAMP = BLOCKS.register(
			"light_gray_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_LIGHT_GRAY)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> LIME_LAMP = BLOCKS.register(
			"lime_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_LIGHT_GREEN)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> MAGENTA_LAMP = BLOCKS.register(
			"magenta_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_MAGENTA)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> ORANGE_LAMP = BLOCKS.register(
			"orange_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_ORANGE)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> PINK_LAMP = BLOCKS.register(
			"pink_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_PINK)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> PURPLE_LAMP = BLOCKS.register(
			"purple_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_PURPLE)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> RED_LAMP = BLOCKS.register(
			"red_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_RED)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> WHITE_LAMP = BLOCKS.register(
			"white_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.TERRACOTTA_WHITE)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
	public static final DeferredBlock<Block> YELLOW_LAMP = BLOCKS.register(
			"yellow_lamp",
			registryName -> new CTDBlock(
					BlockBehaviour.Properties.of()
							.mapColor(MapColor.COLOR_YELLOW)
							.sound(SoundType.GLASS)
							.setId(ResourceKey.create(Registries.BLOCK, registryName))
							.lightLevel(state -> 15)));
}
