package com.login.springdemo.service;



//import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.springdemo.controller.loginspring;
import com.login.springdemo.dao.UserDao;
import com.login.springdemo.entity.User;


@Service
public class UserServiceimpl implements UserService {

	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public User getuser(loginspring log) {
		// TODO Auto-generated method stub
		return userDao.getuser(log);
	}
	


}
