/*
	Project:	Mo' Glowstone Lamps 1.19
	File:		com.themastergeneral.moglowstonelamps.MoGlowstoneLamps
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
package com.themastergeneral.moglowstonelamps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.themastergeneral.moglowstone.MoGlowstone;
import com.themastergeneral.moglowstonelamps.items.ModItems;
import com.themastergeneral.moglowstonelamps.blocks.BlockRegistry;
import com.themastergeneral.moglowstonelamps.items.ItemRegistry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moglowstonelamps")
public class MoGlowstoneLamps {
	
	public static MoGlowstoneLamps instance;
	static final Logger LOGGER = LogManager.getLogger();

	public static final String MODID = "moglowstonelamps";

	public MoGlowstoneLamps() {
		instance = this;
        // Register the setup method for modloading
		IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(this::setup);
        modbus.addListener(this::fillTab);

        // Register ourselves for server, registry and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("Mo' Glowstone Lamps is launching.");
    }
	
	private void fillTab(CreativeModeTabEvent.BuildContents ev)
	{
		if (ev.getTab() == MoGlowstone.MoGlowstoneTab)
		{
			ev.accept(ModItems.black_lamp);
			ev.accept(ModItems.blue_lamp);
			ev.accept(ModItems.brown_lamp);
			ev.accept(ModItems.cyan_lamp);
			ev.accept(ModItems.gray_lamp);
			ev.accept(ModItems.green_lamp);
			ev.accept(ModItems.light_blue_lamp);
			ev.accept(ModItems.light_gray_lamp);
			ev.accept(ModItems.lime_lamp);
			ev.accept(ModItems.magenta_lamp);
			ev.accept(ModItems.orange_lamp);
			ev.accept(ModItems.pink_lamp);
			ev.accept(ModItems.purple_lamp);
			ev.accept(ModItems.red_lamp);
			ev.accept(ModItems.white_lamp);
		}
	}
}
