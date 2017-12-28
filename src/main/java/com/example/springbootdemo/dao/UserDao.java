package com.example.springbootdemo.dao;

import com.example.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User login(@Param("username") String username, @Param("password") String password);
    User register(@Param("username") String username,@Param("password") String password, @Param("realname") String realname,@Param("phone") String phone);
}
