package com.panda.service.auth;

import com.panda.entity.auth.User;

public interface IUserService {

	void addUser(User user);

	User getUserById(Long id);
}
