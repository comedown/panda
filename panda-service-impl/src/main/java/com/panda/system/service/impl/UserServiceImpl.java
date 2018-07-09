package com.panda.system.service.impl;

import com.panda.system.dao.UserDao;
import com.panda.system.entity.User;
import com.panda.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		int result = userDao.insert(user);
	}

	@Override
	public User getUserById(Long id) {
		return userDao.selectByPrimaryKey(id);
	}
}
