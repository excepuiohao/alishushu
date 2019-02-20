package com.alishushu.mapper;

import com.alishushu.bean.Itmessage;
import com.alishushu.bean.ItmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItmessageMapper {
    long countByExample(ItmessageExample example);

    int deleteByExample(ItmessageExample example);

    int deleteByPrimaryKey(String messageid);

    int insert(Itmessage record);

    int insertSelective(Itmessage record);

    List<Itmessage> selectByExample(ItmessageExample example);

    Itmessage selectByPrimaryKey(String messageid);

    int updateByExampleSelective(@Param("record") Itmessage record, @Param("example") ItmessageExample example);

    int updateByExample(@Param("record") Itmessage record, @Param("example") ItmessageExample example);

    int updateByPrimaryKeySelective(Itmessage record);

    int updateByPrimaryKey(Itmessage record);
}