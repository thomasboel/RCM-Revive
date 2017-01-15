package com.thom.rcm.items;

import java.util.ArrayList;

import com.thom.rcm.utility.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
	public static ArrayList<String> itemList = new ArrayList<String>();
	
	public ItemBase(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegistry) 
	{
		itemIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}