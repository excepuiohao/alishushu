package com.alishushu.service;

import java.util.List;
import java.util.Map;

import com.alishushu.bean.Items;

public interface ItemsService {
	
	List<Items> selectallitem(String shopid);
	
	void deleteitem(String itemid);
	
	void insertitem(Items items);
	
	 public List<Items> selectByCondition(Map<String,String> condition);
	   
	 public Items selectByItemsid(String itemsId);
	 
     public List<Items> selectByPageview();
	 
	 public List<Items> selectByPrice();
	 
	 public Items selectitem(String itemid);

}
