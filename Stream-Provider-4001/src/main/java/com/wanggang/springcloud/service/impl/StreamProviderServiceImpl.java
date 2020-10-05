package com.wanggang.springcloud.service.impl;

import com.wanggang.springcloud.service.StreamProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @ClassName : StreamProviderServiceImpl
 * @Description : StreamProviderServiceImpl
 * @Author : wanggang
 * @Date: 2020-10-05 14:28
 * @Version 1.0
 **/
@EnableBinding(Source.class)
public class StreamProviderServiceImpl implements StreamProviderService {

    @Resource
    private MessageChannel output;

    @Override
    public String sendMQ(String msg) {
        output.send(MessageBuilder.withPayload(msg).build());
        return "Stream-Provider-4001：成功发送消息到RabbitMQ！！！" + msg;
    }
}
