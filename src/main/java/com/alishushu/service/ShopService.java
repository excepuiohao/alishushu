package com.alishushu.service;

import com.alishushu.bean.Shop;

public interface ShopService {
	void insertshop(Shop shop);
	
    Shop selectByShopid(String shopsid);
	
	int selectshopcount(String usersid);
	
	Shop selectShopByUserid(String userid);

}
