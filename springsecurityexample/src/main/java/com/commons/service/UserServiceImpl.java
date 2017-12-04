package com.commons.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.commons.entity.User;
import com.commons.repository.UserDaoImpl;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	UserDaoImpl userDaoImpl;
	
	@Autowired
	BCryptPasswordEncoder bcry;
	
	@Override
	public void findByUserName(String userName) throws Exception {
		userDaoImpl.findByUserName(userName);
	}

	@Override
	public void save(User user) throws Exception {
		userDaoImpl.save(user);
	}
}
