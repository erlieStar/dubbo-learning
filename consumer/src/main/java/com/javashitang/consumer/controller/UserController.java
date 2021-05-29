package com.javashitang.consumer.controller;

import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(check = false)
    private UserService userService;

    @RequestMapping("hello")
    public UserInfo hello(@RequestParam("id") String id) {
        return userService.hello(id);
    }

}
