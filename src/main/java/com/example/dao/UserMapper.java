package com.example.dao;

import com.example.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer oppenid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer oppenid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    Integer selectOppenId(@Param("oppenid") String oppenid);

    Integer selectPower(@Param("oppenid") String oppenid);
}