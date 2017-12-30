package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.User;

public interface UserService {
    public User loginuser(String username, String password);
    public User addUser(String usename,String password,String realname,String phone,String address,String userphoto);
    public int removeUser();
    public int updateUser();

}
