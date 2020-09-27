package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : UserApplication
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-24 19:00
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class User1001Application {
    public static void main(String[] args) {
        SpringApplication.run(User1001Application.class,args);
    }
}
