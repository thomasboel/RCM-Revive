package com.thom.rcm.huds;

import org.lwjgl.opengl.GL11;

import com.thom.rcm.RCM;
import com.thom.rcm.utility.Reference;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class HUDSkillInterface extends Gui
{
	private Minecraft mc;
	
	public static final ResourceLocation HDSkillsGui = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skillsuhd.png");

	public HUDSkillInterface(Minecraft mc) 
	{
		super();
		this.mc = mc;
	}
	
	@SubscribeEvent
	public void onRender(RenderGameOverlayEvent event)
	{
		int width = event.resolution.getScaledWidth();
		int height = event.resolution.getScaledHeight();
		
		renderOverlay(event, width, height);
	}
	
	private void renderOverlay(RenderGameOverlayEvent event, int width, int height)
	{
		if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}
		
		FontRenderer fontrenderer = this.mc.fontRenderer;
		
		if (!RCM.instance.playerSettings.hideHUD)
		{
			mc.renderEngine.bindTexture(HDSkillsGui);
			drawTexturedModalRect(RCM.instance.playerSettings.x, RCM.instance.playerSettings.y, 0, 0, 240 / 2, 450 / 2);
		}
	}	
}