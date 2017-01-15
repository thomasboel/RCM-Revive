package com.thom.rcm.init;

import com.thom.rcm.player.PlayerEventHandler;

import net.minecraftforge.common.MinecraftForge;

public class ModEvents 
{
	public static void init()
	{
		MinecraftForge.EVENT_BUS.register(new PlayerEventHandler());
	}
}