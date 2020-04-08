package com.javashitang.consumer;


import com.javashitang.api.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerAppTest {

    @Autowired
    private UserService userService;


    @Test
    public void hello() {
        String result = userService.hello("xiaoming");
        System.out.println(result);
    }
}
