package com.panda.service.sys.impl;

import com.panda.dao.sys.UserDao;
import com.panda.entity.sys.User;
import com.panda.service.sys.IUserService;
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
