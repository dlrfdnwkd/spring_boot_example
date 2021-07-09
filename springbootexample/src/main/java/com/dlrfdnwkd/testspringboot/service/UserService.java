package com.dlrfdnwkd.testspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlrfdnwkd.testspringboot.dao.UserDAO;
import com.dlrfdnwkd.testspringboot.mapper.UserMapper;
import com.dlrfdnwkd.testspringboot.entity.UserEntity;
import com.dlrfdnwkd.testspringboot.model.User;
import com.dlrfdnwkd.testspringboot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserMapper mapper;
	@Autowired
	private UserRepository userRepository;
	
	public User findByName(String name) {
		return userDAO.findByName(name);
	}

	public List<User> find(){
		return mapper.find();
	}

	public List<UserEntity> readUsers(){
		return userRepository.findAll();
	}
}
