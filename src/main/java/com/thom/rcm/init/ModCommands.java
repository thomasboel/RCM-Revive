package com.thom.rcm.init;

import com.thom.rcm.commands.CommandSetLevel;

import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class ModCommands 
{
	public static void init(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandSetLevel());
	}
}