package com.javashitang.consumer;


import com.javashitang.api.pojo.UserInfo;
import com.javashitang.api.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerAppTest {

    @Reference(check = false)
    private UserService userService;


    @Test
    public void hello() {
        UserInfo userInfo = userService.hello("xiaoming");
        System.out.println(userInfo);
    }
}
