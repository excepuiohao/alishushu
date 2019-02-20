package com.alishushu.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alishushu.bean.Address;
import com.alishushu.bean.Users;
import com.alishushu.service.AddressService;
import com.alishushu.service.UsersService;
import com.alishushu.util.GetUUID;

@Controller
@RequestMapping("address")
public class AddressController {

	@Autowired
	AddressService as;
	@Autowired
	Address a;
	@Autowired
	UsersService us;
	@Autowired
	Users u;
	List<Address> list;
	//Users users=(Users)req.getSession().getAttribute("users");
	@RequestMapping("/insertAddress")
	public String insertAddress(@RequestParam("name")String name,@RequestParam("phone")String phone,@RequestParam("address")String address,HttpServletRequest req) throws IOException{
		System.out.println("*****************************************************************************");
		a.setAddid(GetUUID.getUUID());
		Users users=(Users)req.getSession().getAttribute("users");
		a.setUsersid(users.getUsersid());
		/*name = new String(name.getBytes("ISO-8859-1"),"utf-8");
		phone = new String(phone.getBytes("ISO-8859-1"),"utf-8");
		address = new String(address.getBytes("ISO-8859-1"),"utf-8");*/
		a.setName(name);
		a.setPhone(phone);
		a.setAddress(address);
		as.insert(a);
		return "address/selectAllAddress";
	}
	@RequestMapping("/selectAllAddress")
	public void selectAllAddress(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		Users users=(Users)req.getSession().getAttribute("users");
		list = as.selectAllAddressByUser(users.getUsersid());
		req.getSession().setAttribute("addlist", list);
		resp.sendRedirect("http://localhost:8080/alishushu/jsp/address.jsp");
	}
	@RequestMapping("/selectAllAddress1")
	public void selectAllAddress1(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		Users users=(Users)req.getSession().getAttribute("users");
		Address add = as.selectByPrimaryKey(us.selectByPrimaryKey(users.getUsersid()).getAddress());
		req.getSession().setAttribute("add", add);
		resp.sendRedirect("http://localhost:8080/alishushu/jsp/buyOrder.jsp");
	}
	@RequestMapping("/selectMoRAddress")
	public void selectMoRAddress(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		req.setCharacterEncoding("UTF-8");
		Users users=(Users)req.getSession().getAttribute("users");
		u = us.selectByPrimaryKey(users.getUsersid());
		Address add = null;	
		req.getSession().setAttribute("add", add);
		resp.sendRedirect("http://localhost:8080/alishushu/jsp/buyOrder.jsp");
	}
	@RequestMapping("/updateMoren/{addid}")
	public String updateMoren(@PathVariable("addid")String addid,HttpServletRequest req){
		Users users=(Users)req.getSession().getAttribute("users");
		u.setUsersid(users.getUsersid());
		u.setAddress(addid);
		us.updateMren(u);
		return "jsp/address.jsp";
	}
	@RequestMapping("/deleteAdd/{addid}")
	public String deleteAdd(@PathVariable("addid")String addid){
		System.out.println(addid);
		as.deleteAdd(addid);
		return "jsp/address.jsp";
	}
	@RequestMapping("/updateAddress/{addid}/{name}/{phone}/{address}")
	public String updateAddress(@PathVariable("addid")String addid,@PathVariable("name")String name,@PathVariable("phone")String phone,@PathVariable("address")String address) throws UnsupportedEncodingException{
		a.setAddid(addid);
		a.setName(new String(name.getBytes("ISO-8859-1"),"UTF-8"));
		a.setPhone(phone);
		a.setAddress(new String(address.getBytes("ISO-8859-1"),"UTF-8"));
		as.updateAddress(a);
		return "address/selectAllAddress";
	}
}
