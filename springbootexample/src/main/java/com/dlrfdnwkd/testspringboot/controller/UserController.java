package com.dlrfdnwkd.testspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	@ResponseBody
	@PostMapping("/find")
	public List<User> find(){
		return userService.find();
	}
	@GetMapping(value="/readUsers")
	public ResponseEntity readUsers() {
		return ResponseEntity.ok(userService.readUsers());
	}
}
