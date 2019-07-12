package com.example.dao;

import com.example.po.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer oppenid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer oppenid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}