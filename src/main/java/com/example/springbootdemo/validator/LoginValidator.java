package com.example.springbootdemo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Component
public class LoginValidator {
    public List<String> validate(String username, String password){
        List<String> errors = new ArrayList<String>();
        if (username!=null) {
            if (!Pattern.matches("^[a-zA-Z0-9_\\u4e00-\\u9fa5]+$",username)) {
                errors.add("user非法");
            }
        }
        if (password!=null) {
            if (!Pattern.matches("^\\w{6,25}+$",username)) {
                errors.add("password不合法");
            }
        }
        return errors;
    }
}