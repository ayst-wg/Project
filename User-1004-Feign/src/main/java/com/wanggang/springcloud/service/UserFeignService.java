package com.wanggang.springcloud.service;

import com.wanggang.springcloud.entity.Order;
import com.wanggang.springcloud.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName : UserFeignService
 * @Description : UserFeignService
 * @Author : wanggang
 * @Date: 2020-09-24 19:38
 * @Version 1.0
 **/
@Component
@FeignClient(value = "CLOUD-ORDER-SERVICE")
public interface UserFeignService {

    @GetMapping(value = "/order/getOrderInfoById/{id}")
    public CommonResult<Order> getOrderInfoById(@PathVariable("id") long id);

}
