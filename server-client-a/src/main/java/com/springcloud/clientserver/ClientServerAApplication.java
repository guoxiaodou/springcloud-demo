package com.springcloud.clientserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientServerAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServerAApplication.class, args);
    }

}
