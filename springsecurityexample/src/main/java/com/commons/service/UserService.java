package com.commons.service;

import com.commons.entity.User;

public interface UserService {

	public void findByUserName(String userName) throws Exception;

	public void save(User user) throws Exception;

}
