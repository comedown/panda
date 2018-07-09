package com.panda.service;

import com.panda.system.entity.User;
import com.panda.system.service.UserService;
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
	private UserService userService;

	@Test
	public void testMybatis() {
		User user = userService.getUserById(1L);
		System.out.println(user);
	}
}
