package com.javashitang.consumer.controller;

import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.ConsumerUserServiceV2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private ConsumerUserServiceV2 userServiceV2;

    @RequestMapping("hello")
    public UserInfo hello(@RequestParam("id") String id) {
        return userServiceV2.helloV2(id);
    }

}
