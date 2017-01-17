package com.thom.rcm.gui;

import org.lwjgl.opengl.GL11;

import com.thom.rcm.RCM;
import com.thom.rcm.utility.LogHelper;
import com.thom.rcm.utility.Reference;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class InterfaceEditMode extends GuiScreen 
{
	private int x = RCM.instance.playerSettings.x, y = RCM.instance.playerSettings.y;
	private float scalling = 1F;

	public static final ResourceLocation HDSkillsGui = new ResourceLocation(Reference.MOD_ID, "textures/gui/interface/skillsuhd.png");

	public InterfaceEditMode() 
	{
		RCM.instance.playerSettings.hideHUD = true;
		RCM.instance.playerSettings.isEditMode = true;
	}

	public void initGui() 
	{
		buttonList.clear();
		
		buttonList.add(new GUICustomButton(1, width - 30, height / 2 - 30, 20, 20, "+"));
		buttonList.add(new GUICustomButton(2, width - 30, height / 2 + 10, 20, 20, "-"));
	}
	
	@Override
	protected void actionPerformed(GuiButton button) 
	{
		switch (button.id) 
		{
		case 1:
			scalling += .05F;
			break;
		case 2:
			scalling -= .05F;
			break;
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
		drawString(fontRendererObj, "Mouse X: " + x, 15, 15, 0xFFFFFF);
		drawString(fontRendererObj, "Mouse Y: " + y, 15, 27, 0xFFFFFF);
		drawString(fontRendererObj, "Editing: " + RCM.instance.playerSettings.isEditMode, 15, 39, 0xFFFFFF);

		GL11.glScalef(scalling, scalling, scalling);
		
		mc.renderEngine.bindTexture(HDSkillsGui);
		drawTexturedModalRect(this.x, this.y, 0, 0, 240 / 2, 450 / 2);
		
		GL11.glScalef(1/scalling, 1/scalling, 1/scalling);
		
		super.drawScreen(x, y, f);
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