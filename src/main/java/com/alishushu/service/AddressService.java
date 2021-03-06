package com.alishushu.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alishushu.bean.Address;
import com.alishushu.bean.AddressExample;

public interface AddressService {
	List<Address> selectAllAddressByUser(String userId);
	
	long countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(String addid);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(String addid);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
    
    public int deleteAdd(String addid);
    
    public int updateAddress(Address add);
}
