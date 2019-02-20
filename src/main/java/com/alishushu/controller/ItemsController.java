package com.alishushu.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alishushu.bean.Items;
import com.alishushu.bean.Shop;
import com.alishushu.bean.Users;
import com.alishushu.service.ItemsService;
import com.alishushu.service.ShopService;
import com.alishushu.util.GetUUID;
import com.alishushu.util.Upload;

@Controller
public class ItemsController {
	@Autowired
	Users users;
	@Autowired
	Items  items;
	@Autowired
	ItemsService itemsService;
	@Autowired
	ShopService shopService;
	@RequestMapping(value="/selectallitem")
	public String selectallitem(HttpServletRequest request){
		users=(Users)request.getSession().getAttribute("users");
		Shop shop=shopService.selectShopByUserid(users.getUsersid());
		String shopid=shop.getShopsid();
		List list=itemsService.selectallitem(shopid);
		request.getSession().setAttribute("allitem", list);
		request.getSession().setAttribute("myshop", shop);
		request.setAttribute("username", users.getUname());
		request.setAttribute("stateee", "1");
		int star=Integer.parseInt(shop.getStar());
		request.setAttribute("star", star);
		System.out.println(list);
		return "store/storeindex.jsp";
		
	}
	@RequestMapping(value="/deleteitem")
	public String deleteitem(HttpServletRequest request){
		String itemid=request.getParameter("itemid");
		System.out.println(itemid);
		//itemsService.deleteitem(itemid);
		return "selectallitem";
	}
	@RequestMapping(value="/insertitem")
	public String insertitem(HttpServletRequest request
			,@RequestParam("uploadFile") MultipartFile uploadFile,
			HttpSession session){
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
		String putdate=formatter.format(date);
		 String itemid=GetUUID.getUUID();
	    String itemname=request.getParameter("itemname");
	    String iteminfo=request.getParameter("iteminfo");
	     //String itempic=request.getParameter("itempic");
	     //String shopid=request.getParameter("shopid");
	     //String userid=request.getParameter("userid");
	     BigDecimal price=new BigDecimal(Integer.parseInt(request.getParameter("price")));
	    //String putdate=request.getParameter("putdate");
	     //String downdate=request.getParameter("itemname");
	     //String status=request.getParameter("statue");
	     String levels=request.getParameter("levels");
	     //BigDecimal pageview=new BigDecimal(Integer.parseInt(request.getParameter("pageview")));
	     Shop shop=shopService.selectShopByUserid(users.getUsersid());
			String shopid=shop.getShopsid();
	     BigDecimal pageview=new BigDecimal(90);
	     BigDecimal itemcount=new BigDecimal(Integer.parseInt(request.getParameter("itemcount")));
	     items.setItemid(itemid);
	     items.setItemname(itemname);
	     //items.setItempic(itempic);
	     items.setPrice(price);
	     items.setIteminfo(iteminfo);
	     items.setShopid(shopid);
	     users=(Users)request.getSession().getAttribute("users");
	     items.setUserid(users.getUsersid());
	     items.setStatus("在售");
	     items.setLevels(levels);
	     items.setPutdate(putdate);
	     items.setItemcount(itemcount);
	     items.setPageview(pageview);
	     
	     String url = Upload.upload(uploadFile, session);
		 System.out.println(url);
		 items.setItempic(url);
		 //request.setAttribute("name", url);
	     itemsService.insertitem(items);
	     System.out.println(items);
	     return "selectallitem";
	}
	
	@RequestMapping(value="/rulerSelectItems")
	@ResponseBody
	public List<Items> ItemsShow(HttpServletRequest request, HttpServletResponse response,@RequestBody Map<String,String> map){
		System.out.println("jsonajax+1111111111111");
		String date=map.get("startdate1");
		String type=map.get("itemtype1");
		String statue=map.get("statue1");
		String shopaddr1=map.get("cmbProvince1");
		String shopaddr2=map.get("cmbCity1");
		String shopaddr3=map.get("cmbArea1");
		String shopaddr4=shopaddr1+shopaddr2+shopaddr3;
		//String date = request.getParameter("date");
		System.out.println("123456");
		Map<String,String> condition = new HashMap<String, String>();
		condition.put("putdate", date);
		condition.put("typename", type);
		
		condition.put("status", statue);
		condition.put("shopaddr", shopaddr4);
		List<Items> list = itemsService.selectByCondition(condition);
		System.out.println(list);
		request.setAttribute("list", list);
		request.setAttribute("date", date);
		return list;
	}
	
	//查询浏览量最后的前几个
		@RequestMapping(value="/selectByPageview")
		public String selectByPageview(HttpServletRequest request,
	            HttpServletResponse response){
			System.out.println("1111111111111111111111");
			List<Items> list = new ArrayList<Items>();
			
			list = itemsService.selectByPageview();
			ArrayList<Items> al=new ArrayList<Items>();
			for(int i=0;i<6;i++){
				al.add(list.get(i));
				
			}
			request.getSession().setAttribute("listPageview", al);
			System.out.println(al.size()+"chnhaode");
			System.out.println(list);
			return "selectByPrice";
		}
		
		
		//查询价格最高的前几个
		@RequestMapping(value="/selectByPrice")
		public String selectByPrice(HttpServletRequest request,
	            HttpServletResponse response){
			List<Items> list = new ArrayList<Items>();
			list = itemsService.selectByPrice();
			ArrayList<Items> al=new ArrayList<Items>();
			for(int i=0;i<12;i++){
				al.add(list.get(i));
				
			}
			request.getSession().setAttribute("listPrice", al);
			System.out.println("jiaqianhehe"+al.size());
			return "selectNew";
		}
		@RequestMapping(value="/selectitembyid")
		public String selectitem(HttpServletRequest request){
			String itemsId=request.getParameter("itemsid");
			Items items=itemsService.selectByItemsid(itemsId);
			String shopid=items.getShopid();
			Shop shop=shopService.selectByShopid(shopid);
			request.setAttribute("shopn", shop);
			request.setAttribute("item", items);
			System.out.println(items+"商品id的商品");
			System.out.println("商品"+items);
			return "jsp/showItems.jsp";
			
		}
		@RequestMapping("/additem")
		public String additem(){
			
			return "store/insertitem.jsp";
			
			
		}

}
