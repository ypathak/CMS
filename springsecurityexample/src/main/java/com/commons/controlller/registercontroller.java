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
public class registercontroller {

	@Autowired
	registerservice registerservice;
	
	
	@RequestMapping(name="/register",method=RequestMethod.GET)
	public String displayregister(Model model){
		model.addAttribute("userdata", new User());
		return "registretion";
	}
	
	@RequestMapping(name="/registersubmit1",method=RequestMethod.POST)
	public String submitrefgisterdata(@Valid @ModelAttribute("userdata")User user, BindingResult result){
		if(result.hasErrors()){
			return "error";
		}
	registerservice.userservice(user);	
		
	return "login";
	}

}
