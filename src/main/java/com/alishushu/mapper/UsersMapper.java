package com.alishushu.mapper;

import com.alishushu.bean.Users;
import com.alishushu.bean.UsersExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
	List<Users> selectuser(String str);
	
    long countByExample(UsersExample example);
    
    List<Users> selectalluser();
    
    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String usersid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(String usersid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    Users seByUpwd(Users record);
    
}