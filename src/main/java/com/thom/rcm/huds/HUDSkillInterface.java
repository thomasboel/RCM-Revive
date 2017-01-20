package com.thom.rcm.huds;

import org.lwjgl.opengl.GL11;

import com.thom.rcm.RCM;
import com.thom.rcm.utility.Reference;
import com.thom.rcm.utility.SkillReference;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class HUDSkillInterface extends Gui
{
	private Minecraft mc;
	
	public static final ResourceLocation HDSkillsGui = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skillsuhd.png");
	public static final ResourceLocation Skills1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills1.png");
	public static final ResourceLocation Skills2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills2.png");

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
			
			drawLevels(fontrenderer);
		}
	}	
	
	private void drawLevels(FontRenderer fontrenderer)
	{
		float scale = .5F;

		int x = RCM.instance.playerSettings.x, y = RCM.instance.playerSettings.y;
		
		GL11.glScalef(scale, scale, scale);
		
		int i = 0;
		
		for (int horizontal = 0; horizontal < 3; horizontal++)
		{
			for (int vertical = 0; vertical < 9; vertical++)
			{		
				if (!(horizontal == 2 && vertical == 8))
				{
					drawLevelStat(fontrenderer, SkillReference.skillDisplay[i], 50 + (77 * horizontal), 48 + (38 * vertical));
					drawLevelStat(fontrenderer, SkillReference.skillDisplay[i], 65 + (77 * horizontal), 63 + (38 * vertical));
				}	
				i++;
			}
		}
		
		GL11.glScalef(1/scale, 1/scale, 1/scale);
		
		drawIcons(23, 26);
	}
	
	private void drawIcons(int x, int y) 
	{
		x += RCM.instance.playerSettings.x;
		y += RCM.instance.playerSettings.y;
		
		x *= 4;
		y *= 4;
		
		x -= 70;
		y -= 155/2;
		
		GL11.glScalef(0.25F, 0.25F, 0.25F);
		
		mc.renderEngine.bindTexture(Skills1);
		drawTexturedModalRect(x, y + 60, 0, 0, 64, 64);
		drawTexturedModalRect(x + 155, y + 60, 64, 0, 64, 64);
		drawTexturedModalRect(x + 310, y + 60, 128, 0, 64, 64);
		drawTexturedModalRect(x - 5, y + 135, 192, 0, 64, 64);
		drawTexturedModalRect(x + 155, y + 137, 0, 64, 64, 64);
		drawTexturedModalRect(x + 307, y + 135, 64, 64, 64, 64);
		drawTexturedModalRect(x, y + 213, 128, 64, 64, 64);
		drawTexturedModalRect(x + 155, y + 213, 192, 64, 64, 64);
		drawTexturedModalRect(x + 310, y + 215, 0, 128, 64, 64);
		drawTexturedModalRect(x, y + 290, 64, 128, 64, 64);
		drawTexturedModalRect(x + 155, y + 290, 128, 128, 64, 64);
		drawTexturedModalRect(x + 310, y + 290, 192, 128, 64, 64);
		drawTexturedModalRect(x, y + 365, 0, 192, 64, 64);
		drawTexturedModalRect(x + 155, y + 365, 64, 192, 64, 64);
		drawTexturedModalRect(x + 310, y + 365, 128, 192, 64, 64);
		drawTexturedModalRect(x, y + 443, 192, 192, 64, 64);
		mc.renderEngine.bindTexture(Skills2);
		drawTexturedModalRect(x + 155, y + 443, 0, 0, 64, 64);
		drawTexturedModalRect(x + 310, y + 442, 64, 0, 64, 64);
		drawTexturedModalRect(x, y + 517, 128, 0, 64, 64);
		drawTexturedModalRect(x + 155, y + 517, 192, 0, 64, 64);
		drawTexturedModalRect(x + 310, y + 519, 0, 64, 64, 64);
		drawTexturedModalRect(x, y + 594, 64, 64, 64, 64);
		drawTexturedModalRect(x + 155, y + 594, 128, 64, 64, 64);
		drawTexturedModalRect(x + 310, y + 594, 192, 64, 64, 64);
		drawTexturedModalRect(x, y + 669, 0, 128, 64, 64);
		drawTexturedModalRect(x + 155, y + 669, 64, 128, 64, 64);

		GL11.glScalef(4F, 4F, 4F);
	}

	private void drawLevelStat(FontRenderer fontrenderer, String skill, int x, int y)
	{
		x += RCM.instance.playerSettings.x;
		y += RCM.instance.playerSettings.y;
		
		drawCenteredString(fontrenderer, EnumChatFormatting.GOLD + "" + RCM.instance.skillHandler.getLevel(skill) + EnumChatFormatting.RESET, RCM.instance.playerSettings.x + x, RCM.instance.playerSettings.y + y, 0xFFFFFF);
	}
}