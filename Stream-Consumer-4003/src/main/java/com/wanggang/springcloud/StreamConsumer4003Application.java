package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : StreamConsumer4003Application
 * @Description : StreamConsumer4003Application
 * @Author : wanggang
 * @Date: 2020-10-05 14:52
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer4003Application {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer4003Application.class,args);
    }
}
