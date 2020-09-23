package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : Order8001Application
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-21 18:34
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class Order8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Order8001Application.class,args);
    }
}
