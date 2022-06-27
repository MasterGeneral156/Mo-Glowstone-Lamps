/*
	Project:	Mo' Glowstone Lamps 1.19
	File:		com.themastergeneral.moglowstonelamps.items.ItemRegistry
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/Mo-Glowstone-Lamps
	License:	MIT License

				Copyright (c) 2022 MasterGeneral156
				
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

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoGlowstoneLamps.MODID);
	
	//Block items
	public static final RegistryObject<Item> black_lamp = ITEMS.register("black_lamp", () -> ModItems.black_lamp);
	public static final RegistryObject<Item> blue_lamp = ITEMS.register("blue_lamp", () -> ModItems.blue_lamp);
	public static final RegistryObject<Item> brown_lamp = ITEMS.register("brown_lamp", () -> ModItems.brown_lamp);
	public static final RegistryObject<Item> cyan_lamp = ITEMS.register("cyan_lamp", () -> ModItems.cyan_lamp);
	public static final RegistryObject<Item> gray_lamp = ITEMS.register("gray_lamp", () -> ModItems.gray_lamp);
	public static final RegistryObject<Item> green_lamp = ITEMS.register("green_lamp", () -> ModItems.green_lamp);
	public static final RegistryObject<Item> light_blue_lamp = ITEMS.register("light_blue_lamp", () -> ModItems.light_blue_lamp);
	public static final RegistryObject<Item> light_gray_lamp = ITEMS.register("light_gray_lamp", () -> ModItems.light_gray_lamp);
	public static final RegistryObject<Item> lime_lamp = ITEMS.register("lime_lamp", () -> ModItems.lime_lamp);
	public static final RegistryObject<Item> magenta_lamp = ITEMS.register("magenta_lamp", () -> ModItems.magenta_lamp);
	public static final RegistryObject<Item> orange_lamp = ITEMS.register("orange_lamp", () -> ModItems.orange_lamp);
	public static final RegistryObject<Item> purple_lamp = ITEMS.register("purple_lamp", () -> ModItems.purple_lamp);
	public static final RegistryObject<Item> pink_lamp = ITEMS.register("pink_lamp", () -> ModItems.pink_lamp);
	public static final RegistryObject<Item> red_lamp = ITEMS.register("red_lamp", () -> ModItems.red_lamp);
	public static final RegistryObject<Item> white_lamp = ITEMS.register("white_lamp", () -> ModItems.white_lamp);

}
