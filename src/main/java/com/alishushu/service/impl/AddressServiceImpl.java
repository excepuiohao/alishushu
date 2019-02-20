package com.alishushu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.Address;
import com.alishushu.bean.AddressExample;
import com.alishushu.mapper.AddressMapper;
import com.alishushu.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService
{
	@Autowired
	AddressMapper am;

	@Override
	public List<Address> selectAllAddressByUser(String userId)
	{
		return am.selectAllAddressByUser(userId);
	}

	@Override
	public long countByExample(AddressExample example)
	{
		// TODO Auto-generated method stub
		return am.countByExample(example);
	}

	@Override
	public int deleteByExample(AddressExample example)
	{
		// TODO Auto-generated method stub
		return am.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String addid)
	{
		// TODO Auto-generated method stub
		return am.deleteByPrimaryKey(addid);
	}

	@Override
	public int insert(Address record)
	{
		// TODO Auto-generated method stub
		return am.insert(record);
	}

	@Override
	public int insertSelective(Address record)
	{
		// TODO Auto-generated method stub
		return am.insertSelective(record);
	}

	@Override
	public List<Address> selectByExample(AddressExample example)
	{
		// TODO Auto-generated method stub
		return am.selectByExample(example);
	}

	@Override
	public Address selectByPrimaryKey(String addid)
	{
		// TODO Auto-generated method stub
		return am.selectByPrimaryKey(addid);
	}

	@Override
	public int updateByExampleSelective(Address record, AddressExample example)
	{
		// TODO Auto-generated method stub
		return am.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Address record, AddressExample example)
	{
		// TODO Auto-generated method stub
		return am.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Address record)
	{
		// TODO Auto-generated method stub
		return am.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Address record)
	{
		// TODO Auto-generated method stub
		return am.updateByPrimaryKey(record);
	}
	
	public int deleteAdd(String addid){
		System.out.println(addid+"123123");
		AddressExample ae = new AddressExample();
		ae.createCriteria().andAddidEqualTo(addid);
		return am.deleteByExample(ae);
	}

	public int updateAddress(Address add){
		AddressExample ae = new AddressExample();
		ae.createCriteria().andAddidEqualTo(add.getAddid());
		return am.updateByExampleSelective(add, ae);
	}
}
