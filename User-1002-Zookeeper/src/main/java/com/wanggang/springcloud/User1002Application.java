package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : User1002Application
 * @Description : User1002Application
 * @Author : wanggang
 * @Date: 2020-09-27 14:16
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class User1002Application {
    public static void main(String[] args) {
        SpringApplication.run(User1002Application.class,args);
    }
}
