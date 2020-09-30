package com.wanggang.springcloud.service;

/**
 * @ClassName : OrderService
 * @Description : OrderService
 * @Author : wanggang
 * @Date: 2020-09-29 10:31
 * @Version 1.0
 **/
public interface OrderService {

    public String getHystrixOk(long id);

    public String getHystrixTimeOut(long id);

    public String getOrderCircuitBreaker(long id);

}
