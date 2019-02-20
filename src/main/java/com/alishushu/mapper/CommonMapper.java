package com.alishushu.mapper;

import com.alishushu.bean.Common;
import com.alishushu.bean.CommonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonMapper {
    long countByExample(CommonExample example);

    int deleteByExample(CommonExample example);

    int deleteByPrimaryKey(String commonid);

    int insert(Common record);

    int insertSelective(Common record);

    List<Common> selectByExample(CommonExample example);

    Common selectByPrimaryKey(String commonid);

    int updateByExampleSelective(@Param("record") Common record, @Param("example") CommonExample example);

    int updateByExample(@Param("record") Common record, @Param("example") CommonExample example);

    int updateByPrimaryKeySelective(Common record);

    int updateByPrimaryKey(Common record);
}