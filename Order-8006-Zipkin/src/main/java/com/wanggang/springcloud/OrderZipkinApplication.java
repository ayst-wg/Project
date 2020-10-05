package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : OrderZipkinApplication
 * @Description : OrderZipkinApplication
 * @Author : wanggang
 * @Date: 2020-10-05 19:06
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderZipkinApplication.class,args);
    }
}
