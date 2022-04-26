package com.javashitang.producer.service;

import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.AsyncUserService;
import com.javashitang.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class AsyncUserServiceImpl implements AsyncUserService {

    @Override
    public UserInfo hello(String username) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("10");
        userInfo.setPhoneNum("158****4635");
        userInfo.setUserAddress("北京顺义");
        return userInfo;
    }
}
