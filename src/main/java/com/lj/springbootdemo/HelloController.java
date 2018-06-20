package com.lj.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujun
 * @date 2018/6/19 下午7:50
 */

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!" + "-" + name;
    }

    private Integer num;
}
