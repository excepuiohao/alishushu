package com.alishushu.mapper;

import com.alishushu.bean.Shopcar;
import com.alishushu.bean.ShopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcarMapper {
    long countByExample(ShopcarExample example);

    int deleteByExample(ShopcarExample example);

    int insert(Shopcar record);

    int insertSelective(Shopcar record);

    List<Shopcar> selectByExample(ShopcarExample example);

    int updateByExampleSelective(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    int updateByExample(@Param("record") Shopcar record, @Param("example") ShopcarExample example);
}