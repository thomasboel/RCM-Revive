package com.thom.rcm.huds;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class HUDOverlay 
{
	public static void init()
	{
		Minecraft mc = Minecraft.getMinecraft();
		
		MinecraftForge.EVENT_BUS.register(new HUDSkillInterface(mc));
		
		//MinecraftForge.EVENT_BUS.register(new HUDTest(mc));
	}
}
