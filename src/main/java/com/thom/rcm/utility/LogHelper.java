package com.thom.rcm.utility;

public class LogHelper 
{
    public static void debug(String info)
    {
    	System.out.println("[DEBUG] " + info);
    }

    public static void error(String info)
    {
    	System.out.println("[ERROR] " + info);
    }

    public static void fatal(String info)
    {
    	System.out.println("[FATAL] " + info);
    }

    public static void info(String info)
    {
        System.out.println(info);
    }

    public static void warn(String info)
    {
        System.out.println("[WARNING] " + info);
    }
}