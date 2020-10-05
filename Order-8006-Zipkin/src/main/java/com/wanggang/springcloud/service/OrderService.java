package com.wanggang.springcloud.service;

import com.wanggang.springcloud.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : OrderService
 * @Description : OrderService
 * @Author : wanggang
 * @Date: 2020-10-05 17:07
 * @Version 1.0
 **/
public interface OrderService {

    public int createOrderInfo(Order order);

    public void deleteOrderInfoById(@Param("id") long id);

    public int updateOrderInfoById(Order order);

    public Order getOrderInfoById(@Param("id") long id);

}
