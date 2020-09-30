package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : Gateway9527Application
 * @Description : Gateway9527Application
 * @Author : wanggang
 * @Date: 2020-09-29 20:41
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class Gateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527Application.class,args);
    }
}
