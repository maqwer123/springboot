package com.example.springbootdemo;

import com.example.springbootdemo.bean.User;
import com.example.springbootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

	@Autowired
	UserService userService;

	/*@Test
	public void contextLoads() {
		User user = userService.loginuser("qwerww","123456");
		System.out.print(user.toString());
	}*/
}
