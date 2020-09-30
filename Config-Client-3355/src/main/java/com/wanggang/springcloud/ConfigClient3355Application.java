package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : Config3355Application
 * @Description : Config3355Application
 * @Author : wanggang
 * @Date: 2020-09-30 17:34
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3355Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3355Application.class,args);
    }
}
