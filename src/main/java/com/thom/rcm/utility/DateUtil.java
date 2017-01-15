package com.thom.rcm.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.minecraft.client.Minecraft;
//import javabuckets.mods.rcm.guis.GUIDailyGift;
//import javabuckets.mods.rcm.main.RCM;

public class DateUtil 
{
	public static String date;
	
	public static String getDate()
	{
		Date dNow = new Date( );
	    SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
		
		return ft.format(dNow).toString();
	}
	
	public static String getDateToday()
	{
		String unformated = getDate();
		
		String day = unformated.substring(8);
		String month = unformated.substring(5, 7);
		String year = unformated.substring(0, 4);
		
		String formated = day + "-" + month + "-" + year;
		
		return formated;
	}
	
	public static void dateHandling()
	{
		Minecraft mc = Minecraft.getMinecraft();
		
//		date = RCM.instance.dailyGiftHandler.getDate();
//		
//		RCM.instance.dailyGiftHandler.setDate(getDateToday());
	}
}