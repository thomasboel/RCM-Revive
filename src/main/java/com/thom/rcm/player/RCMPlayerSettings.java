package com.thom.rcm.player;

import net.minecraft.nbt.NBTTagCompound;

public class RCMPlayerSettings 
{
	public boolean hideHUD = false;
	public boolean isEditMode = false;
	public int x = 0, y = 0;
	
	public RCMPlayerSettings() 
	{
		
	}
	
	public void writeToNBT(NBTTagCompound compound)
	{
		compound.setInteger("GuiX", x);
		compound.setInteger("GuiY", y);
	}
	
	public void readFromNBT(NBTTagCompound compound)
	{
		x = compound.getInteger("GuiX");
		y = compound.getInteger("GuiY");
	}
}
