package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.dao.UserDao;
import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserDao userDao) {
        this.userMapper = userMapper;
        this.userDao = userDao;
    }


    @Override
    public User loginuser(java.lang.String username, java.lang.String password) {
        return userMapper.login(username,password);
    }

    @Override
    public User addUser(java.lang.String usename, java.lang.String password, java.lang.String realname, java.lang.String phone,java.lang.String address) {
        User user = new User(usename,password,realname,phone,address);
        userMapper.insert(user);
        return user;
    }

    @Override
    public int removeUser() {
        return 0;
    }

    @Override
    public int updateUser() {
        return 0;
    }
}
