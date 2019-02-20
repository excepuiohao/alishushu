package com.alishushu.util;

import java.util.Random;

import org.junit.Test;

public class VerCode {
	
	public String rand(){
		Random random = new Random();
        String result = "";
        for(int i=0;i<6;i++){
        	result+=random.nextInt(10);
        }
		System.out.println(result);
		return result;
	}

}
