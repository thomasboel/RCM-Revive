package com.thom.rcm.player;

import com.thom.rcm.RCM;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties
{
	public static final String EXT_PROP_NAME = "ExtendedPlayer";
	private final EntityPlayer player;
	
	public ExtendedPlayer(EntityPlayer player) 
	{
		this.player = player;
	}
	
	public static final ExtendedPlayer get(EntityPlayer player)
	{
		return (ExtendedPlayer)player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(EXT_PROP_NAME, new ExtendedPlayer(player));
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound properties = new NBTTagCompound();
		
		RCM.instance.skillHandler.writeToNBT(properties);
		RCM.instance.playerSettings.writeToNBT(properties);
		
		compound.setTag(EXT_PROP_NAME, properties);
	}
	
	@Override
	public void loadNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound properties = (NBTTagCompound)compound.getTag(EXT_PROP_NAME);
		
		RCM.instance.skillHandler.readFromNBT(properties);
		RCM.instance.playerSettings.readFromNBT(properties);
	}
	
	@Override
	public void init(Entity entity, World world) 
	{

	}
}