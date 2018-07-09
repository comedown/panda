package com.panda.system.service;

import com.panda.system.entity.User;

public interface UserService {

	void addUser(User user);

	User getUserById(Long id);
}
