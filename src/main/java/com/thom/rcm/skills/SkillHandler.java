package com.thom.rcm.skills;

import com.thom.rcm.utility.LogHelper;
import com.thom.rcm.utility.NBTUtil;
import com.thom.rcm.utility.SkillReference;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;

public class SkillHandler 
{
	public Skill[] skills = new Skill[26];
	
	public SkillHandler() 
	{	
		for (int i = 0; i < skills.length; i++)
		{
			if (skills[i] == null)
			{
				skills[i] = new Skill(SkillReference.skill[i]);
			}
		}
	}
	
	public void writeToNBT(NBTTagCompound compound)
	{
		for(Skill skill : skills)
		{
			NBTUtil.setSkill(compound, skill);
		}
	}
	
	public void readFromNBT(NBTTagCompound compound)
	{
		for(Skill skill : skills)
		{
			skill.replaceValues(NBTUtil.getSkill(compound, skill));
		}
	}
	
	public void setLevel(String skill, int level, double xp)
	{
		for (int i = 0; i < skills.length; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				skills[i].setLevel(level);
				skills[i].setExperience(xp);
			}
		}
	}
	
	public int getLevel(String skill)
	{
		for (int i = 0; i < skills.length; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				return skills[i].getLevel();
			}
		}
		return 0;
	}
	
	public void setExperience(String skill, double xp)
	{
		for (int i = 0; i < skills.length; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				skills[i].setExperience(xp);
			}
		}
	}
	
	public double getExperience(String skill)
	{
		for (int i = 0; i < skills.length; i++)
		{
			if (skill.equalsIgnoreCase(SkillReference.skill[i]))
			{
				return skills[i].getExperience();
			}
		}
		return 0;
	}
	
	public int getTotalLevel()
	{
		int totalLevel = 0;
		
		for (int i = 0; i < skills.length; i++)
		{
			totalLevel += skills[i].getLevel();
		}
		
		return totalLevel;
	}
	
	public double getTotalExperience()
	{
		double totalExperience = 0D;
		
		for (int i = 0; i < skills.length; i++)
		{
			totalExperience += skills[i].getExperience();
		}
		
		return totalExperience;
	}
	
	public void addXPToSkill(String skill, double xp)
	{
		// Double XP HERE
		
		setExperience(skill, getExperience(skill) + xp);
		
		LogHelper.info(xp + " xp gained in " + skill + "!");
	}
	
	public void levelUp(String skill, int level)
	{
		LogHelper.info("You leveled up in " + skill + "! You are now level " + level + "!");
		//Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("You leveled up in " + skill + "! You are now level " + level + "!"));
	}
}