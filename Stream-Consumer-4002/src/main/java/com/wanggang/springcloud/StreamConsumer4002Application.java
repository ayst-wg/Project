package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : StreamConsumer4002Application
 * @Description : StreamConsumer4002Application
 * @Author : wanggang
 * @Date: 2020-10-05 14:51
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer4002Application {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer4002Application.class,args);
    }
}
