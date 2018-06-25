package com.panda.service.sys;

import com.panda.entity.sys.User;

public interface IUserService {

	void addUser(User user);

	User getUserById(Long id);
}
