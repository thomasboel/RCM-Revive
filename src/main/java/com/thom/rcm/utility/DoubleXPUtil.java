package com.thom.rcm.utility;

public class DoubleXPUtil 
{
	public static int daysToDoubleXP()
	{
		String currentDate = DateUtil.getDateToday();
		int currentDay = Integer.valueOf(currentDate.substring(0, 2));
		int currentMonth = Integer.valueOf(currentDate.substring(3, 5));
		
		return getDaysInMonth(currentMonth) - currentDay;
	}
	
	public static int getDaysInMonth(int month)
	{
		switch (month) {
		case 1:
			return 31;
		case 2:
			return 29;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5: 
			return 31;
		case 6:
			return 30;
		case 7: 
			return 31;
		case 8: 
			return 31;
		case 9:
			return 30;
		case 10: 
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}
	}
}