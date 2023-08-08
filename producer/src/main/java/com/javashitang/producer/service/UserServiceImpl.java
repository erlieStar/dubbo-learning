package com.javashitang.producer.service;

import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserInfo hello(String userId, String userAddress) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setPhoneNum("158****4635");
        userInfo.setUserAddress(userAddress);
        return userInfo;
    }
}
