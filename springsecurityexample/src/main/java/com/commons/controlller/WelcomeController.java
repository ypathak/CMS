package com.commons.controlller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.commons.entity.User;
import com.commons.service.UserService;

@Controller
public class WelcomeController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		auth.setAuthenticated(false);
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		return "redirect:/login";
	}
	
	@RequestMapping(name = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("userdata", new User());
		return "registretion";
	}
}
