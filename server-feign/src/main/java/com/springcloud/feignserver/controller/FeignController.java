package com.springcloud.feignserver.controller;

import com.springcloud.feignserver.service.ServiceFeignClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName testController
 * @Description TODO
 * @Author guojian
 * @Date 2020/5/15 10:13 上午
 * @Version 1.0
 */
@RestController
@RequestMapping("/api")
public class FeignController {
    Log log = LogFactory.getLog(FeignController.class);
    @Resource
    private ServiceFeignClient serviceFeignClient;

    @GetMapping("/testB")
    public String TestAController(){
        return "Hello,SpringCloud for TestB";
    }

    @GetMapping("/hi")
    public String call(){
        log.info("feign");
        String result = serviceFeignClient.TestAController("SpringCloud");
        return "b to a 访问结果 ---" + result;
    }
}
