package com.thom.rcm.player;

import org.lwjgl.input.Keyboard;

import com.thom.rcm.RCM;
import com.thom.rcm.gui.RCMMainMenu;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class PlayerEventHandler 
{
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer)event.entity) == null)
		{
			ExtendedPlayer.register((EntityPlayer)event.entity);
		}

		if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME) == null)
		{
			event.entity.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer((EntityPlayer)event.entity));
		}
	}
	
	@SubscribeEvent
	public void onKeyboardTrigger(LivingUpdateEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{	
			EntityPlayer player = (EntityPlayer) event.entity;
			Minecraft mc = Minecraft.getMinecraft();
			
			if (Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
			{
				mc.displayGuiScreen(new RCMMainMenu());
			}
			
			if (Keyboard.isKeyDown(Keyboard.KEY_P))
			{
				if (RCM.instance.playerSettings.isEditMode) { RCM.instance.playerSettings.isEditMode = false; }
				else { RCM.instance.playerSettings.isEditMode = true; }
			}
		}
	}
}