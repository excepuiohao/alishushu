package com.alishushu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alishushu.bean.Shop;
import com.alishushu.bean.Users;
import com.alishushu.service.ShopService;
import com.alishushu.service.UsersService;
import com.alishushu.util.GetUUID;

@Controller
public class ShopController {
	@Autowired
	Users users;
	@Autowired
	Shop shop;
	@Autowired
	ShopService shopService;
	@Autowired
	UsersService usersService;
	@RequestMapping(value="/insertshop")
	public String insertshop(HttpServletRequest request){
		String shopsid=GetUUID.getUUID();
		String shopname=request.getParameter("shopname");
		String usersid=request.getSession().getAttribute("userid").toString();
		String shopaddr=request.getParameter("cmbProvince")
				+request.getParameter("cmbCity")
				+request.getParameter("cmbArea");
		shop.setShopname(shopname);
		shop.setShopsid(shopsid);
		shop.setUsersid(usersid);
		shop.setStar("4");
		shop.setShopaddr(shopaddr);
		shopService.insertshop(shop);
		users.setIdcard(request.getParameter("idcard"));
		users.setUsersid(usersid);
		usersService.updateByPrimaryKeySelective(users);
		request.getSession().setAttribute("shopp", shopsid);
		return "shop/shopSuccess.jsp";
		
	}
	@RequestMapping(value="/jiaoyan")
	public void  selectshopcount(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String usersid=request.getSession().getAttribute("userid").toString();
		int n=shopService.selectshopcount(usersid);
		if(n>=1){
			System.out.println("店铺数量："+n);
			System.out.println("1234567890");
			response.getWriter().print("<script>alert('只能开一个店铺哟！');window.location='selectByPageview'</script>");
			//return Content("<script>alert('请先登录');history.go(-1);</script>"); 
			//return "";
		}
		else{
			
			response.sendRedirect("shop/shop1.jsp");
		}
		//return "shop/shop1.jsp";
		
	}

}
