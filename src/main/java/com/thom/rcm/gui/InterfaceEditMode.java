package com.thom.rcm.gui;

import org.lwjgl.opengl.GL11;

import com.thom.rcm.RCM;
import com.thom.rcm.utility.LogHelper;
import com.thom.rcm.utility.Reference;
import com.thom.rcm.utility.SkillReference;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class InterfaceEditMode extends GuiScreen 
{
	private int x = RCM.instance.playerSettings.x, y = RCM.instance.playerSettings.y;
	//private float scalling = RCM.instance.playerSettings.HUDScalling;

	public static final ResourceLocation HDSkillsGui = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skillsuhd.png");
	public static final ResourceLocation Skills1 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills1.png");
	public static final ResourceLocation Skills2 = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skills2.png");

	private String objEditing;
	
	public InterfaceEditMode(String objectEditing) 
	{
		RCM.instance.playerSettings.hideHUD = true;
		RCM.instance.playerSettings.isEditMode = true;
		
		this.objEditing = objectEditing; 
	}

	public void initGui() 
	{
		buttonList.clear();
		
		/*buttonList.add(new GUICustomButton(1, width - 30, height / 2 - 30, 20, 20, "+"));
		buttonList.add(new GUICustomButton(2, width - 30, height / 2 + 10, 20, 20, "-"));*/
	}
	
	@Override
	protected void actionPerformed(GuiButton button) 
	{
		switch (button.id) 
		{
		/*case 1:
			scalling += .05F;
			break;
		case 2:
			scalling -= .05F;
			break;*/
		default:
			LogHelper.info("Button Clicked in GUI InterfaceEditMode()");
			break;
		}
	}

	public void onGuiClosed() 
	{
		RCM.instance.playerSettings.hideHUD = false;
		RCM.instance.playerSettings.isEditMode = false;
		RCM.instance.playerSettings.x = x;
		RCM.instance.playerSettings.y = y;
	}

	public boolean doesGuiPauseGame() 
	{
		return true;
	}

	public void drawScreen(int x, int y, float f) 
	{
		/*drawString(fontRendererObj, "Mouse X: " + x, 15, 15, 0xFFFFFF);
		drawString(fontRendererObj, "Mouse Y: " + y, 15, 27, 0xFFFFFF);
		drawString(fontRendererObj, "Editing: " + RCM.instance.playerSettings.isEditMode, 15, 39, 0xFFFFFF);*/

		//GL11.glScalef(scalling, scalling, scalling);
		
		mc.renderEngine.bindTexture(HDSkillsGui);
		drawTexturedModalRect(this.x, this.y, 0, 0, 240 / 2, 450 / 2);
		
		//GL11.glScalef(1/scalling, 1/scalling, 1/scalling);
		
		drawIcons(23, 26);
		
		super.drawScreen(x, y, f);
	}
	
	private void drawIcons(int x, int y) 
	{
		x += this.x;
		y += this.y;
		
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
	
	protected void mouseClickMove(int mouseX, int mouseY, int buttonClicked, long timeSinceLastClick) 
	{
		if (RCM.instance.playerSettings.isEditMode)
		{
			x = mouseX;
			y = mouseY;
		}
	}
	
	@Override
	protected void mouseMovedOrUp(int mouseX, int mouseY, int buttonClicked) 
	{
		if (buttonClicked == 2)
		{
			if (RCM.instance.playerSettings.isEditMode)
				RCM.instance.playerSettings.isEditMode = false;
			else
				RCM.instance.playerSettings.isEditMode = true;
		}
	}
}