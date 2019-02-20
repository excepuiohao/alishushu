package com.alishushu.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Tuling {
	/**
	 * 向后台发送post请求
	 * 
	 * @param param
	 * @return
	 */
	private static String APIKEY = "1d57354ffcf64e5d9fb0323e75ebc62a";// 官网注册后，换成你自己的

	public static String getWord(String question) throws IOException {
		String INFO = URLEncoder.encode(question, "utf-8");
		String getURL = "http://www.tuling123.com/openapi/api?key=" + APIKEY + "&info=" + INFO;
		URL getUrl = new URL(getURL);
		HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
		connection.connect();

		// 取得输入流，并使用Reader读取
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
		StringBuffer sb = new StringBuffer();
		String line = "";
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
		// 断开连接
		connection.disconnect();
		sb.delete(0, 23);// 移除前面的相关代码
		sb.reverse();// 倒序内容
		sb.delete(0, 2);
		sb.reverse();// 恢复正常排序
		return sb.toString();
	}
	/*
	public static void main(String args[]){
		try {
			System.out.println(new Tuling().getWord("你好！"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
