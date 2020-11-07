package com.themastergeneral.moglowstonelamps;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.moglowstonelamps.blocks.LampBlockItem;
import com.themastergeneral.moglowstonelamps.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class LampRegistry 
{
	public static final ItemGroup ITEMGROUP = MoGlowstoneLamps.ITEMGROUP;
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
