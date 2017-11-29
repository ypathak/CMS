package com.commons.controlller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.commons.Bean.User;
import com.commons.service.registerservice;

@Controller
@RequestMapping("admin")
public class admincontroller {
@Autowired
registerservice registerservice;
	
	@RequestMapping(name="/",method=RequestMethod.GET)
	public String adminregister(Model model){
		model.addAttribute("admindata", new User());
		return "adminregister";
	}
	
	@RequestMapping(name="/registeradmin",method=RequestMethod.POST)
	public String submitrefgisteradmin(@Valid @ModelAttribute("admindata")User user, BindingResult result){
		if(result.hasErrors()){
			return "error";
		}
	registerservice.adminregister(user);	
		
	return "login";
	}
}
