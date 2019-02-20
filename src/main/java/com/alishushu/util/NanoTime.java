package com.alishushu.util;

public class NanoTime {
	
	//用户id
	public static String getNanoTime(){
		long t =  System.nanoTime();
		String str = String.valueOf(t);
		return str;
	}
}
