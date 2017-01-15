package com.thom.rcm.utility;

public class SkillReference 
{
	public static final String att = "attack";
	public static final String cons = "constitution";
	public static final String mine = "mining";
	public static final String str = "strength";
	public static final String agi = "agility";
	public static final String smith = "smithing";
	public static final String def = "defence";
	public static final String herb = "herblore";
	public static final String fish = "fishing";
	public static final String range = "ranged";
	public static final String thiev = "thieving";
	public static final String cook = "cooking";
	public static final String pray = "prayer";
	public static final String craft = "crafting";
	public static final String fm = "firemaking";
	public static final String mage = "magic";
	public static final String fletch = "fletching";
	public static final String wc = "woodcutting";
	public static final String rc = "runecrafting";
	public static final String slay = "slayer";
	public static final String farm = "farming";
	public static final String con = "construction";
	public static final String hunt = "hunter";
	public static final String summ = "summoning";
	public static final String dung = "dungeoneering";
	public static final String div = "divination";
	
	public static String[] skill = { att, cons, mine, str, agi, smith, def, herb, fish, range, thiev, cook, pray, craft, fm, mage, fletch, wc, rc, slay, farm, con, hunt, summ, dung, div };
	
	public static double getXpFromLevel(int lvl)
	{
		if (lvl == 1) { return 0; }
		else if (lvl == 2) { return 83; }
		else if (lvl == 3) { return 174; } 	
		else if (lvl == 4) { return 276; }
		else if (lvl == 5) { return 388; }
		else if (lvl == 6) { return 512; }
		else if (lvl == 7) { return 650; }
		else if (lvl == 8) { return 801; }
		else if (lvl == 9) { return 969; }
		else if (lvl == 10) { return 1154; }
		else if (lvl == 11) { return 1358; }
		else if (lvl == 12) { return 1584; }
		else if (lvl == 13) { return 1833; }
		else if (lvl == 14) { return 2107; }
		else if (lvl == 15) { return 2411; }
		else if (lvl == 16) { return 2746; }
		else if (lvl == 17) { return 3115; }
		else if (lvl == 18) { return 3523; }
		else if (lvl == 19) { return 3973; }
		else if (lvl == 20) { return 4470; }
		else if (lvl == 21) { return 5018; }
		else if (lvl == 22) { return 5624; }
		else if (lvl == 23) { return 6291; }
		else if (lvl == 24) { return 7028; }
		else if (lvl == 25) { return 7842; }
		else if (lvl == 26) { return 8740; }
		else if (lvl == 27) { return 9730; }
		else if (lvl == 28) { return 10824; }
		else if (lvl == 29) { return 12031; }
		else if (lvl == 30) { return 13363; }
		else if (lvl == 31) { return 14833; }
		else if (lvl == 32) { return 16456; }
		else if (lvl == 33) { return 18247; }
		else if (lvl == 34) { return 20224; }
		else if (lvl == 35) { return 22406; }
		else if (lvl == 36) { return 24815; }
		else if (lvl == 37) { return 27473; }
		else if (lvl == 38) { return 30408; }
		else if (lvl == 39) { return 33648; }
		else if (lvl == 40) { return 37224; }
		else if (lvl == 41) { return 41171; }
		else if (lvl == 42) { return 45529; }
		else if (lvl == 43) { return 50339; }
		else if (lvl == 44) { return 55649; }
		else if (lvl == 45) { return 61512; }
		else if (lvl == 46) { return 67983; }
		else if (lvl == 47) { return 75127; }
		else if (lvl == 48) { return 83014; }
		else if (lvl == 49) { return 91721; }
		else if (lvl == 50) { return 101333; }
		else if (lvl == 51) { return 111945; }
		else if (lvl == 52) { return 123660; }
		else if (lvl == 53) { return 136594; }
		else if (lvl == 54) { return 150872; }
		else if (lvl == 55) { return 166636; }
		else if (lvl == 56) { return 184040; }
		else if (lvl == 57) { return 203254; }
		else if (lvl == 58) { return 224466; }
		else if (lvl == 59) { return 247886; }
		else if (lvl == 60) { return 273742; }
		else if (lvl == 61) { return 302288; }
		else if (lvl == 62) { return 333804; }
		else if (lvl == 63) { return 368599; }
		else if (lvl == 64) { return 407015; }
		else if (lvl == 65) { return 449428; }
		else if (lvl == 66) { return 496254; }
		else if (lvl == 67) { return 547953; }
		else if (lvl == 68) { return 605032; }
		else if (lvl == 69) { return 668051; }
		else if (lvl == 70) { return 737627; }
		else if (lvl == 71) { return 814445; }
		else if (lvl == 72) { return 899257; }
		else if (lvl == 73) { return 992895; }
		else if (lvl == 74) { return 1096278; }
		else if (lvl == 75) { return 1210421; }
		else if (lvl == 76) { return 1336443; }
		else if (lvl == 77) { return 1475581; }
		else if (lvl == 78) { return 1629200; }
		else if (lvl == 79) { return 1798808; }
		else if (lvl == 80) { return 1986068; }
		else if (lvl == 81) { return 2192818; }
		else if (lvl == 82) { return 2421087; }
		else if (lvl == 83) { return 2673114; }
		else if (lvl == 84) { return 2951373; }
		else if (lvl == 85) { return 3258594; }
		else if (lvl == 86) { return 3597792; }
		else if (lvl == 87) { return 3972294; }
		else if (lvl == 88) { return 4385776; }
		else if (lvl == 89) { return 4842295; }
		else if (lvl == 90) { return 5346332; }
		else if (lvl == 91) { return 5902831; }
		else if (lvl == 92) { return 6517253; }
		else if (lvl == 93) { return 7195629; }
		else if (lvl == 94) { return 7944614; }
		else if (lvl == 95) { return 8771558; }
		else if (lvl == 96) { return 9684577; }
		else if (lvl == 97) { return 10692629; }
		else if (lvl == 98) { return 11805606; }
		else if (lvl == 99) { return 13034431; }
		else if (lvl == 100) { return 14391160; }
		else if (lvl == 101) { return 15889109; }
		else if (lvl == 102) { return 17542976; }
		else if (lvl == 103) { return 19368992; }
		else if (lvl == 104) { return 21385073; }
		else if (lvl == 105) { return 23611006; }
		else if (lvl == 106) { return 26068632; }
		else if (lvl == 107) { return 28782069; }
		else if (lvl == 108) { return 31777943; }
		else if (lvl == 109) { return 35085654; }
		else if (lvl == 110) { return 38737661; }
		else if (lvl == 111) { return 42769801; }
		else if (lvl == 112) { return 47221641; }
		else if (lvl == 113) { return 52136869; }
		else if (lvl == 114) { return 57563718; }
		else if (lvl == 115) { return 63555443; }
		else if (lvl == 116) { return 70170840; }
		else if (lvl == 117) { return 77474828; }
		else if (lvl == 118) { return 85539082; }
		else if (lvl == 119) { return 94442737; }
		else if (lvl == 120) { return 104273167; }
		else if (lvl == 121) { return 200000000; }
		else { return 0; }
	}
}