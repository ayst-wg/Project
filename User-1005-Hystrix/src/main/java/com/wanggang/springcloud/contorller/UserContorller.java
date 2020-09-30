package com.wanggang.springcloud.contorller;

import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : UserContorller
 * @Description : UserContorller
 * @Author : wanggang
 * @Date: 2020-09-29 13:25
 * @Version 1.0
 **/
@RestController
@Slf4j
public class UserContorller extends BaseContorller{

    @Resource
    private UserService userService;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/user/hystrix/getHystrixOk/{id}")
    public CommonResult<String> getHystrixOk(@PathVariable("id") long id){
        log.info(getClass().getName() + "\t" + "id = " + id + "\t" + "port = " + port);
        return this.userService.getHystrixOk(id);
    }

    @GetMapping(value = "/user/hystrix/getHystrixTimeOut/{id}")
    public CommonResult<String> getHystrixTimeOut(@PathVariable("id") long id){
        log.info(getClass().getName() + "\t" + "id = " + id + "\t" + "port = " + port);
        return this.userService.getHystrixTimeOut(id);
    }

}
