package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : Config3344Application
 * @Description : Config3344Application
 * @Author : wanggang
 * @Date: 2020-09-30 11:51
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServer3344Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344Application.class,args);
    }
}
