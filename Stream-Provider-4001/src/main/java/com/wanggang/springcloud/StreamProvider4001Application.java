package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : StreamProvider4001Application
 * @Description : StreamProvider4001Application
 * @Author : wanggang
 * @Date: 2020-10-05 14:22
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamProvider4001Application {
    public static void main(String[] args) {
        SpringApplication.run(StreamProvider4001Application.class,args);
    }
}
