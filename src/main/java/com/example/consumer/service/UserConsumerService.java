package com.example.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.entity.User;
import com.example.dubbo.service.UserService;


public class UserConsumerService {
	@Reference
	UserService userService;
	public User saveUser() {
        User user = new User();
        user.setId("001");
        user.setAge(18);
        user.setName("tomy");
        return userService.saveUser(user);
    }
}
