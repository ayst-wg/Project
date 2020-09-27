package com.wanggang.springcloud.controller;

import com.wanggang.springcloud.contorller.BaseContorller;
import com.wanggang.springcloud.entity.Order;
import com.wanggang.springcloud.entity.User;
import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.result.StatusCode;
import com.wanggang.springcloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName : UserController
 * @Description : UserController
 * @Author : wanggang
 * @Date: 2020-09-27 14:12
 * @Version 1.0
 **/
@RestController
@Slf4j
public class UserController extends BaseContorller {

    public static final String ORDER_SERVICE_URL = "http://cloud-order-service";

    @Resource
    private UserService userService;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/user/getUserById/{id}")
    public CommonResult<User> getUserById(@PathVariable("id") long id) {
        log.info("### port = " + this.port);
        if ("".equals(id)) {
            return new CommonResult<User>(StatusCode.REQUEST_PARAM_ERROR);
        }
        User user = this.userService.getUserById(id);

        if (user != null) {
            log.info("######### 查询成功：#########");
            log.info(user.toString());
            return new CommonResult<User>(user, StatusCode.SUCCESS,"，端口号：" + port);
        }
        return new CommonResult<User>(null, StatusCode.FAIL);

    }

    @GetMapping(value = "/user/getOrderByIdToOrder/{id}")
    public CommonResult<Order> getOrderByIdToOrder(@PathVariable("id") long id) {

        final String url = ORDER_SERVICE_URL + "/order/getOrderInfoById/" + id;

        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        log.info("返回结果：" + entity.getBody());

        if(entity.getStatusCode().is2xxSuccessful()) {
            return new CommonResult(entity.getBody(),StatusCode.SUCCESS);
        } else {
            return new CommonResult(StatusCode.FAIL);
        }
    }

    @GetMapping(value = "/user/getDiscoveryList")
    public Object getDiscoveryList(){

        List<String> service = discoveryClient.getServices();

        for (String applicationName : service){
            log.info("applicationName = " + applicationName);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-ORDER-SERVICE");
        for (ServiceInstance instance : instances){
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t"
                    + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/user/zk/getZkTest")
    public String getZkTest(){

        final String url = ORDER_SERVICE_URL + "/order/zk/getZkTest/";

        return restTemplate.getForObject(url,String.class);
    }

}


