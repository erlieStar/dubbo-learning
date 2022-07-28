package com.javashitang.producer.service;

import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserInfo hello(String username) {
        log.info("hello param username: {}", username);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("10");
        userInfo.setPhoneNum("158****4635");
        userInfo.setUserAddress("北京昌平");
        return userInfo;
    }
}
