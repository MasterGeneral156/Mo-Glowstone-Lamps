package com.themastergeneral.moglowstonelamps.items;

import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
