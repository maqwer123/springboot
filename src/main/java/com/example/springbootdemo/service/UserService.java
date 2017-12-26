package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.User;

public interface UserService {
    public User LoginUser(String username,String password);
    //public User addUser();
    public int removeUser();
    public int updateUser();

}
