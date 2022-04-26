package com.javashitang.producer.service;

import com.javashitang.api.service.LogService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class LogServiceImpl implements LogService {
    @Override
    public String hello(String msg) {
        return "hello " + msg;
    }
}
