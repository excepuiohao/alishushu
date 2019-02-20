package com.alishushu.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alishushu.bean.ItShOr;
import com.alishushu.bean.Items;
import com.alishushu.bean.Orderitem;
import com.alishushu.bean.Ordernew;
import com.alishushu.bean.Users;
import com.alishushu.service.ItemsService;
import com.alishushu.service.OrderitemService;
import com.alishushu.service.ShopcarService;
import com.alishushu.util.NanoTime;

@Controller
public class OrderitemController {
	@Autowired
	OrderitemService os;
	@Autowired
	ItemsService is;
	@Autowired
	Items item;
	@Autowired
	Orderitem orderitem;
	@Autowired
	ShopcarService scs;
	@Autowired
	Ordernew onn;
	
	
	@RequestMapping("/addorder")
	public String addOrder(@RequestParam("itemId")String[] itemsid,@RequestParam("totalprice")String total,HttpServletRequest req){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-hh-mm");//设置日期格式
		String time = (String)df.format(new Date());
		List<String> list = new ArrayList<>();
		for (String itemid : itemsid)
		{
			list.add(itemid);
			String orderid = NanoTime.getNanoTime(); //生成订单编号
			String logistal = NanoTime.getNanoTime(); //生成物流单号
			item = is.selectByItemsid(itemid); //获取商品信息
			orderitem.setOrderid(orderid);
			orderitem.setOrdertime(time);
			orderitem.setSelerid(item.getShopid());
			orderitem.setItemid(itemid);
			orderitem.setRecestate("未收货");
			Users users=(Users)req.getSession().getAttribute("users");
			orderitem.setBuyerid(users.getUsersid());
			orderitem.setShipstate("未发货");
			orderitem.setLogistal(logistal);
			os.addOrderItem(orderitem);
		}
		/*scs.deleteMore("4444", list);*/
		return "jsp/zhiFu.jsp";
	}
	
	
	@RequestMapping("/selectOrd")
	public String selectOrd(HttpServletRequest request){
		String userid = (String) request.getSession().getAttribute("userid");
		System.out.println(userid);
		String state1 = "未发货";
		String state4 = "已发货";
		String state2 = "未收货";
		String state3 = "已收货";
		onn.setBuyerid(userid);
		
		//卖家未发货
		onn.setShipstate(state1);
		onn.setRecestate(state2);
	
		List<Ordernew> list2 = new  ArrayList<Ordernew>();
		list2 = os.selectByUsers(onn);
		request.getSession().setAttribute("list2", list2);
		System.out.println(list2);
		
		//买家未收货
		onn.setShipstate(state4);
		List<Ordernew> list1 = new  ArrayList<Ordernew>();
		list1 = os.selectByUsers(onn);
		request.getSession().setAttribute("list1", list1);
		System.out.println(list1);
		

		
		//已收货
		onn.setRecestate(state3);
		List<Ordernew> list3 = new  ArrayList<Ordernew>();
		list3 = os.selectByUsers(onn);
		request.getSession().setAttribute("list3", list3);
		System.out.println(list3);
		
		return "redirect:ch/order.jsp";
		
	}
	
	
	@RequestMapping("/selectOrdFirst")
	public String selectOrdFirst(HttpServletRequest request){
		String userid = (String) request.getSession().getAttribute("userid");
		onn.setBuyerid(userid);
		
		//卖家未发货
		String state1 = "未发货";
		String state2 = "未收货";
		onn.setShipstate(state1);
		onn.setRecestate(state2);
		
		

		List<Ordernew> list2 = new  ArrayList<Ordernew>();
		list2 = os.selectByUsers(onn);
		request.getSession().setAttribute("list2", list2);
		
		//覆盖之前的list
		List<Ordernew> list1 = new  ArrayList<Ordernew>();
		List<Ordernew> list3 = new  ArrayList<Ordernew>();
		list1 = null;
		list3 = null;
		request.getSession().setAttribute("list1", list1);
		request.getSession().setAttribute("list3", list3);
		return "redirect:ch/order.jsp";
		
	}
	
	@RequestMapping("/selectOrdSecond")
	public String selectOrdSecond(HttpServletRequest request){
		String userid = (String) request.getSession().getAttribute("userid");
		onn.setBuyerid(userid);
		
		//买家未收货
		String state4 = "已发货";
		String state2 = "未收货";
		onn.setShipstate(state4);
		onn.setRecestate(state2);
		
		
	
		List<Ordernew> list1 = new  ArrayList<Ordernew>();
		list1 = os.selectByUsers(onn);
		request.getSession().setAttribute("list1", list1);
		
		//覆盖之前的list
		List<Ordernew> list2 = new  ArrayList<Ordernew>();
		List<Ordernew> list3 = new  ArrayList<Ordernew>();
		list2 = null;
		list3 = null;
		request.getSession().setAttribute("list2", list2);
		request.getSession().setAttribute("list3", list3);
		
		return "redirect:ch/order.jsp";
		
	}
	

	

	
	@RequestMapping("/selectOrdThird")
	public String selectOrdThird(HttpServletRequest request){
		String userid = (String) request.getSession().getAttribute("userid");
		onn.setBuyerid(userid);
		
		//买家已收货
		String state4 = "已发货";
		String state3 = "已收货";
		onn.setShipstate(state4);
		onn.setRecestate(state3);
		
		
	
		List<Ordernew> list3 = new  ArrayList<Ordernew>();
		list3 = os.selectByUsers(onn);
		request.getSession().setAttribute("list3", list3);
		
		//覆盖之前的list
		List<Ordernew> list1 = new  ArrayList<Ordernew>();
		List<Ordernew> list2 = new  ArrayList<Ordernew>();
		list1 = null;
		list2 = null;
		request.getSession().setAttribute("list1", list1);
		request.getSession().setAttribute("list2", list2);
		
		return "redirect:ch/order.jsp";
		
	}
	
	@RequestMapping("/updateIntegral")
	public String updateIntegral(HttpServletRequest request){
		String userid = request.getParameter("selerid");
		String price = request.getParameter("price");
		String orderid = request.getParameter("orderid");
		int count = os.updateStatue(orderid);
		return "selectOrdSecond";
	}

}

