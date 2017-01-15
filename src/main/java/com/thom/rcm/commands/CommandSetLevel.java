package com.thom.rcm.commands;

import java.util.List;

import com.thom.rcm.RCM;
import com.thom.rcm.utility.SkillReference;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandSetLevel extends CommandBase
{
	public String getCommandName() 
	{
		return "setlevel";
	}

	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/setlevel <skill> <level>";
	}

	public int getRequiredPermissionLevel() 
	{
		return 0;
	}

	public void processCommand(ICommandSender icommandsender, String[] astring) 
	{
		if (icommandsender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)icommandsender;

			if(astring.length == 0)
			{
				icommandsender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Usage: /setlevel <skill> <level>"));
				return;
			}

			addLevelToSkill(icommandsender, astring, SkillReference.att);
			addLevelToSkill(icommandsender, astring, SkillReference.cons);
			addLevelToSkill(icommandsender, astring, SkillReference.mine);
			addLevelToSkill(icommandsender, astring, SkillReference.str);
			addLevelToSkill(icommandsender, astring, SkillReference.agi);
			addLevelToSkill(icommandsender, astring, SkillReference.smith);
			addLevelToSkill(icommandsender, astring, SkillReference.def);
			addLevelToSkill(icommandsender, astring, SkillReference.herb);
			addLevelToSkill(icommandsender, astring, SkillReference.fish);
			addLevelToSkill(icommandsender, astring, SkillReference.range);
			addLevelToSkill(icommandsender, astring, SkillReference.thiev);
			addLevelToSkill(icommandsender, astring, SkillReference.cook);
			addLevelToSkill(icommandsender, astring, SkillReference.pray);
			addLevelToSkill(icommandsender, astring, SkillReference.craft);
			addLevelToSkill(icommandsender, astring, SkillReference.fm);
			addLevelToSkill(icommandsender, astring, SkillReference.mage);
			addLevelToSkill(icommandsender, astring, SkillReference.fletch);
			addLevelToSkill(icommandsender, astring, SkillReference.wc);
			addLevelToSkill(icommandsender, astring, SkillReference.rc);
			addLevelToSkill(icommandsender, astring, SkillReference.slay);
			addLevelToSkill(icommandsender, astring, SkillReference.farm);
			addLevelToSkill(icommandsender, astring, SkillReference.con);
			addLevelToSkill(icommandsender, astring, SkillReference.hunt);
			addLevelToSkill(icommandsender, astring, SkillReference.summ);
			addLevelToSkill(icommandsender, astring, SkillReference.dung);
			addLevelToSkill(icommandsender, astring, SkillReference.div);
		}
	}

	public void addLevelToSkill(ICommandSender icommandsender, String[] astring, String skill)
	{
		if (astring[0].equalsIgnoreCase(skill))
		{
			if (Integer.valueOf(astring[1]) >= 121 && skill == SkillReference.dung)
			{
				icommandsender.addChatMessage(new ChatComponentText("The Level you have entered is too high!"));
			}
			else if (Integer.valueOf(astring[1]) >= 100 && !(skill == SkillReference.dung))
			{
				icommandsender.addChatMessage(new ChatComponentText("The Level you have entered is too high!"));
			}
			else if (Integer.valueOf(astring[1]) <= 0)
			{
				icommandsender.addChatMessage(new ChatComponentText("The Level you have entered is too small!"));
			}
			else
			{
				//CommandSetLvlChecker.checker(skill, Integer.valueOf(astring[1]));
				int level = Integer.valueOf(astring[1]);
				RCM.instance.skillHandler.addXPToSkill(skill, SkillReference.getXpFromLevel(level) - RCM.instance.skillHandler.getExperience(skill));
				RCM.instance.skillHandler.setLevel(skill, level, SkillReference.getXpFromLevel(level));
				RCM.instance.skillHandler.levelUp(skill, level);
			}

			/*RCM.instance.skillHandler.updateBoostLvls();

			if (skill == SkillReference.pray) {
				RCM.instance.prayer.rechargePrayerPoints();
			}
			if (skill == SkillReference.summ) {
				RCM.instance.summoning.rechargeSummoningPoints();
			}*/
		}	
	}

	public List addTabCompletionOptions(ICommandSender par1iCommandSender, String[] astring) 
	{
		if (astring.length == 1)
		{
			return getListOfStringsMatchingLastWord(astring, new String[] { SkillReference.att, SkillReference.cons, SkillReference.mine, SkillReference.str, SkillReference.agi, SkillReference.smith, SkillReference.def, SkillReference.herb, SkillReference.fish, SkillReference.range, SkillReference.thiev, SkillReference.cook, SkillReference.pray, SkillReference.craft, SkillReference.fm, SkillReference.mage, SkillReference.fletch, SkillReference.wc, SkillReference.rc, SkillReference.slay, SkillReference.farm, SkillReference.con, SkillReference.hunt, SkillReference.summ, SkillReference.dung, SkillReference.div });
		}
		return null;
	}
}