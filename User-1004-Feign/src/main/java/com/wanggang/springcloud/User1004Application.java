package com.wanggang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : UserApplication
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-24 19:00
 * @Version 1.0
 **/
@SpringBootApplication
@EnableFeignClients
public class User1004Application {
    public static void main(String[] args) {
        SpringApplication.run(User1004Application.class,args);
    }
}
