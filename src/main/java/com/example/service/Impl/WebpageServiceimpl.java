package com.example.service.Impl;

import com.example.dao.UserMapper;
import com.example.service.WebpageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebpageServiceimpl implements WebpageService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String selectOppenId(String oppenid) {

        String url = "";
        Integer count = userMapper.selectOppenId(oppenid);
        if(count!=0){
            Integer powercount = userMapper.selectPower(oppenid);
            if(powercount!=0){
                //管理员
                return url;
            }else{
                //用户
                return url;
            }
        }else {
            //没有权限用户
            return url;
        }
    }
}
