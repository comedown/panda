package com.panda.dao.sys;

import com.panda.entity.sys.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserDao extends Mapper<User> {

	List<User> selectUsersByIdList(List<Integer> idList);
}