package com.wanggang.springcloud.controller;

import com.wanggang.springcloud.contorller.BaseContorller;
import com.wanggang.springcloud.entity.Order;
import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.service.UserFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : UserController
 * @Description : UserController
 * @Author : wanggang
 * @Date: 2020-09-24 19:41
 * @Version 1.0
 **/
@RestController
@Slf4j
public class UserController extends BaseContorller {

    @Resource
    private UserFeignService userFeignService;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/user/feign/getOrderInfoById/{id}")
    public CommonResult<Order> getUserById(@PathVariable("id") long id){
        log.info("id = " + id);
        return userFeignService.getOrderInfoById(id);
    }

}

