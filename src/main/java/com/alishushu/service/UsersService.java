package com.alishushu.service;

import java.util.List;

import com.alishushu.bean.Users;

public interface UsersService {
	List<Users> selectalluser();
	
	List<Users> selectuser(String str);
	
    public Users selectByUsersid(String id);
	
	//更新用户积分
	public void updateByUserid(String id,int  integral);
	
	void deleteuser(String usersid);
	
	int insert(Users record);
	
	int insertSelective(Users record);
	
	long selectusercount(String name);
	
	long  seByEamil(String email);
	
	long updateByEamil(Users record);
	
	Users seByUpwd(Users record);//用户名和密码查询
	
	int updateByPrimaryKeySelective(Users record);
	
	Users selectByPrimaryKey(String usersid);
	
	public int updateMren(Users u);

	//List selectalluser();

	//List selectuser(String str);

	//public Users selectByUsersid(String id);
}
