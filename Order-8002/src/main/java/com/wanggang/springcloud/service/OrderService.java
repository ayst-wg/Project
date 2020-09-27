package com.wanggang.springcloud.service;

import com.wanggang.springcloud.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : OrderService
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-21 18:37
 * @Version 1.0
 **/
public interface OrderService {

    public int createOrderInfo(Order order);

    public void deleteOrderInfoById(@Param("id") long id);

    public int updateOrderInfoById(Order order);

    public Order getOrderInfoById(long id);


}
