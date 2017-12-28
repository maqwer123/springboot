package com.example.springbootdemo;

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

	@Test
	public void contextLoads() {
		userService.addUser("qwe","fd","qrr","12345678987");
	}
	@Test
	public void contextLoads2() {
		userService.addUser("qwe","fd","qrr","12345678987");
	}
	@Test
	public void contextLoads4() {
		userService.addUser("qwe","fd","qrr","12345678987");
	}
	@Test
	public void contextLoads5() {
		userService.addUser("qwe","fd","qrr","12345678987");
	}
	@Test
	public void contextLoads6() {
		userService.addUser("qwe","fd","qrr","12345678987");
	}

}
