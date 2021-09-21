package com.javashitang.api.service;

import com.javashitang.api.pojo.UserInfo;

public interface UserService {

    UserInfo hello(String userId);

    // 剩下的接口都是测试反射调用的
    UserInfo save(UserInfo userInfo);

    String get(String userId, Integer age);
}
