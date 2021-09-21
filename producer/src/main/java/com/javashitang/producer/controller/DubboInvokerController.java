package com.javashitang.producer.controller;

import com.alibaba.fastjson.JSONObject;
import com.javashitang.producer.domain.InvokeInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
@RequestMapping("dubbo")
public class DubboInvokerController {

    @Resource
    private ApplicationContext context;

    @RequestMapping("invoke")
    public Object invoke(@RequestBody InvokeInfo invokeInfo) {
        try {
            Class clazz = Class.forName(invokeInfo.getClassName());
            Object object = context.getBean(clazz);
            Method[] declaredMethods = clazz.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (!Objects.equals(method.getName(), invokeInfo.getMethodName())) {
                    continue;
                }
                Class[] paramTypes = method.getParameterTypes();
                if (paramTypes.length != invokeInfo.getParams().size()) {
                    continue;
                }
                List<Object> paramObjs = new ArrayList<>();
                List<String> params = invokeInfo.getParams();
                for (int i = 0; i < paramTypes.length; i++) {
                    String param = params.get(i);
                    Object paramObj = JSONObject.parseObject(param, paramTypes[i]);
                    paramObjs.add(paramObj);
                }
                return method.invoke(object, paramObjs.toArray());
            }
        } catch (Exception e) {
            log.error("invoke error", e);
            return "fail";
        }
        return "fail";
    }

}