package com.wanggang.springcloud.contorller;

import cn.hutool.core.lang.UUID;
import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.result.StatusCode;
import com.wanggang.springcloud.service.StreamProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : StreamProviderContorller
 * @Description : StreamProviderContorller
 * @Author : wanggang
 * @Date: 2020-10-05 14:39
 * @Version 1.0
 **/
@RestController
@Slf4j
public class StreamProviderContorller {

    @Resource
    private StreamProviderService streamProviderService;

    @GetMapping(value = "/stream/provider/sendMQ")
    public CommonResult sendMQ(){

        String str = "消息队列ID：" + UUID.randomUUID().toString();
        String result = streamProviderService.sendMQ(str);
        log.info(result);
        return new CommonResult(result, StatusCode.SUCCESS);
    }
}
