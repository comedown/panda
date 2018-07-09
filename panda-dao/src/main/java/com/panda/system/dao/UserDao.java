package com.panda.system.dao;

import com.panda.system.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserDao extends Mapper<User> {

	List<User> selectUsersByIdList(List<Integer> idList);
}