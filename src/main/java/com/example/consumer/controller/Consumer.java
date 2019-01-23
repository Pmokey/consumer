package com.example.consumer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dubbo.service.UserService;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class Consumer {


	@RequestMapping("/index")
	public String home() {
        return "index";
    }
}
