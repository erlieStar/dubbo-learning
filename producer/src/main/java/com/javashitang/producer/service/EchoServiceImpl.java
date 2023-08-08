package com.javashitang.producer.service;

import com.javashitang.api.service.EchoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author lilimin
 * @since 2021-06-13
 */
@Slf4j
@Service
public class EchoServiceImpl implements EchoService {

    @Override
    public String hello(Integer num) {
        log.info("hello param msg: {}", num);
        return String.valueOf(num);
    }

    @Override
    public Integer echo(Integer num) {
        return num;
    }
}
