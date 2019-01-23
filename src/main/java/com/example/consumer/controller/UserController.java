package com.example.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.entity.User;
import com.example.dubbo.service.UserService;

@RestController
public class UserController {
	@Reference
	UserService userService;

	@RequestMapping("/user")
	public Object saveUser() {
		User user = new User();
		user.setId("001");
		user.setAge(18);
		user.setName("tomy");
		User saveUser = userService.saveUser(user);
		return "服务端返回："+saveUser.getName();
	}
	
	@RequestMapping("/test")
	public Object test() {
		return userService.test("test");
	}
}
