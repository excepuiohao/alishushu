package com.alishushu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.Items;
import com.alishushu.mapper.NewPutdateMapper;
import com.alishushu.service.NewPutdateService;

@Service
public class NewPutdateServiceImpl implements NewPutdateService{
@Autowired
NewPutdateMapper npm;

	@Override
	public List<Items> selectByDate() {
		// TODO Auto-generated method stub
		List<Items> list  = new ArrayList<Items>();
		list = npm.selectByDate();
		return list;
	}

}
