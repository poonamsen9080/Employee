package com.hr.manager.service;

import java.util.List;

import com.hr.manager.bean.User;

public interface UserService {

	public User findUser(User user);

	public List<User> findAll();
}
