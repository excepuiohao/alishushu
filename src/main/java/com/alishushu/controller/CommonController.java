package com.alishushu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alishushu.bean.Common;
import com.alishushu.service.CommonService;
import com.alishushu.util.GetUUID;

@Controller
public class CommonController {
	@Autowired
	Common common;
	@Autowired
	CommonService commonService;
	@RequestMapping(value="/insertcomm")
	public String insertcomm(HttpServletRequest request){
		String commcontext=request.getParameter("commcontext");
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
		String commtime=formatter.format(date);
		String commonid=GetUUID.getUUID();
		String usersid="11111";
		String shopsid="222222222222";
		String levels=request.getParameter("levels");
		common.setCommcontext(commcontext);
		common.setCommonid(commonid);
		common.setCommtime(commtime);
		common.setShopsid(shopsid);
		common.setUsersid(usersid);
		common.setLevels(levels);
		commonService.insertcomm(common);
		System.out.println(common);
		return "b.jsp";
	}

}
