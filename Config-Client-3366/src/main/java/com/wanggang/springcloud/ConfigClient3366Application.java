package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : ConfigClient3366Application
 * @Description : ConfigClient3366Application
 * @Author : wanggang
 * @Date: 2020-09-30 19:05
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3366Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3366Application.class,args);
    }
}
