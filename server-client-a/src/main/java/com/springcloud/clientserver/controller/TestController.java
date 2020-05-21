package com.springcloud.clientserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName testController
 * @Description TODO
 * @Author guojian
 * @Date 2020/5/15 10:09 上午
 * @Version 1.0
 */
@RestController
@RequestMapping("/api")
public class TestController {
    @RequestMapping("/testA")
    public String TestAController(){
        return "Hello,SpringCloud for TestA";
    }

    @RequestMapping("/testB")
    public String TestController(){
        return "Hello,SpringCloud";
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "springcloud") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
