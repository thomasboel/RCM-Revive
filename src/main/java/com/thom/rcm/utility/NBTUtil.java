package com.thom.rcm.utility;

import com.thom.rcm.skills.Skill;

import net.minecraft.nbt.NBTTagCompound;

public class NBTUtil 
{
	public static void setSkill(NBTTagCompound compound, Skill skill)
	{
		compound.setInteger(skill.name + "Level", skill.getLevel());
		compound.setDouble(skill.name + "Experience", skill.getExperience());
	}
	
	public static Skill getSkill(NBTTagCompound compound, Skill skill)
	{
		Skill s = new Skill(skill.name);
		
		s.setLevel(compound.getInteger(skill.name + "Level"));
		s.setExperience(compound.getDouble(skill.name + "Experience"));
		
		return s;
	}
}