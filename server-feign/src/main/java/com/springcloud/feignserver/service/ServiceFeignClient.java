package com.springcloud.feignserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 填入注册中心中的应用名, 也就是要调用的微服务的应用名
// 在eureka页面中可以找到
//fallback 熔断器的功能，Feign是自带断路器的
@FeignClient(name = "SERVICE-CLIENT-A",fallback =  ServiceFeignClientHiHystric.class)
public interface ServiceFeignClient {

    @RequestMapping("/api/hi")
    public String TestAController(@RequestParam(value = "name",defaultValue = "springcloud") String name);

}
