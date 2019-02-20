package com.alishushu.util;

//图片名称
public class Imgname {
	//头像，名称为用户id
	public static String getImgnameId(String usersId,String name){
		int point = name.lastIndexOf(".");

		String ext = name.substring(point);

		return usersId+ext;
	}
	
	//图片，名称随机
	public static String getImgname(String name){
		int point = name.lastIndexOf(".");
		String ext = name.substring(point);
		
		long a =  System.nanoTime();
		String str = String.valueOf(a);
		
		return str+ext;	
	}
}
