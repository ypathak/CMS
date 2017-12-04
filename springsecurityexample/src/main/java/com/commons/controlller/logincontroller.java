package com.commons.controlller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class logincontroller {

	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String indexpage(HttpServletRequest request, HttpServletResponse response){
		   Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	        if (auth != null && !(auth instanceof AnonymousAuthenticationToken)) {
	            return "redirect:superadmin/superadmin";
	        }
		System.out.println("login page display ..... ");
		return "login";
	}
	@RequestMapping(value="/loginpage" , method=RequestMethod.GET)
	public String indexpage1(HttpServletRequest request , HttpServletResponse response){
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    if (auth != null){    
		        new SecurityContextLogoutHandler().logout(request, response, auth);
		    }
		System.out.println("logout page ----------1..... ");
		
	
		
		return "login";
	}
	
}
