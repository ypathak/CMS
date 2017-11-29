package com.commons.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class welcomepage {

	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcomepage(Model model){
		System.out.println("welcome page");
		return "welcomepage";
	}
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hellopage(Model model){
		System.out.println("welcome page");
		return "hello";
	}
}
