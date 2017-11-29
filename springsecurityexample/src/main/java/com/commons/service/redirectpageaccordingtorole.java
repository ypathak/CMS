package com.commons.service;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

@Service
public class redirectpageaccordingtorole implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		Set<String> roles=AuthorityUtils.authorityListToSet(authentication.getAuthorities());
		if(roles.contains("ROLE_USER")){
			response.sendRedirect("hello");
		}else if(roles.contains("ROLE_ADMIN")){
			response.sendRedirect("admin.jsp");
		}else{
			response.sendRedirect("dba.jsp");
		}
	}

	
}
