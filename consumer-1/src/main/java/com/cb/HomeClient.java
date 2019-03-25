package com.cb;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ASUS on 2018/12/13.
 */
@FeignClient("eureka-provider")
public interface HomeClient {

    @RequestMapping("/hello1")
    String consumer();

}
