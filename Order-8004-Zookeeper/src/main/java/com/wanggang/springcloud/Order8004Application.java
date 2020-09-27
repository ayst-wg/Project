package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : Order8004Application
 * @Description : Order8004Application
 * @Author : wanggang
 * @Date: 2020-09-26 23:19
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Order8004Application {
    public static void main(String[] args) {
        SpringApplication.run(Order8004Application.class,args);
    }
}
