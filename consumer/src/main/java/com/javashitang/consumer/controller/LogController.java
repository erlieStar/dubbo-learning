package com.javashitang.consumer.controller;

import com.javashitang.api.service.LogService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Reference(mock = "force:return default")
    private LogService logService;

    @RequestMapping("log")
    public String hello(@RequestParam("msg") String msg) {
        return logService.hello(msg);
    }

}
