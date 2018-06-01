package com.panda.service;

import com.panda.dao.auth.UserDao;
import com.panda.entity.auth.User;
import com.panda.service.auth.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class, JunitServiceConfig.class})
public class ServiceBootstrap {

	@Autowired
	private IUserService userService;

	@Test
	public void testMybatis() {
		User user = new User();
		user.setUsername("young");
		user.setPassword("123456");
		user.setNickname("nickname");
		user = userService.getUserById(2L);
		System.out.println(user.toString());
	}
}
