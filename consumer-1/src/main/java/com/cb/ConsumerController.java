package com.cb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ASUS on 2018/12/13.
 */
@RestController
public class ConsumerController {

    @Autowired
    HomeClient homeClient;

    @RequestMapping("/hello")
    public String consumer(){
        return homeClient.consumer();
    }

}
