package com.wanggang.springcloud.dao;

import com.wanggang.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : OrderDao
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-21 18:35
 * @Version 1.0
 **/
@Mapper
public interface OrderDao {

    public int createOrderInfo(Order order);

    public void deleteOrderInfoById(@Param("id") long id);

    public int updateOrderInfoById(Order order);

    public Order getOrderInfoById(@Param("id") long id);

}
