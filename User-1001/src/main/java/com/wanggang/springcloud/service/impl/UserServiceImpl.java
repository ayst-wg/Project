package com.wanggang.springcloud.service.impl;

import com.wanggang.springcloud.dao.UserDao;
import com.wanggang.springcloud.entity.User;
import com.wanggang.springcloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName : UserServiceImpl
 * @Description : UserServiceImpl
 * @Author : wanggang
 * @Date: 2020-09-24 19:39
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(long id) {
        return this.userDao.getUserById(id);
    }

}
