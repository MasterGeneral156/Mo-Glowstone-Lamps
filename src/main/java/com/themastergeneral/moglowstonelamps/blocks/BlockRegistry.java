package com.themastergeneral.moglowstonelamps.blocks;

import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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
