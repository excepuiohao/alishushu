package com.alishushu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.Shop;
import com.alishushu.bean.ShopExample;
import com.alishushu.bean.ShopcarExample;
import com.alishushu.mapper.ShopMapper;
import com.alishushu.service.ShopService;
@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	ShopMapper shopMapper;

	@Override
	public void insertshop(Shop shop) {
		// TODO Auto-generated method stub
		shopMapper.insert(shop);
	}

	@Override
	public Shop selectByShopid(String shopsid) {
		// TODO 自动生成的方法存根
		Shop shop = shopMapper.selectByPrimaryKey(shopsid);
		return shop;
	}

	@Override
	public int selectshopcount(String usersid) {
		// TODO Auto-generated method stub
		return shopMapper.selectshopcount(usersid);
	}

	@Override
	public Shop selectShopByUserid(String userid) {
		// TODO Auto-generated method stub
		ShopExample shopExample=new ShopExample();
		shopExample.createCriteria().andUsersidEqualTo(userid);
		return shopMapper.selectByExample(shopExample).get(0);
	}

}
