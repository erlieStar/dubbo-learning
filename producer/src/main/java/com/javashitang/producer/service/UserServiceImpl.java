package com.javashitang.producer.service;

import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserInfo hello(String username) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("10");
        userInfo.setPhoneNum("158****4635");
        userInfo.setUserAddress("北京昌平");
        return userInfo;
    }

    @Override
    public UserInfo save(UserInfo userInfo) {
        return userInfo;
    }

    @Override
    public String get(String userId, Integer age) {
        return userId + age;
    }
}
