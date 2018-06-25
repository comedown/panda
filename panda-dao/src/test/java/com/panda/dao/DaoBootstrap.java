package com.panda.dao;

import com.panda.dao.sys.UserDao;
import com.panda.entity.sys.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class, JunitDaoConfig.class})
public class DaoBootstrap {

	@Autowired
	private UserDao userDao;

	@Test
	public void testMybatis() {
		User user = userDao.selectByPrimaryKey(1);
		System.out.println(user);
	}
}
