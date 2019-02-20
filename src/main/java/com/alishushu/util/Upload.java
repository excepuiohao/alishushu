package com.alishushu.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

public class Upload {
	public static String upload(MultipartFile uploadFile, HttpSession session) {
		// 获取上传的文件名
		String filename = uploadFile.getOriginalFilename();


		// 获取上传服务器的路径
		String path = session.getServletContext().getRealPath("/images");
		
		//获取图片的新名称
		String name = Imgname.getImgname(filename);

		File file = new File(path, name);

		try {
			uploadFile.transferTo(file);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String url = Constants.uploadPath + name; 

		return url;
	}
}
