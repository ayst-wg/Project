package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName : eureka
 * @Description :‰
 * @Author : wanggang
 * @Date: 2020-09-21 13:45
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001Application.class,args);
    }
}
