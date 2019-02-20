package com.alishushu.mapper;

import com.alishushu.bean.Messages;
import com.alishushu.bean.Pagese;
import com.alishushu.bean.Systeminfo;
import com.alishushu.bean.SysteminfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysteminfoMapper {
    long countByExample(SysteminfoExample example);

    int deleteByExample(SysteminfoExample example);

    int deleteByPrimaryKey(String systeminfoid);

    int insert(Systeminfo record);

    int insertSelective(Systeminfo record);

    List<Systeminfo> selectByExample(SysteminfoExample example);

    Systeminfo selectByPrimaryKey(String systeminfoid);

    int updateByExampleSelective(@Param("record") Systeminfo record, @Param("example") SysteminfoExample example);

    int updateByExample(@Param("record") Systeminfo record, @Param("example") SysteminfoExample example);

    int updateByPrimaryKeySelective(Systeminfo record);

    int updateByPrimaryKey(Systeminfo record);
    
    List<Messages> selectallmess();
    
    List<Messages> selectmesspage(Pagese pagese);
    
    int selectcountmess();
}