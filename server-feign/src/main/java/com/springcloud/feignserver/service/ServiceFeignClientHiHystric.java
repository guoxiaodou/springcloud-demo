package com.springcloud.feignserver.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName ServiceFeignClientHiHystric
 * @Description TODO
 * @Author guojian
 * @Date 2020/5/18 3:38 下午
 * @Version 1.0
 */
@Component
public class ServiceFeignClientHiHystric implements ServiceFeignClient  {
    @Override
    public String TestAController(String name) {
        return "骚凹瑞:"+name;
    }
}
