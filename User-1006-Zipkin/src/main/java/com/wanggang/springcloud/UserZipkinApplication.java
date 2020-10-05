package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : UserZipkinApplication
 * @Description : UserZipkinApplication
 * @Author : wanggang
 * @Date: 2020-10-05 19:05
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class UserZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserZipkinApplication.class,args);
    }
}
