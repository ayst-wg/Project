package com.wanggang.springcloud.dao;

import com.wanggang.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName : UserDao
 * @Description :
 * @Author : wanggang
 * @Date: 2020-09-24 19:02
 * @Version 1.0
 **/
@Mapper
public interface UserDao {

    public User getUserById(@Param("id") long id);

}
