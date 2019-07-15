package com.alishushu.aspect;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import com.alishushu.bean.SysteminfoExample;
import com.alishushu.mapper.SysteminfoMapper;

@Aspect
public class Systemadvice {
	@Autowired
	SysteminfoMapper systeminfoMapper;
	@After("execution(* com.alishushu.service.SysteminfoService.insertmess(..))")
	public void countsystody() {
		// TODO Auto-generated method stub
		SysteminfoExample example=new SysteminfoExample();
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String releasedate=simpleDateFormat.format(date);
		example.createCriteria().andReleasedateEqualTo(releasedate);
		long count=systeminfoMapper.countByExample(example);
		System.out.println("hahahahhaah!!!!!!!!!!!!!!");
		System.out.println(count);
		//request.getSession().setAttribute("count", count);
		//return count;
	}
}
