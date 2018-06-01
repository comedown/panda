package com.panda.service.auth.impl;

import com.panda.dao.auth.UserDao;
import com.panda.entity.auth.User;
import com.panda.service.auth.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

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
