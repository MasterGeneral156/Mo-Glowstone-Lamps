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

import java.util.function.Supplier;

import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredRegister.Items;

public class ItemRegistry {
	public static final Items ITEMS = DeferredRegister.createItems(MoGlowstoneLamps.MODID);
	
	//Block items
	public static final Supplier<LampBlockItem> black_lamp = ITEMS.register("black_lamp", () -> ModItems.black_lamp);
	public static final Supplier<LampBlockItem> blue_lamp = ITEMS.register("blue_lamp", () -> ModItems.blue_lamp);
	public static final Supplier<LampBlockItem> brown_lamp = ITEMS.register("brown_lamp", () -> ModItems.brown_lamp);
	public static final Supplier<LampBlockItem> cyan_lamp = ITEMS.register("cyan_lamp", () -> ModItems.cyan_lamp);
	public static final Supplier<LampBlockItem> gray_lamp = ITEMS.register("gray_lamp", () -> ModItems.gray_lamp);
	public static final Supplier<LampBlockItem> green_lamp = ITEMS.register("green_lamp", () -> ModItems.green_lamp);
	public static final Supplier<LampBlockItem> light_blue_lamp = ITEMS.register("light_blue_lamp", () -> ModItems.light_blue_lamp);
	public static final Supplier<LampBlockItem> light_gray_lamp = ITEMS.register("light_gray_lamp", () -> ModItems.light_gray_lamp);
	public static final Supplier<LampBlockItem> lime_lamp = ITEMS.register("lime_lamp", () -> ModItems.lime_lamp);
	public static final Supplier<LampBlockItem> magenta_lamp = ITEMS.register("magenta_lamp", () -> ModItems.magenta_lamp);
	public static final Supplier<LampBlockItem> orange_lamp = ITEMS.register("orange_lamp", () -> ModItems.orange_lamp);
	public static final Supplier<LampBlockItem> purple_lamp = ITEMS.register("purple_lamp", () -> ModItems.purple_lamp);
	public static final Supplier<LampBlockItem> pink_lamp = ITEMS.register("pink_lamp", () -> ModItems.pink_lamp);
	public static final Supplier<LampBlockItem> red_lamp = ITEMS.register("red_lamp", () -> ModItems.red_lamp);
	public static final Supplier<LampBlockItem> white_lamp = ITEMS.register("white_lamp", () -> ModItems.white_lamp);

}
