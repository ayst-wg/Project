package com.wanggang.springcloud.service.impl;

import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.result.StatusCode;
import com.wanggang.springcloud.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @ClassName : UserServiceImpl
 * @Description : UserServiceImpl
 * @Author : wanggang
 * @Date: 2020-09-29 16:55
 * @Version 1.0
 **/
@Component
public class UserServiceImpl implements UserService {

    @Override
    public CommonResult<String> getHystrixOk(long id) {
        return new CommonResult<>("用户服务调用订单服务：getHystrixOk 系统超时繁忙或者系统出错，降级方法回调已被执行！", StatusCode.SUCCESS);
    }

    @Override
    public CommonResult<String> getHystrixTimeOut(long id) {
        return new CommonResult<>("用户服务调用订单服务：getHystrixTimeOut 系统超时繁忙或者系统出错，降级方法回调已被执行！", StatusCode.SUCCESS);
    }

}
