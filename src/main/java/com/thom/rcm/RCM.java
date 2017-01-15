package com.thom.rcm;

import com.thom.rcm.huds.HUDOverlay;
import com.thom.rcm.init.ModCommands;
import com.thom.rcm.init.ModEvents;
import com.thom.rcm.player.RCMPlayerSettings;
import com.thom.rcm.proxies.CommonProxy;
import com.thom.rcm.skills.SkillHandler;
import com.thom.rcm.utility.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class RCM
{
	@SidedProxy(clientSide = "com.thom.rcm.proxies.ClientProxy",
				serverSide = "com.thom.rcm.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static RCM instance;
	
	public SkillHandler skillHandler = new SkillHandler();
	public RCMPlayerSettings playerSettings = new RCMPlayerSettings();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
//		ModCreativeTabs.init();
//		ModBlocks.init();
//		ModItems.init();
//		ModRecipes.init();
		HUDOverlay.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModEvents.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
//		ModEvents.postInit();
//		ModSmithingRecipes.removeRecipes();
		proxy.proxy();
	}

	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event)
	{
		ModCommands.init(event);
	}
}