package com.example.dubbo.service;

import com.example.dubbo.entity.User;

public interface UserService {
	User saveUser(User user);
	String test(String parm);
}
