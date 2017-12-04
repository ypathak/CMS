package com.commons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.commons.Bean.Role;
import com.commons.Bean.User;
import com.commons.repository.registerdao;


@Service
public class registerserviceimp implements registerservice{

	@Autowired
	registerdao registerdao;
	
	@Autowired
	BCryptPasswordEncoder bcry;
	
	
	@Override
	public void userservice(User user) {
		// TODO Auto-generated method stub
		user.setPassword(bcry.encode(user.getPassword()));
	     Role roles=new Role();
	     roles.setRole("USER");
		/*user.setRoles(roles);*/
        user.setStatus(true);
		registerdao.sasveuserdao(user);
		
	}


	@Override
	public void adminregister(User user) {
		// TODO Auto-generated method stub
		user.setPassword(bcry.encode(user.getPassword()));
	     Role roles=new Role();
	     roles.setRole("ADMIN");
	/*	user.setRoles(roles);*/
       user.setStatus(true);
		registerdao.sasveuserdao(user);
	}


	

	

}
