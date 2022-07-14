package com.greatlearning.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//controller class for accepting request and sending response 
// welcome page

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String handleWelcomePage(){
		return "welcome";
	}
}
