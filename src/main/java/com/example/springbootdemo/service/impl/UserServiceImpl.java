package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.dao.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User LoginUser(String username,String password) {
        return userMapper.login(username, password);
    }
    @Transactional
            (rollbackFor = RuntimeException.class)

    @Override
    public int removeUser() {
        return 0;
    }

    @Override
    public int updateUser() {
        return 0;
    }
}
