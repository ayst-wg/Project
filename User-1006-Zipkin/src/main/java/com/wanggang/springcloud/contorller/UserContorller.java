package com.wanggang.springcloud.contorller;

import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.result.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName : UserContorller
 * @Description : UserContorller
 * @Author : wanggang
 * @Date: 2020-10-05 18:55
 * @Version 1.0
 **/
@RestController
@Slf4j
public class UserContorller {

    public static final String ORDER_SERVICE_URL = "http://cloud-order-service";

    @Value("${server.port}")
    private String port;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/user/zipkin/getUserZipkin")
    public CommonResult getUserZipkin(){

        final String url = ORDER_SERVICE_URL + "/order/zipkin/getZipkin";
        log.info(url);
        String str = restTemplate.getForObject(url,String.class);
        return new CommonResult(str, StatusCode.SUCCESS);

    }
}
