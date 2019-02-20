package com.alishushu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alishushu.bean.Items;
import com.alishushu.bean.NewPutdate;
import com.alishushu.service.NewPutdateService;

@Controller
public class NewPutdateController {
	@Autowired
	NewPutdateService nps;
	
	@RequestMapping("/selectNew")
	public String selectNew(HttpServletRequest request){
		List<Items> list = new ArrayList<Items>();
		list = nps.selectByDate();
		ArrayList<Items> al=new ArrayList<Items>();
	    for(int i=0;i<6;i++){
	    	al.add(list.get(i));
	    	
	    }
	    System.out.println("chengconghui"+al.size());
		request.getSession().setAttribute("NewPutdate", al);
		System.out.println(al+"1111111111");
		return "jsp/alishushu.jsp";
		
	}

}
