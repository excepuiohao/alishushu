package com.alishushu.service;

import java.util.List;

import com.alishushu.bean.Shopcar;

public interface ShopcarService {
public List selectByUserid(String userId);
	
	public Shopcar selectByUseridItemid(String userId,String itemId);
	
	public int  deleteOne(String userId, String itemId);
	
	public void updateCount(Shopcar shopcar);
	
	public int insertShopcar(String userid,String itemid);

}
