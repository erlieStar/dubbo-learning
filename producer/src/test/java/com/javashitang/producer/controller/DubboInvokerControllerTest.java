package com.javashitang.producer.controller;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-09-21
 */
public class DubboInvokerControllerTest {

    @Test
    public void invoke() {
    }

    @Test
    public void test1() {
        String param = "10";
        Object paramObj = JSONObject.parseObject(param, String.class);
        if (String.class.isAssignableFrom(paramObj.getClass())) {
            System.out.println("yes");
        }
    }
}