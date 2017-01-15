package com.thom.rcm.utility;

import com.thom.rcm.items.ItemBase;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry 
{
	public static void registerItem(Item item, boolean isBuyable)
	{
		String unlocalizedName = item.getUnlocalizedName().substring(5);

		GameRegistry.registerItem(item, unlocalizedName, Reference.MOD_ID);
		ItemBase.itemList.add("rcm:"+unlocalizedName);

		if (isBuyable) 
		{
			//BuyCommandUtil.addToBuyableList(item);
		}
	}
}