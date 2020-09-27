package com.wanggang.springcloud.service;

import com.wanggang.springcloud.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : UserService
 * @Description : UserService
 * @Author : wanggang
 * @Date: 2020-09-24 19:38
 * @Version 1.0
 **/
public interface UserService {

    public User getUserById(@Param("id") long id);

}
