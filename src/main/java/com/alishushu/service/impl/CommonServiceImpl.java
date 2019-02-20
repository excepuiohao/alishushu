package com.alishushu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.Common;
import com.alishushu.mapper.CommonMapper;
import com.alishushu.service.CommonService;
@Service
public class CommonServiceImpl implements CommonService{
	@Autowired
	CommonMapper commonMapper;

	@Override
	public void insertcomm(Common common) {
		// TODO Auto-generated method stub
		commonMapper.insert(common);
	}

}
