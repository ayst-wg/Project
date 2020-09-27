package com.wanggang.springcloud.dao;

import com.wanggang.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : OrderDao
 * @Description : OrderDao
 * @Author : wanggang
 * @Date: 2020-09-25 21:39
 * @Version 1.0
 **/
@Mapper
public interface OrderDao {

    public int createOrderInfo(Order order);

    public void deleteOrderInfoById(@Param("id") long id);

    public int updateOrderInfoById(Order order);

    public Order getOrderInfoById(@Param("id") long id);

}
