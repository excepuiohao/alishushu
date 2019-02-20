package com.alishushu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.ItShOr;
import com.alishushu.bean.Orderitem;
import com.alishushu.bean.Ordernew;
import com.alishushu.mapper.OrderitemMapper;
import com.alishushu.service.OrderitemService;

@Service
public class OrderitemServiceImpl implements OrderitemService{
@Autowired
OrderitemMapper om;

	@Override
	public List<Ordernew> selectByUsers(Ordernew onn) {
		// TODO Auto-generated method stub
		List<Ordernew> list = new ArrayList<Ordernew>();
		list = om.selectByUsers(onn);
		return list;
	}

	public int addOrderItem(Orderitem orderitem){
		return om.insert(orderitem);
	}

	@Override
	public int updateStatue(String orderid) {
		Orderitem orderitem = new Orderitem();
		orderitem.setOrderid(orderid);
		String statue = "已收货";
		orderitem.setRecestate(statue);
		int count = om.updateByPrimaryKeySelective(orderitem);

		return count;
	}

}
