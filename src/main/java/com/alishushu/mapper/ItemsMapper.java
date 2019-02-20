package com.alishushu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.alishushu.bean.Items;
import com.alishushu.bean.ItemsExample;

public interface ItemsMapper {
	List<Items> selectallitem(String shopid);
	
    long countByExample(ItemsExample example);

    int deleteByExample(ItemsExample example);

    int deleteByPrimaryKey(String itemid);

    int insert(Items record);

    int insertSelective(Items record);

    List<Items> selectByExample(ItemsExample example);

    Items selectByPrimaryKey(String itemid);

    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
    
    List<Items> selectByCondition(Map<String,String> condition);
    
    public List<Items> selectByPageview();
	 
	public List<Items> selectByPrice();
}