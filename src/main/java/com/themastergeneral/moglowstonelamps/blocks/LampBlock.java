package com.themastergeneral.moglowstonelamps.blocks;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.moglowstonelamps.MoGlowstoneLamps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class LampBlock extends CTDBlock {

	public LampBlock(String name, MaterialColor color) {
		super(Block.Properties.create(Material.GLASS, color)
				.sound(SoundType.LANTERN)
				.hardnessAndResistance(0.3F)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(1),
				name, 
				MoGlowstoneLamps.MODID);
	}
	
	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos)
	{
		return 15;
	}

}
