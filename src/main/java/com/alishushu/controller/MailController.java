package com.alishushu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alishushu.util.MailTest;
import com.alishushu.util.VerCode;

@Controller
public class MailController {
	
	@RequestMapping("/emailTest")
	public String emailTest(HttpServletRequest request){

    VerCode vc = new VerCode();
	String str = vc.rand();
	String email = request.getParameter("email");
	System.out.println(email);
	MailTest mail = new MailTest();  
    mail.setSubject("验证码");  
    mail.setContent(str);  
    request.getSession().setAttribute("str", str);
    request.getSession().setAttribute("emailed", email);
    //收件人 可以发给其他邮箱(163等) 下同  
    mail.setTo(new String[] {email});   
    //发送邮件  
    try {  
        mail.sendMessage();  
        System.out.println("发送邮件成功！");  
        
    } catch (Exception e) {  
        System.out.println("发送邮件失败！");  
        e.printStackTrace();  
    }  
		return "register/reg1.jsp";
		
	}
	@RequestMapping("/emver")
	public String emver(HttpServletRequest request){
		String ver = request.getParameter("ver");
		String  meg = (String)request.getSession().getAttribute("str");
		if (ver.equals(meg)) {
			return "/getUid";
		}else
			
		return "register/reg1.jsp";
		
	}

}
