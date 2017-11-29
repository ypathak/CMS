package com.commons.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class logincontroller {

	
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String indexpage(){
		System.out.println("login page display ..... ");
		return "login";
	}
	@RequestMapping(value="/loginpage" , method=RequestMethod.GET)
	public String indexpage1(){
		System.out.println("login page display indexpage1..... ");
		return "login";
	}
	
}
