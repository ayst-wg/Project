package com.wanggang.springcloud.service;

import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.service.impl.UserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName : UserService
 * @Description : UserService
 * @Author : wanggang
 * @Date: 2020-09-29 13:18
 * @Version 1.0
 **/
@Component
@FeignClient(value = "CLOUD-ORDER-HYSTRIX-SERVICE", fallback = UserServiceImpl.class)
public interface UserService {

    @GetMapping(value = "/order/hystrix/getHystrixOk/{id}")
    public CommonResult<String> getHystrixOk(@PathVariable("id") long id);

    @GetMapping(value = "/order/hystrix/getHystrixTimeOut/{id}")
    public CommonResult<String> getHystrixTimeOut(@PathVariable("id") long id);

}
