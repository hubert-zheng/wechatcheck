package com.hubert.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hubert.bean.User;
import com.hubert.dao.IUserDao;
import com.hubert.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	
	@Resource
	IUserDao iUserDao;
	
	public User getUserById(String userId) {
		return iUserDao.getUserById(userId);
	}

	public List<User> getUsers() {
		return iUserDao.getUsers();
	}

}
