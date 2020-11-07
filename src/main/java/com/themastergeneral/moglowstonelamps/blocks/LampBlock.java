package com.themastergeneral.moglowstonelamps.blocks;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class LampBlock extends CTDBlock {

	public LampBlock(String name, MaterialColor color) {
		super(Block.Properties.create(Material.GLASS, color)
				.sound(SoundType.LANTERN)
				.hardnessAndResistance(0.3F)
				.setLightLevel(s -> 15)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1),
				name, 
				MoGlowstoneLamps.MODID);
	}

}
