package com.panda.dao;

import com.panda.system.dao.UserDao;
import com.panda.system.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class, JunitDaoConfig.class})
public class DaoBootstrap {

	@Autowired
	private UserDao userDao;

	@Test
	public void testSelect() {
		List<Integer> idList = new ArrayList<>();
		idList.add(1);
		idList.add(2);
		List<User> users = userDao.selectUsersByIdList(idList);
		users.forEach(user -> {
			System.out.println(user.getUsername());
		});
	}

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUsername("二狗");
		user.setNickname("twoDog");
		userDao.insertSelective(user);
	}
}
