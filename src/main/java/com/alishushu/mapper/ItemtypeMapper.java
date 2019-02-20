package com.alishushu.mapper;

import com.alishushu.bean.Itemtype;
import com.alishushu.bean.ItemtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemtypeMapper {
    long countByExample(ItemtypeExample example);

    int deleteByExample(ItemtypeExample example);

    int deleteByPrimaryKey(String typeid);

    int insert(Itemtype record);

    int insertSelective(Itemtype record);

    List<Itemtype> selectByExample(ItemtypeExample example);

    Itemtype selectByPrimaryKey(String typeid);

    int updateByExampleSelective(@Param("record") Itemtype record, @Param("example") ItemtypeExample example);

    int updateByExample(@Param("record") Itemtype record, @Param("example") ItemtypeExample example);

    int updateByPrimaryKeySelective(Itemtype record);

    int updateByPrimaryKey(Itemtype record);
}