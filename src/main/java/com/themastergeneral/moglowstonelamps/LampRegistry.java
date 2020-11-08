/*
	Project:	Mo' Glowstone Lamps 1.16
	File:		com.themastergeneral.moglowstonelamps.LampRegistry
	Author:		TheMasterGeneral
	Website: 	https://github.com/MasterGeneral156/Mo-Glowstone-Lamps
	License:	MIT License

				Copyright (c) 2020 MasterGeneral156
				
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
package com.themastergeneral.moglowstonelamps;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.moglowstonelamps.blocks.LampBlockItem;
import com.themastergeneral.moglowstonelamps.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class LampRegistry 
{
	public static final Logger LOGGER = MoGlowstoneLamps.LOGGER;
	public static final String MODID = MoGlowstoneLamps.MODID;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> itemRegistry = event.getRegistry();
		LOGGER.info("Registering items for modid: " + MODID + ".");
		
		itemRegistry.register(new LampBlockItem(ModBlocks.black_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.blue_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.brown_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.cyan_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.gray_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.green_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.light_blue_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.light_gray_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.lime_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.magenta_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.orange_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.pink_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.purple_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.red_lamp));
		itemRegistry.register(new LampBlockItem(ModBlocks.white_lamp));
		
		
		LOGGER.info("Items registered for modid: " + MODID + ".");
	}
	
	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
		IForgeRegistry<Block> blockRegistry = event.getRegistry();
		LOGGER.info("Registering blocks for modid: " + MODID + ".");
		
		blockRegistry.register(ModBlocks.black_lamp);
		blockRegistry.register(ModBlocks.blue_lamp);
		blockRegistry.register(ModBlocks.brown_lamp);
		blockRegistry.register(ModBlocks.cyan_lamp);
		blockRegistry.register(ModBlocks.gray_lamp);
		blockRegistry.register(ModBlocks.green_lamp);
		blockRegistry.register(ModBlocks.light_blue_lamp);
		blockRegistry.register(ModBlocks.light_gray_lamp);
		blockRegistry.register(ModBlocks.lime_lamp);
		blockRegistry.register(ModBlocks.magenta_lamp);
		blockRegistry.register(ModBlocks.orange_lamp);
		blockRegistry.register(ModBlocks.pink_lamp);
		blockRegistry.register(ModBlocks.purple_lamp);
		blockRegistry.register(ModBlocks.red_lamp);
		blockRegistry.register(ModBlocks.white_lamp);
		
		LOGGER.info("Blocks registered for modid: " + MODID + ".");
    }
}
