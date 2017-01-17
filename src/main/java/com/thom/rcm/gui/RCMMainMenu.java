package com.thom.rcm.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.StatCollector;

public class RCMMainMenu extends GuiScreen
{
	public void initGui() 
	{
		buttonList.clear();
		
		buttonList.add(new GUICustomButton(0, width / 2 - 100, 70, 200, 20, StatCollector.translateToLocal("Back to Game")));
		buttonList.add(new GUICustomButton(1, width / 2 - 100, 95, 97, 20, StatCollector.translateToLocal("Interface Settings")));
		buttonList.add(new GUICustomButton(2, width / 2 + 3, 95, 97, 20, StatCollector.translateToLocal("Skill Tabs")));
		buttonList.add(new GUICustomButton(3, width / 2 - 100, 145 + 25, 200, 20, StatCollector.translateToLocal("Save and Quit to Title")));
		buttonList.add(new GUICustomButton(4, width / 2 - 100, 120, 97, 20, StatCollector.translateToLocal("Skill Guides")));
		buttonList.add(new GUICustomButton(5, width / 2 + 3, 120, 97, 20, StatCollector.translateToLocal("Combat Selection")));
	}
	
	protected void actionPerformed(GuiButton button) 
	{
		switch (button.id) 
		{
		case 1:
			mc.displayGuiScreen(new InterfaceEditMode());
			break;
		}
	}

	public void onGuiClosed() 
	{

	}

	public boolean doesGuiPauseGame() 
	{
		return true;
	}

	public void drawScreen(int x, int y, float f) 
	{
		
		super.drawScreen(x, y, f);
	}
}