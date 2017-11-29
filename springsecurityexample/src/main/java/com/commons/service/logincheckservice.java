package com.commons.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.commons.Bean.Role;
import com.commons.Bean.User;
import com.commons.repository.logincheck;;
@Service("UserDetailsService")
public class logincheckservice  implements UserDetailsService {

	@Autowired
    private logincheck logincheck;
	
	@Override
	public UserDetails loadUserByUsername(String uname) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=logincheck.findByUsername(uname);
		Set<GrantedAuthority> grantedAuthorities=new HashSet<GrantedAuthority>();
	     Role role = user.getRoles();	   
	     
	     grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
	     
	     return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
	  
		
	}

}
