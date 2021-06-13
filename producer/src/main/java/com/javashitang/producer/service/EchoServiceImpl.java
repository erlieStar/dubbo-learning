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
    public String hello(String msg) {
        log.info("hello param msg: {}", msg);
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return msg;
    }
}
