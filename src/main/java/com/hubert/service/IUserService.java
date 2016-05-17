package com.hubert.service;

import java.util.List;

import com.hubert.bean.User;

public interface IUserService {
	//根据Id 取用户信息
	User getUserById(String userId);
	
	//取用户列表
	List<User> getUsers();
}
