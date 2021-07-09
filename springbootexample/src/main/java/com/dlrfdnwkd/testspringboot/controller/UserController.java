package com.dlrfdnwkd.testspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlrfdnwkd.testspringboot.model.User;
import com.dlrfdnwkd.testspringboot.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@PostMapping("/findByName")
	public User findByName(String name) {
		return userService.findByName(name);
	}
}
