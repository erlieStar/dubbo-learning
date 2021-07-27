package com.javashitang.consumer.controller;

import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncUserController {

    @Reference(check = false, async = true)
    private UserService userService;

    @RequestMapping("asyncHello")
    public UserInfo hello(@RequestParam("id") String id) throws Exception {
        userService.hello(id);
        CompletableFuture<UserInfo> future = RpcContext.getContext().getCompletableFuture();
        return future.get();
    }

}
