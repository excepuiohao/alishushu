package com.alishushu.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alishushu.bean.Items;
import com.alishushu.bean.Shop;
import com.alishushu.bean.Shopcar;
import com.alishushu.bean.Users;
import com.alishushu.service.ItemsService;
import com.alishushu.service.ShopService;
import com.alishushu.service.ShopcarService;
import com.alishushu.service.UsersService;
import com.alishushu.service.impl.ShopServiceImpl;

@Controller
public class ShopcarController {
	@Autowired
	ShopcarService scs;
	@Autowired
	ItemsService its;
	@Autowired
	ShopService ssv;
	@Autowired
	UsersService usv;
	
	@RequestMapping(value="/shopcar")
	public String selectShopcar(HttpServletRequest request,
			HttpServletResponse response){
		String userId = request.getParameter("userid");
		System.out.println("用户id为" + userId);
		List<Shopcar> shopcars = scs.selectByUserid(userId);
		//声明一个list集合，用于存放商品
		List<Items> list = new ArrayList<Items>();
		for(Shopcar it:shopcars){
			Items item = its.selectByItemsid(it.getItemid());
			item.setItemcount(it.getItemcount());
			list.add(item);
		}
		//声明一个set集合，用于存放购物车里面所有的店铺
		TreeSet<String> shops =	new TreeSet<String>();
		for(Items item:list){
			Shop shop = ssv.selectByShopid(item.getShopid());
			shops.add(shop.getShopname());
		}
		Map<String, List> map = new HashMap<String, List>();
		Iterator<String> iterator = shops.iterator();
		while(iterator.hasNext()){
			List<Items> list0 = new ArrayList<Items>();
			String shopname = iterator.next();
			for(Items item:list){
				Shop shop = ssv.selectByShopid(item.getShopid());
				if(shopname.equals(shop.getShopname())){
					list0.add(item);
				}
			}
			map.put(shopname, list0);
		}
		request.setAttribute("map", map);
		request.getSession().setAttribute("userId", userId);
		return "ch/mycart.jsp";
	}
	
	@RequestMapping(value="/deleteOne")
	public String deleteOne(HttpServletRequest request,
			HttpServletResponse response){
		String itemId = request.getParameter("itemId");		
		String userId = (String) request.getSession().getAttribute("userId");
		int count = scs.deleteOne(userId, itemId);
		System.out.println("删除个数为" + count);
		
		return "shopcar";
		
	}
	
	@RequestMapping(value="orderShow")
	public String orderShow(HttpServletRequest request,
			HttpServletResponse response){
		Users users1=(Users)request.getSession().getAttribute("users");
		String userId = users1.getUsersid();
		String count1 = request.getParameter("count");
		/*String userId = "4444";
		String count1 = "5";*/
		int count = Integer.parseInt(count1);
		System.out.println("总共几件商品：" + count);
		/*String total = request.getParameter("total");*/
		String total = "11970";
		System.out.println("总共多少价钱：" + total);
		List<Items> list = new ArrayList<Items>();
		int zekou=0;
		for(int i=1; i<count; i++){
			String itemId = request.getParameter("itemId" + i);
			/*String itemId = "63a38276dfad420ab8b23d6a275831ac";*/
			System.out.println("第"+i+"个商品id" + itemId);
			Items item = its.selectByItemsid(itemId); 
			System.out.println("查找到的唯一商品" + item);
			//将原有商品数量设置为购物车商品数量
			Shopcar shopcar = scs.selectByUseridItemid(userId,itemId);
			System.out.println("通过购物车查找到的数量" + shopcar);
			item.setItemcount(shopcar.getItemcount());
			//将上架日期设置为店铺名称
			Shop shop = ssv.selectByShopid(item.getShopid());
			System.out.println("所属商铺" + shop);
			item.setPutdate(shop.getShopname());
			//将卖家id设置为店铺名称
			Users users = usv.selectByUsersid(item.getUserid());
			System.out.println("卖家账户" + users);
			item.setUserid(users.getUname());
			//新改商品
			System.out.println(item);
			list.add(item);
			zekou = users.getIntegral();
		}
		request.getSession().setAttribute("integral", zekou);
		request.getSession().setAttribute("buyOrderList", list);
		request.getSession().setAttribute("total", total);
		return "address/selectAllAddress1";	
	}
	

	@RequestMapping(value="/updateCount/{a}/{b}",method=RequestMethod.POST)
	public String updateCount(@PathVariable("a")String a,@PathVariable("b")String b,HttpServletRequest request){
		System.out.println(a+b);
		String userid = (String) request.getSession().getAttribute("userId");
		System.out.println("买家id" + userid);
		String itemid= a;
		System.out.println("商品id" + itemid);
		String count1= b;
		BigDecimal count = new BigDecimal(count1);
		System.out.println("商品数量" + count);
		Shopcar shopcar = new Shopcar();
		shopcar.setUserid(userid);
		shopcar.setItemid(itemid);
		shopcar.setItemcount(count);
		scs.updateCount(shopcar);
		return "mycart.jsp";
	}
	
	@RequestMapping(value="/testone")
	public String selectone(HttpServletRequest request,
			HttpServletResponse response){
		Map<String,List> map = new HashMap<String, List>();
		List<String> list1 = new ArrayList<String>();
		list1.add("土豆");
		list1.add("马铃薯");
		list1.add("都是一样");
		List<String> list2 = new ArrayList<String>();
		list2.add("西红柿");
		list2.add("番茄");
		list2.add("一样一样");
		List<String> list3 = new ArrayList<String>();
		list3.add("老鼠");
		list3.add("米老鼠");
		list3.add("大不一样");
		map.put("1", list1);
		map.put("2",list2);
		map.put("3", list3);
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		System.out.println("输出map集合中的元素");
		while(it.hasNext()){
			String num = it.next();
			System.out.println(num + ":");
			List<String> list = map.get(num);
			for(String str:list){
				System.out.println(str);
			}
		}
		request.setAttribute("map", map);
		return "onecart.jsp";	
	}
	
	
	@RequestMapping(value="/insertShopcar/{a}")
	public String insertShopcar(@PathVariable("a")String itemid,HttpServletRequest request){
		System.out.println("进入controller");
		String userid = request.getSession().getAttribute("userid").toString(); 
		
		int num = scs.insertShopcar(userid, itemid);
		System.out.println("更新数据" + num);
		
		
		return "jsp/showItems.jsp";
		
	}
	
	
	
	
	
	
}
