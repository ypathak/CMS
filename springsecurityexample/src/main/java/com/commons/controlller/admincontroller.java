package com.commons.controlller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.commons.Bean.User;
import com.commons.service.registerservice;

@Controller
@RequestMapping(value="superadmin")

public class admincontroller {
@Autowired
registerservice registerservice;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String adminregister(Model model){
		model.addAttribute("admindata", new User());
		return "adminregister";
	}
	
	@RequestMapping(value="/registeradmin",method=RequestMethod.POST)
	public String submitrefgisteradmin(@Valid @ModelAttribute("admindata")User user, BindingResult result){
		if(result.hasErrors()){
			return "error";
		}
	registerservice.adminregister(user);	
		
	return "login";
	}
	
	@RequestMapping(value="/superadmin",method=RequestMethod.GET)
	public String superadmin(){
		
		return "superadmin";
	}

	
		  
}
