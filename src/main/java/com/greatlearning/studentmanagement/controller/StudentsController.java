package com.greatlearning.studentmanagement.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.studentmanagement.entity.Student;
import com.greatlearning.studentmanagement.service.StudentService;


//controller class for accepting request and sending response 
//this controller is for displaying all records and handling error 403 (no permission for access)

@Controller
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String handleListAll(Model model) {
		
		List<Student> theStudents = studentService.findAll();

		// add to the spring model
		model.addAttribute("students", theStudents);
		
		return "students-listing";
	}
	
	@RequestMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", "You do not have permission to access this page!");
		}

		model.setViewName("403");
		return model;
	}
}
