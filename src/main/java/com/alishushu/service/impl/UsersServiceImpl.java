package com.alishushu.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alishushu.bean.AddressExample.Criteria;
import com.alishushu.bean.Users;
import com.alishushu.bean.UsersExample;
import com.alishushu.mapper.UsersMapper;
import com.alishushu.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersMapper usersMapper;
	@Autowired
	Users users;

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> selectalluser() {
		// TODO Auto-generated method stub
		return usersMapper.selectalluser();
	}

	@Override
	public List<Users> selectuser(String str) {
		// TODO Auto-generated method stub
		return usersMapper.selectuser(str);
	}

	@Override
	public void deleteuser(String usersid) {
		// TODO Auto-generated method stub
		usersMapper.deleteByPrimaryKey(usersid);
	}
	
	@Override
	public int insert(Users record) {
		// TODO Auto-generated method stub
		
		return usersMapper.insert(record);
	}

	@Override
	public int insertSelective(Users record) {
		// TODO Auto-generated method stub
		return usersMapper.insertSelective(record);
	}

	@Override
	public long selectusercount(String name) {
		// TODO Auto-generated method stub
		UsersExample usersExample=new UsersExample();
		usersExample.createCriteria().andNicknameEqualTo(name);
		System.out.println("servicekkkkk");
		return  usersMapper.countByExample(usersExample);
	}

	@Override
	public long seByEamil(String email) {
		// TODO Auto-generated method stub
		UsersExample usersExample=new UsersExample();
		usersExample.createCriteria().andEmailEqualTo(email);
		return usersMapper.countByExample(usersExample);
	}

	@Override
	public long updateByEamil(Users record) {
		// TODO Auto-generated method stub
		UsersExample usersExample=new UsersExample();
		usersExample.createCriteria().andEmailEqualTo(record.getEmail());
		return usersMapper.countByExample(usersExample);
	}

	@Override
	public Users seByUpwd(Users record) {
		// TODO Auto-generated method stub
		Users users = new Users();
		users = usersMapper.seByUpwd(record);
		return users;
	}

	@Override
	public int updateByPrimaryKeySelective(Users record) {
		// TODO Auto-generated method stub
		return usersMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public Users selectByPrimaryKey(String usersid) {
		// TODO Auto-generated method stub
		return usersMapper.selectByPrimaryKey(usersid);
	}
	

	@Override
	public Users selectByUsersid(String id) {
		
		Users users = usersMapper.selectByPrimaryKey(id);
		
		return users;
	}

	@Override
	public void updateByUserid(String id,int integral) {
		users.setUsersid(id);
		users.setIntegral(integral);
		usersMapper.updateByPrimaryKeySelective(users);
	}
	
	@Override
	public int updateMren(Users u)
	{
		UsersExample ue = new UsersExample();
		ue.createCriteria().andUsersidEqualTo(u.getUsersid());
		return usersMapper.updateByExampleSelective(u, ue);
	}
}
