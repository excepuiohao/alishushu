package com.alishushu.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.alishushu.util.Constants;
import com.alishushu.util.Imgname;
import com.alishushu.util.Upload;

@Controller
public class UploadImgController {

	@RequestMapping("/uploadImg")
	public String uploadImg(
			@RequestParam("uploadFile") MultipartFile uploadFile,
			HttpServletRequest request, HttpSession session) {
	    String url = Upload.upload(uploadFile, session);
	    System.out.println(request.getParameter("aaa"));
		System.out.println(url);
		request.setAttribute("name", url);
        
		return "showphoto.jsp";
	}

}
