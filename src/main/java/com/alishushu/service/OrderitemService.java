package com.alishushu.service;

import java.util.List;

import com.alishushu.bean.ItShOr;
import com.alishushu.bean.Orderitem;
import com.alishushu.bean.Ordernew;

public interface OrderitemService {
	 List<Ordernew> selectByUsers(Ordernew onn);
	public int addOrderItem(Orderitem orderitem);
	
	public int updateStatue(String orderid);

}
