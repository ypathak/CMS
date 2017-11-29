package com.commons.repository;

import com.commons.Bean.User;

public interface logincheck{
 
	User findByUsername(String uname);
}
