package com.hubert.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hubert.bean.User;

@Repository
public interface IUserDao {
	//根据Id 取用户信息
	User getUserById(@Param("UserId")String userId);
	
	//取用户列表
	List<User> getUsers();
}
