package com.thom.rcm.skills;

public class Skill 
{
	public String name;
	
	private int level = 1;
	private double experience = 0;
	
	public Skill(String name) 
	{
		this.name = name;
	}
	
	public int getLevel() 
	{
		return level;
	}
	
	public void setLevel(int level) 
	{
		this.level = level;
	}
	
	public double getExperience() 
	{
		return experience;
	}
	
	public void setExperience(double xp) 
	{
		this.experience = xp;
	}
	
	public void replaceValues(Skill skill)
	{
		setLevel(skill.getLevel());
		setExperience(skill.getExperience());
	}
}