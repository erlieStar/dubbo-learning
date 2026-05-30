package com.javashitang.consumer.service;

import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.ConsumerUserServiceV2;
import com.javashitang.api.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author lilimin
 * @since 2021-06-10
 */
@Service
public class ConsumerUserService implements ConsumerUserServiceV2 {

    @Reference(check = false)
    private UserService userService;

    @Override
    public UserInfo helloV2(String userId) {
        return userService.hello(userId);
    }
}
