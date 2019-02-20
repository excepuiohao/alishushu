package com.alishushu.mapper;

import com.alishushu.bean.Itty;
import com.alishushu.bean.IttyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IttyMapper {
    long countByExample(IttyExample example);

    int deleteByExample(IttyExample example);

    int insert(Itty record);

    int insertSelective(Itty record);

    List<Itty> selectByExample(IttyExample example);

    int updateByExampleSelective(@Param("record") Itty record, @Param("example") IttyExample example);

    int updateByExample(@Param("record") Itty record, @Param("example") IttyExample example);
}