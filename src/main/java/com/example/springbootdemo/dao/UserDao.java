package com.example.springbootdemo.dao;

import com.example.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User login(@Param("username") String username, @Param("password") String password);

    User queryname(@Param("username") String username);
}