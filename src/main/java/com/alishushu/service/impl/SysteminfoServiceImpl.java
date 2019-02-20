package com.alishushu.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.Messages;
import com.alishushu.bean.Pagese;
import com.alishushu.bean.Systeminfo;
import com.alishushu.bean.SysteminfoExample;
import com.alishushu.mapper.SysteminfoMapper;
import com.alishushu.service.SysteminfoService;
@Service
public class SysteminfoServiceImpl implements SysteminfoService {
	@Autowired
	SysteminfoMapper systeminfoMapper;

	@Override
	public void insertmess(Systeminfo systeminfo) {
		// TODO Auto-generated method stub
		systeminfoMapper.insert(systeminfo);
	}

	@Override
	//@After("execution(* com.alishushu.service.SysteminfoService.*(..))")
	public long countsystody() {
		// TODO Auto-generated method stub
		SysteminfoExample example=new SysteminfoExample();
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String releasedate=simpleDateFormat.format(date);
		example.createCriteria().andReleasedateEqualTo(releasedate);
		long count=systeminfoMapper.countByExample(example);
		System.out.println("hahahahhaah!!!!!!!!!!!!!!");
		System.out.println(count);
		return count;
	}

	@Override
	public void ss() {
		// TODO Auto-generated method stub
		System.out.println("3ssssssssssssssssssssss");
	}
	@Override
	public List<Messages> selectallmess() {
		// TODO Auto-generated method stub
		
		return systeminfoMapper.selectallmess();
	}

	@Override
	public void deletesysmess(String systeminfoid) {
		// TODO Auto-generated method stub
		systeminfoMapper.deleteByPrimaryKey(systeminfoid);
		
	}

	@Override
	public List<Messages> selectmesspage(Pagese pagese) {
		// TODO Auto-generated method stub
		return systeminfoMapper.selectmesspage(pagese);
	}

	@Override
	public int selectcountmess() {
		// TODO Auto-generated method stub
		return systeminfoMapper.selectcountmess();
	}

}
