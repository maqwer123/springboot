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

    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public String Login(HttpServletRequest request, @RequestParam("user") String user, @RequestParam("pass") String pass){
        List<String> errors = loginValidator.validate(user,pass);
        if (errors.size()!=0){
            return "error";
        }
        else {
            User user1 = service.LoginUser(user, pass);
            if (user1!=null) {
                UserInfo userInfo = new UserInfo();
                userInfo.setUsername(user1.getUsername());
                request.setAttribute("user", userInfo);
            } else {
                return "error";
            }
        }
//        System.out.println(user+pass);
        return "index";
    }
    @RequestMapping("/login")
    public String LoginP(){
        return "login";
    }

//    @RequestMapping("/hello;")
//    public String Hello() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        service.LoginUser(idfjdkfj);
//        return "index";
//    }
}
