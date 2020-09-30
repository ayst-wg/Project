package com.wanggang.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wanggang.springcloud.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName : OrderService
 * @Description : OrderService
 * @Author : wanggang
 * @Date: 2020-09-29 10:31
 * @Version 1.0
 **/
@Service
@DefaultProperties(defaultFallback = "global_fallback_Handler")
public class OrderServiceImpl implements OrderService {

    @Override
    // 没有自定义使用全局Hystrix降级处理回调方法
    @HystrixCommand
    public String getHystrixOk(long id) {
        // int age = 10/0;
        String str = "Hystrix线程池：" + Thread.currentThread().getName() + " id：" + id + " 正常访问！";
        return str;
    }

    @Override
    // 自定义使用自己的Hystrix降级处理回调方法
    @HystrixCommand(fallbackMethod = "getHystrixTimeOut_Handler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String getHystrixTimeOut(long id) {
        int timeValue = 5;
        try {
            TimeUnit.SECONDS.sleep(timeValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        StringBuffer sb = new StringBuffer();
        sb.append("Hystrix线程池：");
        sb.append(Thread.currentThread().getName());
        sb.append("\t");
        sb.append("耗时(秒)：");
        sb.append(timeValue);
        sb.append("\t 延迟访问！");
        return sb.toString();
    }

    public String getHystrixTimeOut_Handler(long id) {
        return "订单服务系统超时繁忙或系统出错，自定义降级回调方法：getHystrixTimeOut_Handler 已被执行！";
    }


    @Override
    // 服务熔断
    @HystrixCommand(fallbackMethod = "getOrderCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),              //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),    //请求数达到后才计算
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "15000"), //休眠时间窗
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),  //错误率达到多少跳闸
    })
    public String getOrderCircuitBreaker(@PathVariable("id") long id) {
        if (id < 0) {
            throw new RuntimeException();
        }
        String str = getHystrixOk(id);
        return str +  "服务熔断方法 getOrderCircuitBreaker 调用成功：" + IdUtil.simpleUUID();

    }

    public String getOrderCircuitBreaker_fallback(@PathVariable("id") long id){
        return "id 不能为负数！ id: " + id + "，如果id正确，请稍后再试，服务熔断已启动！" ;
    }

    public String global_fallback_Handler(){
        return "Global异常处理信息：服务请求响应异常，全局降级回调方法：global_fallback_Handler 已被执行！";
    }
}
