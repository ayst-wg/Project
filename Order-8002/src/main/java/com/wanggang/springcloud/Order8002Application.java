package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : Order8002Application
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-24 18:17
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class Order8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Order8002Application.class,args);
    }
}
