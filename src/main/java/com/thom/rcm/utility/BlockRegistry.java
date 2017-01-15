package com.thom.rcm.utility;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockRegistry 
{
	public static void registerBlock(Block block, String name)
	{
		block.setBlockName(name);
		block.setBlockTextureName(name);
		GameRegistry.registerBlock(block, name);
	}
}