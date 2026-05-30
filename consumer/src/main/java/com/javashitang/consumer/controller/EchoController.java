package com.javashitang.consumer.controller;

import com.javashitang.api.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EchoController {

    @Reference
    private EchoService echoService;

    @RequestMapping("echo")
    public String echo(@RequestParam("msg") String msg) {
        return echoService.hello(msg);
    }

}
