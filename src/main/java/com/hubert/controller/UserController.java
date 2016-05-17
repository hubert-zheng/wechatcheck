package com.hubert.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hubert.bean.User;
import com.hubert.service.IUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	/** 日志实例 */
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	@Resource
	IUserService iUserService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public @ResponseBody List<User> getUsers(){
		logger.info("users test" );
		return iUserService.getUsers();
	}
}
