package com.alishushu.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.Shopcar;
import com.alishushu.bean.ShopcarExample;
import com.alishushu.mapper.ShopcarMapper;
import com.alishushu.service.ShopcarService;
@Service
public class ShopcarServiceImpl implements ShopcarService {
	@Autowired
	ShopcarMapper shopcarMapper;
	
	@Override
	public List selectByUserid(String userId) {
		ShopcarExample shopcarExample = new ShopcarExample();
		shopcarExample.createCriteria().andUseridEqualTo(userId);
		
		List<Shopcar> list = shopcarMapper.selectByExample(shopcarExample);
		

		return list;
	}

	@Override
	public int deleteOne(String userId, String itemId) {
		ShopcarExample shopcarExample = new ShopcarExample();
		shopcarExample.createCriteria().andUseridEqualTo(userId).andItemidEqualTo(itemId);
		int count =  shopcarMapper.deleteByExample(shopcarExample);
		return count;
	}

	@Override
	public Shopcar selectByUseridItemid(String userId, String itemId) {
		ShopcarExample shopcarExample = new ShopcarExample();
		shopcarExample.createCriteria().andUseridEqualTo(userId).andItemidEqualTo(itemId);
		List<Shopcar> list = shopcarMapper.selectByExample(shopcarExample);
		Shopcar shopcar = null;
		for(Shopcar sp: list){
			shopcar = sp;
		}
		return shopcar;
	}

	@Override
	public void updateCount(Shopcar shopcar) {
		ShopcarExample shopcarExample = new ShopcarExample();
		shopcarExample.createCriteria().andUseridEqualTo(shopcar.getUserid())
		                          .andItemidEqualTo(shopcar.getItemid());
		shopcarMapper.updateByExample(shopcar, shopcarExample);
	}

	@Override
	public int insertShopcar(String userid, String itemid) {
		// 返回值num
		int num = 0;
		ShopcarExample shopcarExample = new ShopcarExample();
		shopcarExample.createCriteria().andUseridEqualTo(userid).andItemidEqualTo(itemid);
		List<Shopcar> list = shopcarMapper.selectByExample(shopcarExample);
		Shopcar shopcar  = new Shopcar();
		shopcar.setUserid(userid);
		shopcar.setItemid(itemid);
		int count1 = 1;
		BigDecimal count = new BigDecimal(count1);
		shopcar.setItemcount(count);
		System.out.println("list" + list);
		if(list.isEmpty()){
			System.out.println("125456");
			num = shopcarMapper.insert(shopcar);
		}else{
			BigDecimal  countOld = null;
			for(Shopcar record:list){
			  countOld = record.getItemcount();
			  System.out.println(countOld);
			}
			BigDecimal countNew  = countOld.add(count);
			shopcar.setItemcount(countNew);
			ShopcarExample shopcarExample2 = new ShopcarExample();
			shopcarExample2.createCriteria().andUseridEqualTo(userid).andItemidEqualTo(itemid);
			num = shopcarMapper.updateByExampleSelective(shopcar,shopcarExample2);
		}
		return num;
	}

}
