package com.control.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.control.model.User;
import com.control.repository.UserRepository;
import com.control.service.UserService;

@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public List<User> allUser() {
		return this.userRepository.findAll();
	}

}
