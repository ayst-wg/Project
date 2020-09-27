package com.wanggang.springcloud;

import com.wanggang.ribbon.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName : UserApplication
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-24 19:00
 * @Version 1.0
 **/
@SpringBootApplication
@RibbonClient(name = "CLOUD-ORDER-SERVICE", configuration = RibbonRule.class)
public class User1003Application {
    public static void main(String[] args) {
        SpringApplication.run(User1003Application.class,args);
    }
}
