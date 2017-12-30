package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.dto.Result;
import com.example.springbootdemo.service.UserService;
import com.example.springbootdemo.validator.LoginValidator;
import com.example.springbootdemo.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {

    private final UserService service;
    private final LoginValidator loginValidator;
    @Autowired
    public UserController(UserService service, LoginValidator loginValidator) {
        this.service = service;
        this.loginValidator = loginValidator;
    }

    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public String login(HttpServletRequest request, @RequestParam("user") String user, @RequestParam("pass") String pass){
        List<String> errors = loginValidator.validate(user,pass);
        if (errors.size()!=0){
            return "error";
        }
        else {
            User user1 = service.loginuser(user, pass);
            if (user1!=null) {
                UserInfo userInfo = new UserInfo();
                userInfo.setUsername(user1.getUsername());
                request.setAttribute("user", userInfo);
            } else {
                return "error";
            }
        }
        return "index";
    }
    @RequestMapping(value = "/userRegister",method = RequestMethod.POST)
    public String register(HttpServletRequest request, @RequestParam("user") String user, @RequestParam("pass") String pass,@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("address") String address,@RequestParam("userphoto") String userphoto){
        User user2 = service.addUser(user,pass,name,phone,address,userphoto);
        return "login";
    }
    @RequestMapping("/login")
    public String loginP(){
        return "login";
    }
    @RequestMapping("/register")
    public String register() {
        return "register";
    }
}

/*
    @RequestMapping(value = "/ajaxLogin",method = RequestMethod.GET)
    @ResponseBody
    public Result ajaxLogin(@RequestParam("user") String user, @RequestParam("pass") String pass){
        Result result = new Result();
        List<String> errors = new ArrayList<>();
        if (errors.size()!=0) {
            result.setCode("400");
            result.setMessage("登录kjfkd0");
            result.setData(errors);
        } else {
            User user1 = service.LoginUser(user, pass);
            if (user1!=null) {
                UserInfo userInfo = new UserInfo();
                userInfo.setUsername(user1.getUsername());
                result.setCode("200");
                result.setMessage("successful");
                result.setData(userInfo);
            } else {
                result.setCode("300");
                result.setMessage("该用户名不存在");
                result.setData(errors);
            }
        }
        return result;
    }
*/

