package com.cb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ASUS on 2019/3/25.
 */
@RestController
public class Hello1 {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello1")
    public String say(){
        return " 你好！来自 eureka-provider" + port +"的祝福1";
    }
}
