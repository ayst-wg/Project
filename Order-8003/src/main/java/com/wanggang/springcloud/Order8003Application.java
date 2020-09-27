package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : OrderApplication
 * @Description : OrderApplication
 * @Author : wanggang
 * @Date: 2020-09-25 21:37
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class Order8003Application {

    public static void main(String[] args) {
        SpringApplication.run(Order8003Application.class,args);
    }

}
