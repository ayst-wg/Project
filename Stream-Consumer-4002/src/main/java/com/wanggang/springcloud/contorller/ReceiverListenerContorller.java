package com.wanggang.springcloud.contorller;

import com.wanggang.springcloud.service.ReceiverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName : ReceiverListener4002Contorller
 * @Description : ReceiverListener4002Contorller
 * @Author : wanggang
 * @Date: 2020-10-05 14:55
 * @Version 1.0
 **/
@Slf4j
@Component
@EnableBinding(Sink.class)
public class ReceiverListenerContorller {

    @Value("${server.port}")
    private String port;

    @Resource
    private ReceiverService receiverService;

    @StreamListener(Sink.INPUT)
    public void receiverMQ(Message<String> message) {
        String str = "Stream-Consumer-4002：成功监听并接受到消息---->" + message.getPayload() + "/t port：" + port ;
        log.info(str);
    }


}


