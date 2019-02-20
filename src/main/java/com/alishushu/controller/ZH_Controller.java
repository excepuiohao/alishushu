package com.alishushu.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alishushu.bean.Itmessage;
import com.alishushu.bean.Systeminfo;
import com.alishushu.bean.Users;
import com.alishushu.service.AddressService;
import com.alishushu.service.ZH_Service;
import com.alishushu.util.GetLAL;
import com.alishushu.util.GetWeek;
import com.alishushu.util.Tuling;

@Controller
public class ZH_Controller {

	@Autowired
	ZH_Service service;
	@Autowired
	AddressService addressService;

	@RequestMapping(value = "MakeAMap")
	public ModelAndView MakeAMap(ModelAndView modelAndView,
			@RequestParam(value = "Shopsid") String Shopsid,HttpServletRequest request) throws IOException {
		System.out.println("start：" + Shopsid);
		
		Users u=(Users)request.getSession().getAttribute("users");
		String Buyerid=u.getUsersid();
		String start = service.FindAddressBySelerid(Shopsid);
		
		String endAddressID = service.FindAddressByBuyerid(Buyerid);
		
		String  end=addressService.selectByPrimaryKey(endAddressID).getAddress();
		System.out.println(end);
		///////地址id   得到地址
		Object[] o = GetLAL.getCoordinate(start);
		Object[] o1 = GetLAL.getCoordinate(end);
		
		modelAndView.addObject("startLongitude", o[0]);
		modelAndView.addObject("startLatitude", o[1]);
		modelAndView.addObject("endLongitude",o1[0]);
		modelAndView.addObject("endLatitude",o1[1]);
		modelAndView.setViewName("GetLogistics.jsp");
		return modelAndView;
	}

	@RequestMapping(value = "LMYRobot/{val}", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> LMYRobot(ModelAndView modelAndView, @PathVariable("val") String str,
			HttpServletRequest request) throws IOException {
		//str = new String(str.getBytes("ISO-8859-1"), "UTF-8");
		String message = Tuling.getWord(str);// 得到回复消息
		System.out.println(str+"xiaoxi");
		System.out.println("回复消息"+message);
		request.setCharacterEncoding("utf-8");
		//response.set
		Map<String, String> map = new HashMap<>();
		map.put("message", message);
		return map;

	}

	@RequestMapping(value = "ViewPerformanceByLine")
	public ModelAndView ViewPerformanceByLine(ModelAndView modelAndView, HttpServletRequest request) {

		Users u = (Users) request.getSession().getAttribute("users");//
	    //Users u1 = new Users();
		//u1.setUsersid("4444");//
		int money[] = { 0, 0, 0, 0, 0, 0, 0 };
		@SuppressWarnings("unused")
		String Selerid = u.getUsersid();
		Date ordertime = new Date();
		@SuppressWarnings("unused")
		List<String> list = GetWeek.getWeekByDate(ordertime);
		for (int i = 0; i < list.size(); i++) {
			int a = service.FindMoneyByItemId(list.get(i), Selerid);
			money[i] = a;
		}
		modelAndView.addObject("money", money);
		modelAndView.setViewName("BaoBiaoZhuXing.jsp");

		return modelAndView;
	}

	@RequestMapping(value = "ViewMessage")
	public ModelAndView ViewMessage(ModelAndView modelAndView, Model model, HttpServletRequest request) {

		 Users u = (Users) request.getSession().getAttribute("users");//
//		Users u1 = new Users();
//		u1.setUsersid("11111");
		String userid = u.getUsersid();
		List<Itmessage> list = service.FindMessage(userid);
		System.out.println(list);
		// modelAndView.addObject("message", list);
		model.addAttribute("message", list);
		modelAndView.addObject("ddd", "jguhygv");
		modelAndView.setViewName("jsp/showItems.jsp");
		return modelAndView;
	}

	@RequestMapping(value = "DeleteMessage")
	public ModelAndView DeleteMessage(ModelAndView modelAndView, Model model, HttpServletRequest request,
			@RequestParam(value = "messageid") String messageid) {

		 Users u = (Users) request.getSession().getAttribute("users");//
//		Users u1 = new Users();
//		u1.setUsersid("11111");
		service.DeleteMessage(messageid);
		String userid = u.getUsersid();
		List<Itmessage> list = service.FindMessage(userid);
		System.out.println(list);
		model.addAttribute("message", list);
		modelAndView.setViewName("ViewMessage.jsp");
		return modelAndView;
	}

	@RequestMapping(value = "ReplyMessage")
	public ModelAndView ReplyMessage(ModelAndView modelAndView, Model model, HttpServletRequest request,
			@RequestParam(value = "fromid") String fromid, @RequestParam(value = "messcontext") String messcontext,
			@RequestParam(value="messageid") String messageid, @RequestParam(value="itemid") String itemid) throws UnsupportedEncodingException{

		Users u = (Users) request.getSession().getAttribute("users");//
		messcontext=new String(messcontext.getBytes("ISO-8859-1"),"utf-8");
		//Users u1 = new Users();
		//u1.setUsersid("11111");
		String userid = u.getUsersid();
		SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
		String messtime = sdf.format(new Date());
		service.InsertMessage(fromid, itemid, userid, messcontext, messtime,"1");
		service.UpdateMessage(messageid);
		List<Itmessage> list = service.FindMessage(userid);
		System.out.println(list);
		model.addAttribute("message", list);
		modelAndView.setViewName("ViewMessage.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value = "SelectAllmess")
	public ModelAndView SelectAllmess(ModelAndView modelAndView, Model model, HttpServletRequest request) throws UnsupportedEncodingException{

		List<Systeminfo> list = service.FindSysteminfo();
		System.out.println(list);
		model.addAttribute("message", list);
		modelAndView.setViewName("ViewSysteminfo.jsp");
		return modelAndView;
	}
	
	
	@RequestMapping(value = "UserMessage")
	public String UserMessage(ModelAndView modelAndView, Model model, HttpServletRequest request,
			@RequestParam(value = "fromid") String fromid, @RequestParam(value = "messcontext") String messcontext,
		   @RequestParam(value="itemid") String itemid) throws UnsupportedEncodingException{

		Users u = (Users) request.getSession().getAttribute("users");//
		messcontext=new String(messcontext.getBytes("ISO-8859-1"),"utf-8");
		SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
		String messtime = sdf.format(new Date());
		service.InsertMessage("11111", itemid, " ", messcontext, messtime,"0");
		return "jsp/showItems.jsp";

	
	}
	
	@RequestMapping(value = "ViewItem")
	public ModelAndView ViewItem(ModelAndView modelAndView, Model model, HttpServletRequest request,
			@RequestParam(value = "itemid") String itemid) {

		 Users u = (Users) request.getSession().getAttribute("users");//
		//Users u1 = new Users();
		//u1.setUsersid("11111");
		String userid = u.getUsersid();
		List<com.alishushu.bean.UserMessage> list=service.FindItmessage(itemid);
		System.out.println(list);
		model.addAttribute("UserMessage", list);
		modelAndView.setViewName("jsp/showItems.jsp");
		return modelAndView;
}
}
