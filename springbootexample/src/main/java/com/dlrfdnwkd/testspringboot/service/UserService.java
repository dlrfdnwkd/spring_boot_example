package com.dlrfdnwkd.testspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlrfdnwkd.testspringboot.dao.UserDAO;
import com.dlrfdnwkd.testspringboot.model.User;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	public User findByName(String name) {
		return userDAO.findByName(name);
	}
}
