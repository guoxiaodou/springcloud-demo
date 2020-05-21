package com.springcloud.ribbonserver.controller;

import com.springcloud.ribbonserver.service.HelloService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author guojian
 * @Date 2020/5/19 2:47 下午
 * @Version 1.0
 */
@RestController
@RequestMapping("/api")
public class HelloController {
    Log log = LogFactory.getLog(HelloController.class);
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name",required = false) String name){
        log.info("ribbon");
        return helloService.hiService(name);
    }


}
