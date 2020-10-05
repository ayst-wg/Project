package com.wanggang.springcloud.contorller;

import com.wanggang.springcloud.entity.Order;
import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.result.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.wanggang.springcloud.service.OrderService;

import javax.annotation.Resource;

/**
 * @ClassName : OrderContorller
 * @Description : OrderContorller
 * @Author : wanggang
 * @Date: 2020-10-05 17:10
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderContorller extends BaseContorller {

    @Resource
    private OrderService orderService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/order/getOrderInfoById/{id}")
    public CommonResult<Order> getOrderInfoById(@PathVariable("id") long id){
        log.info("port = " + port);
        if("".equals(id)){
            return new CommonResult(StatusCode.REQUEST_PARAM_ERROR);
        }
        Order order = this.orderService.getOrderInfoById(id);
        if(order != null){
            log.info("查询成功：" + order);
            return new CommonResult(order,StatusCode.SUCCESS,"，端口号：" + port);
        }else{
            log.info(StatusCode.FAIL.getMessage());
            return new CommonResult(StatusCode.FAIL);
        }
    }

    @GetMapping("/order/zipkin/getZipkin")
    public String getZipkin(){
        return "order service zipkin return success";
    }

}
