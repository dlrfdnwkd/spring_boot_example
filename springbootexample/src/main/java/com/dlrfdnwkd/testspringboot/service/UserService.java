package com.dlrfdnwkd.testspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlrfdnwkd.testspringboot.dao.UserDAO;
import com.dlrfdnwkd.testspringboot.mapper.UserMapper;
import com.dlrfdnwkd.testspringboot.model.User;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserMapper mapper;
	
	public User findByName(String name) {
		return userDAO.findByName(name);
	}
	public List<User> find(){
		return mapper.find();
	}
}
