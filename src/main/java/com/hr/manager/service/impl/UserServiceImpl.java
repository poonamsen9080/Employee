package com.hr.manager.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.manager.bean.User;
import com.hr.manager.exception.UserNotFoundException;
import com.hr.manager.repository.UserRepository;
import com.hr.manager.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User findUser(User user) {
		Optional<User> originalUser=userRepository.findById(user.getUsername());
		if(originalUser.isPresent()) {
			User temp=originalUser.get();
			temp.equals(user);
		  return temp;
		}
		else {
			throw new UserNotFoundException("Invalid User");
		}
	}
	@Override
	public List<User> findAll() {
		System.out.println("hello");
		return userRepository.findAll();
	}

}
