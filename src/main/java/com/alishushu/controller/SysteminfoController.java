package com.alishushu.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alishushu.bean.Messages;
import com.alishushu.bean.Pagese;
import com.alishushu.bean.Systeminfo;
import com.alishushu.service.SysteminfoService;
import com.alishushu.util.GetUUID;
import com.alishushu.util.RequestUtils;

@Controller
@Aspect
public class SysteminfoController {
	@Autowired
	SysteminfoService systeminfoService;
	@Autowired
	Systeminfo systeminfo;
	@RequestMapping(value="/insertsysmess")
	public String insertmess(HttpServletRequest  request){
		String systeminfoid=GetUUID.getUUID();
		String sysinfocontext=request.getParameter("sysinfocontext");
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String releasedate=simpleDateFormat.format(date);
		systeminfo.setManagerid("111111");
		systeminfo.setReleasedate(releasedate);
		systeminfo.setSysinfocontext(sysinfocontext);
		systeminfo.setSysteminfoid(systeminfoid);
		System.out.println(systeminfo);
		//systeminfoService.ss();
		systeminfoService.insertmess(systeminfo);
		long count=systeminfoService.countsystody();
		request.getSession().setAttribute("messcount", count);
		return "store/storeindex.jsp";
	}
	@RequestMapping(value="/selectallmess")
	public String selectallmess(HttpServletRequest request){
		List<Messages> list=systeminfoService.selectallmess();
		request.getSession().setAttribute("allmess", list);
		return "systemmess/allsysmess.jsp";
	}
	@RequestMapping("/deletesysmess")
	public String deletesysmess(HttpServletRequest request){
		String systeminfoid=request.getParameter("systeminfoid");
		systeminfoService.deletesysmess(systeminfoid);
		return "selectallmess";
		
	}
	
	@RequestMapping(value="/selectmesspage")
	public String selectannounce(HttpServletRequest request){
				Map<String, Object> splitPageParam = RequestUtils.getSplitPageParam(request);
				Integer start = (Integer)splitPageParam.get("start");
				Integer end = (Integer)splitPageParam.get("end");
				Integer page = (Integer)splitPageParam.get("page");
				Integer pageSize = (Integer)splitPageParam.get("pageSize");
				Pagese pagese=new Pagese(start,end);
				List<Messages> list=systeminfoService.selectmesspage(pagese);
				request.getSession().setAttribute("allmess", list);
				int count=systeminfoService.selectcountmess();
				request.setAttribute("totalPage", (count-1)/pageSize+1);
				request.setAttribute("page", page);		
		        return "systemmess/allsysmess.jsp";
		
	}

}
