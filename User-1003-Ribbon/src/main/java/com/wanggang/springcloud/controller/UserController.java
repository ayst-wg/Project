package com.wanggang.springcloud.controller;

import com.wanggang.springcloud.contorller.BaseContorller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    public static final String ORDER_SERVICE_URL = "http://CLOUD-ORDER-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;



}

