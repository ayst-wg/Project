package com.wanggang.springcloud.contorller;

import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.result.StatusCode;
import com.wanggang.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : OrderContorller
 * @Description : OrderContorller
 * @Author : wanggang
 * @Date: 2020-09-29 11:01
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderContorller extends BaseContorller{

    @Resource
    private OrderService orderService;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/order/hystrix/getHystrixOk/{id}")
    public CommonResult<String> getHystrixOk(@PathVariable("id") long id){
        log.info(getClass().getName() + "\t" + "id = " + id + "\t" + "port = " + port);
        return new CommonResult(orderService.getHystrixOk(id), StatusCode.SUCCESS);
    }

    @GetMapping(value = "/order/hystrix/getHystrixTimeOut/{id}")
    public CommonResult<String> getHystrixTimeOut(@PathVariable("id") long id){
        log.info(getClass().getName() + "\t" + "id = " + id + "\t" + "port = " + port);
        return new CommonResult(orderService.getHystrixTimeOut(id),StatusCode.SUCCESS);
    }

    @GetMapping(value = "/order/hystrix/getOrderCircuitBreaker/{id}")
    public CommonResult<String> getOrderCircuitBreaker(@PathVariable("id") long id){

        log.info(getClass().getName() + "\t" + "id = " + id + "\t" + "port = " + port);
        return new CommonResult<>(orderService.getOrderCircuitBreaker(id),StatusCode.SUCCESS);
    }

}
