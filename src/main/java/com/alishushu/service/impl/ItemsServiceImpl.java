package com.alishushu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.Items;
import com.alishushu.mapper.ItemsMapper;
import com.alishushu.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService{
	@Autowired
	ItemsMapper itemsMapper;

	@Override
	public List<Items> selectallitem(String shopid) {
		return itemsMapper.selectallitem(shopid);
	}

	@Override
	public void deleteitem(String itemid) {
		// TODO Auto-generated method stub
		itemsMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public void insertitem(Items items) {
		// TODO Auto-generated method stub
		itemsMapper.insert(items);
	}

	@Override
	public List<Items> selectByCondition(Map<String, String> condition) {
		// TODO 自动生成的方法存根
		return itemsMapper.selectByCondition(condition);
	}

	@Override
	public Items selectByItemsid(String itemid) {
		
		Items item = itemsMapper.selectByPrimaryKey(itemid);
		
		return item;
	} 
	
	@Override
	public List<Items> selectByPageview(){
		List<Items> list = itemsMapper.selectByPageview();
		return list;
	}
	 
	@Override
	public List<Items> selectByPrice(){
		List<Items> list = itemsMapper.selectByPrice();
		
		return list;
	}

	@Override
	public Items selectitem(String itemid) {
		// TODO Auto-generated method stub
		return itemsMapper.selectByPrimaryKey(itemid);
	}

}
