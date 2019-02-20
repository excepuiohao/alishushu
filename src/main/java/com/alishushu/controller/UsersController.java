package com.alishushu.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alishushu.bean.Address;
import com.alishushu.bean.Users;
import com.alishushu.service.AddressService;
import com.alishushu.service.ShopService;
import com.alishushu.service.UsersService;
import com.alishushu.util.GetUUID;
import com.alishushu.util.NanoTime;
import com.alishushu.util.Upload;

@Controller
public class UsersController {
	@Autowired
	UsersService usersService;
	@Autowired
	ShopService shopService;
	
	@Autowired
	AddressService addressService;
	@RequestMapping(value="/selectuser")
	public String selectuser(HttpServletRequest request){
		String str=(String) request.getSession().getAttribute("condition");
		System.out.println(str);
		List list=usersService.selectuser(str);
		List l=usersService.selectalluser();
		request.getSession().setAttribute("selectuser", list);
		System.out.println(list);
		System.out.println(l);
		return "userpeo/usersmg.jsp";
		
	}
	@RequestMapping(value="/selectuser1",method=RequestMethod.POST)
	@ResponseBody
	public List<Users> selectuser1(@RequestBody Map<String,String> map,HttpServletRequest request){
		System.out.println(map.get("con1"));
		String str=map.get("con1");
		request.getSession().setAttribute("condition", str);
		List<Users> list=usersService.selectuser(str);
		request.getSession().setAttribute("selectuser", list);
		System.out.println(list);
		return list;
	}
	@RequestMapping(value="/deleteuser")
    public String deleteuser(HttpServletRequest request){
    	String usersid=request.getParameter("usersid");
    	usersService.deleteuser(usersid);
    	System.out.println(usersid);
    	return "selectuser";
    }
	
	@RequestMapping("/getUid")
	public String Reg(HttpServletRequest request) {
		String userid = NanoTime.getNanoTime();
		request.getSession().setAttribute("usersid", userid);
		return "register/reg2.jsp";	
	}
	
	@RequestMapping("/regUsers")
	public String regUsers(HttpServletRequest request) throws IOException{
		String usersid = (String) request.getSession().getAttribute("usersid");
		String email = (String) request.getSession().getAttribute("emailed");
		String upwd = request.getParameter("upwd");
		String nickname = request.getParameter("nickname");
		String yemail = request.getParameter("yemail");
		String url = "images/16935736350014.jpg";
		Users users = new Users();
		users.setPhoto(url);
		users.setUsersid(usersid);
		users.setEmail(email);
		users.setUpwd(upwd);
		users.setNickname(nickname);
		if(yemail!=null){
		users.setIntegral(50);
		}else{
			users.setIntegral(20);
		}
		long count = usersService.insert(users);
		if(count!=0){
			request.setAttribute("nickname", nickname);
			Users users1 = new Users();
			users1.setEmail(yemail);
			users1.setIntegral(20);
			long count1 = usersService.updateByEamil(users1);
		return "register/reg3.jsp";
		}
		else{
			return "register/reg2.jsp";
		}
	}
	

	
	   @RequestMapping(value="/queryByNikname", method=RequestMethod.POST) 
	   @ResponseBody
        public long queryByName(@RequestBody Map<String,String> map){
		System.out.println("123");
		String nik=map.get("nikname");
		System.out.println(nik);
	    long  count=usersService.selectusercount(nik);
	     System.out.println(count);
	     return count;
	   }
	   
	   @RequestMapping(value="/queryByYemail", method=RequestMethod.POST) 
	   @ResponseBody
        public long queryByYemail(@RequestBody Map<String,String> map){
		 String email=map.get("yemail");
	     long  count=usersService.seByEamil(email);
	     System.out.println(count);
	     return count;
	   }
	   
	   @RequestMapping("/userlogin")
	   public String login(HttpServletRequest request){
		   Users users = new Users();
		   String username = request.getParameter("username");
		   String upwd = request.getParameter("upwd");
		   users.setNickname(username);
		   users.setEmail(username);
		   users.setUpwd(upwd);
		   Users users1 = usersService.seByUpwd(users);
		   if(users1!=null){
			   System.out.println("2222");
			   String userid = users1.getUsersid();
			   request.getSession().setAttribute("userid", userid);
			   request.getSession().setAttribute("users", users1);
			   int n=shopService.selectshopcount(userid);
			   request.getSession().setAttribute("shopcount", n);
			   //查询消息数量，留言，系统消息，待写；
		     return "selectByPageview";
		     }
		   else {
			   return "redirect:login/login.jsp";
		}
	   }
	   
	   @RequestMapping("/PerfectPersonalInformation")
	   public String PerfectPersonalInformation(@RequestParam("uploadFile") MultipartFile uploadFile,
				HttpServletRequest request, HttpSession session) {
		   System.out.println("perfectpersoninformation!!!!!!!!!!");
		   String url = Upload.upload(uploadFile, session);
		   String addressidString=GetUUID.getUUID();
		   System.out.println("路径:"+url);
		   System.out.println("perfectpersoninformation!!!!!!!!!!");
		   String cmbProvince = request.getParameter("cmbProvince");
		   String cmbCity = request.getParameter("cmbCity");
		   String cmbArea = request.getParameter("cmbArea");
		   String address = cmbProvince+cmbCity+cmbArea;
		   String uname = request.getParameter("uname");
		   String phone = request.getParameter("phone");
		   String idcard = request.getParameter("idcard");
		   String userid = (String) request.getSession().getAttribute("userid");
		   Address address1=new Address();
		   address1.setAddid(addressidString);
		   address1.setAddress(address);
		   address1.setUsersid(userid);
		   Users users = new Users();
		   users.setUsersid(userid);
		   users.setPhoto(url);
		   users.setAddress(addressidString);
		   users.setUname(uname);
		   users.setPhone(phone);
		   users.setIdcard(idcard);
		   System.out.println("user用户："+users);
		   System.out.println("address地址"+address1);
		   usersService.updateByPrimaryKeySelective(users);
		   addressService.insert(address1);
		   Users users1 =usersService.selectByPrimaryKey(userid);
		   request.getSession().setAttribute("users", users1);
		   return "redirect:permeg/info2.jsp";
		   
	   }
	   
	  
}
