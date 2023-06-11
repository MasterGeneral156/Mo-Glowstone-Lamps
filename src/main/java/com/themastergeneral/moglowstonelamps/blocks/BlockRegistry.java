/*
	Project:	Mo' Glowstone Lamps 1.20
	File:		com.themastergeneral.moglowstonelamps.blocks.BlockRegistry
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/Mo-Glowstone-Lamps
	License:	MIT License

				Copyright (c) 2023 MasterGeneral156
				
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
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoGlowstoneLamps.MODID);
	
	//Mod Blocks
	public static final RegistryObject<Block> black_lamp = BLOCKS.register("black_lamp", () -> ModBlocks.black_lamp);
	public static final RegistryObject<Block> blue_lamp = BLOCKS.register("blue_lamp", () -> ModBlocks.blue_lamp);
	public static final RegistryObject<Block> brown_lamp = BLOCKS.register("brown_lamp", () -> ModBlocks.brown_lamp);
	public static final RegistryObject<Block> cyan_lamp = BLOCKS.register("cyan_lamp", () -> ModBlocks.cyan_lamp);
	public static final RegistryObject<Block> gray_lamp = BLOCKS.register("gray_lamp", () -> ModBlocks.gray_lamp);
	public static final RegistryObject<Block> green_lamp = BLOCKS.register("green_lamp", () -> ModBlocks.green_lamp);
	public static final RegistryObject<Block> light_blue_lamp = BLOCKS.register("light_blue_lamp", () -> ModBlocks.light_blue_lamp);
	public static final RegistryObject<Block> light_gray_lamp = BLOCKS.register("light_gray_lamp", () -> ModBlocks.light_gray_lamp);
	public static final RegistryObject<Block> lime_lamp = BLOCKS.register("lime_lamp", () -> ModBlocks.lime_lamp);
	public static final RegistryObject<Block> magenta_lamp = BLOCKS.register("magenta_lamp", () -> ModBlocks.magenta_lamp);
	public static final RegistryObject<Block> orange_lamp = BLOCKS.register("orange_lamp", () -> ModBlocks.orange_lamp);
	public static final RegistryObject<Block> pink_lamp = BLOCKS.register("pink_lamp", () -> ModBlocks.pink_lamp);
	public static final RegistryObject<Block> purple_lamp = BLOCKS.register("purple_lamp", () -> ModBlocks.purple_lamp);
	public static final RegistryObject<Block> red_lamp = BLOCKS.register("red_lamp", () -> ModBlocks.red_lamp);
	public static final RegistryObject<Block> white_lamp = BLOCKS.register("white_lamp", () -> ModBlocks.white_lamp);
}
