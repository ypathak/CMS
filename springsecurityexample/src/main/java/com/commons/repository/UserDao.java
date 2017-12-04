package com.commons.repository;

import com.commons.entity.User;

public interface UserDao{
	User findByUserName(String userName) throws Exception;
}
