package com.bridgeit.controller;

import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bridgeit.model.User;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginPage(Locale locale, Model model) {
		return "login";	
	}
	
	@RequestMapping(value="/home" , method=RequestMethod.POST)
	public String login(@Validated User user, Model model) {
		model.addAttribute("userName",user.getUserName());
		return "user";
	}
		
	
}
